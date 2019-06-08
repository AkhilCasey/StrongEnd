///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.casey.implementation;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.ArrayList;
//
//import com.casey.bean.PrescriptionDTO;
//import com.casey.bean.PharmacyMedicineDTO;
//import com.casey.bean.ReceptionPatientRegister;
//import com.casey.bean.AdminDTO;
//import com.casey.bean.PatientDTO;
//import com.casey.dbconnection.ConnectionProvider;
//
///**
// *
// * @author d06521
// */
//public class adminManager {
//    
//    public ArrayList<AdminDTO> viewDepartments() throws SQLException
//    {
//        
//        ArrayList<AdminDTO> list=new ArrayList<AdminDTO>();
//        Connection con = ConnectionProvider.createConnection();
//        PreparedStatement pst = con.prepareStatement("select distinct * from department");
//        ResultSet rs=pst.executeQuery();
//        while(rs.next()){
//           AdminDTO ab=new AdminDTO();
//           ab.setDepartment(rs.getString(2));
//           list.add(ab);
//        }
//    return list;
//    }
//
//    public void insert(AdminDTO ob) throws SQLException {
//        Connection con = ConnectionProvider.createConnection();
//        PreparedStatement pst = con.prepareStatement("insert into department(Department_Name,Phone_Number,Location,Floor,Head) values(?,?,?,?,?) ");
//        pst.setString(1, ob.getDepartment());
//        pst.setInt(2, ob.getPhone());
//        pst.setString(3, ob.getLocation());
//        pst.setString(4, ob.getFloor());
//        pst.setString(5, ob.getHead());
//
//        pst.executeUpdate();
//        
//    }
//    public  ResultSet selectDepartment() throws SQLException
//    {
//        Connection con = ConnectionProvider.createConnection();
//        PreparedStatement pst = con.prepareStatement("select distinct Department_Name from department");
//        ResultSet rs=pst.executeQuery();
//        return rs;
//    }
//    public  ResultSet selectDoctor() throws SQLException
//    {
//        Connection con = ConnectionProvider.createConnection();
//        PreparedStatement pst = con.prepareStatement("SELECT Emp_Name FROM employee WHERE Designation='Doctor'");
//        ResultSet rs=pst.executeQuery();
//        return rs;
//    }
//    
//    public int insertDepartment(AdminDTO ad)throws SQLException
//    {
//        Connection con = ConnectionProvider.createConnection();
//       
//        PreparedStatement pst = con.prepareStatement("insert into departmentdoctor(Department_Name,Doctor_Name)values(?,?)");
//        pst.setString(1, ad.getDepartment());
//        pst.setString(2, ad.getDoctor());
//        int i=pst.executeUpdate();
//        return i;
//    }
//    
//    public int insert1(AdminDTO tb) throws SQLException
//    {
//        ConnectionProvider db=new ConnectionProvider();
//        Connection con=db.createConnection();
//        PreparedStatement pst=con.prepareStatement("insert into treatment(Treatment_Type,Amount)values(?,?)");
//        pst.setString(1,tb.getTreatementtype());
//        pst.setFloat(2,tb.getAmount());
//       int i= pst.executeUpdate();
//       return i;
//         }
//    
//    public ArrayList<AdminDTO> treatementview() throws SQLException{
//        
//         ArrayList<AdminDTO> arraylist=new ArrayList<AdminDTO>();
//    Connection con=ConnectionProvider.createConnection();
//    PreparedStatement pst=con.prepareStatement("select * from treatment");
//    ResultSet rs=pst.executeQuery();
//    while (rs.next()) {
//           
//            AdminDTO tb = new AdminDTO();
//            tb.setTreatementid(rs.getInt(1));
//            tb.setTreatementtype(rs.getString(2));
//            tb.setAmount(rs.getFloat(3));
//                  
//
//            arraylist.add(tb);
//        }
//        rs.close();
//        pst.close();
//        con.close();
//        return arraylist;
//    
//    
//    
//    
//    
//    }
//    public AdminDTO showTreatement(int treatementid) throws SQLException{
//        
//        AdminDTO tb=new AdminDTO();
//    ConnectionProvider db=new ConnectionProvider();
//    Connection con=db.createConnection();
//    PreparedStatement pst=con.prepareStatement("Select * from treatment where Treatment_Id=?");
//    pst.setInt(1, treatementid);
//    ResultSet rs=pst.executeQuery();
//    if(rs.next())
//    {
//        tb.setTreatementid(rs.getInt(1));
//        tb.setTreatementtype(rs.getString(2));
//        tb.setAmount(rs.getFloat(3));
//    }
//    return tb;
//    
//    
//    
//    
//    
//    
//    }
//     public int update(AdminDTO tb) throws SQLException{
//     
//     ConnectionProvider db=new ConnectionProvider();
//        Connection con=db.createConnection();
//        PreparedStatement pst= con.prepareStatement("update treatment SET Treatment_Type=?,Amount=? WHERE Treatment_Id =?");
//        
//        
//        pst.setString(1,tb.getTreatementtype()  );
//        pst.setFloat(2,tb.getAmount()  );
//        pst.setInt(3,tb.getTreatementid() );
//       
//        int i= pst.executeUpdate();
//       
//        return i;
//     
//     }
//     
//     public int insertPatient(PatientDTO rp) throws SQLException
//    {
//        ConnectionProvider obj=new ConnectionProvider();
//        Connection con=obj.createConnection();
//        PreparedStatement pst = con.prepareStatement("insert into patientregister(Patient_Name,Date,Age,Gender,Address,Contact,Emergency_contact,Relation,Emergency_Number,Details,Reffered_Doctor,Reffered_Hospital,Reffered_Hosp_Op,Department,Doctor,Status)values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
//        pst.setString(1, rp.getPatientname());
//        pst.setDate(2, rp.getRegdate());
//        pst.setInt(3, rp.getAge());
//        pst.setString(4, rp.getGender());
//        pst.setString(5, rp.getAddress());
//        pst.setString(6, rp.getContact());
//        pst.setString(7, rp.getEmergencycontact());
//        pst.setString(8, rp.getRelation());
//        pst.setString(9, rp.getEmergencynumber());
//        pst.setString(10, rp.getDetails());
//        pst.setString(11, rp.getRefdoctor());
//        pst.setString(12, rp.getRefhospital());
//        pst.setString(13, rp.getRefhosop());
//        pst.setString(14, rp.getDepartment());
//        pst.setString(15, rp.getDepdoctor());
//        pst.setString(16, rp.getStatus());
//        int i=pst.executeUpdate();
//        return i;
//    }
//     
//      public ArrayList<PrescriptionDTO> viewDoctorreport() throws SQLException {
//         
//          ArrayList<PrescriptionDTO> arraylist=new ArrayList<PrescriptionDTO>();
//         Connection con=ConnectionProvider.createConnection();
//         PreparedStatement pst=con.prepareStatement("select * from doctormedicalreport"); 
//         ResultSet rs=pst.executeQuery();
//        while (rs.next()) {
//           
//            PrescriptionDTO dp = new PrescriptionDTO();
//            
//            dp.setReportID(rs.getInt(1));
//            dp.setPatient_ID(rs.getInt(2));
//            dp.setDoctor_ID(rs.getInt(3));
//            dp.setDiagonosis(rs.getString(4));
//            dp.setDate(rs.getTimestamp(5));
//
//            arraylist.add(dp);
//             }
//        rs.close();
//        pst.close();
//        con.close();
//        return arraylist;
//     }
//     public ArrayList<PharmacyMedicineDTO> viewPharmacyreport() throws SQLException  {
//         
//          ArrayList<PharmacyMedicineDTO> arraylist=new ArrayList<PharmacyMedicineDTO>();
//         Connection con=ConnectionProvider.createConnection();
//         PreparedStatement pst=con.prepareStatement("select * from pharmacystock"); 
//         ResultSet rs=pst.executeQuery();
//        while (rs.next()) {
//           
//            PharmacyMedicineDTO pm = new PharmacyMedicineDTO();
//            
//            pm.setStockId(rs.getInt(1));
//            pm.setMedicinename(rs.getString(2));
//            pm.setMedcode(rs.getString(3));
//            pm.setBatchcode(rs.getString(4));
//            pm.setMdate(rs.getDate(5));
//            pm.setEdate(rs.getDate(6));
//            pm.setSuppname(rs.getString(7));
//            pm.setUom(rs.getString(8));
//            pm.setRate(rs.getFloat(9));
//            pm.setTotalamount(rs.getFloat(10));
//            pm.setCategory(rs.getString(11));
//            pm.setQuantity(rs.getInt(12));
//            
//            
//
//
//
//            arraylist.add(pm);
//             }
//        rs.close();
//        pst.close();
//        con.close();
//        return arraylist;
//     }
//        
//     
//    
//}
