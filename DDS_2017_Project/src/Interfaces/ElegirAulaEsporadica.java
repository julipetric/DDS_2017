/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Control.GestorReserva;
import bd.model.Aula;
import bd.model.Diareserva;
import bd.model.Reserva;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Julian
 */
public class ElegirAulaEsporadica extends javax.swing.JFrame {

    Reserva reserva;
    GestorReserva gestor;
    private ArrayList<Aula> aulas;
    private ArrayList<String> diasArreglo;
    private Diareserva dia;
    private String diaTitulo;
    private String actualTitulo;
    private String totalTitulo;
    private Boolean ejecutando = true;
    private RegistrarReserva VentanaReserva;
    public ArrayList<Diareserva> diasReserva;
    private Integer totalDias;

    /**
     * Creates new form ELEGIR_AULA
     */
    public ElegirAulaEsporadica() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public JButton getAceptarButton() {
        return aceptarButton;
    }

    ElegirAulaEsporadica(Reserva reserva, Diareserva diaReserva, Integer actual, RegistrarReserva VentanaReserva, ArrayList<Diareserva> diasReserva) throws ParseException {
        this.VentanaReserva = VentanaReserva;
        this.diasReserva = diasReserva;
        this.diaTitulo = diaReserva.getId().getFecha();
        this.totalTitulo = Integer.toString(reserva.getDiareservas().size());
        this.actualTitulo = Integer.toString(actual + 1);
        initComponents();

        this.setReserva(reserva);
        this.dia=diaReserva;
        gestor = new GestorReserva();
        diasArreglo = new ArrayList<>();

        this.aulas = new ArrayList<>();
        this.aulas = gestor.obtenerDisponibilidad(reserva);
        //tengo todas las aulas

        for (int i = 0; i < this.getAulas().size(); i++) {
            this.agregarFilaATabla(this.getAulas().get(i));
        }

        fechaLabel.setText(this.diaTitulo);
        this.setLocationRelativeTo(null);
    }

    public void agregarFilaATabla(Aula aula) {
        DefaultTableModel modelo = (DefaultTableModel) tablaAulas.getModel();
        Object rowData[] = new Object[4];
        rowData[0] = aula.getId();
        rowData[1] = aula.getTipo();
        rowData[2] = aula.getCapacidad();
        rowData[3] = aula.getUbicacion();
        modelo.addRow(rowData);
    }

    public void setAulas(ArrayList<Aula> aulas) {
        this.aulas = aulas;
    }

    public ArrayList<Aula> getAulas() {
        return aulas;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public void setGestor(GestorReserva gestor) {
        this.gestor = gestor;
    }

    public void setDiasArreglo(ArrayList<String> diasArreglo) {
        this.diasArreglo = diasArreglo;
    }

    public void setDia(Diareserva dia) {
        this.dia = dia;
    }

    public void setDiaTitulo(String diaTitulo) {
        this.diaTitulo = diaTitulo;
    }

    public void setActualTitulo(String actualTitulo) {
        this.actualTitulo = actualTitulo;
    }

    public void setTotalTitulo(String totalTitulo) {
        this.totalTitulo = totalTitulo;
    }

    public void setFechaLabel(JLabel fechaLabel) {
        this.fechaLabel = fechaLabel;
    }

    public void setjButton1(JButton jButton1) {
        this.aceptarButton = jButton1;
    }

    public void setjButton2(JButton jButton2) {
        this.cancelarButton = jButton2;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public void setjTable1(JTable jTable1) {
        this.tablaAulas = jTable1;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public GestorReserva getGestor() {
        return gestor;
    }

    public ArrayList<String> getDiasArreglo() {
        return diasArreglo;
    }

    public Diareserva getDia() {
        return dia;
    }

    public String getDiaTitulo() {
        return diaTitulo;
    }

    public Boolean getEjecutando() {
        return ejecutando;
    }

    public String getActualTitulo() {
        return actualTitulo;
    }

    public String getTotalTitulo() {
        return totalTitulo;
    }

    public JLabel getFechaLabel() {
        return fechaLabel;
    }

    public JButton getjButton1() {
        return aceptarButton;
    }

    public void setEjecutando(Boolean ejecutando) {
        this.ejecutando = ejecutando;
    }

    public JButton getjButton2() {
        return cancelarButton;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public JTable getjTable1() {
        return tablaAulas;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAulas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        fechaLabel = new javax.swing.JLabel();
        cancelarButton = new javax.swing.JButton();
        aceptarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(new String("Elija aula para el dia " + this.diaTitulo + " - " + this.actualTitulo + "/" + this.totalTitulo));

        jScrollPane1.setMinimumSize(new java.awt.Dimension(453, 700));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(453, 700));

        tablaAulas.setBackground(new java.awt.Color(153, 153, 153));
        tablaAulas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Aula", "Tipo", "Capacidad", "Ubicación"
            }
        ));
        tablaAulas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaAulasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaAulas);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Aulas disponibles:");

        fechaLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        cancelarButton.setText("Cancelar");
        cancelarButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cancelarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarButtonActionPerformed(evt);
            }
        });

        aceptarButton.setBackground(new java.awt.Color(204, 204, 204));
        aceptarButton.setText("Aceptar");
        aceptarButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        aceptarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        aceptarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fechaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(aceptarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fechaLabel)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aceptarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaAulasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaAulasMouseClicked
        Integer select = tablaAulas.getSelectedRow();
        this.getDia().setAula(this.getAulas().get(select));
        System.out.println("stuff");
    }//GEN-LAST:event_tablaAulasMouseClicked

    private void cancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarButtonActionPerformed
       
        VentanaReserva.reservaNumero = 0;
        reserva.getDiareservas().clear();
        
        this.dispose();
    }//GEN-LAST:event_cancelarButtonActionPerformed

    private void aceptarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarButtonActionPerformed
        if (tablaAulas.getSelectedRow() == -1) {
            ERROR_SELECCION_FILA vent = new ERROR_SELECCION_FILA();
            vent.setVisible(true);
        } else {
            reserva.getDiareservas().add(this.getDia());
            this.setEjecutando(false);
            try {
                VentanaReserva.GenerarElegirAulaEsporadica(diasReserva);
            } catch (ParseException ex) {
                Logger.getLogger(ElegirAulaEsporadica.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.dispose();
        }
    }//GEN-LAST:event_aceptarButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ElegirAulaEsporadica.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ElegirAulaEsporadica.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ElegirAulaEsporadica.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ElegirAulaEsporadica.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ElegirAulaEsporadica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarButton;
    private javax.swing.JButton cancelarButton;
    private javax.swing.JLabel fechaLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaAulas;
    // End of variables declaration//GEN-END:variables

}
