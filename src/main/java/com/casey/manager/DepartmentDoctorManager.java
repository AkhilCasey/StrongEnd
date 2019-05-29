/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.casey.manager;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.casey.bean.DepartmentMaster;
import com.casey.dbconnection.ConnectionProvider;

/**
 *
 * @author cynber
 */
public class DepartmentDoctorManager {
    
    public ResultSet getDepartment() throws SQLException
    {
        ConnectionProvider ob=new ConnectionProvider();
        Connection con=ob.createConnection();
        java.sql.PreparedStatement pst=con.prepareStatement("SELECT DISTINCT Department_Name FROM departmentdoctor");
        ResultSet rs=pst.executeQuery();
        return rs;
    }
    
    public ArrayList getDoctors(String dept) throws SQLException {
        System.out.println("in manager" + dept);
        ArrayList<String> Mname = new ArrayList<String>();
        ConnectionProvider db = new ConnectionProvider();
        Connection con = db.createConnection();
        java.sql.PreparedStatement pst = con.prepareStatement("SELECT DISTINCT Doctor_Name FROM departmentdoctor WHERE Department_Name=?");
        pst.setString(1, dept);
        ResultSet rs = pst.executeQuery();
        DepartmentMaster obj = new DepartmentMaster();
        while (rs.next()) {
            //System.out.println(rs.getString(1));
            obj.setDoctor(rs.getString(1));
            Mname.add(obj.getDoctor());
        }

        return Mname;
    }
}
