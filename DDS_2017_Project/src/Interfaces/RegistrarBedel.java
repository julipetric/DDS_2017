/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Clases.Turno;
import Control.GestorBedel;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author rodri
 */
public class RegistrarBedel extends javax.swing.JFrame {

    GestorBedel controlador;

    public String usuario;
    public String apellido;
    public String nombre;
    public String contra;
    public String contra2;
    public Turno turno;
    //arreglo booleano para identificar que dio error
    public ArrayList<Boolean> datosError;

    public RegistrarBedel() {
        controlador = new GestorBedel();
        initComponents();
        jLabel9.setText("");
        jLabel10.setText("");
        this.setLocationRelativeTo(null);

        nombreTextField.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (nombreTextField.getText().length() >= 12) {
                    e.consume();
                }
            }
        });

        lastnameTextField.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (lastnameTextField.getText().length() >= 20) {
                    e.consume();
                }
            }
        });

        usernameTextField.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (usernameTextField.getText().length() >= 32) {
                    e.consume();
                }
            }
        });
        
        pass1TextField.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (pass1TextField.getText().length() >= 32) {
                    e.consume();
                }
            }
        });
        
        pass2TextField.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (pass2TextField.getText().length() >= 32) {
                    e.consume();
                }
            }
        });

    }

    public void errorNombre() {
        jLabel2.setForeground(Color.red);
    }

    public void errorUsuario() {
        jLabel5.setForeground(Color.red);
    }

    public void errorApellido() {
        jLabel3.setForeground(Color.red);
    }

    public void errorContra() {
        jLabel6.setForeground(Color.red);
    }

    public void errorContra2() {
        jLabel7.setForeground(Color.red);
    }

    public void errorTurno() {
        jLabel4.setForeground(Color.red);
    }

    public void nombreOk() {
        jLabel2.setForeground(Color.black);
    }

    public void usuarioOk() {
        jLabel5.setForeground(Color.black);
    }

    public void apellidoOk() {
        jLabel3.setForeground(Color.black);
    }

    public void contraOk() {
        jLabel6.setForeground(Color.black);
    }

    public void contra2Ok() {
        jLabel7.setForeground(Color.black);
    }

    public void turnoOk() {
        jLabel4.setForeground(Color.black);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel1 = new javax.swing.JLabel();
        nombreTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lastnameTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        turnoComboBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        usernameTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        pass1TextField = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        pass2TextField = new javax.swing.JPasswordField();
        aceptarButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nuevo Bedel");
        setAlwaysOnTop(true);
        setMinimumSize(new java.awt.Dimension(760, 330));
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Registrar un nuevo bedel");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 12, 0, 0);
        getContentPane().add(jLabel1, gridBagConstraints);

        nombreTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTextFieldActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 261;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 12, 0, 0);
        getContentPane().add(nombreTextField, gridBagConstraints);

        jLabel2.setText("Nombre/s");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 12, 0, 0);
        getContentPane().add(jLabel2, gridBagConstraints);

        jLabel3.setText("Apellido/s");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 60, 0, 0);
        getContentPane().add(jLabel3, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 12;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 261;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 60, 0, 0);
        getContentPane().add(lastnameTextField, gridBagConstraints);

        jLabel4.setText("Turno de trabajo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 60, 0, 0);
        getContentPane().add(jLabel4, gridBagConstraints);

        turnoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MAÑANA", "TARDE", "NOCHE" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 12;
        gridBagConstraints.ipadx = 190;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 60, 0, 0);
        getContentPane().add(turnoComboBox, gridBagConstraints);

        jLabel5.setText("Nombre de usuario");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 158;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 12, 0, 0);
        getContentPane().add(jLabel5, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 261;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 12, 0, 0);
        getContentPane().add(usernameTextField, gridBagConstraints);

        jLabel6.setText("Contraseña");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 202;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 12, 0, 0);
        getContentPane().add(jLabel6, gridBagConstraints);

        pass1TextField.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 261;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 12, 0, 0);
        getContentPane().add(pass1TextField, gridBagConstraints);

        jLabel7.setText("Repetir contraseña");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 60, 0, 0);
        getContentPane().add(jLabel7, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 12;
        gridBagConstraints.ipadx = 261;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 60, 0, 0);
        getContentPane().add(pass2TextField, gridBagConstraints);

        aceptarButton.setBackground(new java.awt.Color(204, 204, 204));
        aceptarButton.setText("Aceptar");
        aceptarButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        aceptarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        aceptarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 13;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.ipadx = 39;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 18, 0, 0);
        getContentPane().add(aceptarButton, gridBagConstraints);

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setText("Cancelar");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.ipadx = 33;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 1, 0, 0);
        getContentPane().add(jButton2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 267;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 72, 0, 0);
        getContentPane().add(jLabel8, gridBagConstraints);

        jLabel9.setForeground(new java.awt.Color(255, 51, 51));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 14;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(jLabel9, gridBagConstraints);

        jLabel10.setForeground(new java.awt.Color(255, 51, 51));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 15;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 12);
        getContentPane().add(jLabel10, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aceptarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarButtonActionPerformed
        nombre = nombreTextField.getText();
        apellido = lastnameTextField.getText();
        usuario = usernameTextField.getText();
        contra = pass1TextField.getText();
        contra2 = pass2TextField.getText();
        turno = Turno.valueOf(turnoComboBox.getSelectedItem().toString());
        datosError = new ArrayList<>();
        Boolean errorNombre= false;
        Boolean errorApellido= false;
        //se inicializa el arreglo de tipos de error
        for (int i = 0; i < 8; i++) {
            datosError.add(false);
        }
      
        boolean datosInvalidos = controlador.validar(nombre, apellido, usuario, turno, contra, contra2, datosError);
 
            if (datosError.get(6)) {
                jLabel9.setText("Solo letras");
                  jLabel2.setForeground(Color.red);
            }else{ jLabel9.setText("");  jLabel2.setForeground(Color.black);}
            if (datosError.get(7)) {
                jLabel10.setText("Solo letras");
                  jLabel3.setForeground(Color.red);
            }else{ jLabel10.setText("");  jLabel3.setForeground(Color.black);}
            
           
            //se colorean los datos invalidos
            if (datosError.get(0)) {
                errorNombre();
            } else {
                nombreOk();
            }
            if (datosError.get(1)) {
                errorApellido();
            } else {
                apellidoOk();
            }
            if (datosError.get(2)) {
                errorUsuario();
            } else {
                usuarioOk();
            }
            if (datosError.get(3)) {
                errorTurno();
            } else {
                turnoOk();
            }
            if (datosError.get(4)) {
                errorContra();
            } else {
                contraOk();
            }
            if (datosError.get(5)) {
                errorContra2();
            } else {
                contra2Ok();
            }

            if (!datosInvalidos) {
                Exito bien = new Exito();
                bien.setVisible(true);
                java.util.Date fecha = new Date();
                String fechaFormat = new SimpleDateFormat("dd/MM/yyyy").format(fecha);
                controlador.crearBedel(usuario, nombre, apellido, contra, turno.toString(), fechaFormat);
                nombreTextField.setText("");
                lastnameTextField.setText("");
                pass1TextField.setText("");
                pass2TextField.setText("");
                usernameTextField.setText("");
                turnoComboBox.setSelectedIndex(0);
            }
        
    }//GEN-LAST:event_aceptarButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        CONFIRMACION_CANCELACION v3 = new CONFIRMACION_CANCELACION(this);
        v3.setVisible(true);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void nombreTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrarBedel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarBedel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarBedel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarBedel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarBedel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarButton;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lastnameTextField;
    private javax.swing.JTextField nombreTextField;
    private javax.swing.JPasswordField pass1TextField;
    private javax.swing.JPasswordField pass2TextField;
    private javax.swing.JComboBox<String> turnoComboBox;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}
