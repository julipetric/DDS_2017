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
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;
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
       
        try{
            session.save(bedel);
            tx.commit();
            session.close();
        }catch(HibernateError e){
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
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
        if(!usuario.equals("*")){
            lista = criterio.add(Restrictions.eq("nombreUsuario", consulta)).list();
        }
        else{
             lista = criterio.list();
        }
        System.out.println(lista);
        tx.commit();
        session.close();
        return lista;
    }
    
    public boolean readLogAdmin(String usuario, String pass){
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
        tx.commit();
        session.close();
        return verif;
    }
    
    public List read(String apellido, Turno turno){
        
        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        
        String hql = "FROM Bedel";
        Query query = session.createQuery(hql);
        List bedeles = query.list();
        
        System.out.println(bedeles);
        tx.commit();
        session.close();

        return bedeles;
    }
    
    public Bedel traerBedel(String ID){
        
        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        
         List<Bedel>lista = session.createCriteria(Bedel.class)
                     .add(Restrictions.eq("nombreUsuario",ID))
                     .list(); 
        
        
    return lista.get(0);
    }

     public void modificarBedel(Bedel bedel){
      SessionFactory sesion = HibernateUtil.getSessionFactory();
      Session session = sesion.openSession();
      Transaction tx = session.beginTransaction();
      try{
       session.merge(bedel);
      }catch(HibernateException e){
          if (tx != null) {
              tx.rollback();
          }
          e.printStackTrace();
      }
     
      tx.commit();
      session.close();
     }
}
