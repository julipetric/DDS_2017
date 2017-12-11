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
public class AulaInformatica extends Aula {
    public Integer cantPc;

    public AulaInformatica() {
    }

    public Integer getCantPc() {
        return cantPc;
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

    public void setCantPc(Integer cantPc) {
        this.cantPc = cantPc;
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
