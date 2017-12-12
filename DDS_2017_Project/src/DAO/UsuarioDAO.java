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
        List<Bedel> lista = criterio.add(Restrictions.eq("apellido", consulta)).list();
        System.out.println(lista);
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
