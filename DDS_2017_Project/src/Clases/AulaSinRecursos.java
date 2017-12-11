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
public class AulaSinRecursos extends Aula{
    public Boolean ventilador;

    public AulaSinRecursos() {
    }

    public Boolean getVentilador() {
        return ventilador;
    }

    public Boolean getAc() {
        return ac;
    }

    public Boolean getCañon() {
        return cañon;
    }

    public TipoPizarron getPizzaron() {
        return pizzaron;
    }

    public void setVentilador(Boolean ventilador) {
        this.ventilador = ventilador;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setAc(Boolean ac) {
        this.ac = ac;
    }

    public void setCañon(Boolean cañon) {
        this.cañon = cañon;
    }

    public void setPizzaron(TipoPizarron pizzaron) {
        this.pizzaron = pizzaron;
    }
    
}
