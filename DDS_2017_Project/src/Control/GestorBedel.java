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
import bd.dto.HibernateUtil;
import java.util.Arrays;
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

    public boolean validar(String nombre, String apellido, String usuario, Turno turno, char[] contra, char[] contra2) {
        PoliticaSeguridad politica;
        politica = new PoliticaSeguridad();

        boolean error, errorp;
        error=false;
        errorp=politica.validar(contra, contra2);    
       
        // VEMOS SI YA EXISTE EL NOMBRE DE USUARIO
        //UsuarioDAO dao1 = new UsuarioDAO();
        //dao1.consultaNombreUsuario(ventana.usuario);

        if (usuario==null || apellido==null) { 
            error=true;
        }

        //llamada a dao si esta todo piola
        if (error==false && errorp==false) {
            UsuarioDAO dao = new UsuarioDAO();
            Bedel b1 = new Bedel(usuario, Arrays.toString(contra), nombre, apellido, turno.toString());
            dao.crear(b1);
        }
        return error;
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
