/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cynber.siddha.servlet;

import com.cynber.siddha.bean.DoctorPrescription;
import com.cynber.siddha.bean.SiddhaEmployee;
import com.cynber.siddha.constraints.SiddhaConstraints;
import com.cynber.siddha.manager.DoctorPrescriptionManager;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
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
@WebServlet(name = "generatebill", urlPatterns = {"/generatebill"})
public class generatebill extends HttpServlet {

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
            out.println("<title>Servlet generatebill</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet generatebill at " + request.getContextPath() + "</h1>");
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
             HttpSession session = request.getSession();
     SiddhaEmployee phar = new SiddhaEmployee();
  phar=(SiddhaEmployee)session.getAttribute("user");
if(session.getAttribute("user") instanceof SiddhaEmployee && phar.getAccess_privilege()==SiddhaEmployee.PHARMACIST_ACCESS_PRIVILEGE)
{
        
        
        try {
            int quantity=0;
            float mrp=0,total=0,cost=0;
            DoctorPrescription obj = new DoctorPrescription();
            int rid = Integer.parseInt(request.getParameter("rid"));
            int patid = Integer.parseInt(request.getParameter("patid"));
                       
                         
                
                java.util.Date date = new java.util.Date();
                System.out.println(new Timestamp(date.getTime()));
                
                //PDF GENERATE start...
                Document document = new Document();
                String root = request.getServletContext().getRealPath("/");
                File dir = new File(root + File.separator + SiddhaConstraints.PHARMACY_BILL);
                if (!dir.exists()) {
                    dir.mkdir();
                }
                String bill_pdf = dir.getPath() + File.separator + rid + ".pdf";
                
                PdfWriter.getInstance(document, new FileOutputStream(bill_pdf));
                
                document.open();
                
//    File file = new File("itext-test.pdf");
//			FileOutputStream fileout = new FileOutputStream(file);
//			
//			PdfWriter.getInstance(document, fileout);
//			document.addAuthor("Me");
//			document.addTitle("My iText Test");
////  Chunk chunk = new Chunk("iText Test");
//Font font = new Font(Font.COURIER);
//font.setStyle(Font.UNDERLINE);
//font.setStyle(Font.ITALIC);
//chunk.setFont(font);
//chunk.setBackground(Color.CYAN);
//document.add(chunk);
// List list = new List(true, 15);
// list.add("Pharmacy Bill");
// list.add("trwtrtrtrwt");
// list.add("wtrwtwrttr");
// document.add(list);
Paragraph paragraph = new Paragraph();
paragraph.add("Mannam Ayurveda Co-operative Medical College Hospital");
paragraph.setAlignment(Element.ALIGN_CENTER);
document.add(paragraph);

Paragraph paragraph5 = new Paragraph();
paragraph5.add("Pandalam, Pathanamthitta, Pin 689501, Kerala");
paragraph5.setAlignment(Element.ALIGN_CENTER);
document.add(paragraph5);

Paragraph paragraph7 = new Paragraph();
paragraph7.add("TREATMENT BILL");
paragraph7.setAlignment(Element.ALIGN_CENTER);
document.add(paragraph7);

Paragraph paragraph8 = new Paragraph();
paragraph8.add("**************");
paragraph8.setAlignment(Element.ALIGN_CENTER);
document.add(paragraph8);

Paragraph paragraph6 = new Paragraph();
paragraph6.add("Phone :04734-208060    Fax :04734-252253    e-mail :mannamayurmedcollege@gmail.com");
paragraph6.setAlignment(Element.ALIGN_CENTER);
document.add(paragraph6);

Paragraph paragraph2 = new Paragraph();
paragraph2.add("************************************************");
paragraph2.setAlignment(Element.ALIGN_CENTER);
document.add(paragraph2);

Paragraph paragraph1 = new Paragraph();
paragraph1.add("Date :" + new Timestamp(date.getTime()) + "                                                                                 OP ID " + patid);
paragraph1.setAlignment(Element.ALIGN_LEFT);
document.add(paragraph1);

Paragraph paragraph10 = new Paragraph();
paragraph10.add("Pharmacy in Charge "+phar.getEmp_id());
paragraph10.setAlignment(Element.ALIGN_LEFT);
document.add(paragraph10);

Paragraph paragraph9 = new Paragraph();
paragraph9.add("     ");
paragraph9.setAlignment(Element.ALIGN_CENTER);
document.add(paragraph9);

// document.add(new Paragraph("Hello World!"+docid));
// document.add(new Paragraph("Hello World!"+labid));
PdfPTable table1 = new PdfPTable(8);
table1.addCell("SI No");
table1.addCell("Medicine");
table1.addCell("Usage");
table1.addCell("Unit Price");
table1.addCell("Quantity");
table1.addCell("Duration");
table1.addCell("Day");
table1.addCell("Cost");

System.out.println("ENTER THE PDF");





 DoctorPrescriptionManager objM = new DoctorPrescriptionManager();
            DoctorPrescriptionManager objM1 = new DoctorPrescriptionManager();
            ArrayList<DoctorPrescription> array = objM.selectbyid(rid);
            int i=1;
            for (DoctorPrescription p : array) {
                mrp=p.getMrp();
                quantity=Integer.parseInt(p.getQuantity());
                cost = mrp*quantity;
                total=cost+total; 
                
                obj.setPrescriptionid(p.getPrescriptionid());
                obj.setMedicalReportId(p.getMedicalReportId());
                obj.setMedicineName(p.getMedicineName());
                obj.setUsage(p.getUsage());
                obj.setMrp(p.getMrp());
                obj.setQuantity(p.getQuantity());
                obj.setDuration(p.getDuration());
                obj.setDay(p.getDay());
                
                objM1.insert12(obj);



table1.addCell(Integer.toString(i));
table1.addCell(p.getMedicineName());
table1.addCell(p.getUsage());
table1.addCell(Float.toString(p.getMrp()));
table1.addCell(p.getQuantity());
table1.addCell(p.getDuration());
table1.addCell(p.getDay());
table1.addCell(Float.toString(cost));


System.out.println("TOTAL" + total);
i++;
  }
System.out.println("PDF Generated...");
document.add(table1);

PdfPTable table2 = new PdfPTable(3);
table2.addCell("");
table2.addCell("Gross Total");
table2.addCell(Float.toString(total));
document.add(table2);




Paragraph paragraph11 = new Paragraph();
paragraph11.add("     ");
paragraph11.setAlignment(Element.ALIGN_CENTER);
document.add(paragraph11);

Paragraph paragraph4 = new Paragraph();
paragraph4.add("************************************************");
paragraph4.setAlignment(Element.ALIGN_CENTER);
document.add(paragraph4);

document.close();



response.sendRedirect("PharmacyBilling.jsp?status=billed&rid="+rid+"&patid=" + patid);
    
        } catch (SQLException ex) {
            Logger.getLogger(generatebill.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(generatebill.class.getName()).log(Level.SEVERE, null, ex);
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
