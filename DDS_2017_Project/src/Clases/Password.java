/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Date;

/**
 *
 * @author Tomas
 */
public class Password {
    public Date fecha;
    public String value;
    public Boolean actual;

    public Password() {
    }

    public Date getFecha() {
        return fecha;
    }

    public String getValue() {
        return value;
    }

    public Boolean getActual() {
        return actual;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setActual(Boolean actual) {
        this.actual = actual;
    }
    
    
}
