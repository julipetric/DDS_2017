/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Clases.PoliticaSeguridad;
import bd.model.Bedel;
import Clases.Turno;
import DAO.UsuarioDAO;
import Interfaces.REGISTRAR_BEDEL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Tomas
 */
public class GestorBedel {

    private REGISTRAR_BEDEL ventana;

    public GestorBedel() {
    }

    public boolean validar(String nombre, String apellido, String usuario, Turno turno, String contra, String contra2, ArrayList<Boolean> errores) {
        PoliticaSeguridad politica;
        politica = new PoliticaSeguridad();

        boolean error, errorp;
        error = false;
        errorp = politica.validar(contra, contra2);
        if (errorp) {
            errores.set(4, true);
            errores.set(5, true);
        }

        // VEMOS SI YA EXISTE EL NOMBRE DE USUARIO
        //UsuarioDAO dao1 = new UsuarioDAO();
        //dao1.consultaNombreUsuario(ventana.usuario);
        if (usuario.equals("")) {
            errores.set(0, true);
            error = true;
        }

        if (apellido.equals("")) {
            errores.set(1, true);
            error = true;
        }
        
        if(usuario.equals("")){
            errores.set(2, true);
            error = true;
        }
        
        if(turno == null){
           errores.set(3, true);
            error = true; 
        }

        System.out.println(error);
        System.out.println(errorp);
        //llamada a dao si esta todo correcto
        if (error == false && errorp == false) {
            System.out.println("1");
            UsuarioDAO dao = new UsuarioDAO();
            System.out.println("2");
            Bedel b1 = new Bedel(usuario,nombre, apellido, contra, turno.toString());
            System.out.println("3");
            dao.crear(b1);
            System.out.println("4");
            return false;
        }
        else{
             return true;
        }
    }
       
    private void eliminarBedel(Bedel bedel) {
        //IMPLEMENTAR GATITOS
        //IMPLEMENTAR GATITOS 
        //IMPLEMENTAR GATITOS
    }

    private void modificarBedel(Bedel bedel, String nombre, String apellido, String email, Turno turno) {
        //IMPLEMENTAR GATITOS
        //IMPLEMENTAR GATITOS 
        //IMPLEMENTAR GATITOS
    }

    private Boolean validarDatos(String id, String password1, String password2, String nombre, String apellido, Turno turno) {
        //IMPLEMENTAR GATITOS
        //IMPLEMENTAR GATITOS 
        //IMPLEMENTAR GATITOS
        return true;
    }
    
    public List buscarBedel (String apellido, Turno turno){
        UsuarioDAO dao = new UsuarioDAO();
        List bedelesdao = dao.consultaNombreUsuario(apellido);
        //filtrar de la lista de bedeles cuales cumplen las caract
        
        return bedelesdao ; //bedelesdao;
    }
}
