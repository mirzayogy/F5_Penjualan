package com.mirzayogy.f5_penjualan.model;

import com.mirzayogy.f5_penjualan.library.Koneksi;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Pengguna extends MyModel implements MyInterface{
    
    private int id;
    private String username;
    private String password;
    private int id_pertanyaan;
    private Pertanyaan pertanyaan;
    private String jawaban;

    public Pengguna() {
        koneksi = new Koneksi();
        connection = koneksi.getConnection();
    }

    public Pengguna(int id, String username, String password, int id_pertanyaan, String jawaban) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.id_pertanyaan = id_pertanyaan;
        this.jawaban = jawaban;
        
        koneksi = new Koneksi();
        connection = koneksi.getConnection();
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId_pertanyaan() {
        return id_pertanyaan;
    }

    public void setId_pertanyaan(int id_pertanyaan) {
        this.id_pertanyaan = id_pertanyaan;
    }

    public Pertanyaan getPertanyaan() {
        return pertanyaan;
    }

    public void setPertanyaan(Pertanyaan pertanyaan) {
        this.pertanyaan = pertanyaan;
    }

    public String getJawaban() {
        return jawaban;
    }

    public void setJawaban(String jawaban) {
        this.jawaban = jawaban;
    }
    
    
    
    public boolean login(){
        return true;
    }
    
    public boolean forgotPassword(){
        return true;
    }
    
    public boolean register(){
        String insertSQL = "INSERT INTO pengguna VALUES (NULL,?,?,?,?)";
        boolean berhasil;
        try {
            PreparedStatement ps = connection.prepareStatement(insertSQL);
            ps.setString(1,this.username);
            ps.setString(2,this.password);
            ps.setInt(3,this.id_pertanyaan);
            ps.setString(4, this.jawaban);
            
            ps.execute();
            berhasil = true;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            berhasil = false;
        }
        
        return berhasil;
    }
    
    public boolean cekUserAda(){
        String cekSQL = "SELECT username FROM pengguna WHERE username = ?";
        boolean berhasil;
        try {
            PreparedStatement ps = connection.prepareStatement(cekSQL);
            ps.setString(1,this.username);
            
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                
            }
            berhasil = true;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            berhasil = false;
        }
        
        return berhasil;
    }

    @Override
    public boolean create() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
