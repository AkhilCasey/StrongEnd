///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.casey.implementation;
//
//
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//
//import com.casey.bean.TreatmentDTO;
//import com.casey.dbconnection.ConnectionProvider;
//
///**
// *
// * @author D06515
// */
//public class TreatementManager {
//    
//    public void insert(TreatmentDTO tb) throws SQLException{
//        ConnectionProvider db=new ConnectionProvider();
//        Connection con=db.createConnection();
//        PreparedStatement pst=con.prepareStatement("insert into treatement(Treatement_Type,Amount)values(?,?)");
//        pst.setString(1,tb.getTreatementtype());
//        pst.setFloat(2,tb.getAmount());
//        pst.executeUpdate();
//         }
//    
//    public ArrayList<TreatmentDTO> treatementview() throws SQLException{
//        
//         ArrayList<TreatmentDTO> arraylist=new ArrayList<TreatmentDTO>();
//    Connection con=ConnectionProvider.createConnection();
//    PreparedStatement pst=con.prepareStatement("select * from treatement");
//    ResultSet rs=pst.executeQuery();
//    while (rs.next()) {
//           
//            TreatmentDTO tb = new TreatmentDTO();
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
//    public TreatmentDTO showTreatement(int treatementid) throws SQLException{
//        
//        TreatmentDTO tb=new TreatmentDTO();
//    ConnectionProvider db=new ConnectionProvider();
//    Connection con=db.createConnection();
//    PreparedStatement pst=con.prepareStatement("Select * from treatement where Treatement_Id=?");
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
//     public int update(TreatmentDTO tb) throws SQLException{
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
//     
//     
//     
//     
//     
//     
//     }
//    
//    
//        
//    
//    
//    
//    
//   
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//}
