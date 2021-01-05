/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tampil;

/**
 *
 * @author Anggita
 */
public class MVC_Tampil {
    viewTampil vt = new viewTampil();
    modelTampil mt = new modelTampil();
    controllerTampil ct = new controllerTampil(vt, mt);

    public void setVisible(boolean b) {
       
    }
}
