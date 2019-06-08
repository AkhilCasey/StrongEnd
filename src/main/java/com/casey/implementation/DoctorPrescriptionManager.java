//package com.casey.implementation;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.ArrayList;
//import java.util.List;
//
//import com.casey.bean.PrescriptionDTO;
//import com.casey.dbconnection.ConnectionProvider;
//
///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
///**
// *
// * @author D06507
// */
//public class DoctorPrescriptionManager {
//    
//    public int insert(PrescriptionDTO po) throws SQLException {
//        int x = 0;
//        Connection con = ConnectionProvider.createConnection();
//        PreparedStatement pst = con.prepareStatement("insert into doctormedicalreport(Patient_Id,"
//                + "Doctor_id,Diagonosis,Date)values (?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
//        // pst.setInt(1, po.getReportID());
//        pst.setInt(1, po.getPatient_ID());
//        pst.setInt(2, po.getDoctor_ID());
//        pst.setString(3, po.getDiagonosis());
//      //  pst.setString(4, po.getTreatement());
//        pst.setTimestamp(4, po.getDate());
//        
//        pst.executeUpdate();
//        
//        ResultSet rs = pst.getGeneratedKeys();
//        if (rs.next()) {
//            x = rs.getInt(1);
//            
//        }
//
//        //System.out.println("REPORT id IN manager iss"+x);
//        pst.close();
//
//        // System.out.println("DATA 1 INSERTED1");
//        return x;
//    }
//
//    public ArrayList<PrescriptionDTO> select() throws SQLException {
//        Connection con = ConnectionProvider.createConnection();
//        ArrayList<PrescriptionDTO> arraylist = new ArrayList<PrescriptionDTO>();
//        PreparedStatement pst = con.prepareStatement("select * from doctormedicalreport group by Report_Id");
//        ResultSet rs = pst.executeQuery();
//        
//        while (rs.next()) {
//            PrescriptionDTO obj = new PrescriptionDTO();
//            obj.setReportID(rs.getInt(1));
//            System.out.println("111"+rs.getInt(1));
//            obj.setPatient_ID(rs.getInt(2));
//             System.out.println("2222"+rs.getInt(2));
//            obj.setDoctor_ID(rs.getInt(3));
//             System.out.println("111"+rs.getInt(1));
//            obj.setDiagonosis(rs.getString(4));
//             System.out.println("111"+rs.getInt(1));
//           
//            obj.setDate(rs.getTimestamp(5));
//            arraylist.add(obj);
//        }
//        
//        rs.close();
//        pst.close();
//        con.close();        
//        return arraylist;        
//        
//    }
//    
//    public void insertLab(List<PrescriptionDTO> obj) throws SQLException {
//        
//        Connection con = ConnectionProvider.createConnection();
//        
//        PreparedStatement pst1 = con.prepareStatement("insert into laboratory(Report_Id,Patient_Id,Test_Name,Doctor_id,Prescribed_Date,Status)values (?,?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
//        for (PrescriptionDTO po : obj) {
//            pst1.setInt(1, po.getReportID());
//            // System.out.println("oooooooooooo"+po.getReportID());
//            pst1.setInt(2, po.getPatient_ID());
//            pst1.setString(3, po.getTest_name());
//            pst1.setInt(4, po.getDoctor_ID());
//            pst1.setTimestamp(5, po.getPrescribedDate());
//            pst1.setString(6, po.getStatus());
//            if(!po.getTest_name().equals("No Test")){
//            pst1.addBatch();}
//        }
//        pst1.executeBatch();
//        pst1.close();
//        con.close();
//        
//    }
//    
//     public ArrayList<PrescriptionDTO> selectbyid(int id) throws SQLException {
//        Connection con = ConnectionProvider.createConnection();
//       
//        PreparedStatement pst = con.prepareStatement("select * from prescribed_medicines where medical_report_id=?");
//        pst.setInt(1, id);
//        ResultSet rs = pst.executeQuery();
//        ArrayList<PrescriptionDTO> arraylist = new ArrayList<PrescriptionDTO>();
//        
//        while (rs.next()) {
//           PrescriptionDTO obj = new PrescriptionDTO();
//           
//           obj.setPrescriptionid(rs.getInt(1));
//            obj.setMedicalReportId(rs.getInt(2));
//            obj.setMedicineName(rs.getString(3));
//            obj.setUsage(rs.getString(4));
//            obj.setMrp(rs.getFloat(5));
//            obj.setQuantity(rs.getString(6));
//            obj.setDuration(rs.getString(7));
//            obj.setDay(rs.getString(8));
//            obj.setComments(rs.getString(9));
//        arraylist.add(obj);
//        
//        }
//        
//           
//        return arraylist;        
//        
//    }
//    public void insertmedicine(List<PrescriptionDTO> medicines) throws SQLException {
//
//        Connection con = ConnectionProvider.createConnection();
//        String sql = "INSERT INTO prescribed_medicines(medical_report_id,medicine_name,mrp,`usage`,quantity,duration,`day`,comments)VALUES (?,?,?,?,?,?,?,?)";
//        PreparedStatement ps = con.prepareStatement(sql);
//        for (PrescriptionDTO medicine : medicines) {
//            //MedicalReport med =new MedicalReport();
//            // medicine.setComments(med.getComments());
//
//           // ps.setInt(1, medicine.getPrescriptionId());
//            ps.setInt(1, medicine.getMedicalReportId());
//            ps.setString(2, medicine.getMedicineName());
//            ps.setFloat(3, medicine.getMrp());
//            ps.setString(4, medicine.getUsage());
//            ps.setString(5, medicine.getQuantity());
//            ps.setString(6, medicine.getDuration());
//            ps.setString(7, medicine.getDay());
//            ps.setString(8, medicine.getComments());
//            ps.addBatch();
//            System.out.println("value entered in prescribed medicines comm is.." + medicine.getComments());
//        }
//        ps.executeBatch();
//        ps.close();
//        con.close();
//
//    }
// 
//public ArrayList<PrescriptionDTO> viewbill() throws SQLException {
//        Connection con = ConnectionProvider.createConnection();
//       ArrayList<PrescriptionDTO> arraylist = new ArrayList<PrescriptionDTO>();
//               PreparedStatement pst = con.prepareStatement("select * from pharmacybill ");
//        
//        ResultSet rs = pst.executeQuery();
//        
//        
//        while (rs.next()) {
//            
//           PrescriptionDTO obj = new PrescriptionDTO();
//           
//            obj.setReportID(rs.getInt(2));
//            obj.setPrescriptionid(rs.getInt(3));
//            obj.setMedicineName(rs.getString(4));
//            obj.setUsage(rs.getString(5));
//            obj.setMrp(rs.getFloat(6));
//            obj.setQuantity(rs.getString(7));
//            obj.setDuration(rs.getString(8));
//            obj.setDay(rs.getString(9));
//          
//     arraylist.add(obj);
//        }       
//        return arraylist;        
//      }
//
//public Float SelectMedCost(String name) throws SQLException{
// Connection con=ConnectionProvider.createConnection();
//        PreparedStatement pst=con.prepareStatement("SELECT Rate FROM pharmacystock where Medicine_Name=?");
//        pst.setString(1, name);
//        ResultSet rs=pst.executeQuery();
//        rs.next();
//        Float charge=rs.getFloat(1);
//        System.out.println("charge in managerr  "+rs.getInt(1)); 
//       return charge;
//       
// }
//
//
//public void insert12(PrescriptionDTO obj) throws SQLException {
//        
//        Connection con = ConnectionProvider.createConnection();
//              PreparedStatement pst1 = con.prepareStatement("insert into pharmacybill(report_id,prescription_id,medicine_name,`usage`,mrp,quantity,duration,day)values (?,?,?,?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
//                  pst1.setInt(1, obj.getMedicalReportId());
//            pst1.setInt(2, obj.getPrescriptionid());                
//            pst1.setString(3, obj.getMedicineName());
//            pst1.setString(4, obj.getUsage());
//            pst1.setFloat(5, obj.getMrp());
//            pst1.setString(6, obj.getQuantity());
//            pst1.setString(7, obj.getDuration());
//             pst1.setString(8, obj.getDay());
//              pst1.executeUpdate();
//            
//        }
//   
//public ArrayList<PrescriptionDTO> selectbill(int rid) throws SQLException {
//        Connection con = ConnectionProvider.createConnection();
//       ArrayList<PrescriptionDTO> arraylist = new ArrayList<PrescriptionDTO>();
//               PreparedStatement pst = con.prepareStatement("select * from pharmacybill where report_id=?");
//        pst.setInt(1, rid);
//        ResultSet rs = pst.executeQuery();
//               
//        while (rs.next()) {
//                  PrescriptionDTO obj = new PrescriptionDTO();
//            
//            obj.setPrescriptionid(rs.getInt(2));
//            obj.setMedicalReportId(rs.getInt(3));
//            obj.setMedicineName(rs.getString(4));
//            obj.setUsage(rs.getString(5));
//            
//            obj.setMrp(rs.getFloat(6));
//            obj.setQuantity(rs.getString(7));
//            obj.setDuration(rs.getString(8));
//            obj.setDay(rs.getString(9));
//           
//            arraylist.add(obj);
//        }       
//        return arraylist;        
//        
//    }
//
//    
//public PrescriptionDTO selectid(int id) throws SQLException {
//        Connection con = ConnectionProvider.createConnection();
//       
//        PreparedStatement pst = con.prepareStatement("select * from prescribed_medicines where  prescription_id=?");
//        pst.setInt(1, id);
//        ResultSet rs = pst.executeQuery();
//        
//         PrescriptionDTO obj = new PrescriptionDTO();
//        while (rs.next()) {
//                 
//            obj.setPrescriptionid(rs.getInt(1));
//            obj.setMedicalReportId(rs.getInt(2));
//            obj.setMedicineName(rs.getString(3));
//            obj.setUsage(rs.getString(4));
//            obj.setMrp(rs.getFloat(5));
//            obj.setQuantity(rs.getString(6));
//            obj.setDuration(rs.getString(7));
//            obj.setDay(rs.getString(8));
//            obj.setComments(rs.getString(9));
//        
//        
//        }
//        
//           
//        return obj;        
//        
//    }
//
//}
