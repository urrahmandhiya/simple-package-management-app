/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connection;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author ardab
 */
public class ConnectionDB {
    static Connection con;
    
    public static Connection getConnection() {
        if(con == null){
            MysqlDataSource data = new MysqlDataSource();
            data.setDatabaseName("gudang_paket");
            data.setUser("root");
            data.setPassword("");
            try
            {
                con = data.getConnection();
                System.out.println("koneksi berhasil");
            } 
            catch (SQLException ex)
            {
                System.out.println("tidak konek");
            }
        }
        return con;
    }
}
