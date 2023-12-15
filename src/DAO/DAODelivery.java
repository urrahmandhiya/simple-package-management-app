/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DAOInterface.IDAODelivery;
import Model.Delivery;
import java.util.List;
import Connection.ConnectionDB;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


/**
 *
 * @author ardab
 */
public class DAODelivery implements IDAODelivery {
    public DAODelivery(){
        con = ConnectionDB.getConnection();
    }
    
    @Override
    public List<Delivery> getAll() {
        List<Delivery> lstPrm = null;
        try {
            lstPrm = new ArrayList<Delivery>();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(select);
            while(rs.next()){
                Delivery prm = new Delivery();
                prm.setDelivery_id(rs.getString("delivery_id"));
                prm.setKId(rs.getInt("courier_id"));             
                prm.setPacket_id(rs.getString("packet_id"));
                prm.setDelivery_date(rs.getString("delivery_date"));
                prm.setDelivery_status(rs.getString("delivery_status"));
                prm.setDelivery_arrival(rs.getString("delivery_arrival"));
                lstPrm.add(prm);
            }
        }        
        catch(SQLException ex){
            System.out.println("error"+ex);
        }
        return lstPrm;
    }

    @Override
    public List<Delivery> getAllByName(String delivery_id) {
         List<Delivery> lstPrm = null;
        try {
            lstPrm = new ArrayList<Delivery>();
            PreparedStatement st = con.prepareStatement(carinama);
            st.setString(1,"%" + delivery_id + "%");
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Delivery prm = new Delivery();
                prm.setDelivery_id(rs.getString("delivery_id"));
                prm.setKId(rs.getInt("courier_id"));             
                prm.setPacket_id(rs.getString("packet_id"));
                prm.setDelivery_date(rs.getString("delivery_date"));
                prm.setDelivery_status(rs.getString("delivery_status"));
                prm.setDelivery_arrival(rs.getString("delivery_arrival"));
                lstPrm.add(prm);
            }
        }        
        catch(SQLException ex){
            System.out.println("error"+ex);
            System.out.println("Failed to execute the SQL statement: " + ex.getMessage());
        }
        return lstPrm;
    }

    @Override
    public boolean insert(Delivery b) {
        boolean result = true;
        PreparedStatement statement = null;
        try {
            statement = con.prepareStatement(insert);
            statement.setString(1, b.getDelivery_id());
            statement.setInt(2, b.getKId());
            statement.setString(3, b.getPacket_id());
            statement.setDate(4, new java.sql.Date(b.getDelivery_date().getTime())); // Convert java.util.Date to java.sql.Date
            statement.setString(5, b.getDelivery_status());
            statement.setString(6, b.getDelivery_arrival());
            statement.execute();
        }
        catch(SQLException ex) {
            System.out.println("Failed to execute the SQL statement: " + ex.getMessage());
            System.out.println("Gagal Input");
            result = false;
        }
        finally {
            try {
                statement.close();
            }
            catch(SQLException ex) {
                System.out.println("Gagal Input");
                result = false;
            }
        }
        return result;
    }

    @Override
    public boolean update(Delivery b) {
        boolean result = true;
        PreparedStatement statement = null;
        try {
            statement = con.prepareStatement(update);
            statement.setInt(1, b.getKId());
            statement.setString(2, b.getPacket_id());
            statement.setDate(3, new java.sql.Date(b.getDelivery_date().getTime())); // Convert java.util.Date to java.sql.Date
            statement.setString(4, b.getDelivery_status());
            statement.setString(5, b.getDelivery_arrival());
            statement.setString(6, b.getDelivery_id());
            statement.execute();
        }
        catch(SQLException ex) {
            System.out.println("Failed to execute the SQL statement: " + ex.getMessage());
            System.out.println("Gagal Ubah");
        }
        finally {
            try {
                statement.close();
            }
            catch(SQLException ex) {
                System.out.println("Gagal Ubah");
                result = false;
            }
        }
        return result;
    }

    @Override
    public void delete(String delivery_id) {
        PreparedStatement statement = null;
        try {
            statement = con.prepareStatement(delete);
            statement.setString(1, delivery_id);
            statement.execute();
        }
        catch(SQLException ex) {
            System.out.println("Failed to execute the SQL statement: " + ex.getMessage());
            System.out.println("Gagal Delete");
        }
        finally {
            try {
                statement.close();
            }
            catch(SQLException ex) {
                System.out.println("Gagal Delete");
            }
        }
    }
    
    Connection con;
    final String insert = "INSERT INTO delivery (delivery_id, courier_id, packet_id, delivery_date, delivery_status, delivery_arrival) VALUES (?, ?, ?, ?, ?, ?);";
    final String update = "UPDATE delivery SET courier_id=?, packet_id=?, delivery_date=?, delivery_status=?, delivery_arrival=? WHERE delivery_id=?;";
    final String delete = "DELETE FROM delivery WHERE delivery_id=?;";  
    final String select = "SELECT * FROM delivery ORDER BY packet_id;";
    final String carinama = "SELECT * FROM delivery WHERE delivery_id like ?;";
    
}
