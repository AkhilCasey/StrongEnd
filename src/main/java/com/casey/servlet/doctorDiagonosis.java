///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.cynber.siddha.servlet;
//
//import com.cynber.siddha.bean.DoctorPrescription;
//import com.cynber.siddha.bean.SiddhaEmployee;
//import com.cynber.siddha.dbconnection.ConnectionProvider;
//import com.cynber.siddha.manager.DoctorPrescriptionManager;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.sql.CallableStatement;
//import java.sql.Connection;
//import java.sql.SQLException;
//import java.sql.Timestamp;
//import java.util.ArrayList;
//import java.util.List;
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
//@WebServlet(name = "doctorDiagonosis", urlPatterns = {"/doctorDiagonosis"})
//public class doctorDiagonosis extends HttpServlet {
//int g=0;
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
//            out.println("<title>Servlet doctorDiagonosis</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet doctorDiagonosis at " + request.getContextPath() + "</h1>");
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
//        HttpSession session = request.getSession();
//        SiddhaEmployee doctor = new SiddhaEmployee();
//        doctor = (SiddhaEmployee) session.getAttribute("user");
//        //System.out.println("servlet called");
//
//        try {
//            String opid = request.getParameter("opid");
//            System.out.println("opid is" + opid);
//
//            java.util.Date date = new java.util.Date();
//            System.out.println(new Timestamp(date.getTime()));
//            System.out.println("timestamp date in servlet is " + new Timestamp(date.getTime()));
//
//            PrescriptionDTO dig = new PrescriptionDTO();
//            dig.setName(request.getParameter("Name"));
//            dig.setDate(new Timestamp(date.getTime()));
//            dig.setDoctor_ID((doctor.getEmp_id()));
//            dig.setPatient_ID(Integer.parseInt(opid));
//            dig.setDiagonosis(request.getParameter("diagonosis"));
//
//            dig.setHaematology(request.getParameter("haematology"));
//            dig.setUrine(request.getParameter("urine"));
//            dig.setSputum(request.getParameter("sputum"));
//            dig.setFeaces(request.getParameter("feaces"));
//            dig.setSerology(request.getParameter("serology"));
//            dig.setBioChem(request.getParameter("biochemistry"));
//            dig.setHormone(request.getParameter("hormone"));
//
//            DoctorPrescriptionManager purM = new DoctorPrescriptionManager();
//            int a = purM.insert(dig);
//
//            List<PrescriptionDTO> lablist = new ArrayList<PrescriptionDTO>();
//            String[] testname = request.getParameterValues("tests");
//
//            if (!testname[0].equals("No Test")) {
//                for (int i = 0; i < testname.length; i++) {
//                    String m = testname[i];
//                    if (m.equals("select")) {
//                        g = 1;
//                        System.out.println("ggmmmggg" + g);
//                    } else {
//
//                        PrescriptionDTO lab = new PrescriptionDTO();
//                        lab.setReportID(a);
//                        lab.setPatient_ID(Integer.parseInt(opid));
//                        lab.setTest_name(testname[i]);
//                        lab.setDoctor_ID(doctor.getEmp_id());
//                        lab.setStatus("Pending");
//                        lab.setPrescribedDate(new Timestamp(date.getTime()));
//
//                        lablist.add(lab);
//
//                    }
//                }
//
//                purM.insertLab(lablist);
//            }
//            List<PrescriptionDTO> list = new ArrayList<PrescriptionDTO>();
//
//            String[] medicines = request.getParameterValues("medicine");
//            String[] usage = request.getParameterValues("usage");
//            String[] quantity = request.getParameterValues("quantity");
//            String[] duration = request.getParameterValues("duration");
//            String[] day = request.getParameterValues("day");
//            if (!medicines[0].equals("Nil")) {
//                System.out.println("aaha" + medicines[0]);
//                System.out.print("UYYOOOOOOOOOOOO");
//                for (int i = 0; i < medicines.length; i++) {
//                    // int mrp;
//                    CallableStatement callableStatement = null;
//
//                    DoctorPrescriptionManager medicineM = new DoctorPrescriptionManager();
//                    Float mrp = medicineM.SelectMedCost(medicines[i]);
//
//                    PrescriptionDTO medicine = new PrescriptionDTO();
//                    medicine.setMedicalReportId(a);
//                    medicine.setComments(request.getParameter("comments"));
//                    medicine.setMedicineName(medicines[i]);
//
//                    Connection con = ConnectionProvider.createConnection();
//
//                    medicine.setMrp(mrp);
//
//                    medicine.setUsage(usage[i]);
//                    medicine.setQuantity(quantity[i]);
//                    medicine.setDuration(duration[i]);
//                    medicine.setDay(day[i]);
//
//                    list.add(medicine);
//                    System.out.println(list);
//
//                }
//
//                DoctorPrescriptionManager medicineM = new DoctorPrescriptionManager();
//                medicineM.insertmedicine(list);
//            }
//            if (a > 0) {
//                response.sendRedirect("doctorPrescription.jsp?Status=success");
//            } else {
//                response.sendRedirect("doctorPrescription.jsp?Status=failed");
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(doctorDiagonosis.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//    }
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
