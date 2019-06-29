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
//import com.casey.bean.PatientDTO;
//import com.casey.bean.ReceptionPatientRegister;
//import com.casey.dbconnection.ConnectionProvider;
//
///**
// *
// * @author cynber
// */
//public class ReceptionPatientRegisterManager {
//
//    public int insertPatient(PatientDTO rp) throws SQLException {
//        int x = 0;
//        ConnectionProvider obj = new ConnectionProvider();
//        Connection con = obj.createConnection();
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
//        pst.executeUpdate();
//         ResultSet rs = pst.getGeneratedKeys();
//        if (rs.next()) {
//            x = rs.getInt(1);
//
//        }
//        
//      
//        
//        
//        
//        PreparedStatement pst1 = con.prepareStatement("insert into op_booking(Op_Id,Name,Address,Doc_Name,Date)values (?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
//        pst1.setInt(1, x);
//        pst1.setString(2, rp.getPatientname());
//        pst1.setString(3, rp.getAddress());
//        pst1.setString(4, rp.getDepdoctor());
//        System.out.println("nameeeeeeeeee"+rp.getRefdoctor());
//        pst1.setDate(5, rp.getRegdate());
//      
//        pst1.executeUpdate();
//        
//        
//        
//       
//        return x;
//    }
//
//    public int insertRePatient(ReceptionPatientRegister rp) throws SQLException {
//        int x = 0;
//        ConnectionProvider obj = new ConnectionProvider();
//        Connection con = obj.createConnection();
//        PreparedStatement pst = con.prepareStatement("insert into patientregister(Patient_Name,Date,Age,Gender,Address,Contact,Emergency_contact,Relation,Emergency_Number,Details,Reffered_Doctor,Reffered_Hospital,Reffered_Hosp_Op,Department,Doctor,Old_Id)values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
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
//        pst.setInt(16, rp.getOldid());
//        pst.executeUpdate();
//        ResultSet rs = pst.getGeneratedKeys();
//        if (rs.next()) {
//            x = rs.getInt(1);
//
//            
//            
//                   
//        PreparedStatement pst1 = con.prepareStatement("insert into op_booking(Op_Id,Name,Address,Doc_Name,Date)values (?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
//        pst1.setInt(1, x);
//        pst1.setString(2, rp.getPatientname());
//        pst1.setString(3, rp.getAddress());
//        pst1.setString(4, rp.getDepdoctor());
//        System.out.println("nameeeeeeeeee"+rp.getRefdoctor());
//        pst1.setDate(5, rp.getRegdate());
//      
//        pst1.executeUpdate(); 
//            
//            
//            
//            
//        }
//        return x;
//    }
//
//    public ArrayList<ReceptionPatientRegister> selectSingleBill(int id) throws SQLException {
//        ArrayList<ReceptionPatientRegister> arraylist = new ArrayList<ReceptionPatientRegister>();
//        Connection con = ConnectionProvider.createConnection();
//        PreparedStatement pst = con.prepareStatement("SELECT * FROM patientregister where Patient_Id=?");
//        pst.setInt(1, id);
//        ResultSet rs = pst.executeQuery();
//
//        while (rs.next()) {
//            ReceptionPatientRegister obj = new ReceptionPatientRegister();
//            obj.setPatientid(rs.getInt(1));
//            obj.setPatientname(rs.getString(2));
//            obj.setAge(rs.getInt(4));
//            obj.setContact(rs.getString(8));
//            obj.setAddress(rs.getString(7));
//            obj.setDetails(rs.getString(12));
//
//            arraylist.add(obj);
//        }
//        rs.close();
//        pst.close();
//        con.close();
//        return arraylist;
//
//    }
//
//    public ReceptionPatientRegister editPatient(int pid) throws SQLException {
//        ConnectionProvider db = new ConnectionProvider();
//        Connection con = db.createConnection();
//        PreparedStatement pst = con.prepareStatement("Select * from patientregister where Patient_Id=?");
//        pst.setInt(1, pid);
//        ReceptionPatientRegister rp = new ReceptionPatientRegister();
//        ResultSet rs = pst.executeQuery();
//        while (rs.next()) {
//
//            rp.setPatientid(rs.getInt(1));
//            System.out.println("------" + rs.getInt(1));
//            rp.setPatientname(rs.getString(2));
//            rp.setRegdate(rs.getDate(3));
//            rp.setAge(rs.getInt(4));
//            rp.setDob(rs.getDate(5));
//            rp.setGender(rs.getString(6));
//            rp.setAddress(rs.getString(7));
//            rp.setContact(rs.getString(8));
//            System.out.println("---++++---" + rs.getString(8));
//            rp.setEmergencycontact(rs.getString(9));
//            rp.setRelation(rs.getString(10));
//            rp.setEmergencynumber(rs.getString(11));
//            rp.setDetails(rs.getString(12));
//            rp.setRefdoctor(rs.getString(13));
//            rp.setRefhospital(rs.getString(14));
//            rp.setRefhosop(rs.getString(15));
//        }
//        return rp;
//    }
//
//    public ReceptionPatientRegister editAdminPatient(int pid) throws SQLException {
//        ConnectionProvider db = new ConnectionProvider();
//        Connection con = db.createConnection();
//        PreparedStatement pst = con.prepareStatement("Select * from siddhapatient where Patient_Id=?");
//        pst.setInt(1, pid);
//        ReceptionPatientRegister rp = new ReceptionPatientRegister();
//        ResultSet rs = pst.executeQuery();
//        while (rs.next()) {
//
//            rp.setPatientid(rs.getInt(1));
//            System.out.println("------" + rs.getInt(1));
//            rp.setPatientname(rs.getString(2));
//            rp.setRegdate(rs.getDate(3));
//            rp.setAge(rs.getInt(4));
//            rp.setDob(rs.getDate(5));
//            rp.setGender(rs.getString(6));
//            rp.setAddress(rs.getString(7));
//            rp.setContact(rs.getString(8));
//            System.out.println("---++++---" + rs.getString(8));
//            rp.setEmergencycontact(rs.getString(9));
//            rp.setRelation(rs.getString(10));
//            rp.setEmergencynumber(rs.getString(11));
//            rp.setDetails(rs.getString(12));
//            rp.setRefdoctor(rs.getString(13));
//            rp.setRefhospital(rs.getString(14));
//            rp.setRefhosop(rs.getString(15));
//        }
//        return rp;
//    }
//
//    public ReceptionPatientRegister editAdminPatientExist(int pid) throws SQLException {
//        ConnectionProvider db = new ConnectionProvider();
//        Connection con = db.createConnection();
//        PreparedStatement pst = con.prepareStatement("Select * from patientregister where Patient_Id=?");
//        pst.setInt(1, pid);
//        ReceptionPatientRegister rp = new ReceptionPatientRegister();
//        ResultSet rs = pst.executeQuery();
//        while (rs.next()) {
//
//            rp.setPatientid(rs.getInt(1));
//            System.out.println("------" + rs.getInt(1));
//            rp.setPatientname(rs.getString(2));
//            rp.setRegdate(rs.getDate(3));
//            rp.setAge(rs.getInt(4));
//            rp.setDob(rs.getDate(5));
//            rp.setGender(rs.getString(6));
//            rp.setAddress(rs.getString(7));
//            rp.setContact(rs.getString(8));
//            System.out.println("---++++---" + rs.getString(8));
//            rp.setEmergencycontact(rs.getString(9));
//            rp.setRelation(rs.getString(10));
//            rp.setEmergencynumber(rs.getString(11));
//            rp.setDetails(rs.getString(12));
//            rp.setRefdoctor(rs.getString(13));
//            rp.setRefhospital(rs.getString(14));
//            rp.setRefhosop(rs.getString(15));
//        }
//        return rp;
//    }
//
//    public int updatePatient(ReceptionPatientRegister rp) throws SQLException {
//        ConnectionProvider ob = new ConnectionProvider();
//        Connection con = ob.createConnection();
//        PreparedStatement pst = con.prepareStatement("update patientregister set Patient_Name=?,Date=?,Age=?,Gender=?,Address=?,Contact=?,Emergency_contact=?,Relation=?,Emergency_Number=?,Details=?,Reffered_Doctor=?,Reffered_Hospital=?,Reffered_Hosp_Op=? where Patient_Id=?");
//
//        System.out.println(rp.getPatientname());
//        System.out.println(rp.getRegdate());
//        System.out.println(rp.getAge());
//        System.out.println(rp.getGender());
//        System.out.println(rp.getAddress());
//        System.out.println(rp.getContact());
//        System.out.println(rp.getEmergencycontact());
//        System.out.println(rp.getRelation());
//        System.out.println(rp.getEmergencynumber());
//        System.out.println(rp.getDetails());
//
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
//        pst.setInt(14, rp.getPatientid());
//        int i = pst.executeUpdate();
//        return i;
//    }
//
//    public ArrayList<ReceptionPatientRegister> select() throws SQLException {
//        ArrayList<ReceptionPatientRegister> arraylist = new ArrayList<ReceptionPatientRegister>();
//        Connection con = ConnectionProvider.createConnection();
//        PreparedStatement pst = con.prepareStatement("SELECT * FROM patientregister order by Patient_Id desc");
//
//        ResultSet rs = pst.executeQuery();
//
//        while (rs.next()) {
//            ReceptionPatientRegister obj = new ReceptionPatientRegister();
//            obj.setPatientid(rs.getInt(1));
//            obj.setPatientname(rs.getString(2));
//            obj.setAge(rs.getInt(4));
//            obj.setContact(rs.getString(8));
//            obj.setAddress(rs.getString(7));
//            obj.setDetails(rs.getString(12));
//            obj.setStatus(rs.getString(19));
//
//            arraylist.add(obj);
//        }
//        rs.close();
//        pst.close();
//        con.close();
//        return arraylist;
//
//    }
//
//    public ArrayList<ReceptionPatientRegister> selectPatientSearch() throws SQLException {
//        ArrayList<ReceptionPatientRegister> arraylist = new ArrayList<ReceptionPatientRegister>();
//        Connection con = ConnectionProvider.createConnection();
//        PreparedStatement pst = con.prepareStatement("SELECT * FROM siddhapatient order by Patient_Id desc");
//
//        ResultSet rs = pst.executeQuery();
//
//        while (rs.next()) {
//            ReceptionPatientRegister obj = new ReceptionPatientRegister();
//            obj.setPatientid(rs.getInt(1));
//            obj.setPatientname(rs.getString(2));
//            obj.setAge(rs.getInt(4));
//            obj.setContact(rs.getString(8));
//            obj.setAddress(rs.getString(7));
//            obj.setDetails(rs.getString(12));
//
//            arraylist.add(obj);
//        }
//        rs.close();
//        pst.close();
//        con.close();
//        return arraylist;
//
//    }
//
//    public int patientOPCheck(int patientid) throws SQLException {
//        ReceptionPatientRegister obj = new ReceptionPatientRegister();
//        ConnectionProvider db = new ConnectionProvider();
//        Connection con = db.createConnection();
//        int j = 0;
//        PreparedStatement pst = con.prepareStatement("select * from ipregister where Patient_Id=?");
//        pst.setInt(1, patientid);
//        ResultSet rs = pst.executeQuery();
//        if (rs.next()) {
//            j = 1;
//        }
//        return j;
//    }
//
//    public ReceptionPatientRegister getPatientDetails(int patientid) throws SQLException {
//        ReceptionPatientRegister obj = new ReceptionPatientRegister();
//        ConnectionProvider db = new ConnectionProvider();
//        Connection con = db.createConnection();
//        PreparedStatement pst = con.prepareStatement("select * from patientregister where Patient_Id=?");
//        pst.setInt(1, patientid);
//        ResultSet rs = pst.executeQuery();
//        while (rs.next()) {
//            obj.setPatientid(rs.getInt(1));
//            obj.setPatientname(rs.getString(2));
//            obj.setRegdate(rs.getDate(3));
//            obj.setAge(rs.getInt(4));
//            obj.setDob(rs.getDate(5));
//            obj.setGender(rs.getString(6));
//            obj.setAddress(rs.getString(7));
//            obj.setContact(rs.getString(8));
//            obj.setEmergencycontact(rs.getString(9));
//            obj.setRelation(rs.getString(10));
//            obj.setEmergencynumber(rs.getString(11));
//            obj.setDetails(rs.getString(12));
//            obj.setRefdoctor(rs.getString(13));
//            obj.setRefhosop(rs.getString(14));
//            obj.setRefhosop(rs.getString(15));
//            obj.setDepartment(rs.getString(16));
//            obj.setDepdoctor(rs.getString(17));
//
//        }
//        return obj;
//    }
//}
