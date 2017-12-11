/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author rodri
 */
public class TablaDiasEsporadicosTableModel extends AbstractTableModel {

    private final String[] nombresColumnas = {"Día", "Hora Inicio", "Hora Fin"};
    private List<DiaReserva> diasReservaEsporadica = new ArrayList<>();
    
    
    @Override
    public int getRowCount() {
        return this.diasReservaEsporadica.size(); 
    }

    @Override
    public int getColumnCount() {
        return this.nombresColumnas.length; 
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {//devuelve los valores en un punto
        if(rowIndex >= 0 && rowIndex < this.diasReservaEsporadica.size()){
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            switch(columnIndex){
                case 0: return sdf.format(this.diasReservaEsporadica.get(rowIndex).fecha);
                case 1: return this.diasReservaEsporadica.get(rowIndex).horaInicio;
                case 2: return this.diasReservaEsporadica.get(rowIndex).horaFin;
                default: return null;
            }
        }else{
            return null;
        }
    }
    
    @Override
    public String getColumnName(int col) {
      return nombresColumnas[col];
    }
    
    public void setDiasReservaEsporadica(ArrayList<DiaReserva> dias){ 
        this.diasReservaEsporadica = dias;
    }
    
      public DiaReserva getDia(int row){
        if(row >= 0 && row < this.diasReservaEsporadica.size()){
            return this.diasReservaEsporadica.get(row);
        }else{
            return null;
        }
    }
    
}
