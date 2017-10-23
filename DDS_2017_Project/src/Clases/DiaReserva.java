/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author Tomas
 */
public class DiaReserva {
    public Date fecha;
    public String horaInicio;
    public String horaFin;

    public DiaReserva(Date fecha, String horarioInicio, String horaFin) {
    }

    public Date getFecha() {
        return fecha;
    }

    public String getHorarioInicio() {
        return horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setHorarioInicio(String horarioInicio) {
        this.horaInicio = horarioInicio;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }
    
    
}
