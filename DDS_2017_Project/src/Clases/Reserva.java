/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import DAO.ReservaDAO;
import java.util.ArrayList;

/**
 *
 * @author Tomas
 */
public class Reserva {
    public Periodo periodo;
    public TipoDeAula tipoDeAula;
    public Integer cantidadAlumnos;
    public String nombreCurso;
    public Docente docente;
    public Integer id;

    public Integer getId() {
        return id;
    }

    public Docente getDocente() {
        return docente;
    }
    public ArrayList<DiaReserva> diasReserva;
    public ArrayList<DiaReserva> diasReservaEsporadica;
    

    public Reserva() {
        ReservaDAO dao = new ReservaDAO();
        id = dao.getIdReserva();
        diasReserva = new ArrayList<>();
        diasReservaEsporadica = new ArrayList<>();
        
    }

    public ArrayList<DiaReserva> getDiasReserva() {
        return diasReserva;
    }

    public ArrayList<DiaReserva> getDiasReservaEsporadica() {
        return diasReservaEsporadica;
    }
    
    public Reserva( TipoDeAula tipo, Periodo periodo, Integer cantidadAlumnos, String nombreCurso){
        diasReserva = new ArrayList<>();
    }
    
    

    public Periodo getPeriodo() {
        return periodo;
    }

    public TipoDeAula getTipoDeAula() {
        return tipoDeAula;
    }

    public Integer getCantidadAlumnos() {
        return cantidadAlumnos;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }

    public void setTipoDeAula(TipoDeAula tipoDeAula) {
        this.tipoDeAula = tipoDeAula;
    }

    public void setCantidadAlumnos(Integer cantidadAlumnos) {
        this.cantidadAlumnos = cantidadAlumnos;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }
    
}
