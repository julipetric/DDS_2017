/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import bd.model.Aula;
import Clases.EstructAUX;
import Clases.horariosAUX;
import bd.model.Reserva;
import DAO.AulaDAO;
import DAO.ReservaDAO;
import Interfaces.Exito;
import bd.model.Diareserva;
import bd.model.DiareservaId;
import bd.model.Docente;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tomas
 */
public class GestorReserva {

    private final ArrayList<String> cola;

    public GestorReserva() {

        cola = new ArrayList<>();
        this.cola.add("08:00");
        this.cola.add("08:00");
        this.cola.add("08:30");
        this.cola.add("09:00");
        this.cola.add("09:30");
        this.cola.add("10:00");
        this.cola.add("10:30");
        this.cola.add("11:00");
        this.cola.add("11:30");
        this.cola.add("12:00");
        this.cola.add("12:30");
        this.cola.add("13:00");
        this.cola.add("13:30");
        this.cola.add("14:00");
        this.cola.add("14:30");
        this.cola.add("15:00");
        this.cola.add("15:30");
        this.cola.add("16:00");
        this.cola.add("16:30");
        this.cola.add("17:00");
        this.cola.add("17:30");
        this.cola.add("18:00");
        this.cola.add("18:30");
        this.cola.add("19:00");
        this.cola.add("19:30");
        this.cola.add("20:00");
        this.cola.add("20:30");
        this.cola.add("21:00");
        this.cola.add("21:30");
        this.cola.add("22:00");
        this.cola.add("22:30");
        this.cola.add("23:00");
        this.cola.add("23:30");

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
        posibles.sort((Aula a1, Aula a2) -> (int) (a1.getCapacidad() - a2.getCapacidad()));

        return (ArrayList<Aula>) posibles;
    }

    public List listaReservasDia(String dia, String tipo, String aula) {

        ReservaDAO dao = new ReservaDAO();
        List<Reserva> reservasdao = dao.read(dia, tipo, aula);//o bien envío datos, o bien asterisco
        return reservasdao;

    }

    public ArrayList<Aula> obtenerDisponibilidad(Reserva reserva) {
        //Se crean DAOs para los objetos
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
        posibles.sort((Aula a1, Aula a2) -> (int) (a1.getCapacidad() - a2.getCapacidad()));
        
        return (ArrayList<Aula>) posibles;
    }
    
    
    public Reserva registrarDatosReserva(Reserva reserva, String cantAlumnosComboBox, String tipoComboBox,String cursoTextField,Docente docente, Boolean periodicaRadioButton, String periodo) {
        reserva.setCantidadAlumnos(Integer.parseInt(cantAlumnosComboBox));
        reserva.setTipoAula(tipoComboBox);
        reserva.setNombreCurso(cursoTextField);
        reserva.setDocente(docente);
        if (periodicaRadioButton) {
            reserva.setPeriodo(periodo);
        } else {
            reserva.setPeriodo("ESPORADICA");
        }
        return reserva;
    }
    
    public ArrayList setearFechasPeriodicas(Boolean modoPrueba,Date inicio, Date inicio1C ,Date fin,Date fin2C,Date fin1C,Date inicio2C,Integer periodoComboBox) {
        ArrayList<Date> Aux = new ArrayList();
        
        for (int i = 0; i < 2; i++) {
            Aux.add(new Date());
        }
        
        if (periodoComboBox.equals(0)) {
            inicio = inicio1C;
            fin = fin2C;
        }
        if (periodoComboBox.equals(1)) {
            inicio = inicio1C;
            fin = fin1C;
        }
        if (periodoComboBox.equals(2)) {
            inicio = inicio2C;
            fin = fin2C;
        }
        if (!modoPrueba) {
            Date hoy = new Date();
            inicio = hoy;
        } else {
            System.out.println("FECHAS SETEADAS EN MODO PRUEBA");
            System.out.println("FECHAS SETEADAS EN MODO PRUEBA");
            System.out.println("FECHAS SETEADAS EN MODO PRUEBA");
        }
        Aux.set(0,inicio);
        Aux.set(1,fin); 
        return Aux;
    }
  
     public Reserva agregarDiasReservaPeriodicas(Reserva reserva,ArrayList<Diareserva> diasReserva,ArrayList<Integer> diasDeSemana,Date inicio,Date fin,ArrayList<horariosAUX> horariosPorDia) {
        diasReserva = new ArrayList<>(); //<--- ESTP ESTABA MUY MAL DEFINIDA, ESTABA ADENTRO DE LOS BUCLES DE ABAJO...
        Calendar aux = Calendar.getInstance();
        for (int i = 0; i < diasDeSemana.size(); i++) {
            //System.out.println("for");
            aux.setTime(inicio);//se setea el calendario auxiliar en la fecha inicial CAMBIAR
            //Seteo en primer dia de semana
            boolean j = true;
            while (j) {
                //System.out.println("0");
                if (aux.getTime().getDay() == Integer.parseInt(diasDeSemana.get(i).toString())) {
                    j = false;
                } else {
                    aux.add(Calendar.DATE, 1);
                }
            }
            //Sale aux en el primer dia de la semana que coincide
            boolean h = aux.getTime().compareTo(fin) < 0;

            while (h) {//while para agregar los dias de reserva
                //System.out.println("2");
                Date fechaAux = aux.getTime();

                // Display a date in day, month, year format
                DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
                String fecha = formatter.format(fechaAux);
                DiareservaId idAux = new DiareservaId(fecha, horariosPorDia.get(i).getHorainicio(), horariosPorDia.get(i).getHorafin(), reserva.getId());
                diasReserva.add(new Diareserva(idAux, reserva));
                aux.add(Calendar.DATE, 7);//Se incrementa en 1 semana el dia aux
                //SE CHEQUEA h
                h = aux.getTime().compareTo(fin) < 0;
            }
            //se va a incrementar i, se vuelve al dia de hor, se acomoda en el siguiente dia seleccionado y se agregan todos los dias reserva
        }
        reserva.diareservas = new HashSet<>(diasReserva);
        
        return reserva;
        
    }
    
    public ArrayList setearFechasEsporadicas(Date inicio,Date fin2C, Date fin, Boolean modoPrueba) {
        ArrayList<Date> Aux = new ArrayList();
        
        for (int i = 0; i < 2; i++) {
            Aux.add(new Date());
        }
        
        if (!modoPrueba) {
            Date hoy = new Date();
            inicio = hoy;
            fin = fin2C;
        } else {
            System.out.println("FECHAS SETEADAS EN MODO PRUEBA");
            System.out.println("FECHAS SETEADAS EN MODO PRUEBA");
            System.out.println("FECHAS SETEADAS EN MODO PRUEBA");
        }
        
        Aux.set(0,inicio);
        Aux.set(1,fin); 
        return Aux;
        
    }
    
    
    public Boolean Guardar(Boolean esporadicaRadioButton,Integer reservaNumero, Reserva reserva,ArrayList<Diareserva> diasReserva,DefaultTableModel modelo,ArrayList<Integer> diasDeSemana) {
        Boolean flag = false;
        if (esporadicaRadioButton) {
            if (reservaNumero > reserva.getDiareservas().size()) {
                //ArrayList<Diareserva> arrayAux = new ArrayList<>(reserva.getDiareservas());
                this.nuevaReserva(reserva, diasReserva);
                modelo.setRowCount(0);
                flag=true;
            }
        } else {
            if (reservaNumero > diasDeSemana.size()) {
                //ArrayList<Diareserva> arrayAux = new ArrayList<>(reserva.getDiareservas());
                reserva.diareservas = new HashSet<>(diasReserva);
                this.nuevaReserva(reserva, diasReserva);
                modelo.setRowCount(0);
                flag=true;
            }
        }
       return flag;
    }
    
    
}
