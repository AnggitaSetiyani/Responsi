/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Daftar;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Anggita
 */
public class modelDaftar {
    viewDaftar daftar;
    
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/responsi";
    static final String USER = "root";
    static final String PASS = "";
    Connection koneksi;
    Statement statement;
    
    public modelDaftar(){
        try{
            Class.forName(JDBC_DRIVER);
            koneksi = (Connection) DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Koneksi Berhasil");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            System.out.println("Koneksi Gagal");
        }
    }
        
        public void insertAdmin(String username, String password){
        int jmlData=0;
        try {
           
           
           String query = "Select * from accounts WHERE password =" + password; 
           ResultSet resultSet = statement.executeQuery(query);
           
           while (resultSet.next()){ 
                jmlData++;
            }
           
           
            if (jmlData==0) {
                query = "INSERT INTO accounts(username, password) VALUES ('"+username+"','"+password+"')";
           
                statement = (Statement) koneksi.createStatement();
                statement.executeUpdate(query); 
                System.out.println("Berhasil ditambahkan");
                JOptionPane.showMessageDialog(null, "Data Berhasil ditambahkan");
            }
            else {
                JOptionPane.showMessageDialog(null, "Data sudah ada");
            }
        } catch (Exception sql) {
            System.out.println(sql.getMessage());   
            JOptionPane.showMessageDialog(null, sql.getMessage());
        }
    }
    
    public String[][] readAdmin(){
        try{
            int jmlData = 0;
            
            String data[][] = new String[getBanyakData()][2]; 
            
            String query = "Select * from accounts"; 
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                data[jmlData][0] = resultSet.getString("username");                
                data[jmlData][1] = resultSet.getString("password");
                jmlData++;
            }
            return data;
               
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
        }
    }
    
    public int getBanyakData(){
        int jmlData = 0;
        try{
            statement = koneksi.createStatement();
            String query = "Select * from accounts";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){ 
                jmlData++;
            }
            return jmlData;
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return 0;
        }
    }
    
}

