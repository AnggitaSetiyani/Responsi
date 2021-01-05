/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Daftar;

/**
 *
 * @author Anggita
 */
public class MVC_Daftar {
    viewDaftar vd = new viewDaftar();
    modelDaftar md = new modelDaftar();
    controllerDaftar cd = new controllerDaftar(vd, md);

    public void setVisible(boolean b) {
      
    }

    
}
