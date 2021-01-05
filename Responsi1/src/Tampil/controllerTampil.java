/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tampil;
import Edit.MVC_Edit;
import Perpustakaan.AboutUs;
import Pinjam.viewPinjam;
import Perpustakaan.Perpustakaan;
import Pinjam.MVC_Pinjam;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
/**
 *
 * @author Anggita
 */
public class controllerTampil {
    modelTampil model;
    viewTampil view;
    Pinjam.viewPinjam pinjam;
    
    public controllerTampil(viewTampil vpc, modelTampil mpc) {
        this.model = mpc;
        this.view = vpc;
        
        if (model.getBanyakData() != 0) {
            String dataBuku[][] = model.readBuku();
            view.tabel.setModel((new JTable(dataBuku, view.namaKolom)).getModel());
        } else {
            JOptionPane.showMessageDialog(null, "Data Tidak Ada");
        }
        
        view.jbedit.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mousePressed(e);
                int baris = view.tabel.getSelectedRow();
                int kolom = view.tabel.getSelectedColumn(); // ga kepake sekarang
                
                MVC_Edit mvc = new MVC_Edit();
                new MVC_Edit().setVisible(true);
    
            }
        });
        
        
        view.jbhapus.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mousePressed(e);
                int baris = view.tabel.getSelectedRow();
                int kolom = view.tabel.getSelectedColumn(); // ga kepake sekarang

                String dataterpilih = view.tabel.getValueAt(baris, 0).toString();

                System.out.println(dataterpilih);

                model.deleteBuku(dataterpilih);
                String dataBuku[][] = model.readBuku();
                view.tabel.setModel(new JTable(dataBuku, view.namaKolom).getModel());    
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
        
        view.jbtampil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                MVC_Tampil mvc = new MVC_Tampil();
                new MVC_Tampil().setVisible(true);
            }
        });
        
        view.jblogout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                 System.exit(0); 
            }
        });
    }
}
