/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Daftar;

import Daftar.modelDaftar;
import Daftar.viewDaftar;
import Login.MVC_Login;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Anggita
 */
public class controllerDaftar {
    modelDaftar model;
    viewDaftar view;
    Daftar.viewDaftar daftar;
    
    public controllerDaftar(viewDaftar vpc, modelDaftar mpc) {
        this.model = mpc;
        this.view = vpc;
        
        if (model.getBanyakData() != 0) {
            String dataAdmin[][] = model.readAdmin();
        } else {
            JOptionPane.showMessageDialog(null, "Data Tidak Ada");
        }
        
        view.jbdaftar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String username = view.getUsername();
                String password = view.getPassword();
                model.insertAdmin(username, password);

                String dataBuku[][] = model.readAdmin();
            }
        });
        
        view.jbbatal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                MVC_Login login = new MVC_Login();
                new MVC_Login().setVisible(true);
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
