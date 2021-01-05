/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edit;

import Pinjam.MVC_Pinjam;
import Pinjam.modelPinjam;
import Pinjam.viewPinjam;
import Tampil.MVC_Tampil;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Anggita
 */
public class controllerEdit {
    modelEdit model;
    viewEdit view;
    
    public controllerEdit(viewEdit vpc, modelEdit mpc) {
        this.model = mpc;
        this.view = vpc;
        
        if (model.getBanyakData() != 0) {
            String dataBuku[][] = model.readBuku();
        } else {
            JOptionPane.showMessageDialog(null, "Data Tidak Ada");
        }
        
        view.jbedit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String idAnggota = view.getIdAnggota();
                String nama = view.getNama();
                String buku = view.getIdBuku();
                String judul = view.getJudul();
                model.updateBuku(idAnggota, nama, buku, judul);

                String dataBuku[][] = model.readBuku();
            }
        });
        
        view.jbbatal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MVC_Tampil mvc = new MVC_Tampil();
                new MVC_Tampil().setVisible(true);
            }
        });
    }
}
