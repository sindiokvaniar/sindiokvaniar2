/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.blits.kdl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author user
 */
public class Koneksi {
     public Statement state;
    public Connection connect;
    public String url = "jdbc:mysql://localhost:3306/db_ikhlas";
    
    public void koneksiDatabase(){
        try {
            connect = DriverManager.getConnection(url,"root","1024");//nama database, username database, password database
            System.out.println("Koneksi Berhasil");
            state = connect.createStatement();
        } catch (SQLException ex) {
             System.err.println("SQLException:"+ex.getMessage());
        }
    }
}
