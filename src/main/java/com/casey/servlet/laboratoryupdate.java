///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.cynber.siddha.servlet;
//
//import com.cynber.siddha.bean.LaboratoryBean;
//import com.cynber.siddha.bean.SiddhaEmployee;
//import com.cynber.siddha.manager.LaboratoryManager;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.sql.SQLException;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
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
//@WebServlet(name = "laboratoryupdate", urlPatterns = {"/laboratoryupdate"})
//public class laboratoryupdate extends HttpServlet {
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
//            out.println("<title>Servlet laboratoryupdate</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet laboratoryupdate at " + request.getContextPath() + "</h1>");
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
//        
//         HttpSession session=request.getSession();
//                SiddhaEmployee lab = new SiddhaEmployee();
//                lab=(SiddhaEmployee)session.getAttribute("user");
//                //System.out.println("servlet called");
//		if(session.getAttribute("user") instanceof SiddhaEmployee && lab.getAccess_privilege()==SiddhaEmployee.LAB_TECHNICIAN_ACCESS_PRIVILEGE)
//		{
//        
//        
//        try {
//            //Timestamp
//            //java.util.Date date = new java.util.Date();
//           // System.out.println("timestamp date in servlet is " + new Timestamp(date.getTime()));
//
//            //Timestamp
//            String startdate = request.getParameter("startdate");
//            String enddate = request.getParameter("enddate");
//            
//            System.out.println("111111111111"+startdate);
//            
//            
//
//
//            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
//           // DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
//            java.sql.Date enddate1 = null;
//            java.sql.Date startdate1 = null;
//           
//            java.util.Date sdate = sdf.parse(startdate);
//            java.util.Date edate = sdf.parse(enddate);
//            enddate1 = new java.sql.Date(edate.getTime());
//            startdate1 = new java.sql.Date(sdate.getTime());
//            Date date1 = new Date();
//            System.out.println("PARSED SDATE " + startdate1);
//            System.out.println("PARSED EDATE " + enddate1);
//
//         
//
//            System.out.println("PATIENT ID" + request.getParameter("patientid"));
//            System.out.println("REPORT ID" + request.getParameter("reportid"));
//            System.out.println("TEST NAME" + request.getParameter("testname"));
//            System.out.println("Doc ID" + request.getParameter("docid"));
//            System.out.println("LAB ID" + request.getParameter("techid"));
//            System.out.println("START DATE" + request.getParameter("startdate"));
//            System.out.println("END DATE" + request.getParameter("enddate"));
//            System.out.println("RESULT" + request.getParameter("result"));
//            System.out.println("STATUS" + request.getParameter("status"));
//
//            LaboratoryBean lab1 = new LaboratoryBean();
//            System.out.println("aaaaaaaa");
//            lab1.setTestname(request.getParameter("testname"));
//            lab1.setDoctorid(Integer.parseInt(request.getParameter("docid")));
//            lab1.setPatientid(Integer.parseInt(request.getParameter("patientid")));
//            System.out.println("bbbbbbb");
//            lab1.setReportid(Integer.parseInt(request.getParameter("reportid")));
//            System.out.println("ccccccc");
//            lab1.setLabtechnicianid(Integer.parseInt(request.getParameter("techid")));
//            //System.out.println("ddddddd");
//            lab1.setStartdate(startdate1);
//            lab1.setEnddate(enddate1);
//            lab1.setResult(request.getParameter("result"));
//            System.out.println("eeeeeee");
//            lab1.setStatus(request.getParameter("status"));
//            LaboratoryManager laman = new LaboratoryManager();
//            int i = laman.update(lab1);
//            if (i > 0) {
//                response.sendRedirect("laboratoryView1.jsp?id=updated&reportid="+lab1.getReportid());
//            } else {
//                System.out.println("Failed.........................");
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(laboratoryupdate.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (ParseException ex) {
//            Logger.getLogger(laboratoryupdate.class.getName()).log(Level.SEVERE, null, ex);
//        }
//}
//                else
//                    response.sendRedirect("sessionexpired.jsp");
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
