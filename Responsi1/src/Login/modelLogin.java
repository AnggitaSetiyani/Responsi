/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

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
public class modelLogin {
    viewLogin view;
    
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/responsi";
    static final String USER = "root";
    static final String PASS = "";
    Connection koneksi;
    Statement statement;
    
    public modelLogin(){
        try{
            Class.forName(JDBC_DRIVER);
            koneksi = (Connection) DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Koneksi Berhasil");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            System.out.println("Koneksi Gagal");
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
    
//    public void Login(){
//        try {
//            java.sql.Statement stat = koneksi.createStatement();
//            ResultSet result=stat.executeQuery ("select * from accounts where "
//                    + "password='" +view.getPassword()+"'");
//            if (result.next()) {
//                if (view.getPassword().equals(result.getString("password"))){
//                JOptionPane.showMessageDialog(null, "Login Berhasil");
//                } else {
//                        JOptionPane.showMessageDialog(null, "Password Salah");
//                        view.jlpassword.setText("");
//                        view.jlusername.requestFocus();
//                }
//            } else {
//                JOptionPane.showMessageDialog(null, "User Tidak Ditemukan");
//                view.jlusername.setText("");
//                view.jlpassword.setText("");
//                view.jlusername.requestFocus();
//            }
//        } catch (Exception e){
//            JOptionPane.showMessageDialog(null, "Gagal");
//        }
//    }
    
}
