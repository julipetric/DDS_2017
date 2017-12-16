/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import bd.dto.HibernateUtil;
import bd.model.Docente;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author santi_000
 */
public class DocenteDAO {

    public ArrayList<Docente> read() {
        //trae todos los docentes de la bd
        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        
        List<Docente> docentes = session.createCriteria(Docente.class).list();
        
        tx.commit();
        session.close();
        
        return (ArrayList<Docente>) docentes;
    }
    
}
