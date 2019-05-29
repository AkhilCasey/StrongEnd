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
import java.sql.Statement;
import java.util.ArrayList;

import com.casey.bean.IPRegister;
import com.casey.dbconnection.ConnectionProvider;

/**
 *
 * @author d06521
 */
public class IPRegisterManager {
    
    public ResultSet selectTreatmentType() throws SQLException {//search using id
      
        Connection con = ConnectionProvider.createConnection();
        PreparedStatement pst = con.prepareStatement("select *  from treatment");
       
        ResultSet rs = pst.executeQuery();
        return rs;
    }
   
    public ResultSet selectRoomType() throws SQLException {//search using id
      
        Connection con = ConnectionProvider.createConnection();
        PreparedStatement pst = con.prepareStatement("select *  from room");
       
        ResultSet rs = pst.executeQuery();
        return rs;
    }

    public int insertPatient(IPRegister rp) throws SQLException {
       
        ConnectionProvider obj = new ConnectionProvider();
        Connection con = obj.createConnection();
        PreparedStatement pst = con.prepareStatement("insert into ipregister(Patient_Id,Patient_Name,Date,Age,DOB,Gender,Address,Contact,Emergency_contact,Relation,Emergency_Number,Department,Doctor,Treatment_Type,Room_Type,Advance,Balance,IP_Status)values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
        pst.setInt(1, rp.getPatientid());
        pst.setString(2, rp.getPatientname());
        pst.setDate(3, rp.getRegdate());
        pst.setInt(4, rp.getAge());
        pst.setDate(5, rp.getDob());
        pst.setString(6, rp.getGender());
        pst.setString(7, rp.getAddress());
        pst.setString(8, rp.getContact());
        pst.setString(9, rp.getEmergencycontact());
        pst.setString(10, rp.getRelation());
        pst.setString(11, rp.getEmergencynumber());
        pst.setString(12, rp.getDepartment());
        pst.setString(13, rp.getDepartment());
        pst.setString(14, rp.getTreatmenttype());
        pst.setString(15, rp.getRoomtype());
        pst.setFloat(16, rp.getAdvance());
        pst.setFloat(17, rp.getBalance());
        pst.setString(18, rp.getIpstatus());
        int i = pst.executeUpdate();
        return i;
    }
    
    public ArrayList<IPRegister> select() throws SQLException
    {
        ArrayList<IPRegister> arraylist = new ArrayList<IPRegister>();
        Connection con = ConnectionProvider.createConnection();
        PreparedStatement pst = con.prepareStatement("select *  from ipregister");
       
        ResultSet rs = pst.executeQuery();
        while (rs.next())
        {            
            IPRegister obj=new IPRegister();
            
            obj.setIpid(rs.getInt(1));
            obj.setPatientid(rs.getInt(2));
            obj.setPatientname(rs.getString(3));
            obj.setRegdate(rs.getDate(4));
            obj.setAge(rs.getInt(5));
            obj.setDob(rs.getDate(6));
            obj.setGender(rs.getString(7));
            obj.setAddress(rs.getString(8));
            obj.setContact(rs.getString(9));
            obj.setEmergencycontact(rs.getString(10));
            obj.setRelation(rs.getString(11));
            obj.setEmergencynumber(rs.getString(12));
            obj.setDepartment(rs.getString(13));
            obj.setDoctor(rs.getString(14));
            obj.setTreatmenttype(rs.getString(15));
            obj.setRoomtype(rs.getString(16));
            obj.setAdvance(rs.getFloat(17));
            obj.setBalance(rs.getFloat(18));
            obj.setIpstatus(rs.getString(19));
            arraylist.add(obj);
           
            }
        rs.close();
        pst.close();
        con.close();
        return arraylist;
    }
    
    public IPRegister patientPayment(int patientid) throws SQLException
    {
        IPRegister rp=new IPRegister();
        ConnectionProvider ob=new ConnectionProvider();
        Connection con=ob.createConnection();
        PreparedStatement pst=con.prepareStatement("SELECT ipregister.Patient_Id,room.Price,treatment.Amount,ipregister.Balance FROM ipregister INNER JOIN room ON room.Room_Type=ipregister.Room_Type INNER JOIN treatment ON treatment.Treatment_Type=ipregister.Treatment_Type WHERE ipregister.Patient_Id=?");
        pst.setInt(1, patientid);
        ResultSet rs=pst.executeQuery();
        if(rs.next())
        {
            rp.setPatientid(rs.getInt(1));
            rp.setPrice(rs.getFloat(2));
            rp.setAmount(rs.getFloat(3));
            rp.setBalance(rs.getFloat(4));
            
        }
        return rp;
    }

    public int patientPaymentInsert(IPRegister rp) throws SQLException
    {
        ConnectionProvider ob=new ConnectionProvider();
        Connection con=ob.createConnection(); 
        PreparedStatement pst=con.prepareStatement("insert into ippatientpayment(Patient_Id,Date,RoomRent,TreatmentCharge,OtherExpense,TotalAmount)values(?,?,?,?,?,?)");
        pst.setInt(1, rp.getPatientid());
        pst.setDate(2, rp.getRegdate());
        pst.setFloat(3, rp.getPrice());
        pst.setFloat(4, rp.getAmount());
        pst.setFloat(5, rp.getOther());
        pst.setFloat(6, rp.getTotal());
        int i=pst.executeUpdate();
        return i;
    }
    
    public int patientBalanceUpdate(IPRegister rp) throws SQLException
    {
        ConnectionProvider ob=new ConnectionProvider();
        Connection con=ob.createConnection(); 
        PreparedStatement pst=con.prepareStatement("update ipregister set Balance=? where Patient_Id=?");
        pst.setFloat(1, rp.getBalance()); 
        pst.setFloat(2, rp.getPatientid());
        int j=pst.executeUpdate();
        return j;
    }
    
    public IPRegister selectPayment(int patientid) throws SQLException
    {
        IPRegister rp=new IPRegister();
        ConnectionProvider ob=new ConnectionProvider();
        Connection con=ob.createConnection(); 
        PreparedStatement pst=con.prepareStatement("select * from ipregister where Patient_Id=?");
        pst.setInt(1, patientid);
        ResultSet rs=pst.executeQuery();
        if(rs.next())
        {
            rp.setPatientid(rs.getInt(2));
            rp.setAdvance(rs.getFloat(17));
            rp.setBalance(rs.getFloat(18));
        }
        return rp;
    }
    
    public int updateAdvance(IPRegister rp) throws SQLException
    {
        ConnectionProvider ob=new ConnectionProvider();
        Connection con=ob.createConnection(); 
        PreparedStatement pst=con.prepareStatement("update ipregister set Advance=?,Balance=? where Patient_Id=?"); 
        pst.setFloat(1, rp.getAdvance());
        pst.setFloat(2, rp.getBalance());
        pst.setInt(3, rp.getPatientid());
        int i=pst.executeUpdate();
        return i;
    }
    
    public ArrayList<IPRegister> patientDischarge(int patientid)throws SQLException
    {
        ConnectionProvider ob=new ConnectionProvider();
        Connection con=ob.createConnection(); 
        PreparedStatement pst=con.prepareStatement("SELECT * FROM ippatientpayment WHERE Patient_Id=?"); 
        ArrayList<IPRegister> arraylist = new ArrayList<IPRegister>();
        pst.setInt(1, patientid);
        ResultSet rs=pst.executeQuery();
        while(rs.next()){
            IPRegister ip=new IPRegister();
            ip.setPatientid(rs.getInt(2));
            ip.setRegdate(rs.getDate(3));
            ip.setRoomrent(rs.getFloat(4));
            ip.setTreatmentamount(rs.getFloat(5));
            ip.setOther(rs.getFloat(6));
            ip.setTotal(rs.getFloat(7));
            arraylist.add(ip);
        }
    return arraylist;
    }
    
    
     public ArrayList<IPRegister> patientDischargeBill(int patientid)throws SQLException
    {
        ConnectionProvider ob=new ConnectionProvider();
        Connection con=ob.createConnection(); 
        PreparedStatement pst=con.prepareStatement("SELECT ippatientpayment.Payment_Id,ippatientpayment.Patient_Id,ippatientpayment.Date,ippatientpayment.RoomRent,ippatientpayment.TreatmentCharge,ippatientpayment.OtherExpense,ippatientpayment.TotalAmount,ipregister.Balance FROM ippatientpayment INNER JOIN ipregister ON ipregister.Patient_Id=ippatientpayment.Patient_Id WHERE ipregister.Patient_Id=?"); 
        ArrayList<IPRegister> arraylist = new ArrayList<IPRegister>();
        pst.setInt(1, patientid);
        ResultSet rs=pst.executeQuery();
        while(rs.next()){
            IPRegister ip=new IPRegister();
            ip.setPatientid(rs.getInt(2));
            ip.setRegdate(rs.getDate(3));
            ip.setRoomrent(rs.getFloat(4));
            ip.setTreatmentamount(rs.getFloat(5));
            ip.setOther(rs.getFloat(6));
            ip.setTotal(rs.getFloat(7));
            ip.setBalance(rs.getFloat(8));
            arraylist.add(ip);
        }
    return arraylist;
    }



    
    
    
    
    public int patientStatusChange(int patientid) throws SQLException
    {
         ConnectionProvider ob = new ConnectionProvider();
        Connection con = ob.createConnection();
        PreparedStatement pst = con.prepareStatement("update ipregister set IP_Status='OUT' WHERE Patient_Id=?");
        pst.setInt(1, patientid);
        int i=pst.executeUpdate();
        return i;
    }
}

