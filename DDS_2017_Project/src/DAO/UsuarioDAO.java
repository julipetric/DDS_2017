/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Clases.Turno;
import Interfaces.TODO_OK;
import bd.dto.HibernateUtil;
import bd.model.Bedel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
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

}
