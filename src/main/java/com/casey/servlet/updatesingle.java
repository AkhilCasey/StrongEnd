/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cynber.siddha.servlet;

import com.cynber.siddha.bean.PharmacyMedicine;
import com.cynber.siddha.manager.PharmacyMedicineManager;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
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
@WebServlet(name = "updatesingle", urlPatterns = {"/updatesingle"})
public class updatesingle extends HttpServlet {

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
            out.println("<title>Servlet updatesingle</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet updatesingle at " + request.getContextPath() + "</h1>");
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
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            int id = Integer.parseInt(request.getParameter("stockid"));
            String createdDate, createdDate1, createdDate2, createdDate3 = null;

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

            java.sql.Date sqlDate = null;
            java.sql.Date sqlDate1 = null;

            createdDate = request.getParameter("mdate");
            createdDate1 = request.getParameter("edate");

            System.out.println("createdDate" + createdDate);
            System.out.println("createdDate1" + createdDate1);
            try {
                if (createdDate != null) {
                    System.out.println("bbbbbb");
                    java.util.Date utildate = sdf.parse(createdDate);
                    java.util.Date utildate1 = sdf.parse(createdDate1);

                    System.out.print("utildate" + utildate);
                    sqlDate = new java.sql.Date(utildate.getTime());
                    sqlDate1 = new java.sql.Date(utildate1.getTime());

                    System.out.println(sqlDate1);

                    System.out.print("fdghdfhfh" + sqlDate);
                }
            } catch (ParseException e1) {
                System.out.println("Exception " + e1);
            }
            PharmacyMedicineDTO pm = new PharmacyMedicineDTO();
            System.out.println("23333333333"+request.getParameter("Name") );
            pm.setMedicinename(request.getParameter("Name"));
            pm.setMedcode(request.getParameter("Code"));
            pm.setBatchcode(request.getParameter("BatchCode"));
            pm.setCategory(request.getParameter("category"));
            pm.setMdate(sqlDate);
            pm.setEdate(sqlDate1);
            pm.setSuppname(request.getParameter("sname"));
            pm.setUom(request.getParameter("uom"));
            pm.setQuantity(Integer.parseInt(request.getParameter("quantity")));
            pm.setRate(Float.parseFloat(request.getParameter("rate")));
            pm.setTaxpercent(Float.parseFloat(request.getParameter("taxpercent")));
            pm.setTaxamount(Float.parseFloat(request.getParameter("taxamount")));
            pm.setTotalamount(Float.parseFloat(request.getParameter("totalamount")));
            pm.setStockId(id);

            PharmacyMedicineManager pmm = new PharmacyMedicineManager();
            int i = pmm.updateMedicine(pm);
            if (i > 0) {
                response.sendRedirect("PharmacyStockHome.jsp?Status=success");
            } else {
                out.println("Insertion Failed");
            }
        } catch (SQLException ex) {
            Logger.getLogger(PharmacyMedicineInsertAction.class.getName()).log(Level.SEVERE, null, ex);
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
