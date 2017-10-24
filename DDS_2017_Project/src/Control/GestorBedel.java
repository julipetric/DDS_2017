/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import bd.model.Bedel;
import Clases.Turno;
import DAO.UsuarioDAO;
import Interfaces.REGISTRAR_BEDEL;
import bd.dto.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Tomas
 */
public class GestorBedel {
    private REGISTRAR_BEDEL ventana;

    public GestorBedel() {
    }
    
    public void validar(REGISTRAR_BEDEL v1){
       ventana=v1;
       String passNueva = "";
       Boolean error = false;
     
      
        char[] pass1 = ventana.contra;
        char[] pass2 = ventana.contra2;
        
        if (pass1.length == pass2.length) {
            for (int i = 0; i < pass1.length; i++) {
                if (pass1[i] != pass2[i]) {

                    error = true;
                    ventana.errorContra();
                    ventana.errorContra2();
                    break;
                } else {
                    passNueva += pass1[i];
                }
            }

        }
        else{
                    error = true;
                    ventana.errorContra();
                    ventana.errorContra2();
                    
        }
        if (ventana.usuario.isEmpty()) {               // || ventana.nombre.isEmpty() || ventana.apellido.isEmpty()) {
            error = true;
            ventana.errorUsuario();
        }
        if (ventana.turno == null) {
           
        }
        //ventana.jLabel8.setText(error);
        if (error = false) {
            UsuarioDAO dao = new UsuarioDAO();
            //dao.crear();
            //ventana.jLabel8.setText("");
            
            //A dao, Bedel b1 = new Bedel(ventana.jTextField1.getText(), jTextField4.getText(), jTextField2.getText(), passNueva, jComboBox2.getSelectedItem().toString().toUpperCase());

        }  

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
