/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cynber.siddha.servlet;

import com.cynber.siddha.bean.IPRegister;
import com.cynber.siddha.manager.IPRegisterManager;
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
@WebServlet(name = "PatientPayment", urlPatterns = {"/PatientPayment"})
public class PatientPayment extends HttpServlet {

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
            out.println("<title>Servlet PatientPayment</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet PatientPayment at " + request.getContextPath() + "</h1>");
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
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         try {
                    
                    String createdDate, createdDate1=null;
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    java.sql.Date sqlDate = null;
                    
                    createdDate = request.getParameter("date1");
                    
                    
                    System.out.println("createdDate" + createdDate);
                    System.out.println("createdDate1" + createdDate1);
                    
                    try {
                        if (createdDate != null) {
                            System.out.println("Date");
                            java.util.Date utildate = sdf.parse(createdDate);
                            
                            
                            
                            System.out.print("utildate" + utildate);
                            sqlDate = new java.sql.Date(utildate.getTime());
                            System.out.print("Date1" + sqlDate);
                        }
                    } catch (ParseException e1) {
                        System.out.println("Exception " + e1);
                    } 
                    IPRegisterDTO rp=new IPRegisterDTO();
                    IPRegisterManager rpm=new IPRegisterManager();
                    rp.setPatientid(Integer.parseInt(request.getParameter("patientid")));
                    rp.setRegdate(sqlDate);
                    rp.setPrice(Float.parseFloat(request.getParameter("room")));
                    rp.setAmount(Float.parseFloat(request.getParameter("treatment")));
                    rp.setOther(Float.parseFloat(request.getParameter("other")));
                    rp.setTotal(Float.parseFloat(request.getParameter("total")));
                    float total=Float.parseFloat(request.getParameter("total"));
                    float bal=Float.parseFloat(request.getParameter("balance"));
                    float balance=bal-total;
                    rp.setBalance(balance);
                    int i=rpm.patientPaymentInsert(rp);
                    int j=rpm.patientBalanceUpdate(rp);
                    if(i>0)
                    {
                        response.sendRedirect("IPHome.jsp?Status=Success");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(PatientPayment.class.getName()).log(Level.SEVERE, null, ex);
                } 

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
