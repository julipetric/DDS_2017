/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Clases.Aula;
import Clases.DiaReserva;
import Clases.Reserva;
import DAO.AulaDAO;
import DAO.ReservaDAO;
import bd.model.Bedel;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tomas
 */
public class GestorReserva {

    public GestorReserva() {
    }
    
    public void nuevaReserva(){
     //IMPLEMENTAR GATITOS
          //IMPLEMENTAR GATITOS 
               //IMPLEMENTAR GATITOS
    }
    
    public ArrayList<Aula> obtenerDisponibilidadPeriodica(Reserva res){
        ArrayList<Aula> posibles;        
        AulaDAO aulaDao = new AulaDAO();
        
        posibles = (ArrayList<Aula>) aulaDao.read(res.getTipoDeAula(), res.getCantidadAlumnos());
        
        ArrayList<Aula> disponibles;
        ReservaDAO resDao = new ReservaDAO();
        
        disponibles = resDao.read(res.getPeriodo(), res.getDiasReserva(), res.getTipoDeAula(), res.getCantidadAlumnos(), posibles);
        
        return disponibles;
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

    public void obtenerDisponibilidadEsporadica(Reserva reserva) {
        
         ReservaDAO daoR = new ReservaDAO();
         AulaDAO daoA = new AulaDAO();
         String fecha = new String();
         SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
         ArrayList<DiaReserva> dias = new ArrayList<>();
         List<Aula> posibles = new ArrayList<>();
         dias = reserva.diasReservaEsporadica;
         ArrayList<DiaReserva> diasPorAula = new ArrayList<>();
         
         posibles = daoA.read(reserva.tipoDeAula, reserva.cantidadAlumnos); //devuelve aulas compatibles con mi reserva
         
         for(int i=0 ; i<posibles.size(); i++){
            //traer del dao, para cada dia, los aulas que cumplan el criterio y sus DiaReserva asignados con fecha igual al dia
            fecha = sdf.format(dias.get(i).fecha);
            diasPorAula = daoR.getDiaReserva(posibles.get(i).id, fecha);//que devuelva para ese aula y ese dia, los dias reserva
            //SEGUIR ACA
            
            
            
        }
        
    }
}
