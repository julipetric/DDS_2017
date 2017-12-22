/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import bd.model.Aula;
import Clases.Periodo;
import bd.model.Reserva;
import bd.dto.HibernateUtil;
import bd.model.Diareserva;
import bd.model.Docente;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

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

    public void crear(Reserva reserva, ArrayList<Diareserva> dias) {
        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.save(reserva);   
        tx.commit();
        session.close();
        
        System.out.println("ahora los diasReserva");
        sesion = HibernateUtil.getSessionFactory();
        session = sesion.openSession();
        tx = session.beginTransaction();
        
        for(int i=0;i<dias.size();i++){
            Diareserva diaAux = dias.get(i);
            if (diaAux.getIdAula()!=null) {
              session.save(diaAux);  
            }    
        }
        
        tx.commit();
        session.close();  
    }

    public List read(String dia, String tipo, String aula) {

        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session = sesion.openSession();

        String hql = "FROM aula";
        Query query = session.createQuery(hql);
        List aulas = query.list();

        System.out.println(aulas);

        return aulas;
    }

    public Integer getIdReserva() {
        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        Transaction tx = session.beginTransaction();

        Integer count = ((Number) session.createCriteria(Reserva.class).setProjection(Projections.rowCount()).uniqueResult()).intValue();

        tx.commit();
        session.close();

        return (count + 1);
    }

}

