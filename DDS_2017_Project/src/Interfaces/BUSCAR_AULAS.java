/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import bd.model.Aula;
import bd.model.Aulainf;
import bd.model.Aulamm;
import bd.model.Aulasr;
import Clases.TipoDeAula;
import Control.GestorDeAulas;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rodri
 */
public class BUSCAR_AULAS extends javax.swing.JFrame {

    /**
     * Creates new form BUSCAR_AULAS
     */
    public BUSCAR_AULAS() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        aulaNum = new javax.swing.JComboBox<>();
        aulaTipo = new javax.swing.JComboBox<>();
        aulaCapacidad = new javax.swing.JComboBox<>();
        buscarButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAulas = new javax.swing.JTable();
        modificarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BUSCAR AULAS");
        setMinimumSize(new java.awt.Dimension(760, 330));
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Buscar aulas");

        jLabel2.setText("Numero de aula");

        jLabel3.setText("Tipo de aula");

        jLabel4.setText("Capacidad");

        aulaNum.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un numero" }));

        aulaTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un tipo" }));

        aulaCapacidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un tipo" }));

        buscarButton.setBackground(new java.awt.Color(0, 102, 255));
        buscarButton.setText("Buscar");
        buscarButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        buscarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarButtonActionPerformed(evt);
            }
        });

        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jScrollPane1.setMinimumSize(new java.awt.Dimension(453, 700));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(453, 700));

        tablaAulas.setBackground(new java.awt.Color(153, 153, 153));
        tablaAulas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Numero", "Piso", "Tipo", "Capacidad", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaAulas);

        modificarButton.setBackground(new java.awt.Color(51, 204, 0));
        modificarButton.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        modificarButton.setText("Modificar");
        modificarButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(260, 260, 260))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(buscarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(282, 282, 282))
                        .addComponent(modificarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(aulaNum, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(aulaTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(aulaCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addGap(56, 56, 56))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aulaTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aulaNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aulaCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(buscarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(modificarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarButtonActionPerformed
        GestorDeAulas gestor = new GestorDeAulas();

        String idAula = (String) aulaNum.getSelectedItem();
        Integer capacidad = Integer.parseInt((String) aulaCapacidad.getSelectedItem());
        TipoDeAula tipo = (TipoDeAula) aulaTipo.getSelectedItem();
        ArrayList<Aula> listaAulas = new ArrayList<>();
        if (idAula != null) {
            Aula a = gestor.buscarAula(idAula);
            if (a != null) {
                listaAulas.add(a);
            }
        } else {
            if (tipo != null) {
                /*Traer de la BD aulas por tipo y guardar en listaAulas*/
            }
            if (capacidad != null) {
                /*filtrar  listaAulas para solo las de capacidad mayor a especificada*/
            }
        }
        DefaultTableModel model = (DefaultTableModel) tablaAulas.getModel();
        TipoDeAula tipoA = null;
        for (Aula a : listaAulas) {
            if (a.getAulainf() != null) {
                tipoA = TipoDeAula.INFORMATICA;
            }
            if (a.getAulamm() != null) {
                tipoA = TipoDeAula.MULTIMEDIOS;
            }
            if (a.getAulasr() != null) {
                tipoA = TipoDeAula.SINRECURSOS;
            }
            String habilitacion = null;
            if (a.isHabilitada()) {
                habilitacion = "Habilitada";
            } else {
                habilitacion = "No habilitada";
            }
            Object[] v = {a.getId(), a.getUbicacion(), tipoA, a.getCapacidad(), habilitacion};
            model.addRow(v);
        }

        if (listaAulas.isEmpty()) {
            NO_HAY_AULAS aviso = new NO_HAY_AULAS();
            aviso.setVisible(true);
        }
    }//GEN-LAST:event_buscarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(BUSCAR_AULAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BUSCAR_AULAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BUSCAR_AULAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BUSCAR_AULAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BUSCAR_AULAS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> aulaCapacidad;
    private javax.swing.JComboBox<String> aulaNum;
    private javax.swing.JComboBox<String> aulaTipo;
    private javax.swing.JButton buscarButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton modificarButton;
    private javax.swing.JTable tablaAulas;
    // End of variables declaration//GEN-END:variables
}
