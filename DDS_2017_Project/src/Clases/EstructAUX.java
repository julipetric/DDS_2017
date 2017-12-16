/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;
import bd.model.Aula;
import bd.model.Diareserva;

/**
 *
 * @author rodri
 */
public class EstructAUX {
    
    Diareserva dia;
    ArrayList<Aula> aulasDisponibles;

    public EstructAUX(Diareserva d, ArrayList<Aula> a){
        
        dia = d;
        aulasDisponibles = a;
        
    }

    public EstructAUX() {
    }

    
}
