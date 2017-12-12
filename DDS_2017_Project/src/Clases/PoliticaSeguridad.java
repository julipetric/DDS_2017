/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author santi_000
 */
public class PoliticaSeguridad {

    public boolean validar(String pass, String passv) {
        boolean error = false;
       
        

        if ((pass.length() < 8 || pass.length() > 32) || (passv.length() < 8 || passv.length() > 32)) {
            error = true;
        } else {
            
            if (!pass.isEmpty() && !passv.isEmpty() && pass.length() > 7 && pass.length() < 33 && passv.length() > 7 && passv.length() < 33 && passv.length() == pass.length()) {
            
                for (int i = 0; i < pass.length(); i++) {
                    if (pass.charAt(i)!= passv.charAt(i)) {
                        error = true;
                        break;
                    }
                }
            
            } else {
                error = true;
            }
        }
        return error;
    }

    public PoliticaSeguridad() {
    }
}
