/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import bd.model.Aula;
import Clases.EstructAUX;
import bd.model.Reserva;
import DAO.AulaDAO;
import DAO.ReservaDAO;
import bd.model.Diareserva;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tomas
 */
public class GestorReserva {

    private final ArrayList<String> cola;

    public GestorReserva() {

        cola = new ArrayList<>();
        this.cola.add("08:00");
        this.cola.add("08:45");
        this.cola.add("09:30");
        this.cola.add("10:15");
        this.cola.add("10:30");
        this.cola.add("11:15");
        this.cola.add("12:00");
        this.cola.add("12:45");
        this.cola.add("13:15");
        this.cola.add("13:30");
        this.cola.add("14:00");
        this.cola.add("14:15");
        this.cola.add("14:45");
        this.cola.add("15:30");
        this.cola.add("16:15");
        this.cola.add("16:30");
        this.cola.add("17:15");
        this.cola.add("18:00");
        this.cola.add("18:45");
        this.cola.add("19:00");
        this.cola.add("19:45");
        this.cola.add("20:30");
        this.cola.add("21:15");
        this.cola.add("21:30");
        this.cola.add("22:15");
        this.cola.add("23:00");
        this.cola.add("23:45");

    }

    public void nuevaReserva(Reserva reserva, ArrayList<Diareserva> dias) {//<--------------GUARDA RESERVA
        ReservaDAO resDao = new ReservaDAO();
        resDao.crear(reserva, dias);
    }

    public ArrayList<Aula> obtenerDisponibilidadPeriodica(Reserva reserva) {
        //Se crean DAOs para los objetos
        ReservaDAO daoR = new ReservaDAO();
        AulaDAO daoA = new AulaDAO();

        //
        //ArrayList<Diareserva> dias = new ArrayList<>(reserva.getDiareservas());
        List<Aula> posibles;
        //ArrayList<Diareserva> diasPorAula;
        //ArrayList<Aula> aulasDisponibles = new ArrayList<>();
        //ArrayList<Aula> struct = new ArrayList<>();

        //System.out.println("estamos en el gestor");
        //System.out.println(reserva.tipoDeAula);
        //System.out.println(reserva.cantidadAlumnos);
        //obtenemos compatibles con mi reserva
        posibles = daoA.getPosibles(reserva.getTipoAula(), reserva.getCantidadAlumnos());
        //posibles está bien, trae todo

        //Ordenar aulas por capacidad descendentemente
        posibles.sort((Aula a1, Aula a2) -> (int) (a2.getCapacidad() - a1.getCapacidad()));

        return (ArrayList<Aula>) posibles;
    }

    public List listaReservasDia(String dia, String tipo, String aula) {

        ReservaDAO dao = new ReservaDAO();
        List<Reserva> reservasdao = dao.read(dia, tipo, aula);//o bien envío datos, o bien asterisco
        return reservasdao;

    }

    public ArrayList<Aula> obtenerDisponibilidadDia(Reserva reserva, Diareserva dia) {
        //Se crean DAOs para los objetos
        ReservaDAO daoR = new ReservaDAO();
        AulaDAO daoA = new AulaDAO();

        //
        //ArrayList<Diareserva> dias = new ArrayList<>(reserva.getDiareservas());
        List<Aula> posibles;
        //ArrayList<Diareserva> diasPorAula;
        //ArrayList<Aula> aulasDisponibles = new ArrayList<>();
        //ArrayList<Aula> struct = new ArrayList<>();

        //System.out.println("estamos en el gestor");
        //System.out.println(reserva.tipoDeAula);
        //System.out.println(reserva.cantidadAlumnos);
        //obtenemos compatibles con mi reserva
        posibles = daoA.getPosibles(reserva.getTipoAula(), reserva.getCantidadAlumnos());
        //posibles está bien, trae todo

        //Ordenar aulas por capacidad descendentemente
        posibles.sort((Aula a1, Aula a2) -> (int) (a2.getCapacidad() - a1.getCapacidad()));
        
        return (ArrayList<Aula>) posibles;
    }
}
