/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Tomas
 */
public class Bedel extends Usuario{
    
    public Turno turno;
    
    public Bedel(String id, String password, String nombre, String apellido, Turno turno) {
        super(id, password, nombre, apellido);
        this.turno = turno;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }
    
    
}
