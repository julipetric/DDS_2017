package bd.model;
// Generated 14-dic-2017 11:50:49 by Hibernate Tools 4.3.1



/**
 * Posee generated by hbm2java
 */
public class Posee  implements java.io.Serializable {


     private Integer idMaster;
     private Aulainf aulainf;
     private Aulamm aulamm;
     private Aulasr aulasr;
     private Diareserva diareserva;

    public Posee() {
    }

    public Posee(Aulainf aulainf, Aulamm aulamm, Aulasr aulasr, Diareserva diareserva) {
       this.aulainf = aulainf;
       this.aulamm = aulamm;
       this.aulasr = aulasr;
       this.diareserva = diareserva;
    }
   
    public Integer getIdMaster() {
        return this.idMaster;
    }
    
    public void setIdMaster(Integer idMaster) {
        this.idMaster = idMaster;
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
    public Aulasr getAulasr() {
        return this.aulasr;
    }
    
    public void setAulasr(Aulasr aulasr) {
        this.aulasr = aulasr;
    }
    public Diareserva getDiareserva() {
        return this.diareserva;
    }
    
    public void setDiareserva(Diareserva diareserva) {
        this.diareserva = diareserva;
    }




}


