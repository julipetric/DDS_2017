package bd.model;
// Generated 13-dic-2017 23:20:32 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Aulasr generated by hbm2java
 */
public class Aulasr  implements java.io.Serializable {


     private String id;
     private Aula aula;
     private byte[] ventilador;
     private Set posees = new HashSet(0);

    public Aulasr() {
    }

	
    public Aulasr(Aula aula, byte[] ventilador) {
        this.aula = aula;
        this.ventilador = ventilador;
    }
    public Aulasr(Aula aula, byte[] ventilador, Set posees) {
       this.aula = aula;
       this.ventilador = ventilador;
       this.posees = posees;
    }
   
    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    public Aula getAula() {
        return this.aula;
    }
    
    public void setAula(Aula aula) {
        this.aula = aula;
    }
    public byte[] getVentilador() {
        return this.ventilador;
    }
    
    public void setVentilador(byte[] ventilador) {
        this.ventilador = ventilador;
    }
    public Set getPosees() {
        return this.posees;
    }
    
    public void setPosees(Set posees) {
        this.posees = posees;
    }




}


