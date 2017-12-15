/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import bd.model.Aula;
import Clases.DiaReserva;
import Clases.EstructAUX;
import Clases.Reserva;
import DAO.AulaDAO;
import DAO.ReservaDAO;
import bd.model.Bedel;
import java.text.SimpleDateFormat;
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

    public void nuevaReserva() {
        //IMPLEMENTAR GATITOS
        //IMPLEMENTAR GATITOS 
        //IMPLEMENTAR GATITOS
    }

    public ArrayList<Aula> obtenerDisponibilidadPeriodica(Reserva res) {
        ArrayList<Aula> posibles;
        AulaDAO aulaDao = new AulaDAO();

        posibles = (ArrayList<Aula>) aulaDao.read(res.getTipoDeAula(), res.getCantidadAlumnos());

        ArrayList<Aula> disponibles;
        ReservaDAO resDao = new ReservaDAO();

        disponibles = resDao.read(res.getPeriodo(), res.getDiasReserva(), res.getTipoDeAula(), res.getCantidadAlumnos(), posibles);

        return disponibles;
    }

    public List listaReservasDia(String dia, String tipo, String aula) {

        ReservaDAO dao = new ReservaDAO();
        List<Reserva> reservasdao = dao.read(dia, tipo, aula);//o bien envío datos, o bien asterisco
        return reservasdao;

    }

    public ArrayList listarReservasCurso(String curso) {
        //IMPLEMENTAR GATITOS
        //IMPLEMENTAR GATITOS 
        //IMPLEMENTAR GATITOS
        return new ArrayList();
    }

    public ArrayList<EstructAUX> obtenerDisponibilidadEsporadica(Reserva reserva) {

        //Se crean DAOs para los objetos
        ReservaDAO daoR = new ReservaDAO();
        AulaDAO daoA = new AulaDAO();
        
        //
        String fecha = new String();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        ArrayList<DiaReserva> dias = new ArrayList<>();
        List<Aula> posibles = new ArrayList<>();
        dias = reserva.diasReservaEsporadica;
        ArrayList<DiaReserva> diasPorAula = new ArrayList<>();
        ArrayList<Aula> aulasDisponibles = new ArrayList<>();
        ArrayList<EstructAUX> struct = new ArrayList<>();

        //System.out.println("estamos en el gestor");
        //System.out.println(reserva.tipoDeAula);
        //System.out.println(reserva.cantidadAlumnos);
        posibles = daoA.read(reserva.tipoDeAula, reserva.cantidadAlumnos); //devuelve aulas compatibles con mi reserva
        //System.out.println(posibles.size());
        for (int i = 0; i < posibles.size(); i++) {
            System.out.println(posibles.get(i).getId());
        }

        for (int i = 0; i < dias.size(); i++) { //recorro dias 
            fecha = sdf.format(dias.get(i).fecha);
            for (int j = 0; j < posibles.size(); j++) {
                //traer del dao, para cada dia, los aulas que cumplan el criterio y sus DiaReserva asignados con fecha igual al dia
                diasPorAula = daoR.getDiaReserva(posibles.get(j).getId(), fecha);//que devuelva para ese aula y ese dia, los dias reserva
                //SEGUIR ACA

                if (this.verSuperposicicion(diasPorAula, dias.get(i))) {//agrego el aula a la lista final si está isponible
                    // tengo que hacer una estructura de datos nueva
                    aulasDisponibles.add(posibles.get(j));

                }
                struct.add(new EstructAUX(dias.get(i), aulasDisponibles));
                aulasDisponibles.clear();
            }
        }

        return struct;
    }

    private Boolean verSuperposicicion(ArrayList<DiaReserva> diasPorAula, DiaReserva dia) {

        String inicio = dia.horaInicio;
        String fin = dia.horaFin;
        Boolean flag = true;
        List<String> horarios1 = cola.subList(cola.indexOf(inicio), cola.indexOf(fin));
        List<String> horarios2;
      if (diasPorAula != null) {
        for (int i = 0; i < diasPorAula.size(); i++) {//recorro todos los dias por aula

            horarios2 = cola.subList(cola.indexOf(diasPorAula.get(i).horaInicio), cola.indexOf(diasPorAula.get(i).horaFin));

            for (int j = 0; j < horarios1.size(); j++) {//comparamos que horarios  1 tenga algun elemento compatible con horarios  2, en ese caso se chocan

                if (horarios2.contains(horarios1.get(i))) {
                    flag = false;
                }

            }

        }
}
        return flag;

    }
}
