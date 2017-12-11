/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Clases.Reserva;
import bd.dto.HibernateUtil;
import bd.model.Bedel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author santi_000
 */
public class ReservaDAO {
    private Connection con;
    private ResultSet rs;
    private ResultSetMetaData rsmd;
    
    public ReservaDAO() {
    }
    
    public void crear(Reserva reserva) {
        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.save(reserva);
        tx.commit();
        session.close();
    }
    
    public List read(String dia, String tipo, String aula){
        
        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        
        String hql = "FROM Bedel";
        Query query = session.createQuery(hql);
        List bedeles = query.list();
        
        System.out.println(bedeles);
        

        return bedeles;
    }
}
