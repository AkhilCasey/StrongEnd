///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.cynber.siddha.servlet;
//
//import com.cynber.siddha.bean.OpBooking;
//import com.cynber.siddha.bean.ReceptionPatientRegister;
//import com.cynber.siddha.bean.SiddhaEmployee;
//import com.cynber.siddha.manager.OpBookingManager;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//
///**
// *
// * @author cynber
// */
//@WebServlet(name = "doctorFindOp", urlPatterns = {"/doctorFindOp"})
//public class doctorFindOp extends HttpServlet {
//    String a,b; 
//    int c,d;
//
//    /**
//     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
//     * methods.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet doctorFindOp</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet doctorFindOp at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        }
//    }
//
//    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
//    /**
//     * Handles the HTTP <code>GET</code> method.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException { PrintWriter out = response.getWriter();
//
//                OpBookingDTO op = new OpBookingDTO();
//		HttpSession session=request.getSession();
//                SiddhaEmployee doctor = new SiddhaEmployee();
//                doctor=(SiddhaEmployee)session.getAttribute("user");
//                //System.out.println("servlet called");
//		if(session.getAttribute("user") instanceof SiddhaEmployee && doctor.getAccess_privilege()==SiddhaEmployee.DOCTOR_ACCESS_PRIVILEGE && request.getParameter("date")!=null)
//		{
//       try {
//           OpBookingManager objM=new OpBookingManager();
//           
//           String x=request.getParameter("date");
//            System.out.println("date in servlet="+x);
//           ArrayList<ReceptionPatientRegister> array=objM.selectBookingDetails((request.getParameter("date")),doctor.getName());
//           
//           
//                      // out.println("<tr><th style='text-align:center'> ID </th>");
//                       out.println("<th style='text-align:center'> Patient ID</th>");
//                       out.println("<th style='text-align:center'> Doctor ID </th>");
//                       out.println("<th style='text-align:center'> Name </th>");
//                       out.println("<th style='text-align:center'> Address </th>");
//                       out.println("<th style='text-align:center'> Date </th></tr>");
//           
//           
//           for(ReceptionPatientRegister p : array){
//               a=request.getParameter("date");
//               b=op.getDate();
//               System.out.println("11111"+a);
//               System.out.println("22222"+b);
//               
//               
//               
//               out.println("<!DOCTYPE html><html lang='en'><head><meta http-equiv='Content-Type' content='text/html; charset=ISO-8859-1'><title></title></head><body><tbody>");
//               
//               if(a!=""){
//                   if(op!=null)
//                   {
//                       System.out.println("keeriyada");
//                      
//                        System.out.println(p.getAddress());
//                        
//                      // out.println("<td style='text-align:center'>"+p.getBookingID()+"</td>");
//                       out.println("<td style='text-align:center'>"+p.getPatientid() +"</td>");
//                       out.println("<td style='text-align:center'>"+p.getDepdoctor()+"</td>");
//                       out.println("<td style='text-align:center'>"+p.getPatientname()+"</td>");
//                       out.println("<td style='text-align:center'>"+p.getAddress()+"</td>");
//                       out.println("<td style='text-align:center'>"+p.getRegdate()+"</td>");
//                       
//                       
//                   }else
//                       out.println("<tr><td colspan='2'>No Patients Found.</td></tr>");
//                   
//                   
//                   
//               } else
//                   out.println("<tr><td colspan='2'>No Patients Found.</td></tr>");
//           }
//           
//           
//           out.println("</tbody></body></html>");
//       } catch (SQLException ex) {
//           Logger.getLogger(doctorFindOp.class.getName()).log(Level.SEVERE, null, ex);
//       }
//		}
//                else
//                    response.sendRedirect("sessionexpired.jsp");
//	
//    }
//
//    /**
//     * Handles the HTTP <code>POST</code> method.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        processRequest(request, response);
//    }
//
//    /**
//     * Returns a short description of the servlet.
//     *
//     * @return a String containing servlet description
//     */
//    @Override
//    public String getServletInfo() {
//        return "Short description";
//    }// </editor-fold>
//
//}
