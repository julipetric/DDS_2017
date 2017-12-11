/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Clases.Turno;
import Clases.Usuario;
import bd.dto.HibernateUtil;
import bd.model.Bedel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Conjunction;
import org.hibernate.criterion.MatchMode;
import static org.hibernate.criterion.Projections.id;
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
<<<<<<< HEAD

    public List read(String apellido, Turno turno) {
        
       SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();   
        Transaction tx = session.beginTransaction();
        Criteria crit = session.createCriteria(Bedel.class);
        Conjunction conj = Restrictions.conjunction();
        ArrayList <Bedel> resultado;
        
        conj.add(Restrictions.ilike("apellido", apellido, MatchMode.ANYWHERE));
        crit.add(conj);
        resultado = (ArrayList<Bedel>)crit.list();
        
        for(int i=0; i<=resultado.size(); i++){
            System.out.print(resultado.get(i).getNombre()); 
        }
        
        session.getTransaction().commit();
        
        /*SQLQuery query = session.createSQLQuery("select nombre, apellido, nombreUsuario, password, turno from bedel").addEntity(Bedel.class);
        List bedeles = query.list();*/
        
  
        
         /* for (Iterator iterator = bedeles.iterator(); iterator.hasNext();){
            Bedel employee = (Bedel) iterator.next(); 
            System.out.print("First Name: " + employee.getNombre()); 
            System.out.print("  Last Name: " + employee.getApellido()); 
         }
         

        //System.out.println(bedeles);
        tx.commit();
        session.close();
        */
        return null;
=======
    
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
>>>>>>> master
    }

}
