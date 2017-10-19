/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Clases.Bedel;
import Clases.Turno;
import bd.dto.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author Tomas
 */
public class GestorBedel {

    public GestorBedel() {
    }
    
    public void registrarBedel(Bedel bedel){
     //cargar a BD
    }
    
    public Bedel buscarBedel(String n, Turno t){
          Session session = HibernateUtil.getSessionFactory().openSession();
          Bedel bedel = (Bedel) session.get(Bedel.class,n);    
    return bedel;}
    
    private void eliminarBedel(Bedel bedel){
     //IMPLEMENTAR GATITOS
          //IMPLEMENTAR GATITOS 
               //IMPLEMENTAR GATITOS
    }
    
    private void modificarBedel(Bedel bedel,String nombre,String apellido,String email,Turno turno){
     //IMPLEMENTAR GATITOS
          //IMPLEMENTAR GATITOS 
               //IMPLEMENTAR GATITOS
    }
    
    private Boolean validarDatos(String id,String password1,String password2,String nombre,String apellido,Turno turno){
     //IMPLEMENTAR GATITOS
          //IMPLEMENTAR GATITOS 
               //IMPLEMENTAR GATITOS
    return true;}
}
