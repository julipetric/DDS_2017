/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import bd.model.Bedel;
import Clases.Turno;
import bd.dto.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Tomas
 */
public class GestorBedel {

    public GestorBedel() {
    }
    
    public void registrarBedel(Bedel bedel){
     SessionFactory sesion = HibernateUtil.getSessionFactory();
     Session session = sesion.openSession();
     Transaction tx = session.beginTransaction();
     session.save(bedel);
     tx.commit();
     session.close();
    }
    
    public Bedel buscarBedel(String n, Turno t){
     SessionFactory sesion = HibernateUtil.getSessionFactory();
     Session session = sesion.openSession();
     Transaction tx = session.beginTransaction();
     Bedel bedel = (Bedel) session.get(Bedel.class,1);    
     tx.commit();
     session.close();
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
