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
//import java.util.ArrayList;
//
//import com.casey.bean.LaboratoryBean;
//import com.casey.dbconnection.ConnectionProvider;
//
///**
// *
// * @author D06515
// */
//public class LaboratoryManager {
//
////    public void insert(LaboratoryBean lab) throws SQLException {
////        ConnectionProvider db = new ConnectionProvider();
////       Connection con = db.createConnection();
////        PreparedStatement pst = con.prepareStatement("insert into laboratory(Sl_No,Report_Id,Patient_Id,Test_Name,Doctor_Id,Labtechnician_Id,Start_Date,End_Date,Result,Status)values(?,?,?,?,?,?,?,?,?,?)");
////
////        pst.setInt(1, lab.getSlno());
////        pst.setInt(2, lab.getReportid());
////        pst.setInt(3, lab.getPatientid());
////        pst.setString(4, lab.getTestname());
////        pst.setInt(5, lab.getDoctorid());
////        pst.setInt(6, lab.getLabtechnicianid());
////        pst.setDate(7, lab.getStartdate());
////        pst.setDate(8, lab.getEnddate());
////
////        pst.setString(9, lab.getResult());
////        pst.setString(10, lab.getStatus());
////
////        System.out.println("data inserted");
////
////    }
//
//    public ArrayList<LaboratoryBean> labtest() throws SQLException {
//        ArrayList<LaboratoryBean> arraylist = new ArrayList<LaboratoryBean>();
//        Connection con = ConnectionProvider.createConnection();
//        PreparedStatement pst = con.prepareStatement("select * from laboratory group by Report_Id");
//
//        ResultSet rs = pst.executeQuery();
//        while (rs.next()) {
//           
//            LaboratoryBean obj = new LaboratoryBean();
//            obj.setSlno(rs.getInt(1));
//            obj.setReportid(rs.getInt(2));
//            obj.setPatientid(rs.getInt(3));
//            obj.setTestname(rs.getString(4));
//            obj.setDoctorid(rs.getInt(5));
//            obj.setLabtechnicianid(rs.getInt(6));
//            obj.setStartdate(rs.getDate(8));
//            obj.setEnddate(rs.getDate(9));
//            obj.setResult(rs.getString(10));
//            obj.setStatus(rs.getString(11));
//
//            arraylist.add(obj);
//        }
//        rs.close();
//        pst.close();
//        con.close();
//        return arraylist;
//    }
//
//    public LaboratoryBean patientview(int id,String name) throws SQLException {
//
//        Connection con = ConnectionProvider.createConnection();
//        PreparedStatement pst = con.prepareStatement("SELECT * FROM laboratory WHERE Patient_Id = ? and Test_Name = ?  ");
//        pst.setInt(1, id);
//        pst.setString(2, name);
//        
//
//        LaboratoryBean lab = new LaboratoryBean();
//        ResultSet rs = pst.executeQuery();
//        while (rs.next()) {
//
//            lab.setSlno(rs.getInt(1));
//            lab.setReportid(rs.getInt(2));
//            lab.setPatientid(rs.getInt(3));
//            lab.setTestname(rs.getString(4));
//            lab.setDoctorid(rs.getInt(5));
//            lab.setLabtechnicianid(rs.getInt(6));
//            lab.setStartdate(rs.getDate(8));
//            lab.setEnddate(rs.getDate(9));
//            lab.setResult(rs.getString(10));
//            lab.setStatus(rs.getString(11));
//            
//        }
//        return lab;
//
//    }
//    public int update(LaboratoryBean lab1) throws SQLException
//    {
//        System.out.println("entered manager");
//        ConnectionProvider db=new ConnectionProvider();
//        Connection con=db.createConnection();
//        PreparedStatement pst= con.prepareStatement("update laboratory SET Labtechnician_Id=?,Start_Date=?,End_Date=?,Result=?,`Status`=? WHERE Report_Id =? and Test_Name=?");
//        System.out.println("xxxx");
//        pst.setInt(1,lab1.getLabtechnicianid());
//        pst.setDate(2,lab1.getStartdate());
//        pst.setDate(3,lab1.getEnddate());
//        pst.setString(4,lab1.getResult());
//        pst.setString(5,lab1.getStatus());
//        pst.setInt(6,lab1.getReportid() );
//        pst.setString(7,lab1.getTestname());
//        System.out.println("yyyyyy");
//       int i= pst.executeUpdate();
//       System.out.println("zzzzz");
//        return i;
//    }
//    public ArrayList<LaboratoryBean> patientupdate() throws SQLException{
//        ArrayList<LaboratoryBean> arrayList=new ArrayList<LaboratoryBean>();
//        Connection con=ConnectionProvider.createConnection();
//        PreparedStatement pst=con.prepareStatement("SELECT * FROM laboratory");
//        ResultSet rs=pst.executeQuery();
//        while(rs.next()){
//            LaboratoryBean obj=new LaboratoryBean();
//            obj.setReportid(rs.getInt(2));
//            obj.setLabtechnicianid(rs.getInt(6));
//            obj.setStartdate(rs.getDate(7));
//            obj.setEnddate(rs.getDate(8));
//            obj.setResult(rs.getString(9));
//            obj.setStatus(rs.getString(10));
//            arrayList.add(obj);
//        }
//        rs.close();
//        pst.close();
//        con.close();
//        return arrayList;
//    }
//    
//    public ArrayList<LaboratoryBean> singlelabtest(int reportid) throws SQLException {
//        ArrayList<LaboratoryBean> arraylist = new ArrayList<LaboratoryBean>();
//        Connection con = ConnectionProvider.createConnection();
//        PreparedStatement pst = con.prepareStatement("select * from laboratory where Report_Id=?");
//        pst.setInt(1, reportid);
//        ResultSet rs = pst.executeQuery();
//        while (rs.next()) {
//           
//            LaboratoryBean obj = new LaboratoryBean();
//            obj.setSlno(rs.getInt(1));
//            obj.setReportid(rs.getInt(2));
//            obj.setPatientid(rs.getInt(3));
//            obj.setTestname(rs.getString(4));
//            obj.setDoctorid(rs.getInt(5));
//            obj.setLabtechnicianid(rs.getInt(6));
//            obj.setStartdate(rs.getDate(8));
//            obj.setEnddate(rs.getDate(9));
//            obj.setResult(rs.getString(10));
//            obj.setStatus(rs.getString(11));
//
//            arraylist.add(obj);
//        }
//        rs.close();
//        pst.close();
//        con.close();
//        return arraylist;
//    }
//    
// public ArrayList<LaboratoryBean> selectBillDetails(int repid) throws SQLException{
//        ArrayList<LaboratoryBean> arrayList=new ArrayList<LaboratoryBean>();
//        Connection con=ConnectionProvider.createConnection();
//        PreparedStatement pst=con.prepareStatement("SELECT * FROM laboratory where Report_Id=?");
//        pst.setInt(1, repid);
//        ResultSet rs=pst.executeQuery();
//        while(rs.next()){
//            LaboratoryBean obj=new LaboratoryBean();
//            obj.setReportid(rs.getInt(2));
//            obj.setPatientid(rs.getInt(3));
//            obj.setTestname(rs.getString(4));
//            obj.setDoctorid(rs.getInt(5));
//            obj.setLabtechnicianid(rs.getInt(6));
//            obj.setPrescribed_Date(rs.getTimestamp(7));
//            //obj.setEnddate(rs.getDate(8));
//            obj.setResult(rs.getString(9));
//            obj.setStatus(rs.getString(10));
//            arrayList.add(obj);
//        }
//        rs.close();
//        pst.close();
//        con.close();
//        return arrayList;
//    }  
// 
// 
// public int SelectTestCost(String name) throws SQLException{
// Connection con=ConnectionProvider.createConnection();
//        PreparedStatement pst=con.prepareStatement("SELECT Charge FROM laboratorytest where Test_Name=?");
//        pst.setString(1, name);
//        ResultSet rs=pst.executeQuery();
//        rs.next();
//        int charge=rs.getInt(1);
//        System.out.println("charge in managerr  "+rs.getInt(1)); 
//       return charge;
// }
//
// 
// 
//    }
//
