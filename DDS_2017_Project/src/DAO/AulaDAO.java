/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import bd.model.Aula;
import bd.model.Reserva;
import bd.dto.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

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
        tx.commit();
        session.close();
        return a;
    }

    public List<Aula> getPosibles(String tipo, int cant) {
        //System.out.println("read");
        //System.out.println(cant);
        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        ArrayList<Aula>posibles = new ArrayList<>();
        ArrayList<Aula>posiblesAux2 = new ArrayList<>();
        ArrayList<Aula>posiblesAux3 = new ArrayList<>();
        List<Aula> posiblesAux1 = session.createCriteria(Aula.class)
                //.add(Restrictions.ge("capacidad", cant))//ver que sea mayor o igual
                //.add(Restrictions.eq("tipo", tipo))
                //.add(Restrictions.eq("habilitada", true))
                .list();
        tx.commit();
        session.close();
        
        
        posiblesAux1.stream().filter((a) -> (a.getCapacidad()>=cant)).forEachOrdered((a) -> {
            posiblesAux2.add(a);
        });
        
        posiblesAux2.stream().filter((a) -> (a.getTipo().equals(tipo))).forEachOrdered((a) -> {
            posiblesAux3.add(a);
        });
        
        posiblesAux3.stream().filter((a) -> (a.isHabilitada())).forEachOrdered((a) -> {
            posibles.add(a);
        });


        return posibles;
    }

    public void getAulas(Reserva reserva) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
