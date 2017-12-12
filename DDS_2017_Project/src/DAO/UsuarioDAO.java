/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import bd.dto.HibernateUtil;
import bd.model.Admin;
import bd.model.Bedel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.List;
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

    public UsuarioDAO() {
    }

    public void crear(Bedel bedel) {
        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.save(bedel);
        tx.commit();
        session.close();
    }

    public void consultaNombreUsuario(String usuario) {
        //
    }
    
    public List read(String apellido, String turno){ 
        List<Bedel> lista = null;
        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        if (turno==null) {
            lista = session.createCriteria(Bedel.class)
                     .add(Restrictions.eq("apellido",apellido))
                     .list();
        }
        if (apellido == null) {
            lista = session.createCriteria(Bedel.class)
                     .add(Restrictions.eq("turno",turno))
                     .list(); 
        }
        
        if (apellido != null && turno != null) {
            lista = session.createCriteria(Bedel.class)
                     .add(Restrictions.eq("turno",turno))
                     .add(Restrictions.eq("apellido",apellido))
                     .list(); 
        }
        
        tx.commit();
        session.close();
        return lista;

    }
    
    public boolean readLog(String usuario, String pass){
        System.out.println("flag1");
        boolean verif = false;
        List<Admin> lista = null;
        
        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        
         lista = session.createCriteria(Admin.class)
                     .add(Restrictions.eq("nombre",usuario))
                     .add(Restrictions.eq("password",pass))
                     .list(); 
        
        verif = !lista.isEmpty();
        System.out.println("verif");
        
        tx.commit();
        session.close();
        return verif;
    }

}
