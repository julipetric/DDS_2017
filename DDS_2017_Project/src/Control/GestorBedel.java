/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import bd.model.Bedel;
import Clases.Turno;
import DAO.UsuarioDAO;
import Interfaces.REGISTRAR_BEDEL;
import bd.dto.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Tomas
 */
public class GestorBedel {

    private REGISTRAR_BEDEL ventana;

    public GestorBedel() {
    }

    public void validar(REGISTRAR_BEDEL v1) {
        ventana = v1;
        String passNueva = "";
        Boolean error = false;

        String pass1 = "";
        String pass2 = "";

        for (int i = 0; i < ventana.contra.length; i++) {
            pass1 += ventana.contra[i];
        }
        for (int i = 0; i < ventana.contra2.length; i++) {
            pass2 += ventana.contra2[i];
        }

        if (pass1.equals(pass2) && !pass1.isEmpty() && !pass2.isEmpty()) {
            ventana.contraOk();
            ventana.contra2Ok();
        } else {
            error = true;
            ventana.errorContra();
            ventana.errorContra2();
        }

        if (ventana.usuario.isEmpty()) {
            error = true;
            ventana.errorUsuario();
        } else {
            ventana.usuarioOk();
        }
        
        // VEMOS SI YA EXISTE EL NOMBRE DE USUARIO
        UsuarioDAO dao1 = new UsuarioDAO();
        //dao1.consultaNombreUsuario(ventana.usuario);
        
        
        if (ventana.nombre.isEmpty()) {
            error = true;
            ventana.errorNombre();
        } else {
            ventana.nombreOk();
        }
        if (ventana.apellido.isEmpty()) {
            error = true;
            ventana.errorApellido();
        } else {
            ventana.apellidoOk();
        }
        //llamada a dao si esta todo piola
        if (error == false) {
            UsuarioDAO dao = new UsuarioDAO();
            Bedel b1 = new Bedel(ventana.nombre, ventana.apellido, ventana.usuario, pass1, ventana.turno.toString());
            dao.crear(b1);

        }

    }

    public Bedel buscarBedel(String n, Turno t) {
        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Bedel bedel = (Bedel) session.get(Bedel.class, 1);
        tx.commit();
        session.close();
        return bedel;
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
}
