/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Clases.DiaReserva;
import Clases.Reserva;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author rodri
 */
public class NUEVO_DIA extends javax.swing.JFrame {

    
    private Date fechaInicio;
    private Date fechaFin;
    private REGISTRAR_RESERVA ventana;
    private Reserva reserva;
   
    private final ArrayList<String> cola;
    
    public NUEVO_DIA(Reserva res, Date inicio, Date fin, REGISTRAR_RESERVA vent) {
        initComponents();
        reserva = res;
        fechaInicio = inicio;
        fechaFin = fin;        
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
        jDateChooser1.setCalendar(Calendar.getInstance());
        cola = new ArrayList<>();
        ventana = vent;
        
        
        
        this.cola.add("08:00");
        this.cola.add("08:45");
        this.cola.add("09:30");
        this.cola.add("10:15");
        this.cola.add("10:30");
        this.cola.add("11:15");
        this.cola.add("12:00");
        this.cola.add("12:45");
        this.cola.add("13:15");
        this.cola.add("13:30");
        this.cola.add("14:00");
        this.cola.add("14:15");
        this.cola.add("14:45");
        this.cola.add("15:30");
        this.cola.add("16:15");
        this.cola.add("16:30");
        this.cola.add("17:15");
        this.cola.add("18:00");
        this.cola.add("18:45");
        this.cola.add("19:00");
        this.cola.add("19:45");
        this.cola.add("20:30");
        this.cola.add("21:15");
        this.cola.add("21:30");
        this.cola.add("22:15");
        this.cola.add("23:00");
        this.cola.add("23:45");
        
        
        
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jDialog1.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("NUEVO DIA");
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "08:00", "08:45", "09:30", "10:15", "10:30", "11:15", "12:00", "12:45", "13:15", "13:30", "14:00", "14:15", "14:45", "15:30", "16:15", "16:30", "17:15", "18:00", "18:45", "19:00", "19:45", "20:30", "21:15", "21:30", "22:15", "23:00", "23:45\t" }));
        jComboBox3.setPreferredSize(new java.awt.Dimension(74, 20));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "08:00", "08:45", "09:30", "10:15", "10:30", "11:15", "12:00", "12:45", "13:15", "13:30", "14:00", "14:15", "14:45", "15:30", "16:15", "16:30", "17:15", "18:00", "18:45", "19:00", "19:45", "20:30", "21:15", "21:30", "22:15", "23:00", "23:45" }));
        jComboBox4.setPreferredSize(new java.awt.Dimension(74, 20));

        jLabel1.setText("Fecha");

        jButton1.setBackground(new java.awt.Color(0, 102, 255));
        jButton1.setText("Aceptar");
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cerrar\n");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("Error de fecha");

        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("Error de horario");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3))))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(jLabel1))
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jComboBox3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // COMPORTAMIENTO DEL BOTÓN ACEPTAR
        
        
        if (jDateChooser1.getDate().compareTo(this.fechaInicio)!= 1 || jDateChooser1.getDate().compareTo(this.fechaFin) != -1  ){
            //ERROR DE FECHA, SOLO INFORMO
            jLabel2.setVisible(true);
            if (this.cola.indexOf(jComboBox3.getSelectedItem().toString()) >= this.cola.indexOf(jComboBox4.getSelectedItem().toString())){
                jLabel3.setVisible(true); //TODO MAL, 2 ERRORES EN PANTALLA
            }
            else{
                jLabel3.setVisible(false);                 
            }
        }
        else{
            jLabel2.setVisible(false);
            
            if (this.cola.indexOf(jComboBox3.getSelectedItem().toString()) >= this.cola.indexOf(jComboBox4.getSelectedItem().toString())){
                jLabel3.setVisible(true);
            }
            else{
                jLabel3.setVisible(false); //TODO OK, FECHA Y HORA, AGREGAR DIARESERVA A LA LISTA
                
                
                
                DiaReserva dia = new DiaReserva(jDateChooser1.getDate(),jComboBox3.getSelectedItem().toString(),jComboBox4.getSelectedItem().toString() );
                reserva.diasReservaEsporadica.add(dia);//agrego el dia
                
                ventana.agregarFilaATabla(dia);
            }
                       
        }
        
        
        //ventana.actualizarDiasReserva(diasReserva);//se actualiza la lista en la ventana original
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
