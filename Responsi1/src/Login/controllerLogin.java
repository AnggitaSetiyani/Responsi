/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import Daftar.MVC_Daftar;
import static Login.viewLogin.JDBC_DRIVER;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Anggita
 */
public class controllerLogin {
    modelLogin model;
    viewLogin view;
    Login.viewLogin login;
    
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/responsi";
    static final String USER = "root";
    static final String PASS = "";
    Connection koneksi;
    Statement statement;
    
    public controllerLogin(viewLogin vpc, modelLogin mpc) {
        this.model = mpc;
        this.view = vpc;
        
        if (model.getBanyakData() != 0) {
            String dataAdmin[][] = model.readAdmin();
        } else {
            JOptionPane.showMessageDialog(null, "Data Tidak Ada");
        }
        
//        view.jblogin.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {   
//              String username = view.getUsername();
//              String password = view.getPassword();
//              model.Login();;
//
//            }
//        });
//        
        view.jbdaftar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                MVC_Daftar mvc = new MVC_Daftar();
                new MVC_Daftar().setVisible(true);
            }
        });
        
        view.jbexit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                 System.exit(0); 
            }
        });
        
    }
}
