/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DAOInterface.IDAOCourier;
import Model.Courier;
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
public class DAOCourier implements IDAOCourier {
    public DAOCourier(){
        con = ConnectionDB.getConnection();
    }
    
    @Override
    public List<Courier> getAll() {
        List<Courier> lstKurir = null;
        try {
            lstKurir = new ArrayList<Courier>();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(select);
            while(rs.next()){
                Courier krr = new Courier();
                krr.setKId(rs.getInt("courier_id"));
                krr.setKNama(rs.getString("courier_name"));
                krr.setKNohp(rs.getString("courier_phone"));
                krr.setKEmail(rs.getString("courier_email"));
                krr.setKendaraan(rs.getString("courier_vehicle_type"));
                krr.setWilayah(rs.getString("courier_location"));
                krr.setKapasitas(rs.getInt("courier_capacity"));
                lstKurir.add(krr);
            }
        }        
        catch(SQLException ex){
            System.out.println("error"+ex);
        }
        return lstKurir;
    }

    @Override
    public List<Courier> getCariNama(String KNama) {
         List<Courier> lstKurir = null;
        try {
            lstKurir = new ArrayList<Courier>();
            PreparedStatement st = con.prepareStatement(carinama);
            st.setString(1,"%"+KNama+"%");
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Courier krr = new Courier();
                krr.setKId(rs.getInt("courier_id"));
                krr.setKNama(rs.getString("courier_name"));
                krr.setKNohp(rs.getString("courier_phone"));
                krr.setKEmail(rs.getString("courier_email"));
                krr.setKendaraan(rs.getString("courier_vehicle_type"));
                krr.setWilayah(rs.getString("courier_location"));
                krr.setKapasitas(rs.getInt("courier_capacity"));
                lstKurir.add(krr);
            }
        }        
        catch(SQLException ex){
            System.out.println("error"+ex);
        }
        return lstKurir;
    }

    @Override
    public boolean insert(Courier b) {
        boolean result = true;
        PreparedStatement statement = null;
        try {
            statement = con.prepareStatement(insert);
            statement.setInt(1, b.getKId());
            statement.setString(2, b.getKNama());
            statement.setString(3, b.getKNohp());
            statement.setString(4, b.getKEmail());
            statement.setString(5, b.getKendaraan());
            statement.setString(6, b.getWilayah());
            statement.setInt(7, b.getKapasitas());
            statement.execute();
        }
        catch(SQLException ex) {
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
    public void update(Courier b) {
        PreparedStatement statement = null;
        try {
            statement = con.prepareStatement(update);
            statement.setString(1, b.getKNama());
            statement.setString(2, b.getKNohp());
            statement.setString(3, b.getKEmail());
            statement.setString(4, b.getKendaraan());
            statement.setString(5, b.getWilayah());
            statement.setInt(6, b.getKapasitas());
            statement.setInt(7, b.getKId());
            statement.execute();
        }
        catch(SQLException ex) {
            System.out.println("Gagal Ubah");
        }
        finally {
            try {
                statement.close();
            }
            catch(SQLException ex) {
                System.out.println("Gagal Ubah");
            }
        }
    }

    @Override
    public void delete(int Kid) {
        PreparedStatement statement = null;
        try {
            statement = con.prepareStatement(delete);
            statement.setInt(1, Kid);
            statement.execute();
        }
        catch(SQLException ex) {
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
    final String insert = "INSERT INTO  courier (courier_id, courier_name, courier_phone, courier_email, courier_vehicle_type, courier_location, courier_capacity) VALUES (?, ?, ?, ?, ?, ?, ?);";
    final String update = "UPDATE courier SET courier_name=?, courier_phone=?, courier_email=?, courier_vehicle_type=?, courier_location=?, courier_capacity=? WHERE courier_id=?;";
    final String delete = "DELETE FROM courier WHERE courier_id=?;";
    final String select = "SELECT * FROM courier ORDER BY courier_id asc;";
    final String carinama = "SELECT * FROM courier WHERE courier_name like ?;";
    
}
