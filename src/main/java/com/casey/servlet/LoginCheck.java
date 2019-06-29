///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.cynber.siddha.servlet;
//
//import com.cynber.siddha.bean.SiddhaEmployee;
//import com.cynber.siddha.manager.SiddhaEmployeeManager;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.sql.SQLException;
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
// * @author D06507
// */
//@WebServlet(name = "LoginCheck", urlPatterns = {"/LoginCheck"})
//public class LoginCheck extends HttpServlet {
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
//            out.println("<title>Servlet LoginCheck</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet LoginCheck at " + request.getContextPath() + "</h1>");
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
//        int uid = Integer.parseInt(request.getParameter("username"));
//        String pwd = request.getParameter("password");
//
//        try {
//
//            SiddhaEmployeeManager obj = new SiddhaEmployeeManager();
//            SiddhaEmployee objB = obj.loginCheckfun(uid, pwd);
//            if (objB != null) {
//                HttpSession session = request.getSession();
//                session.setAttribute("user", objB);
//                if (objB.getJob_status() == SiddhaEmployee.LEFT_JOB_STATUS) {
//                    response.sendRedirect("login.jsp?status=failed");
//                    return;
//                }
//                switch (objB.getAccess_privilege()) //Access privilege 5 is given for receptionist 1 for admin 2 for doctor
//                {                   
//                    case 1:
//                        response.sendRedirect("adminHome.jsp");//ADMIN PAGE
//                        break;
//                    case 2:
//                        response.sendRedirect("receptionHome.jsp"); // RECEPTION PAGE
//                        break;
//                    case 3:
//                        response.sendRedirect("doctorHome.jsp"); // Doctor page
//                        break;
//                    case 4:
//                        response.sendRedirect("laboratoryhome.jsp"); //  LAB technician page
//                        break;
//                    case 5:
//                        response.sendRedirect("PharmacyStockHome.jsp");// Pharmacy Technician
//                        break;
//                    case 6:
//                        response.sendRedirect("IPHome.jsp");// IP section if any
//                        break;
//                    case 7:
//                        response.sendRedirect(".jsp");//STore user if any
//                    default:
//                        response.sendRedirect("login.jsp? status=failed");
//                }
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(LoginCheck.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//
//
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
