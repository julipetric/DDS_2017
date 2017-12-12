package bd.model;
// Generated 12-dic-2017 17:00:20 by Hibernate Tools 4.3.1


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
     private Set haces = new HashSet(0);

    public Bedel() {
    }

	
    public Bedel(String nombreUsuario, String nombre, String apellido, String password, String turno) {
        this.nombreUsuario = nombreUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.password = password;
        this.turno = turno;
    }
    public Bedel(String nombreUsuario, String nombre, String apellido, String password, String turno, Set haces) {
       this.nombreUsuario = nombreUsuario;
       this.nombre = nombre;
       this.apellido = apellido;
       this.password = password;
       this.turno = turno;
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
    public Set getHaces() {
        return this.haces;
    }
    
    public void setHaces(Set haces) {
        this.haces = haces;
    }




}


