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
public abstract class Usuario {
    
    public String id;
    public String password;
    public String nombre;
    public String apellido;

    public Usuario(String id, String password, String nombre, String apellido) {
        this.id = id;
        this.password = password;
        this.nombre = nombre;
        this.apellido = apellido;
    }
}
