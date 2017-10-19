package Clases;

/**
 *
 * @author Tomas
 */
public class Admin extends Usuario{

    public Admin(String id, String password, String nombre, String apellido) {
        super(id, password, nombre, apellido, null);
        //no se si el admin tiene turno asiq meti un null
    }
    
}
