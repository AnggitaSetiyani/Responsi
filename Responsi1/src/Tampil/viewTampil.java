/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tampil;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Anggita
 */
public class viewTampil extends JFrame {
    JLabel jlperpus = new JLabel ("PERPUSTAKAAN");
    JLabel jlmenu = new JLabel ("LIST BUKU YANG DIPINJAM");
    
    
    JButton jbhapus = new JButton("Hapus");
    JButton jbedit = new JButton("Edit");
    JButton jbhome = new JButton("Home");
    JButton jbpinjam = new JButton("Pinjam");
    JButton jbtampil = new JButton("Tampil");
    JButton jbabout = new JButton("About Us");
    JButton jblogout = new JButton("Logout");
    
    JTable tabel;
    DefaultTableModel dtm;
    JScrollPane scrollPane;
    Object namaKolom[] = {"ID", "Nama", "ID Buku", "Judul Buku"};
    
    public viewTampil(){
        setTitle("Tampil");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(750,550);
        setLocationRelativeTo(null);
        
        dtm = new DefaultTableModel(namaKolom, 0);
        tabel = new JTable(dtm);
        scrollPane = new JScrollPane(tabel);
        
        add(jlperpus);
        jlperpus.setBounds(180, 50, 360, 20);
        
        add(jbhapus);
        jbhapus.setBounds(80, 90, 130, 20);
        
        add(jbedit);
        jbedit.setBounds(230, 90, 130, 20);
        
        add(jlmenu);
        jlmenu.setBounds(150, 130, 360, 20);
        
        add(scrollPane);
        scrollPane.setBounds(20, 160, 480, 300);
        
        add(jbhome);
        jbhome.setBounds(520, 100, 130, 40);
        
        add(jbpinjam);
        jbpinjam.setBounds(520, 150, 130, 40);
        
        add(jbtampil);
        jbtampil.setBounds(520, 200, 130, 40);
        
        add(jbabout);
        jbabout.setBounds(520, 250, 130, 40);
        
        add(jblogout);
        jblogout.setBounds(610, 20, 90, 20);
    }
}
