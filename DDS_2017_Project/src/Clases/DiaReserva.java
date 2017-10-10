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
    public Time horarioInicio;
    public Time horaFin;

    public DiaReserva() {
    }

    public Date getFecha() {
        return fecha;
    }

    public Time getHorarioInicio() {
        return horarioInicio;
    }

    public Time getHoraFin() {
        return horaFin;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setHorarioInicio(Time horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public void setHoraFin(Time horaFin) {
        this.horaFin = horaFin;
    }
    
    
}
