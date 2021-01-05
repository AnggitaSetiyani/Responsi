/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perpustakaan;
import Tampil.MVC_Tampil;
import Pinjam.MVC_Pinjam;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Anggita
 */
public class Perpustakaan extends JFrame  {
     
     JLabel jlperpus = new JLabel ("PERPUSTAKAAN");
     JLabel jlmenu = new JLabel ("SELAMAT DATANG DI");
     JLabel jlpus = new JLabel ("PERPUSTAKAAN");
     
     JButton jbhome = new JButton("Home");
     JButton jbpinjam = new JButton("Pinjam");
     JButton jbtampil = new JButton("Tampil");
     JButton jbabout = new JButton("About Us");
     JButton jblogout = new JButton("Logout");
     
     public Perpustakaan(){
        setTitle("Perpustakaan");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(750,450);
        setLocationRelativeTo(null);
        
        add(jlpus);
        jlpus.setBounds(320, 50, 360, 20);
        
        add(jlmenu);
        jlmenu.setBounds(420, 150, 360, 20);
        
        add(jlperpus);
        jlperpus.setBounds(430, 170, 360, 20);
        
        add(jbhome);
        jbhome.setBounds(120, 100, 130, 40);
        
        add(jbpinjam);
        jbpinjam.setBounds(120, 150, 130, 40);
        
        add(jbtampil);
        jbtampil.setBounds(120, 200, 130, 40);
        
        add(jbabout);
        jbabout.setBounds(120, 250, 130, 40);
        
        add(jblogout);
        jblogout.setBounds(610, 20, 90, 20);
        
        jbtampil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MVC_Tampil mvc = new MVC_Tampil();
                 new MVC_Tampil().setVisible(true);
            }
            
        });
        
        jbpinjam.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MVC_Pinjam mvc = new MVC_Pinjam();
                
            }
            
        });
        
        jbabout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 new AboutUs().setVisible(true);
            }
            
        });
        
        jblogout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                 System.exit(0); 
            }
        });
        
     }
     
     
    
}
