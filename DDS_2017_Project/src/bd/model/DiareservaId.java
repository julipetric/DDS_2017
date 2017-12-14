package bd.model;
// Generated 14-dic-2017 11:50:49 by Hibernate Tools 4.3.1



/**
 * DiareservaId generated by hbm2java
 */
public class DiareservaId  implements java.io.Serializable {


     private String fecha;
     private String horaInicio;
     private String horaFin;

    public DiareservaId() {
    }

    public DiareservaId(String fecha, String horaInicio, String horaFin) {
       this.fecha = fecha;
       this.horaInicio = horaInicio;
       this.horaFin = horaFin;
    }
   
    public String getFecha() {
        return this.fecha;
    }
    
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public String getHoraInicio() {
        return this.horaInicio;
    }
    
    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }
    public String getHoraFin() {
        return this.horaFin;
    }
    
    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof DiareservaId) ) return false;
		 DiareservaId castOther = ( DiareservaId ) other; 
         
		 return ( (this.getFecha()==castOther.getFecha()) || ( this.getFecha()!=null && castOther.getFecha()!=null && this.getFecha().equals(castOther.getFecha()) ) )
 && ( (this.getHoraInicio()==castOther.getHoraInicio()) || ( this.getHoraInicio()!=null && castOther.getHoraInicio()!=null && this.getHoraInicio().equals(castOther.getHoraInicio()) ) )
 && ( (this.getHoraFin()==castOther.getHoraFin()) || ( this.getHoraFin()!=null && castOther.getHoraFin()!=null && this.getHoraFin().equals(castOther.getHoraFin()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getFecha() == null ? 0 : this.getFecha().hashCode() );
         result = 37 * result + ( getHoraInicio() == null ? 0 : this.getHoraInicio().hashCode() );
         result = 37 * result + ( getHoraFin() == null ? 0 : this.getHoraFin().hashCode() );
         return result;
   }   


}


