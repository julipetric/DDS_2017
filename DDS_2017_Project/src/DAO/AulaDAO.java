/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Clases.DiaReserva;
import bd.model.Aula;
import Clases.Reserva;
import Clases.TipoDeAula;
import bd.dto.HibernateUtil;
import java.util.ArrayList;

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

    public Aula read(String idAula) {
        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Aula a = (Aula) session.get(Aula.class, idAula);
        return a;
    }

    public List<Aula> obtenerDisponibles(TipoDeAula tipo, Integer cant) {
        //System.out.println("obtenerDisponibles");
        //System.out.println(cant);

        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        List<Aula> posibles = session.createCriteria(Aula.class)
                //.add(Restrictions.ge("capacidad", cant))
                //.add(Restrictions.eq("tipo", tipo.toString()))
                //.add(Restrictions.eq("hablitida", true))
                .list();
        tx.commit();
        session.close();
        
        ArrayList<Aula> aulaFinal = new ArrayList<>();
        ArrayList<Aula> aulaAux1 = new ArrayList<>();
        ArrayList<Aula> aulaAux2 = new ArrayList<>();
        
        posibles.stream().filter((a) -> (a.getCapacidad() >= cant)).forEachOrdered((a) -> {
            aulaAux1.add(a);
        });
        
        aulaAux1.stream().filter((a) -> (a.getTipo().equals(tipo.toString()))).forEachOrdered((a) -> {
            aulaAux2.add(a);
        });
        
        aulaAux2.stream().filter((a) -> (a.isHabilitada())).forEachOrdered((a) -> {
            aulaFinal.add(a);
        });
        
        return aulaFinal;
    }

    public void getAulas(Reserva reserva) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
