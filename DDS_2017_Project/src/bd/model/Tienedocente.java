package bd.model;
// Generated 13-dic-2017 23:20:32 by Hibernate Tools 4.3.1



/**
 * Tienedocente generated by hbm2java
 */
public class Tienedocente  implements java.io.Serializable {


     private Integer idMaster;
     private Docente docente;
     private Reserva reserva;

    public Tienedocente() {
    }

    public Tienedocente(Docente docente, Reserva reserva) {
       this.docente = docente;
       this.reserva = reserva;
    }
   
    public Integer getIdMaster() {
        return this.idMaster;
    }
    
    public void setIdMaster(Integer idMaster) {
        this.idMaster = idMaster;
    }
    public Docente getDocente() {
        return this.docente;
    }
    
    public void setDocente(Docente docente) {
        this.docente = docente;
    }
    public Reserva getReserva() {
        return this.reserva;
    }
    
    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }




}


