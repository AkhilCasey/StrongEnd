/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cynber.siddha.servlet;

import com.cynber.siddha.bean.SiddhaEmployee;
import com.cynber.siddha.manager.SiddhaEmployeeManager;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author cynber
 */
@WebServlet(name = "updatesinglestaff", urlPatterns = {"/updatesinglestaff"})
public class updatesinglestaff extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet updatesinglestaff</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet updatesinglestaff at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            String s = request.getParameter("designation");
            System.out.println("bbbb" + s);

            String createdDate, createdDate1;
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            java.sql.Date sqlDate = null;
            java.sql.Date sqlDate1 = null;
            createdDate = request.getParameter("dob");
            createdDate1 = request.getParameter("doj");
            java.util.Date utildate = sdf.parse(createdDate);
            java.util.Date utildate1 = sdf.parse(createdDate1);
            sqlDate = new java.sql.Date(utildate.getTime());
            sqlDate1 = new java.sql.Date(utildate1.getTime());
            SiddhaEmployee se = new SiddhaEmployee();
            //  se.setPassword("password");
            se.setEmp_id(Integer.parseInt(request.getParameter("id")));
            se.setDesignation(request.getParameter("designation"));
            se.setName(request.getParameter("name"));
            se.setAddress(request.getParameter("address"));
            se.setDate_birth(sqlDate);
            se.setDate_registration(sqlDate1);
            
            se.setPhone(Long.parseLong(request.getParameter("contact")));
            
            se.setBlood_group(request.getParameter("blood"));
            se.setJob_type(request.getParameter("jobtype"));
            int a = 1, b = 2, c = 3, d = 4, e = 5, f = 6, g = 7;
            if (s.equals("Administration")) {
                System.out.println("11111");
                se.setAccess_privilege(1);
            } else if (s.equals("Reception")) {
                se.setAccess_privilege(2);
            } else if (s.equals("Doctor")) {
                se.setAccess_privilege(3);
            } else if (s.equals("Lab Technician")) {
                se.setAccess_privilege(4);
            } else if (s.equals("Pharmacist")) {
                se.setAccess_privilege(5);
            } else if (s.equals("IP")) {
                se.setAccess_privilege(6);
            } else if (s.equals("Store Staff")) {
                se.setAccess_privilege(7);
            }
            se.setJob_status(Integer.parseInt(request.getParameter("jobstatus")));
            se.setGender(request.getParameter("gender"));
            se.setEmail(request.getParameter("email"));
            se.setDepartment(request.getParameter("department"));
            se.setQualifications(request.getParameter("qualification"));
            SiddhaEmployeeManager objM = new SiddhaEmployeeManager();
            objM.update(se);
            response.sendRedirect("adminViewStaff.jsp");
        } catch (ParseException ex) {
            Logger.getLogger(updatesinglestaff.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(updatesinglestaff.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
