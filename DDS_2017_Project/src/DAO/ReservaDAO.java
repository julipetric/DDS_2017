/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Clases.Aula;
import Clases.DiaReserva;
import Clases.Docente;
import Clases.Periodo;
import bd.model.Reserva;
import Clases.TipoDeAula;
import bd.dto.HibernateUtil;
import bd.model.Bedel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;
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

    public void crear(Reserva reserva) {
        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.save(reserva);
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

    public ArrayList<Aula> read(Periodo periodo, ArrayList<DiaReserva> diasReserva, TipoDeAula tipoDeAula, Integer cantidadAlumnos, ArrayList<Aula> disp) {
        
        //En un principio clonamos las disponibles o posibles a las isponibles finales
        ArrayList<Aula> disponibles = (ArrayList<Aula>) disp.clone();

        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        Transaction tx = session.beginTransaction();

        //Obtenemos los IDs de las que tenemos como disponibles para usar luego
        ArrayList<String> idAulasDisp = new ArrayList<>();
        for (int i = 0; i < disp.size(); i++) {
            idAulasDisp.add(disp.get(i).getId());
        }

        //Encontramos las reservas que cumplen nuestras condiciones de busqueda para la nueva reserva
        Criteria criterio1 = session.createCriteria(Reserva.class);
        criterio1.add(Restrictions.or(Restrictions.eq("periodo", Periodo.ANUAL), Restrictions.eq("periodo", periodo)));
        criterio1.add(Restrictions.eq("tipo", tipoDeAula));
        criterio1.add(Restrictions.ge("cantidadAlumnos", cantidadAlumnos));

        ArrayList<Reserva> reservasCoincidentes = (ArrayList<Reserva>) criterio1.list();
        
        //Obtenemos los IDs de dichas reservas para usar despues
        ArrayList<Integer> idReservas = new ArrayList<>();
        for (int i = 0; i < disp.size(); i++) {
            idReservas.add(reservasCoincidentes.get(i).getId());
        }
        
        //Encontramos los DiaReserva correspondientes a las reservas que pueden generar conflicto encontradas anteriormente
        Criteria criterio2 = session.createCriteria(DiaReserva.class);
        criterio2.add(Restrictions.in("id", idReservas));
        
        ArrayList<DiaReserva> diasCoincidentes = (ArrayList<DiaReserva>) criterio2.list();
        
        //Obtenemos los IDs de aulas no disponibles segun los objetos DiaReserva que encontramos antes
        ArrayList<String> idAulasNoDisp = new ArrayList<>();
        for (int i = 0; i < diasCoincidentes.size(); i++) {
            idAulasNoDisp.add(diasCoincidentes.get(i).getAula().getId());
        }
        
        //Lo pasamos a Set y lo volvemos para no tener repetidos
        Set<String> aux = new HashSet<>(idAulasNoDisp);
        idAulasNoDisp = new ArrayList<>(aux);
        
        //Obtenemos los objetos aula correspondiente a los IDs encontrados antes
        Criteria criterio3 = session.createCriteria(Aula.class);
        criterio3.add(Restrictions.in("idAula", idAulasNoDisp));
        
        ArrayList<Aula>noDisp = (ArrayList<Aula>) criterio3.list();
        
        //A las disponibles en primer lugar, le "restamos" las no disponibles encontradas y las devolvemos
        disponibles.removeAll(noDisp);
        return disponibles;
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

    public ArrayList<DiaReserva> getDiaReserva(String id, String fecha) {
        
        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        
        Criteria criterio1 = session.createCriteria(DiaReserva.class);
        criterio1.add(Restrictions.eq("idAula", id));
        criterio1.add(Restrictions.eq("fecha", fecha));
        
        ArrayList<DiaReserva> dias =  (ArrayList<DiaReserva>) criterio1.list();//para caa aula, me devuelve los dias reserva de ese dia
        
        return dias;
        
        
    }

   

}
