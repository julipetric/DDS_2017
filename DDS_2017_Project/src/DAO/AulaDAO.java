/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Clases.DiaReserva;
import bd.model.Aula;
import bd.model.Reserva;
import bd.dto.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author santi_000
 */
public class AulaDAO {

    public Aula read(String idAula) {
        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Aula a = (Aula) session.get(Aula.class, idAula);
        return a;
    }

    public List<Aula> getPosibles(String tipo, int cant) {
        //System.out.println("read");
        //System.out.println(cant);
        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        List<Aula> posibles = session.createCriteria(Aula.class)
                .add(Restrictions.ge("capacidad", cant))//ver que sea mayor o igual
                .add(Restrictions.eq("tipo", tipo))
                .add(Restrictions.eq("habilitada", true))
                .list();
        tx.commit();
        session.close();

        return posibles;
    }

    public void getAulas(Reserva reserva) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
