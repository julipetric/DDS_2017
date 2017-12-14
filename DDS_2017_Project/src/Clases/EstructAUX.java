/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;
import bd.model.Aula;

/**
 *
 * @author rodri
 */
public class EstructAUX {
    
    DiaReserva dia;
    ArrayList<Aula> aulasDisponibles;

    public EstructAUX(DiaReserva d, ArrayList<Aula> a){
        
        dia = d;
        aulasDisponibles = a;
        
    }

    
}
