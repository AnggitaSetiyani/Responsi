/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pinjam;

/**
 *
 * @author Anggita
 */
public class MVC_Pinjam {
    viewPinjam vp = new viewPinjam();
    modelPinjam mp = new modelPinjam();
    controllerPinjam cp = new controllerPinjam(vp, mp);

    public void setVisible(boolean b) {
        
    }
}
