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

    public boolean validar(char[] pass, char[] passv) {
        boolean error = false;
        String passNueva = "";
        String pass1 = "";
        String pass2 = "";

        if ((pass.length < 8 || pass.length > 32) || (passv.length < 8 || passv.length > 32)) {
            error = true;
        } else {
            for (int i = 0; i < pass.length; i++) {
                pass1 += pass[i];
            }
            for (int i = 0; i < passv.length; i++) {
                pass2 += passv[i];
            }
            if ((pass1.equals(pass2) && !pass1.isEmpty() && !pass2.isEmpty()) && pass.length > 7 && pass.length < 33 && passv.length > 7 && passv.length < 33) {
            } else {
                error = true;
            }
        }
        return error;
    }

    public PoliticaSeguridad() {
    }
}
