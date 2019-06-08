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
//import java.util.List;
//
//import com.casey.bean.PharmacyMedicineDTO;
//import com.casey.dbconnection.ConnectionProvider;
//
///**
// *
// * @author cynber
// */
//public class PharmacyMedicineManager {
//
//    public int insertMedicine(PharmacyMedicineDTO pm) throws SQLException {
//        ConnectionProvider ob = new ConnectionProvider();
//        Connection con = ob.createConnection();
//        PreparedStatement pst = con.prepareStatement("insert into pharmacystock(Medicine_Name,Medicine_Code,BatchCode,MNF_Date,Exp_Date,Supplier_Name,UOM,Rate,Total_Amount,Category,Quantity)values(?,?,?,?,?,?,?,?,?,?,?)");
//        pst.setString(1, pm.getMedicinename());
//        pst.setString(2, pm.getMedcode());
//        pst.setString(3, pm.getBatchcode());
//        pst.setDate(4, pm.getMdate());
//        pst.setDate(5, pm.getEdate());
//        pst.setString(6, pm.getSuppname());
//        pst.setString(7, pm.getUom());
//        pst.setFloat(8, pm.getRate());
//        pst.setFloat(9, pm.getTotalamount());
//        pst.setString(10, pm.getCategory());
//        pst.setInt(11, pm.getQuantity());
//
//        int i = pst.executeUpdate();
//        return i;
//    }
//
//    public int updateMedicine(PharmacyMedicineDTO pm) throws SQLException {
//
//        ConnectionProvider ob = new ConnectionProvider();
//        Connection con = ob.createConnection();
//
//        PreparedStatement pst = con.prepareStatement("update pharmacystock set Medicine_Name=?,Medicine_Code=?,BatchCode=?,MNF_Date=?,Exp_Date=?,Supplier_Name=?,UOM=?,Rate=?,Total_Amount=?,Category=?,Quantity=? where Stock_Id=?");
//
//        pst.setString(1, pm.getMedicinename());
//        pst.setString(2, pm.getMedcode());
//        pst.setString(3, pm.getBatchcode());
//        pst.setDate(4, pm.getMdate());
//        pst.setDate(5, pm.getEdate());
//        pst.setString(6, pm.getSuppname());
//        pst.setString(7, pm.getUom());
//        pst.setFloat(8, pm.getRate());
//        pst.setFloat(9, pm.getTotalamount());
//        pst.setString(10, pm.getCategory());
//        pst.setInt(11, pm.getQuantity());
//        pst.setInt(12, pm.getStockId());
//
//        int i = pst.executeUpdate();
//        return i;
//
//    }
//
//    public ArrayList<PharmacyMedicineDTO> select() throws SQLException {
//        ArrayList<PharmacyMedicineDTO> arraylist = new ArrayList<PharmacyMedicineDTO>();
//        ConnectionProvider db = new ConnectionProvider();
//        Connection con = db.createConnection();
//        PreparedStatement pst = con.prepareStatement(" Select * from pharmacystock ");
//        ResultSet rs = pst.executeQuery();
//
//        while (rs.next()) {
//
//            PharmacyMedicineDTO rp = new PharmacyMedicineDTO();
//
//            rp.setStockId(rs.getInt(1));
//            rp.setMedicinename(rs.getString(2));
//            rp.setMedcode(rs.getString(3));
//            rp.setBatchcode(rs.getString(4));
//            rp.setMdate(rs.getDate(5));
//            rp.setEdate(rs.getDate(6));
//            rp.setSuppname(rs.getString(7));
//            rp.setUom(rs.getString(8));
//            rp.setRate(rs.getFloat(9));
//            rp.setTotalamount(rs.getFloat(10));
//            rp.setCategory(rs.getString(11));
//            rp.setQuantity(rs.getInt(12));
//
//            arraylist.add(rp);
//        }
//        rs.close();
//        pst.close();
//        con.close();
//        return arraylist;
//
//    }
//
//    public PharmacyMedicineDTO viewsingle(int id) throws SQLException {
//        ConnectionProvider db = new ConnectionProvider();
//        Connection con = db.createConnection();
//        PreparedStatement pst = con.prepareStatement(" Select * from pharmacystock where Stock_Id=?");
//        pst.setInt(1, id);
//        ResultSet rs = pst.executeQuery();
//        PharmacyMedicineDTO rp = new PharmacyMedicineDTO();
//        while (rs.next()) {
//
//            rp.setStockId(rs.getInt(1));
//            rp.setMedicinename(rs.getString(2));
//            rp.setMedcode(rs.getString(3));
//            rp.setBatchcode(rs.getString(4));
//            rp.setMdate(rs.getDate(5));
//            rp.setEdate(rs.getDate(6));
//            rp.setSuppname(rs.getString(7));
//            rp.setUom(rs.getString(8));
//            rp.setRate(rs.getFloat(9));
//            rp.setTotalamount(rs.getFloat(10));
//            rp.setCategory(rs.getString(11));
//            rp.setQuantity(rs.getInt(12));
//
//        }
//        return rp;
//
//    }
//
//    public List<String> fetchData(String name) throws ClassNotFoundException, SQLException, NullPointerException {
//        ConnectionProvider db = new ConnectionProvider();
//        Connection con = db.createConnection();
//        List<String> name_list = new ArrayList<String>();
//        PreparedStatement pst = con.prepareStatement("Select Medicine_Name from pharmacystock where Medicine_Name LIKE ?");
//        pst.setString(1, name + "%");
//        ResultSet rs = pst.executeQuery();
//        while (rs.next()) {
//            name_list.add(rs.getString(1));
//
//        }
//        rs.close();
//        pst.close();
//        con.close();
//        return name_list;
//    }
//
//    public PharmacyMedicineDTO getData(String name) throws ClassNotFoundException, SQLException, NullPointerException {
//        ConnectionProvider db = new ConnectionProvider();
//        Connection con = db.createConnection();
//        PharmacyMedicineDTO obj = new PharmacyMedicineDTO();
//        PreparedStatement pst = con.prepareStatement("Select Rate from pharmacystock where Medicine_Name LIKE ?");
//        pst.setString(1, name + "%");
//        ResultSet rs = pst.executeQuery();
//        while (rs.next()) {
//            obj.setRate(rs.getFloat(1));
//
//        }
//        return obj;
//
//    }
//
//}
