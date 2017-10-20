package Clases;

/**
 *
 * @author Tomas
 */
public class Admin extends Usuario{

    public Admin(String id, String password, String nombre, String apellido) {
        super(id, password, nombre, apellido);
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
    
}
