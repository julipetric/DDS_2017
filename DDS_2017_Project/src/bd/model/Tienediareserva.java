package bd.model;
// Generated 14-dic-2017 11:50:49 by Hibernate Tools 4.3.1



/**
 * Tienediareserva generated by hbm2java
 */
public class Tienediareserva  implements java.io.Serializable {


     private Integer idMaster;
     private Diareserva diareserva;
     private Reserva reserva;

    public Tienediareserva() {
    }

    public Tienediareserva(Diareserva diareserva, Reserva reserva) {
       this.diareserva = diareserva;
       this.reserva = reserva;
    }
   
    public Integer getIdMaster() {
        return this.idMaster;
    }
    
    public void setIdMaster(Integer idMaster) {
        this.idMaster = idMaster;
    }
    public Diareserva getDiareserva() {
        return this.diareserva;
    }
    
    public void setDiareserva(Diareserva diareserva) {
        this.diareserva = diareserva;
    }
    public Reserva getReserva() {
        return this.reserva;
    }
    
    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }




}


