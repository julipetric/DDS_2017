package bd.model;
// Generated 11-dic-2017 15:58:19 by Hibernate Tools 4.3.1



/**
 * Hace generated by hbm2java
 */
public class Hace  implements java.io.Serializable {


     private Integer idMaster;
     private Bedel bedel;
     private Reserva reserva;

    public Hace() {
    }

    public Hace(Bedel bedel, Reserva reserva) {
       this.bedel = bedel;
       this.reserva = reserva;
    }
   
    public Integer getIdMaster() {
        return this.idMaster;
    }
    
    public void setIdMaster(Integer idMaster) {
        this.idMaster = idMaster;
    }
    public Bedel getBedel() {
        return this.bedel;
    }
    
    public void setBedel(Bedel bedel) {
        this.bedel = bedel;
    }
    public Reserva getReserva() {
        return this.reserva;
    }
    
    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }




}


