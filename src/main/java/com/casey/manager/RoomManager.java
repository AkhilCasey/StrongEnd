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

import com.casey.bean.RoomBean;
import com.casey.dbconnection.ConnectionProvider;

/**
 *
 * @author D06515
 */
public class RoomManager {
    
    public void insert(RoomBean rb) throws SQLException{
        ConnectionProvider db=new ConnectionProvider();
        Connection con=db.createConnection();
        PreparedStatement pst=con.prepareStatement("insert into room(Room_Type,Price)values(?,?)");
       
        pst.setString(1,rb.getRoomtype());
        pst.setFloat(2,rb.getPrice());
        pst.executeUpdate();
    
    
    
    
    }
    public ArrayList<RoomBean> roomview() throws SQLException{
    
    ArrayList<RoomBean> arraylist=new ArrayList<RoomBean>();
    Connection con=ConnectionProvider.createConnection();
    PreparedStatement pst=con.prepareStatement("select * from room");
    ResultSet rs=pst.executeQuery();
    while (rs.next()) {
           
            RoomBean rb = new RoomBean();
            rb.setRoomid(rs.getInt(1));
            rb.setRoomtype(rs.getString(2));
            rb.setPrice(rs.getFloat(3));
                  

            arraylist.add(rb);
        }
        rs.close();
        pst.close();
        con.close();
        return arraylist;
    
    
    
    }
    
     public int update(RoomBean rb) throws SQLException
    {
        
        ConnectionProvider db=new ConnectionProvider();
        Connection con=db.createConnection();
        PreparedStatement pst= con.prepareStatement("update room SET Room_Type=?,Price=? WHERE Room_Id =?");
        
        
        pst.setString(1,rb.getRoomtype() );
        pst.setFloat(2,rb.getPrice() );
        pst.setInt(3,rb.getRoomid() );
       
        int i= pst.executeUpdate();
       
        return i;
    }
            
            
            
public RoomBean showRoom(int roomid) throws SQLException
{
    RoomBean rb=new RoomBean();
    ConnectionProvider db=new ConnectionProvider();
    Connection con=db.createConnection();
    PreparedStatement pst=con.prepareStatement("Select * from room where Room_Id=?");
    pst.setInt(1, roomid);
    ResultSet rs=pst.executeQuery();
    if(rs.next())
    {
        rb.setRoomid(rs.getInt(1));
        rb.setRoomtype(rs.getString(2));
        rb.setPrice(rs.getFloat(3));
    }
    return rb;
    
}
            
  
    
}
