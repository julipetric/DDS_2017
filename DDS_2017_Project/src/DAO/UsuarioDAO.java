/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Clases.Turno;
import bd.dto.HibernateUtil;
import bd.model.Admin;
import bd.model.Bedel;
import bd.model.Historialdecontrasenia;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.hibernate.Criteria;
import org.hibernate.HibernateError;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author santi_000
 */
public class UsuarioDAO {

    private Connection con;
    private ResultSet rs;
    private ResultSetMetaData rsmd;
    private String consulta;

    public UsuarioDAO() {
    }

    public void crear(Bedel bedel) {
        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Historialdecontrasenia historial = new Historialdecontrasenia(bedel, bedel.getFecha(), bedel.getPassword());
        try {
            session.save(bedel);
            session.save(historial);
            tx.commit();
            session.close();
        } catch (HibernateError e) {
            if (tx != null) {
                tx.rollback();
            }
            session.close();
        }

    }

    public List consultaNombreUsuario(String usuario) {
        consulta = usuario;
        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Criteria criterio = session.createCriteria(Bedel.class);
        List<Bedel> lista = new ArrayList();
        if (!usuario.equals("*")) {
            lista = criterio.add(Restrictions.eq("nombreUsuario", consulta)).list();
        } else {
            lista = criterio.list();
        }
        System.out.println(lista);
        tx.commit();
        session.close();
        return lista;
    }

    public List consultarApellidoUsuario(String apellido) {
        consulta = apellido;
        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Criteria criterio = session.createCriteria(Bedel.class);
        List<Bedel> lista = new ArrayList();
        if (!apellido.equals("*")) {
            lista = criterio.add(Restrictions.eq("apellido", consulta)).list();
        } else {
            lista = criterio.list();
        }
        System.out.println(lista);
        tx.commit();
        session.close();
        return lista;
    }

    public List readLogAdmin(String usuario, String pass) {
        boolean verif = false;
        List<Admin> lista = null;

        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        Transaction tx = session.beginTransaction();

        lista = session.createCriteria(Admin.class)
                .add(Restrictions.eq("id", usuario))
                .add(Restrictions.eq("password", pass))
                .list();
        tx.commit();
        session.close();
        return lista;
    }

    public Bedel traerBedel(String ID) {

        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        Transaction tx = session.beginTransaction();

        List<Bedel> lista = session.createCriteria(Bedel.class)
                .add(Restrictions.eq("nombreUsuario", ID))
                .list();

        return lista.get(0);
    }

    public void modificarBedel(Bedel bedel) {
        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Historialdecontrasenia historial = new Historialdecontrasenia(bedel, bedel.getFecha(), bedel.getPassword());

        try {
            session.merge(bedel);
            session.save(historial);
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
        }

        tx.commit();
        session.close();
    }

    public Boolean consultarContraseña(String IDUSUARIO, String contra) {
        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        Transaction tx = session.beginTransaction();

        List<Bedel> lista = session.createCriteria(Bedel.class)
                .add(Restrictions.eq("nombreUsuario", IDUSUARIO))
                .list();

        if (!lista.isEmpty()) {
            Set historial = lista.get(0).getHistorialdecontrasenias();
            ArrayList<Historialdecontrasenia> contieneHistorial = new ArrayList();
            ArrayList<String> Contraseñas = new ArrayList();

            contieneHistorial.addAll(historial);

            for (Historialdecontrasenia H : contieneHistorial) {
                Contraseñas.add(H.getValue());
            }

            System.out.println("CONTRAS " + lista.get(0).getHistorialdecontrasenias() + "tien que estar en true " + Contraseñas.contains(contra));
            if (Contraseñas.contains(contra)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }

    }
}
