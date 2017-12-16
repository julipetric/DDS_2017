package bd.model;
// Generated 16-dic-2017 9:38:19 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Docente generated by hbm2java
 */
public class Docente  implements java.io.Serializable {


     private Integer id;
     private String apellido;
     private String nombre;
     private String email;
     private Set reservas = new HashSet(0);

    public Docente() {
    }

	
    public Docente(String apellido, String nombre, String email) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.email = email;
    }
    public Docente(String apellido, String nombre, String email, Set reservas) {
       this.apellido = apellido;
       this.nombre = nombre;
       this.email = email;
       this.reservas = reservas;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public Set getReservas() {
        return this.reservas;
    }
    
    public void setReservas(Set reservas) {
        this.reservas = reservas;
    }




}


