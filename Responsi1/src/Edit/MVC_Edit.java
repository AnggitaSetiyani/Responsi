/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edit;

/**
 *
 * @author Anggita
 */
public class MVC_Edit {
    viewEdit ve = new viewEdit();
    modelEdit me = new modelEdit();
    controllerEdit ce = new controllerEdit(ve, me);

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
