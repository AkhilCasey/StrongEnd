/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cynber.siddha.servlet;

import com.cynber.siddha.bean.ReceptionPatientRegister;
import com.cynber.siddha.bean.SiddhaEmployee;
import com.cynber.siddha.manager.ReceptionPatientRegisterManager;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
@WebServlet(name = "doctorFindPatient", urlPatterns = {"/doctorFindPatient"})
public class doctorFindPatient extends HttpServlet {
 int a,b;
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
            out.println("<title>Servlet doctorFindPatient</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet doctorFindPatient at " + request.getContextPath() + "</h1>");
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
        PrintWriter out = response.getWriter();

                ReceptionPatientRegister patient = new ReceptionPatientRegister();
		HttpSession session=request.getSession();
                SiddhaEmployee doctor = new SiddhaEmployee();
                doctor=(SiddhaEmployee)session.getAttribute("user");
                //System.out.println("servlet called");
		if(session.getAttribute("user") instanceof SiddhaEmployee && doctor.getAccess_privilege()==SiddhaEmployee.DOCTOR_ACCESS_PRIVILEGE && request.getParameter("opid")!=null)
		{
                    ReceptionPatientRegisterManager objM=new ReceptionPatientRegisterManager();
                    
  
                            try {
                              patient=objM.editPatient(Integer.parseInt(request.getParameter("opid")));
                               a=(Integer.parseInt(request.getParameter("opid")));
                               b=patient.getPatientid();
                               System.out.println(a);
                               System.out.println(b);
                            } catch (SQLException ex) {
                                Logger.getLogger(doctorFindPatient.class.getName()).log(Level.SEVERE, null, ex);
                            }

		
			out.println("<!DOCTYPE html><html lang='en'><head><meta http-equiv='Content-Type' content='text/html; charset=ISO-8859-1'><title></title></head><body><tbody>");
			try
			{
                            if(a==b&&a!=0){
                            if(patient!=null)
                            {
                                
				out.println("<tr><td style='text-align:center'> Id </td><td style='text-align:center'>"+patient.getPatientid()+"</td>");
                                out.println("<tr><td style='text-align:center'> Name </td><td style='text-align:center'>"+patient.getPatientname() +"</td>");
                                out.println("<tr><td style='text-align:center'> Gender </td><td style='text-align:center'>"+patient.getGender()+"</td>");
                                out.println("<tr><td style='text-align:center'> Date of Birth </td><td style='text-align:center'>"+patient.getDob()+"</td>");
                                out.println("<tr><td style='text-align:center'> Age </td><td style='text-align:center'>"+patient.getAge()+"</td>");
                                out.println("<tr><td style='text-align:center'> Address </td><td style='text-align:center'>"+patient.getAddress()+"</td>");
                                out.println("<tr><td style='text-align:center'> Phone </td><td style='text-align:center'>"+patient.getContact()+"</td>");
                                out.println("<tr><td style='text-align:center'> Date of Registration </td><td style='text-align:center'>"+patient.getRegdate()+"</td>");
                                out.println("<tr><td style='text-align:center'> Emergency Contact Name </td><td style='text-align:center'>"+patient.getEmergencycontact()+"</td>");
                                out.println("<tr><td style='text-align:center'> Emergency Contact Relation </td><td style='text-align:center'>"+patient.getRelation()+"</td>");
                                out.println("<tr><td style='text-align:center'> Emergency Contact Number </td><td style='text-align:center'>"+patient.getEmergencynumber()+"</td>");
                                out.println("<tr><td style='text-align:center'> Details </td><td style='text-align:center'>"+patient.getDetails()+"</td>");
                                //out.println("<tr><td style='text-align:center'> Allergic Medicine </td><td style='text-align:center'>"+patient.getAllergic_medicines()+"</td>");
                               // out.println("<tr><td style='text-align:center'> Previous Surgery </td><td style='text-align:center'>"+patient.getPrevious_surgeries()+"</td>");
                               // out.println("<tr><td style='text-align:center'> Previous Medications </td><td style='text-align:center'>"+patient.getPrev_medications()+"</td>");
                                out.println("<tr><td style='text-align:center'> Reffered Doctor </td><td style='text-align:center'>"+patient.getRefdoctor()+"</td>");
                                out.println("<tr><td style='text-align:center'> Reffered Hospital </td><td style='text-align:center'>"+patient.getRefhosop()+"</td>");
                                out.println("<tr><td style='text-align:center'> Reffered Hospital OP </td><td style='text-align:center'>"+patient.getRefhosop()+"</td>");
                                //out.println("<tr><td style='text-align:center'> Reffered Hospital Diagonosis </td><td style='text-align:center'>"+patient.getRef_hosp_diagnosis()+"</td>");
                                //out.println("<tr><td style='text-align:center'> Reffered Hospital Treatement </td><td style='text-align:center'>"+patient.getRef_hosp_treatments()+"</td>");
                                
                                }else
                                out.println("<tr><td colspan='2'>No Patients Found.</td></tr>");
                                
                                
                                
                            } else
                                 out.println("<tr><td colspan='2'>No Patients Found.</td></tr>");
			}
			catch(Exception ex)
			{
				System.out.println(ex);
			}
			
			out.println("</tbody></body></html>");
		}
                else
                    response.sendRedirect("sessionexpired.jsp");
	
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
