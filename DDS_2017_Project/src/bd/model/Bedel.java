package bd.model;
// Generated 16-dic-2017 9:38:19 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Bedel generated by hbm2java
 */
public class Bedel  implements java.io.Serializable {


     private String nombreUsuario;
     private String nombre;
     private String apellido;
     private String password;
     private String turno;
     private String fecha;
     private Set historialdecontrasenias = new HashSet(0);
     private Set haces = new HashSet(0);

    public Bedel() {
    }

	
    public Bedel(String nombreUsuario, String nombre, String apellido, String password, String turno, String fecha) {
        this.nombreUsuario = nombreUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.password = password;
        this.turno = turno;
        this.fecha = fecha;
    }
    public Bedel(String nombreUsuario, String nombre, String apellido, String password, String turno, String fecha, Set historialdecontrasenias, Set haces) {
       this.nombreUsuario = nombreUsuario;
       this.nombre = nombre;
       this.apellido = apellido;
       this.password = password;
       this.turno = turno;
       this.fecha = fecha;
       this.historialdecontrasenias = historialdecontrasenias;
       this.haces = haces;
    }
   
    public String getNombreUsuario() {
        return this.nombreUsuario;
    }
    
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getTurno() {
        return this.turno;
    }
    
    public void setTurno(String turno) {
        this.turno = turno;
    }
    public String getFecha() {
        return this.fecha;
    }
    
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public Set getHistorialdecontrasenias() {
        return this.historialdecontrasenias;
    }
    
    public void setHistorialdecontrasenias(Set historialdecontrasenias) {
        this.historialdecontrasenias = historialdecontrasenias;
    }
    public Set getHaces() {
        return this.haces;
    }
    
    public void setHaces(Set haces) {
        this.haces = haces;
    }




}


