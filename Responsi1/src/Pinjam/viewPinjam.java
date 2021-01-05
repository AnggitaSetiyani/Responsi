/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pinjam;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JTextField;
/**
 *
 * @author Anggita
 */
public class viewPinjam extends JFrame {
    
    JLabel jlperpus = new JLabel ("PERPUSTAKAAN");
    JLabel jlidAnggota = new JLabel("ID Anggota");
    JTextField jtidAnggota = new JTextField();
    JLabel jlnama = new JLabel("Nama");
    JTextField jtnama = new JTextField();
    JLabel jlbuku = new JLabel("ID Buku");
    JTextField jtbuku = new JTextField();
    JLabel jljudul = new JLabel("Judul Buku");
    JTextField jtjudul = new JTextField();
    
    JButton jbtambah = new JButton("Tambah");
    JButton jbbatal = new JButton("Batal");
    JButton jbhome = new JButton("Home");
    JButton jbpinjam = new JButton("Pinjam");
    JButton jbtampil = new JButton("Tampil");
    JButton jbabout = new JButton("About Us");
    JButton jblogout = new JButton("Logout");
    
    public viewPinjam(){
        
        setTitle("Pinjam");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(750,450);
        setLocationRelativeTo(null);
        
        add(jlperpus);
        jlperpus.setBounds(320, 50, 360, 20);    
        
        add(jlidAnggota);
        jlidAnggota.setBounds(120, 100, 360, 20);
        add(jtidAnggota);
        jtidAnggota.setBounds(200, 104, 200, 20);
        
        add(jlnama);
        jlnama.setBounds(120, 150, 360, 20);
        add(jtnama);
        jtnama.setBounds(200, 154, 200, 20);
        
        add(jlbuku);
        jlbuku.setBounds(120, 200, 360, 20);
        add(jtbuku);
        jtbuku.setBounds(200, 204, 200, 20);
        
        add(jljudul);
        jljudul.setBounds(120, 250, 360, 20);
        add(jtjudul);
        jtjudul.setBounds(200, 254, 200, 20);
        
        add(jbtambah);
        jbtambah.setBounds(150, 300, 100, 20);
        
        add(jbbatal);
        jbbatal.setBounds(280, 300, 100, 20);
        
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
        
        jbbatal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String def = ""; 
                jtidAnggota.setText(def);
                jtnama.setText(def);
                jtbuku.setText(def);
                jtjudul.setText(def);
            }
            
        });
    }
    
    
    public String getIdAnggota(){
        return jtidAnggota.getText();
    }
    
    public String getNama(){
        return jtnama.getText();
    }
    
    public String getIdBuku(){
        return jtbuku.getText();
    }
    
    public String getJudul(){
        return jtjudul.getText();
    }
}

