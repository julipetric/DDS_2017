/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Clases.Reserva;
import DAO.ReservaDAO;
import bd.model.Bedel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tomas
 */
public class GestorDeReservas {

    public GestorDeReservas() {
    }
    
    public void nuevaReserva(){
     //IMPLEMENTAR GATITOS
          //IMPLEMENTAR GATITOS 
               //IMPLEMENTAR GATITOS
    }
    
    private void obtenerDisponibilidad(){
     //IMPLEMENTAR GATITOS
          //IMPLEMENTAR GATITOS 
               //IMPLEMENTAR GATITOS
    }
    
    public List listaReservasDia(String dia, String tipo, String aula){
   
        ReservaDAO dao = new ReservaDAO();
        List<Reserva> reservasdao = dao.read(dia,tipo, aula);//o bien envío datos, o bien asterisco
        return reservasdao;
    
        
        
    
    }
    
    public ArrayList listarReservasCurso(String curso){
    //IMPLEMENTAR GATITOS
          //IMPLEMENTAR GATITOS 
               //IMPLEMENTAR GATITOS
    return new ArrayList();}
}
