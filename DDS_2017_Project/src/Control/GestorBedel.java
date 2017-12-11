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

    public boolean validar(String nombre, String apellido, String usuario, Turno turno, char[] contra, char[] contra2, ArrayList<Boolean> errores) {
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

        //llamada a dao si esta todo correcto
        if (error == false && errorp == false) {
            UsuarioDAO dao = new UsuarioDAO();
            Bedel b1 = new Bedel(usuario, Arrays.toString(contra), nombre, apellido, turno.toString());
            dao.crear(b1);
        }
        return error;
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
    
    public List buscarBedel (String apellido, String turno){
        UsuarioDAO dao = new UsuarioDAO();
        List<Bedel> bedelesdao = dao.read(apellido,turno);
        return bedelesdao;
    }
}
