package bd.model;
// Generated 14-dic-2017 17:33:49 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Aula generated by hbm2java
 */
public class Aula  implements java.io.Serializable {


     private String id;
     private int capacidad;
     private String pizzaron;
     private boolean habilitada;
     private boolean canion;
     private boolean ac;
     private boolean ubicacion;
     private Set diareservas = new HashSet(0);
     private Aulasr aulasr;
     private Aulainf aulainf;
     private Aulamm aulamm;

    public Aula() {
    }

	
    public Aula(String id, int capacidad, String pizzaron, boolean habilitada, boolean canion, boolean ac, boolean ubicacion) {
        this.id = id;
        this.capacidad = capacidad;
        this.pizzaron = pizzaron;
        this.habilitada = habilitada;
        this.canion = canion;
        this.ac = ac;
        this.ubicacion = ubicacion;
    }
    public Aula(String id, int capacidad, String pizzaron, boolean habilitada, boolean canion, boolean ac, boolean ubicacion, Set diareservas, Aulasr aulasr, Aulainf aulainf, Aulamm aulamm) {
       this.id = id;
       this.capacidad = capacidad;
       this.pizzaron = pizzaron;
       this.habilitada = habilitada;
       this.canion = canion;
       this.ac = ac;
       this.ubicacion = ubicacion;
       this.diareservas = diareservas;
       this.aulasr = aulasr;
       this.aulainf = aulainf;
       this.aulamm = aulamm;
    }
   
    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
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
    public boolean isHabilitada() {
        return this.habilitada;
    }
    
    public void setHabilitada(boolean habilitada) {
        this.habilitada = habilitada;
    }
    public boolean isCanion() {
        return this.canion;
    }
    
    public void setCanion(boolean canion) {
        this.canion = canion;
    }
    public boolean isAc() {
        return this.ac;
    }
    
    public void setAc(boolean ac) {
        this.ac = ac;
    }
    public boolean isUbicacion() {
        return this.ubicacion;
    }
    
    public void setUbicacion(boolean ubicacion) {
        this.ubicacion = ubicacion;
    }
    public Set getDiareservas() {
        return this.diareservas;
    }
    
    public void setDiareservas(Set diareservas) {
        this.diareservas = diareservas;
    }
    public Aulasr getAulasr() {
        return this.aulasr;
    }
    
    public void setAulasr(Aulasr aulasr) {
        this.aulasr = aulasr;
    }
    public Aulainf getAulainf() {
        return this.aulainf;
    }
    
    public void setAulainf(Aulainf aulainf) {
        this.aulainf = aulainf;
    }
    public Aulamm getAulamm() {
        return this.aulamm;
    }
    
    public void setAulamm(Aulamm aulamm) {
        this.aulamm = aulamm;
    }




}


