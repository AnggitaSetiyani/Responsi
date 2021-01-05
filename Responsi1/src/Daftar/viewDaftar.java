/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Daftar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Anggita
 */
public class viewDaftar extends JFrame {
    
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/responsi";
    static final String USER = "root";
    static final String PASS = "";
    Connection koneksi;
    Statement statement;
    
    JLabel jldaftar = new JLabel ("Daftar");
    JLabel jlusername = new JLabel("Username : ");
    JTextField jtusername = new JTextField();
    JLabel jlpassword = new JLabel("Password : ");
    JTextField jtpassword = new JTextField();
    
    JButton jbdaftar = new JButton("Daftar");
    JButton jbbatal = new JButton("Batal");
    JButton jbexit = new JButton("Exit");
    
    public viewDaftar(){
        
        try{
            Class.forName(JDBC_DRIVER);
            koneksi = (Connection) DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Koneksi Berhasil");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            System.out.println("Koneksi Gagal");
        }
        
        setTitle("Daftar");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(750,450);
        setLocationRelativeTo(null);
        
        
        add(jldaftar);
        jldaftar.setBounds(320, 50, 360, 20);
        
        add(jlusername);
        jlusername.setBounds(220, 100, 360, 20);
        add(jtusername);
        jtusername.setBounds(300, 104, 180, 20);
        
        add(jlpassword);
        jlpassword.setBounds(220, 140, 360, 20);
        add(jtpassword);
        jtpassword.setBounds(300, 142, 180, 20);
        
        add(jbexit);
        jbexit.setBounds(610, 20, 90, 20);
        
        add(jbdaftar);
        jbdaftar.setBounds(220, 250, 120, 20);
        
        add(jbbatal);
        jbbatal.setBounds(350, 250, 120, 20);
        
        
    }
    
    public String getUsername(){
        return jtusername.getText();
    }
    
    public String getPassword(){
        return jtpassword.getText();
    }
    
}

