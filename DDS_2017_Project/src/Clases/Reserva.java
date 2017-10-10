/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Tomas
 */
public class Reserva {
    public Periodo periodo;
    public TipoDeAula tipoDeAula;
    public Integer cantidadAlumnos;
    public String nombreCurso;

    public Reserva() {
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
