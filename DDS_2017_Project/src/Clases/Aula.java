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
public abstract class Aula {
    public String id;
    public Integer capacidad;
    public String ubicacion;
    public Boolean habilitada;
    public Boolean ac;
    public Boolean cañon;
    public TipoPizarron pizzaron; 
    
    public String getId() {
        return id;
    }
    
    public String getUbicacion() {
        return ubicacion;
    }
       
    public void setId(String id) {
        this.id = id;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public Boolean getHabilitada() {
        return habilitada;
    }

    public void setHabilitada(Boolean habilitada) {
        this.habilitada = habilitada;
    }

}
