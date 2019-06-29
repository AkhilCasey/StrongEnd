///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.cynber.siddha.servlet;
//
//import com.cynber.siddha.bean.ReceptionPatientRegister;
//import com.cynber.siddha.manager.ReceptionPatientRegisterManager;
//import java.io.IOException;
//import java.io.PrintWriter;
//import static java.lang.System.out;
//import java.sql.SQLException;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
///**
// *
// * @author cynber
// */
//@WebServlet(name = "ReceptionPatientUpdate", urlPatterns = {"/ReceptionPatientUpdate"})
//public class ReceptionPatientUpdate extends HttpServlet {
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
//            out.println("<title>Servlet ReceptionPatientUpdate</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet ReceptionPatientUpdate at " + request.getContextPath() + "</h1>");
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
//            throws ServletException, IOException {
//        processRequest(request, response);
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
//        
//        try {
//            
//            String createdDate, createdDate1=null;
//            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//            java.sql.Date sqlDate = null;
//            createdDate = request.getParameter("date1");
//            System.out.println("createdDate" + createdDate);
//            System.out.println("createdDate1" + createdDate1);
//            try {
//                if (createdDate != null) {
//                    System.out.println("Date");
//                    java.util.Date utildate = sdf.parse(createdDate);
//                    
//                    
//                    
//                    System.out.print("utildate" + utildate);
//                    sqlDate = new java.sql.Date(utildate.getTime());
//                    
//                    
//                    
//                    
//                    System.out.print("Date1" + sqlDate);
//                }
//            } catch (ParseException e1) {
//                System.out.println("Exception " + e1);
//            }
//            ReceptionPatientRegister rp=new ReceptionPatientRegister();
//            rp.setPatientid(Integer.parseInt(request.getParameter("patientid")));
//            System.out.println("Patient Id.."+Integer.parseInt(request.getParameter("patientid")));
//            rp.setPatientname(request.getParameter("Name"));
//            rp.setGender(request.getParameter("gender"));
//            rp.setRegdate(sqlDate);
//            System.out.println("Age="+Integer.parseInt(request.getParameter("age")));
//            rp.setAge(Integer.parseInt(request.getParameter("age")));
//            rp.setAddress(request.getParameter("address"));
//            rp.setContact(request.getParameter("contact"));
//            rp.setEmergencycontact(request.getParameter("emergencyname"));
//            rp.setRelation(request.getParameter("relation"));
//            rp.setEmergencynumber(request.getParameter("emergencycontact"));
//            rp.setDetails(request.getParameter("details"));
//            rp.setRefdoctor(request.getParameter("refdoctor"));
//            rp.setRefhospital(request.getParameter("refhospital"));
//            rp.setRefhosop(request.getParameter("opnum"));
//            ReceptionPatientRegisterManager rpm=new ReceptionPatientRegisterManager();
//            int i=rpm.updatePatient(rp);
//            if(i!=0)
//            {
//                response.sendRedirect("receptionHome.jsp?Status=success");
//            }
//            else
//            {
//                out.println("Updation Failed");
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(ReceptionPatientUpdate.class.getName()).log(Level.SEVERE, null, ex);
//        }
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
