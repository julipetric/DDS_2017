/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import DAO.UsuarioDAO;
import java.util.Arrays;

/**
 *
 * @author Tomas
 */
public class GestorDeAutenticacion {

    public GestorDeAutenticacion() {
    }
   
    public Boolean autenticar(String usuario, String password){
       UsuarioDAO dao = new UsuarioDAO();

       return dao.readLogAdmin(usuario, password);
             
    }
}
