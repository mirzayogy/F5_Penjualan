package com.mirzayogy.f5_penjualan.model;

import com.mirzayogy.f5_penjualan.library.Koneksi;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Pertanyaan extends MyModel implements MyInterface {
    
    private int id;
    private String pertanyaan;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPertanyaan() {
        return pertanyaan;
    }

    public void setPertanyaan(String pertanyaan) {
        this.pertanyaan = pertanyaan;
    }
    
    
    
    public Pertanyaan(int id, String pertanyaan) {
        this.id = id;
        this.pertanyaan = pertanyaan;
        
        koneksi = new Koneksi();
        connection = koneksi.getConnection();
    }

    public Pertanyaan() {
        koneksi = new Koneksi();
        connection = koneksi.getConnection();
    }
    
    public boolean create(){
        String insertSQL = "INSERT INTO pertanyaan VALUES (NULL,?)";
        
        try {
            PreparedStatement ps = connection.prepareStatement(insertSQL);
            ps.setString(1, this.pertanyaan);
            ps.execute();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.toString());            
            return false;
        }
    }
    
    public boolean update(){
        String updateSQL = "UPDATE pertanyaan SET pertanyaan = ? WHERE id = ?";
        
        try {
            PreparedStatement ps = connection.prepareStatement(updateSQL);
            ps.setString(1, this.pertanyaan);
            ps.setInt(2, this.id);
            ps.execute();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.toString());            
            return false;
        }
    }
    
    public boolean delete(){
        String deleteSQL = "DELETE FROM pertanyaan WHERE id = ?";
        
        try {
            PreparedStatement ps = connection.prepareStatement(deleteSQL);
            ps.setInt(1, this.id);
            ps.execute();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.toString());            
            return false;
        }
    }
    
    public ArrayList<Pertanyaan> read(){
        ArrayList<Pertanyaan> listPertanyaan = new ArrayList<Pertanyaan>();
        String sql = "SELECT * FROM pertanyaan";
        
        try {
            Statement statement = this.connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            
            Pertanyaan pertanyaan;
            
            while(resultSet.next()){
                pertanyaan = new Pertanyaan(
                 resultSet.getInt("id"),
                 resultSet.getString("pertanyaan")
                );
                
                listPertanyaan.add(pertanyaan);
            }
            
            return listPertanyaan;
            
        } catch (SQLException ex) {
            System.out.println(sql);
            System.out.println(ex.toString());
            
            return null;
        }
    }
}
