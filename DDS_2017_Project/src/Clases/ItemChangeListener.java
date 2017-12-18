/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Interfaces.OBTENER_DISPONIBILIDAD_DE_AULAS;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 *
 * @author rodri
 */
public class ItemChangeListener implements ItemListener{
    
    OBTENER_DISPONIBILIDAD_DE_AULAS ventana;

    public ItemChangeListener(OBTENER_DISPONIBILIDAD_DE_AULAS vent) {
        
        ventana = vent;
    }
    
    
    
    
    @Override
    public void itemStateChanged(ItemEvent event) {
       if (event.getStateChange() == ItemEvent.SELECTED) {
          Object item = event.getItem();
          System.out.println("cambio");
          ventana.vaciarTabla();
         
       }
    } 

    
    
    
}
