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
import java.util.ArrayList;
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
    private String consulta;

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

    public List consultaNombreUsuario(String usuario) {
        consulta = usuario;
        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Criteria criterio = session.createCriteria(Bedel.class);
        List<Bedel> lista = new ArrayList();
        if(!usuario.equals("*")){
            lista = criterio.add(Restrictions.eq("apellido", consulta)).list();
        }
        else{
             lista = criterio.list();
        }
        System.out.println(lista);
        tx.commit();
        session.close();
        return lista;
    }
    
    public List read(String apellido, Turno turno){
        
        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        
        String hql = "FROM Bedel";
        Query query = session.createQuery(hql);
        List bedeles = query.list();
        
        System.out.println(bedeles);
        

        return bedeles;
    }

}
