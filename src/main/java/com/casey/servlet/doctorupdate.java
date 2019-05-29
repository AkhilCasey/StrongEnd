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
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author cynber
 */
@WebServlet(name = "doctorupdate", urlPatterns = {"/doctorupdate"})
public class doctorupdate extends HttpServlet {

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
            out.println("<title>Servlet doctorupdate</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet doctorupdate at " + request.getContextPath() + "</h1>");
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
         int r=0;
   HttpSession session = request.getSession();
     SiddhaEmployee doctor = new SiddhaEmployee();
  doctor=(SiddhaEmployee)session.getAttribute("user");
if(session.getAttribute("user") instanceof SiddhaEmployee && doctor.getAccess_privilege()==SiddhaEmployee.DOCTOR_ACCESS_PRIVILEGE)
{
            //System.out.println("if executed........");
             try {
           SiddhaEmployee obj = new SiddhaEmployee();
           
                 obj.setEmp_id(doctor.getEmp_id());
                 obj.setPassword(request.getParameter("password"));
                 obj.setName(doctor.getName());
                 obj.setGender(doctor.getGender());
                 obj.setDate_birth(doctor.getDate_birth());
                 obj.setAddress(request.getParameter("address"));
                 obj.setEmail(request.getParameter("email"));
                 obj.setPhone(Long.parseLong(request.getParameter("phone")));
                 obj.setDepartment(doctor.getDepartment());
                 obj.setDesignation(doctor.getDesignation());
                 obj.setQualifications(request.getParameter("qualifications"));
                
                 obj.setDate_registration(doctor.getDate_registration());
                 obj.setAccess_privilege(doctor.getAccess_privilege());
                 obj.setJob_status(doctor.getJob_status());
                 obj.setJob_type(doctor.getJob_type());
               
                 
                 
                
                 
                 //System.out.println("value get........");
                
                 SiddhaEmployeeManager objM = new SiddhaEmployeeManager();
                r= objM.update(obj);
                 
                 
                  session.setAttribute("user",obj);
                 
                 
                // System.out.println("try executed........");
                 
                     if(r>0){               
                                 
               // System.out.println("<script alert('data updated') window.location='doctorprofile.jsp';></script>");
                        System.out.println("Update success");
                       
                        response.sendRedirect("doctorProfile.jsp");
                  
                     }else{
                        System.out.println("Update Failed!");
                     }
                        
                        
                        
                        
                        
                        
                         
                 //  HttpSession session = request.getSession();
                 // session.setAttribute("dataUpdated", "true");
                 
                 
            
                

     }catch (Exception ex) {
                    System.out.println(ex);
                }
}
      else {
            response.sendRedirect("sessionexpired.jsp");
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
