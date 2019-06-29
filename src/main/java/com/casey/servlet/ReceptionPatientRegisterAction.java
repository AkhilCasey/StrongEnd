///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.cynber.siddha.servlet;
//
//import com.cynber.siddha.bean.ReceptionPatientRegister;
//import com.cynber.siddha.bean.SiddhaEmployee;
//import com.cynber.siddha.constraints.SiddhaConstraints;
//import com.cynber.siddha.manager.ReceptionPatientRegisterManager;
//import com.itextpdf.text.Document;
//import com.itextpdf.text.DocumentException;
//import com.itextpdf.text.Element;
//import com.itextpdf.text.Paragraph;
//import com.itextpdf.text.pdf.PdfPTable;
//import com.itextpdf.text.pdf.PdfWriter;
//import java.io.File;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.PrintWriter;
//import static java.lang.System.out;
//import java.sql.SQLException;
//import java.sql.Timestamp;
//import java.text.DateFormat;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
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
//@WebServlet(name = "ReceptionPatientRegisterAction", urlPatterns = {"/ReceptionPatientRegisterAction"})
//public class ReceptionPatientRegisterAction extends HttpServlet {
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
//            out.println("<title>Servlet patientregisteraction</title>");
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet patientregisteraction at " + request.getContextPath() + "</h1>");
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
//        SiddhaEmployee user = new SiddhaEmployee();
//        user = (SiddhaEmployee) session.getAttribute("user");
//        if (session.getAttribute("user") instanceof SiddhaEmployee && user.getAccess_privilege() == SiddhaEmployee.RECEPTION_ACCESS_PRIVILEGE) {
//
//            try {
//
//                String createdDate, createdDate1 = null;
//                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//                java.sql.Date sqlDate = null;
//
//                createdDate = request.getParameter("date1");
//
//                System.out.println("createdDate" + createdDate);
//                System.out.println("createdDate1" + createdDate1);
//
//                try {
//                    if (createdDate != null) {
//                        System.out.println("Date");
//                        java.util.Date utildate = sdf.parse(createdDate);
//
//                        System.out.print("utildate" + utildate);
//                        sqlDate = new java.sql.Date(utildate.getTime());
//                        System.out.print("Date1" + sqlDate);
//                    }
//                } catch (ParseException e1) {
//                    System.out.println("Exception " + e1);
//                }
//
//                ReceptionPatientRegister rp = new ReceptionPatientRegister();
//                rp.setPatientname(request.getParameter("Name"));
//                rp.setGender(request.getParameter("gender"));
//                rp.setRegdate(sqlDate);
//                rp.setAge(Integer.parseInt(request.getParameter("age")));
//                rp.setAddress(request.getParameter("address"));
//                rp.setContact(request.getParameter("contact"));
//                rp.setEmergencycontact(request.getParameter("emergencyname"));
//                rp.setRelation(request.getParameter("relation"));
//                rp.setEmergencynumber(request.getParameter("emergencycontact"));
//                rp.setDetails(request.getParameter("details"));
//                rp.setRefdoctor(request.getParameter("refdoctor"));
//                rp.setRefhospital(request.getParameter("refhospital"));
//                rp.setRefhosop(request.getParameter("opnum"));
//                rp.setDepartment(request.getParameter("department"));
//                rp.setDepdoctor(request.getParameter("depdoctor"));
//                ReceptionPatientRegisterManager rpm= new ReceptionPatientRegisterManager();
//                int id = rpm.insertPatient(rp);
//                System.out.println("Pat Id isss...." + id);
//
//                java.util.Date date = new java.util.Date();
//                System.out.println(new Timestamp(date.getTime()));
//                try {
//                    //PDF GENERATE start...
//                    Document document = new Document();
//                    String root = request.getServletContext().getRealPath("/");
//                    File dir = new File(root + File.separator + SiddhaConstraints.RECEPTION_BILL);
//                    if (!dir.exists()) {
//                        dir.mkdir();
//                    }
//                    String bill_pdf = dir.getPath() + File.separator + id + ".pdf";
//
//                    PdfWriter.getInstance(document, new FileOutputStream(bill_pdf));
//
//                    document.open();
//
////    File file = new File("itext-test.pdf");
////			FileOutputStream fileout = new FileOutputStream(file);
////			
////			PdfWriter.getInstance(document, fileout);
////			document.addAuthor("Me");
////			document.addTitle("My iText Test");
//////  Chunk chunk = new Chunk("iText Test");
////Font font = new Font(Font.COURIER);
////font.setStyle(Font.UNDERLINE);
////font.setStyle(Font.ITALIC);
////chunk.setFont(font);
////chunk.setBackground(Color.CYAN);
////document.add(chunk);
//// List list = new List(true, 15);
//// list.add("Pharmacy Bill");
//// list.add("trwtrtrtrwt");
//// list.add("wtrwtwrttr");
//// document.add(list);
//                    Paragraph paragraph = new Paragraph();
//                    paragraph.add("Mannam Ayurveda Co-operative Medical College Hospital");
//                    paragraph.setAlignment(Element.ALIGN_CENTER);
//                    document.add(paragraph);
//
//                    Paragraph paragraph5 = new Paragraph();
//                    paragraph5.add("Pandalam, Pathanamthitta, Pin 689501, Kerala");
//                    paragraph5.setAlignment(Element.ALIGN_CENTER);
//                    document.add(paragraph5);
//
//                    Paragraph paragraph7 = new Paragraph();
//                    paragraph7.add("REGISTRATION BILL");
//                    paragraph7.setAlignment(Element.ALIGN_CENTER);
//                    document.add(paragraph7);
//
//                    Paragraph paragraph8 = new Paragraph();
//                    paragraph8.add("**************");
//                    paragraph8.setAlignment(Element.ALIGN_CENTER);
//                    document.add(paragraph8);
//
//                    Paragraph paragraph6 = new Paragraph();
//                    paragraph6.add("Phone :04734-208060    Fax :04734-252253    e-mail :mannamayurmedcollege@gmail.com");
//                    paragraph6.setAlignment(Element.ALIGN_CENTER);
//                    document.add(paragraph6);
//
//                    Paragraph paragraph2 = new Paragraph();
//                    paragraph2.add("************************************************");
//                    paragraph2.setAlignment(Element.ALIGN_CENTER);
//                    document.add(paragraph2);
//
//                    Paragraph paragraph1 = new Paragraph();
//                    paragraph1.add("Date :" + new Timestamp(date.getTime()) + "                                                                                 OP ID " + id);
//                    paragraph1.setAlignment(Element.ALIGN_LEFT);
//                    document.add(paragraph1);
//
//                    Paragraph paragraph10 = new Paragraph();
//                    paragraph10.add("IP in Charge "+user.getEmp_id());
//                    paragraph10.setAlignment(Element.ALIGN_LEFT);
//                    document.add(paragraph10);
//
//                    Paragraph paragraph9 = new Paragraph();
//                    paragraph9.add("     ");
//                    paragraph9.setAlignment(Element.ALIGN_CENTER);
//                    document.add(paragraph9);
//
//// document.add(new Paragraph("Hello World!"+docid));
//// document.add(new Paragraph("Hello World!"+labid));
//                    PdfPTable table1 = new PdfPTable(3);
//                    table1.addCell("Doctor");
//                    table1.addCell("Appointment Date");
//                    table1.addCell("Fee");
//
//                    System.out.println("ENTER THE PDF");
//
////            IPRegisterManager rpm1 = new IPRegisterManager();
////            ArrayList<IPRegister> array = rpm1.patientDischargeBill(id);
////            int i = 1;
////            for (IPRegister p : array) {
////
//                    DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
//                    Timestamp dat = new Timestamp(date.getTime());
//                    java.util.Date today = dat;
//                    String reportDate = df.format(today);
//                    System.out.println("Report Date:**** " + reportDate);
//
//                    table1.addCell(rp.getDepdoctor());
//                    table1.addCell(reportDate);
//                    table1.addCell("200");
//
//                    System.out.println("PDF Generated...");
//                    document.add(table1);
//
//                    Paragraph paragraph11 = new Paragraph();
//                    paragraph11.add("     ");
//                    paragraph11.setAlignment(Element.ALIGN_CENTER);
//                    document.add(paragraph11);
//
//                    Paragraph paragraph4 = new Paragraph();
//                    paragraph4.add("************************************************");
//                    paragraph4.setAlignment(Element.ALIGN_CENTER);
//                    document.add(paragraph4);
//
//                    document.close();
//
//                } catch (DocumentException ex) {
//                    Logger.getLogger(IPBill.class.getName()).log(Level.SEVERE, null, ex);
//                }
//
//                if (id > 0) {
//                    response.sendRedirect("PatientSearchBill.jsp?id=" + id);
//                } else {
//                    out.println("Registration Failed");
//                }
//
//            } catch (SQLException ex) {
//                Logger.getLogger(ReceptionPatientRegisterAction.class.getName()).log(Level.SEVERE, null, ex);
//            }
//}
//      else {
//            response.sendRedirect("sessionexpired.jsp");
//        }
//        }
//
//        /**
//         * Returns a short description of the servlet.
//         *
//         * @return a String containing servlet description
//         */
//        @Override
//        public String getServletInfo
//        
//            () {
//        return "Short description";
//        }// </editor-fold>
//
//    }
