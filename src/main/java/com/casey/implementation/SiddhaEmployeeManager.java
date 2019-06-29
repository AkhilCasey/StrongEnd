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
//import com.casey.bean.SiddhaEmployee;
//import com.casey.dbconnection.ConnectionProvider;
//
///**
// *
// * @author D06507
// */
//public class SiddhaEmployeeManager {
//    
//   
//    public SiddhaEmployee loginCheckfun(int emp_id, String password) throws SQLException {
//        Connection con = ConnectionProvider.createConnection();
//
//        PreparedStatement pst = con.prepareStatement("Select * from employee where Emp_Id=? and Password=? and Job_Status<>?");
//
//        pst.setInt(1, emp_id);
//        pst.setString(2, password);
//        pst.setString(3, "2");
//
//        ResultSet rs = pst.executeQuery();
//        SiddhaEmployee obj = new SiddhaEmployee();
//        if (rs.next()) {
//            obj.setEmp_id(rs.getInt(1));
//            obj.setPassword(rs.getString(2));
//            obj.setDesignation(rs.getString(3));
//            obj.setName(rs.getString(4));
//            obj.setAddress(rs.getString(5));
//            obj.setDate_registration(rs.getDate(6));
//            obj.setDate_birth(rs.getDate(7));
//            obj.setPhone(rs.getLong(8));
//            obj.setBlood_group(rs.getString(9));
//            obj.setJob_type(rs.getString(10));
//            obj.setAccess_privilege(rs.getInt(11));
//            obj.setJob_status(rs.getInt(12));
//            obj.setGender(rs.getString(13));
//            obj.setEmail(rs.getString(14));
//            obj.setDepartment(rs.getString(15));
//            obj.setQualifications(rs.getString(16));
//
//        }
//        rs.close();
//        pst.close();
//        con.close();
//        return obj;
//    }
//   
//     public ArrayList<SiddhaEmployee> select() throws SQLException {
//            
//        ArrayList<SiddhaEmployee> arraylist = new ArrayList<SiddhaEmployee>();
//        Connection con = ConnectionProvider.createConnection();
//        PreparedStatement pst = con.prepareStatement("select * from employee");
//     
//        ResultSet rs = pst.executeQuery();
//        while (rs.next()) {
//            SiddhaEmployee obj = new SiddhaEmployee();
//            obj.setEmp_id(rs.getInt(1));
//            obj.setPassword(rs.getString(2));
//             obj.setDesignation(rs.getString(3));
//            obj.setName(rs.getString(4));
//            obj.setAddress(rs.getString(5));
//            obj.setDate_registration(rs.getDate(6));
//            obj.setDate_birth(rs.getDate(7));
//            obj.setPhone(rs.getLong(8));
//            obj.setBlood_group(rs.getString(9));
//            obj.setJob_type(rs.getString(10));
//            obj.setAccess_privilege(rs.getInt(11));
//            obj.setJob_status(rs.getInt(12));
//            obj.setGender(rs.getString(13));
//            obj.setEmail(rs.getString(14));
//            obj.setDepartment(rs.getString(15));
//            obj.setQualifications(rs.getString(16));
//            
//            
//            arraylist.add(obj);
//        } rs.close();
//       pst.close();
//       con.close();
//        return arraylist;
//    }
//    
//        
//        
//     public SiddhaEmployee selectFromId(int staffid) throws SQLException {//search using id
//        SiddhaEmployee obj = new SiddhaEmployee();
//        Connection con = ConnectionProvider.createConnection();
//        PreparedStatement pst = con.prepareStatement("select Emp_id,Password,Designation,Emp_name,Address,DOJ,DOB,Contact_Number,Blood_Group,Job_Type,Access_Privilage,Job_Status,Gender,Email,Department,Qualification  from employee where Emp_id=?");
//        pst.setInt(1, staffid);
//        ResultSet rs = pst.executeQuery();
//        if (rs.next()) {
//            //-------//
//            obj.setEmp_id(staffid);
//            obj.setPassword(rs.getString(2));
//            obj.setDesignation(rs.getString(3));
//            obj.setName(rs.getString(4));
//            obj.setAddress(rs.getString(5));
//            obj.setDate_registration(rs.getDate(6));
//            obj.setDate_birth(rs.getDate(7));
//            obj.setPhone(rs.getLong(8));
//            obj.setBlood_group(rs.getString(9));
//            obj.setJob_type(rs.getString(10));
//            obj.setAccess_privilege(rs.getInt(11));
//            obj.setJob_status(rs.getInt(12));
//            obj.setGender(rs.getString(13));
//            obj.setEmail(rs.getString(14));
//            obj.setDepartment(rs.getString(15));
//            obj.setQualifications(rs.getString(16));
//            
//            
//            
//            
//            System.out.println("SELECT FROM ID");
//        }
//        rs.close();
//        pst.close();
//        con.close();
//
//        return obj;
//    }
//     
//      public ArrayList<SiddhaEmployee> selectEmployee() throws SQLException {//search using id
//      
//         ArrayList<SiddhaEmployee> arraylist = new ArrayList<SiddhaEmployee>();
//        Connection con = ConnectionProvider.createConnection();
//        PreparedStatement pst = con.prepareStatement("select *  from employee ");
//       
//        ResultSet rs = pst.executeQuery();
//       while (rs.next())
//        {            
//            SiddhaEmployee obj=new SiddhaEmployee();
//            
//            obj.setEmp_id(rs.getInt(1));
//            obj.setPassword(rs.getString(2));
//            obj.setDesignation(rs.getString(3));
//            obj.setName(rs.getString(4));
//            obj.setAddress(rs.getString(5));
//            obj.setDate_registration(rs.getDate(6));
//            obj.setDate_birth(rs.getDate(7));
//            obj.setPhone(rs.getLong(8));
//            obj.setBlood_group(rs.getString(9));
//            obj.setJob_type(rs.getString(10));
//            obj.setJob_status(rs.getInt(11));
//            obj.setGender(rs.getString(12));
//            obj.setEmail(rs.getString(13));
//            obj.setDepartment(rs.getString(14));
//            obj.setQualifications(rs.getString(15));
//            
//            arraylist.add(obj);
//            System.out.println("saaradeee"+arraylist);
//           
//            }
//        rs.close();
//        pst.close();
//        con.close();
//        return arraylist;
//    }
//     
//     
//        public int update(SiddhaEmployee obj) throws SQLException
//    {
//        
//        Connection con = ConnectionProvider.createConnection();
//	PreparedStatement pst=con.prepareStatement("update employee set Emp_Name=?,Gender=?,DOB=?,Address=?,Email=?,Contact_Number=?,Department=?,Designation=?,"
//                + "Qualification=?,DOJ=?,Access_Privilage=?,Job_Status=?,Job_Type=?where Emp_Id=?");
//        
//      
//        pst.setString(1, obj.getName());
//        pst.setString(2, obj.getGender());
//        pst.setDate(3,obj.getDate_birth());
//        pst.setString(4, obj.getAddress());
//        pst.setString(5, obj.getEmail());
//        pst.setLong(6, obj.getPhone());
//        pst.setString(7, obj.getDepartment());
//        pst.setString(8, obj.getDesignation());
//        pst.setString(9, obj.getQualifications());       
//        pst.setDate(10, obj.getDate_registration());
//        pst.setInt(11, obj.getAccess_privilege());
//        pst.setInt(12, obj.getJob_status());
//        pst.setString(13, obj.getJob_type());
//        pst.setInt(14,obj.getEmp_id());
//    
//        
//     int r = pst.executeUpdate();
//     
//       pst.close();
//       con.close();
//       return r;
//    }
//    
//    public void insert(SiddhaEmployee ob) throws SQLException {
//        
//        Connection con = ConnectionProvider.createConnection();
//        PreparedStatement pst = con.prepareStatement("insert into employee(Password,Designation,Emp_name,Address,DOJ,DOB,Contact_Number,Blood_Group,Job_Type,Access_Privilage,Job_Status,Gender,Email,Department,Qualification) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) ");
//
//        pst.setString(1, ob.getPassword());
//        pst.setString(2, ob.getDesignation());
//        pst.setString(3, ob.getName());
//        pst.setString(4, ob.getAddress());      
//        pst.setDate(5, ob.getDate_registration());
//        pst.setDate(6, ob.getDate_birth());
//        pst.setLong(7, ob.getPhone());
//        pst.setString(8, ob.getBlood_group());
//        pst.setString(9, ob.getJob_type());
//        pst.setInt(10, ob.getAccess_privilege());
//        pst.setInt(11, ob.getJob_status());
//        pst.setString(12, ob.getGender());
//        pst.setString(13, ob.getEmail());
//        pst.setString(14, ob.getDepartment());
//        pst.setString(15, ob.getQualifications());
//
//        pst.executeUpdate();
//    }
//    
//     public ArrayList<SiddhaEmployee> selectDoctor() throws SQLException {//search using id
//      
//         ArrayList<SiddhaEmployee> arraylist = new ArrayList<SiddhaEmployee>();
//        Connection con = ConnectionProvider.createConnection();
//        PreparedStatement pst = con.prepareStatement("select *  from employee where Designation='Doctor' and Access_Privilage='3'");
//       
//        ResultSet rs = pst.executeQuery();
//       while (rs.next())
//        {            
//            SiddhaEmployee obj=new SiddhaEmployee();
//            
//            obj.setEmp_id(rs.getInt(1));
//            obj.setPassword(rs.getString(2));
//            obj.setDesignation(rs.getString(3));
//            obj.setName(rs.getString(4));
//            obj.setAddress(rs.getString(5));
//            obj.setDate_registration(rs.getDate(6));
//            obj.setDate_birth(rs.getDate(7));
//            obj.setPhone(rs.getLong(8));
//            obj.setBlood_group(rs.getString(9));
//            obj.setJob_type(rs.getString(10));
//            obj.setJob_status(rs.getInt(11));
//            obj.setGender(rs.getString(12));
//            obj.setEmail(rs.getString(13));
//            obj.setDepartment(rs.getString(14));
//            obj.setQualifications(rs.getString(15));
//            
//            arraylist.add(obj);
//            System.out.println("saaradeee"+arraylist);
//           
//            }
//        rs.close();
//        pst.close();
//        con.close();
//        return arraylist;
//    }
//}