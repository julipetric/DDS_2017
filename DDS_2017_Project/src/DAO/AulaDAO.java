/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import bd.model.Aula;
import Clases.Reserva;
import Clases.TipoDeAula;
import bd.dto.HibernateUtil;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author santi_000
 */
public class AulaDAO {
    
    public Aula read(String idAula){
        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Aula a = (Aula) session.get(Aula.class, idAula);
        return a;
    }
    
    public List<Aula> read(TipoDeAula tipo, Integer cant){
        //System.out.println("read");
        //System.out.println(cant);
        List<Aula> posibles;
        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Criteria criterio = session.createCriteria(Aula.class);
        //criterio.add(Restrictions.ge("capacidad", cant));//ver que sea mayor o igual
        //criterio.add(Restrictions.eq("tipo", tipo));
        //criterio.add(Restrictions.eq("hablitida", 1));
        posibles = criterio.list();
        tx.commit();
        session.close();
        
        return posibles;
    }

    public void getAulas(Reserva reserva) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
