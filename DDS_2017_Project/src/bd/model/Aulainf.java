package bd.model;
// Generated 27-oct-2017 10:12:53 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Aulainf generated by hbm2java
 */
public class Aulainf  implements java.io.Serializable {


     private Integer id;
     private int capacidad;
     private String pizzaron;
     private byte[] habilitada;
     private byte[] cañon;
     private byte[] ac;
     private byte[] ubicacion;
     private int cantPc;
     private Set posees = new HashSet(0);

    public Aulainf() {
    }

	
    public Aulainf(int capacidad, String pizzaron, byte[] habilitada, byte[] cañon, byte[] ac, byte[] ubicacion, int cantPc) {
        this.capacidad = capacidad;
        this.pizzaron = pizzaron;
        this.habilitada = habilitada;
        this.cañon = cañon;
        this.ac = ac;
        this.ubicacion = ubicacion;
        this.cantPc = cantPc;
    }
    public Aulainf(int capacidad, String pizzaron, byte[] habilitada, byte[] cañon, byte[] ac, byte[] ubicacion, int cantPc, Set posees) {
       this.capacidad = capacidad;
       this.pizzaron = pizzaron;
       this.habilitada = habilitada;
       this.cañon = cañon;
       this.ac = ac;
       this.ubicacion = ubicacion;
       this.cantPc = cantPc;
       this.posees = posees;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public int getCapacidad() {
        return this.capacidad;
    }
    
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    public String getPizzaron() {
        return this.pizzaron;
    }
    
    public void setPizzaron(String pizzaron) {
        this.pizzaron = pizzaron;
    }
    public byte[] getHabilitada() {
        return this.habilitada;
    }
    
    public void setHabilitada(byte[] habilitada) {
        this.habilitada = habilitada;
    }
    public byte[] getCañon() {
        return this.cañon;
    }
    
    public void setCañon(byte[] cañon) {
        this.cañon = cañon;
    }
    public byte[] getAc() {
        return this.ac;
    }
    
    public void setAc(byte[] ac) {
        this.ac = ac;
    }
    public byte[] getUbicacion() {
        return this.ubicacion;
    }
    
    public void setUbicacion(byte[] ubicacion) {
        this.ubicacion = ubicacion;
    }
    public int getCantPc() {
        return this.cantPc;
    }
    
    public void setCantPc(int cantPc) {
        this.cantPc = cantPc;
    }
    public Set getPosees() {
        return this.posees;
    }
    
    public void setPosees(Set posees) {
        this.posees = posees;
    }




}


