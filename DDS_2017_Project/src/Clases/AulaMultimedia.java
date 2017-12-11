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
public class AulaMultimedia extends Aula{
   public Boolean televisor;
   public Boolean dvd;
   public Boolean computadora;

    public AulaMultimedia() {
    }

    public Boolean getTelevisor() {
        return televisor;
    }

    public Boolean getDvd() {
        return dvd;
    }

    public Boolean getComputadora() {
        return computadora;
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

    public void setTelevisor(Boolean televisor) {
        this.televisor = televisor;
    }

    public void setDvd(Boolean dvd) {
        this.dvd = dvd;
    }

    public void setComputadora(Boolean computadora) {
        this.computadora = computadora;
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
