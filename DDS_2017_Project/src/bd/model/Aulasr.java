package bd.model;
// Generated Dec 15, 2017 3:18:15 PM by Hibernate Tools 4.3.1



/**
 * Aulasr generated by hbm2java
 */
public class Aulasr  implements java.io.Serializable {


     private String id;
     private Aula aula;
     private boolean ventilador;

    public Aulasr() {
    }

    public Aulasr(Aula aula, boolean ventilador) {
       this.aula = aula;
       this.ventilador = ventilador;
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
    public boolean isVentilador() {
        return this.ventilador;
    }
    
    public void setVentilador(boolean ventilador) {
        this.ventilador = ventilador;
    }




}


