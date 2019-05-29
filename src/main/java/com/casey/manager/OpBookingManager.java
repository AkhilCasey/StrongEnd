/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.casey.manager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.casey.bean.ReceptionPatientRegister;
import com.casey.dbconnection.ConnectionProvider;

/**
 *
 * @author D06507
 */
public class OpBookingManager {

     public ArrayList<ReceptionPatientRegister> selectBookingDetails(String date,String name) throws SQLException {
     
        ArrayList<ReceptionPatientRegister> arraylist = new ArrayList<ReceptionPatientRegister>();
        Connection con = ConnectionProvider.createConnection();
        PreparedStatement pst = con.prepareStatement("select * from op_booking where Date=? and Doc_Name=?");
        pst.setString(1, date);
        pst.setString(2, name);
        ResultSet rs = pst.executeQuery();
        while (rs.next()) {
            ReceptionPatientRegister obj = new ReceptionPatientRegister();
           // obj.setBookingID(rs.getInt(1));
            obj.setPatientid(rs.getInt(2));
            obj.setPatientname(rs.getString(3));
            obj.setAddress(rs.getString(4));
            obj.setDepdoctor(rs.getString(5));
            obj.setRegdate(rs.getDate(6));
            arraylist.add(obj);
            System.out.println("IN MANAGER");
            System.out.println(rs.getInt(1));
            System.out.println(obj.getPatientid());
            System.out.println("IN MANAGER");
            
        }
        rs.close();
        pst.close();
        con.close();
        return arraylist;

    }

}
