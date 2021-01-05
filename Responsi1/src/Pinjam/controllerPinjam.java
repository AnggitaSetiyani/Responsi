/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pinjam;

import Perpustakaan.AboutUs;
import Perpustakaan.Perpustakaan;
import Tampil.MVC_Tampil;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author Anggita
 */
public class controllerPinjam {
    modelPinjam model;
    viewPinjam view;
    
    public controllerPinjam(viewPinjam vpc, modelPinjam mpc) {
        this.model = mpc;
        this.view = vpc;
        
        if (model.getBanyakData() != 0) {
            String dataBuku[][] = model.readBuku();
        } else {
            JOptionPane.showMessageDialog(null, "Data Tidak Ada");
        }
        
        view.jbtambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                String idAnggota = view.getIdAnggota();
                String nama = view.getNama();
                String buku = view.getIdBuku();
                String judul = view.getJudul();
                model.insertData(idAnggota, nama, buku, judul);

                String dataBuku[][] = model.readBuku();
            }
        });
        
        view.jbhome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Perpustakaan perpus = new Perpustakaan();
                new Perpustakaan().setVisible(true);
            }
        });
        
        view.jbpinjam.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                MVC_Pinjam mvc = new MVC_Pinjam();
                new MVC_Pinjam().setVisible(true);
            }
        });
        
        view.jbabout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                AboutUs us = new AboutUs();
                new AboutUs().setVisible(true);
            }
        });
        
        view.jblogout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                 System.exit(0); 
            }
        });
        
        view.jbtampil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MVC_Tampil mvc = new MVC_Tampil();
                 new MVC_Tampil().setVisible(true);
            }
            
        });
       
    }
}
