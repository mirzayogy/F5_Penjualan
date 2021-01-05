
package com.mirzayogy.f5_penjualan.library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {
    
    private final String  URL = "jdbc:mysql://localhost:3306/5f_penjualan"
            + "?serverTimezone=Asia/Makassar";
    private final String USER = "root";
    private final String PASS = "";
    
    public Connection getConnection() {
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection con = DriverManager.getConnection(URL, USER, PASS);
            
            System.out.println("OK");

            return con;

        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.toString());
            return null;
        } 
    }
    
    public static void main(String[] args) {
        Koneksi database = new Koneksi();
        database.getConnection();
    }
}
