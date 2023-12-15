/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DAOInterface.IDAOPacket;
import Connection.ConnectionDB;
import Model.Packet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;
import java.sql.PreparedStatement;

/**
 *
 * @author Dhiya ardab
 */
public class DAOPacket implements IDAOPacket{

    public DAOPacket()
    {
        con = ConnectionDB.getConnection();
    }
    
    @Override
    public List<Packet> getAll() {
        List<Packet> lstPkt = null;
        try 
        {
            lstPkt = new ArrayList<Packet>();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(StrRead);
            while (rs.next()) 
            {
                Packet pkt = new Packet();
                pkt.setPacket_id(rs.getString("packet_id"));
                pkt.setPacket_weight(rs.getFloat("packet_weight"));
                pkt.setPacket_dimensions(rs.getString("packet_dimensions"));
                pkt.setPacket_description(rs.getString("packet_description"));
                pkt.setSender_name(rs.getString("sender_name"));
                pkt.setSender_phone(rs.getString("sender_phone"));
                pkt.setSender_address(rs.getString("sender_address"));
                pkt.setReceiver_name(rs.getString("receiver_name"));
                pkt.setReceiver_phone(rs.getString("receiver_phone"));
                pkt.setReceiver_address(rs.getString("receiver_address"));
                pkt.setPacket_status(rs.getString("packet_status"));               
                lstPkt.add(pkt);
            }
        } 
        catch (SQLException e) 
        {
            System.out.println("error " + e);
        }
        return lstPkt;
    }
    
    


    @Override
    public boolean insert(Packet b) {
        boolean result=true;
        PreparedStatement statement = null;
        try 
        {
            statement = con.prepareStatement(StrInsert);
            statement.setString(1, b.getPacket_id());
            statement.setFloat(2, b.getPacket_weight());
            statement.setString(3, b.getPacket_dimensions());
            statement.setString(4, b.getPacket_description());
            statement.setString(5, b.getSender_name());
            statement.setString(6, b.getSender_phone());
            statement.setString(7, b.getSender_address());
            statement.setString(8, b.getReceiver_name());
            statement.setString(9, b.getReceiver_phone());
            statement.setString(10, b.getReceiver_address());
            statement.setString(11, b.getPacket_status());
            statement.execute();
        } catch (SQLException e) 
        {
            System.out.println("Gagal Input");
            result = false;
        }
        finally
        {
            try {
                statement.close();
            } catch (Exception e) 
            {
                System.out.println("Gagal Input");
                result = false;
            }
        }
        return result;
    }
    
    @Override
    public void update(Packet b) {
        PreparedStatement statement = null;
        try 
        {
            statement = con.prepareStatement(StrUpdate);
            statement.setFloat(1, b.getPacket_weight());
            statement.setString(2, b.getPacket_dimensions());
            statement.setString(3, b.getPacket_description());
            statement.setString(4, b.getSender_name());
            statement.setString(5, b.getSender_phone());
            statement.setString(6, b.getSender_address());
            statement.setString(7, b.getReceiver_name());
            statement.setString(8, b.getReceiver_phone());
            statement.setString(9, b.getReceiver_address());
            statement.setString(10, b.getPacket_status());
            statement.setString(11, b.getPacket_id());
            statement.execute();
        } catch (SQLException e)
        {
            System.out.println("Failed to execute the SQL statement: " + e.getMessage());
        }
        finally
        {
            try {
                statement.close();
            } catch (Exception e) 
            {
                System.out.println("Gagal Update");
            }
        }
    }
    
    @Override
    public void delete(String packet_id) {
        PreparedStatement statement = null;
        try 
        {
            statement = con.prepareStatement(StrDelete);
            statement.setString(1, packet_id);
            statement.execute();
        } catch (SQLException e) 
        {
            System.out.println("Gagal Delete");
        }
        finally
        {
            try {
                statement.close();
            } catch (Exception e) 
            {
                System.out.println("Gagal Delete");
            }
        }
    }
    
    @Override
    public List<Packet> getAllByName(String packet_id) {
        List<Packet> lstPkt = null;
        try 
        {
            lstPkt = new ArrayList<Packet>();
            PreparedStatement st = con.prepareStatement(StrSearch);
            st.setString(1, "%" + packet_id + "%" );
            ResultSet rs = st.executeQuery();
            while (rs.next()) 
            {
                Packet pkt = new Packet();
                pkt.setPacket_id(rs.getString("packet_id"));
                pkt.setPacket_weight(rs.getFloat("packet_weight"));
                pkt.setPacket_dimensions(rs.getString("packet_dimensions"));
                pkt.setPacket_description(rs.getString("packet_description"));
                pkt.setSender_name(rs.getString("sender_name"));
                pkt.setSender_phone(rs.getString("sender_phone"));
                pkt.setSender_address(rs.getString("sender_address"));
                pkt.setReceiver_name(rs.getString("receiver_name"));
                pkt.setReceiver_phone(rs.getString("receiver_phone"));
                pkt.setReceiver_address(rs.getString("receiver_address"));
                pkt.setPacket_status(rs.getString("packet_status"));               
                lstPkt.add(pkt);
            }
        } 
        catch (SQLException e) 
        {
            System.out.println("error " + e);
        }
        return lstPkt;
    }
    
    Connection con;
    // SQL Query
    String StrRead = "select * from packet order by packet_id asc;";
    String StrInsert = "insert into packet (packet_id, packet_weight, packet_dimensions, packet_description, sender_name, sender_phone, sender_address, receiver_name, receiver_phone, receiver_address, packet_status) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    String StrUpdate = "update packet set packet_weight=?, packet_dimensions=?, packet_description=?, sender_name=?, sender_phone=?, sender_address=?, receiver_name=?, receiver_phone=?, receiver_address=?, packet_status=? where packet_id=?";
    String StrDelete = "delete from packet where packet_id=?";
    String StrSearch = "select * from packet where packet_id like ?;";
    
}
