/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cruds;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author sinyo
 */
public class config {
    private static Connection mysqlconfig;
    public static Connection configDB()throws SQLException{
        try {
            String url = "jdbc:mysql://localhost:3306/db_uts_e2"; //url database
            String user = "root";   // username mySQL default : root
            String pass = "";       // password MySQL default : kosong
            DriverManager.registerDriver(new com.mysql.jdbc.Driver()); 
            mysqlconfig=DriverManager.getConnection(url,user,pass);
            // validasi koneksi database
        } catch (Exception e) {
            System.err.println("koneksi gagal" + e.getMessage());
        }
    return mysqlconfig;
    }
    
}
