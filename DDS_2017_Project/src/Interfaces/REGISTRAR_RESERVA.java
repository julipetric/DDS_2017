/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Clases.DiaReserva;
import Clases.Periodo;
import Clases.Reserva;
import Clases.TipoDeAula;
import Clases.horariosAUX;
import Control.GestorReserva;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rodri
 */
public class REGISTRAR_RESERVA extends javax.swing.JFrame {

    private ArrayList<Date> dias;
    private Calendar calendario;
    private Date inicio1C;
    private Date fin1C;
    private Date inicio2C;
    private Periodo periodo;
    private Date fin2C;
    private TipoDeAula tipo;
    private ArrayList<Integer> diasDeSemana;
    public Reserva reserva;
    private ArrayList<horariosAUX> horariosPorDia;
    private GestorReserva gestor;

    public SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public REGISTRAR_RESERVA() {
        initComponents();

        esporadicaRadioButton.setSelected(false);
        periodicaRadioButton.setSelected(true);
        jButton3.setEnabled(false);
        jTable1.setEnabled(false);
        reserva = new Reserva();
        gestor = new GestorReserva();

        try {
            inicio1C = sdf.parse("15/03/2017");
        } catch (ParseException ex) {
            Logger.getLogger(REGISTRAR_RESERVA.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            fin1C = sdf.parse("9/06/2017");
        } catch (ParseException ex) {
            Logger.getLogger(REGISTRAR_RESERVA.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            inicio2C = sdf.parse("08/07/2017");
        } catch (ParseException ex) {
            Logger.getLogger(REGISTRAR_RESERVA.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            fin2C = sdf.parse("25/12/2017");
        } catch (ParseException ex) {
            Logger.getLogger(REGISTRAR_RESERVA.class.getName()).log(Level.SEVERE, null, ex);
        }

        //Las fechas están verificadas
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        jCheckBox12 = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        cantAlumnosComboBox = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        aceptarButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox7 = new javax.swing.JComboBox<>();
        jComboBox8 = new javax.swing.JComboBox<>();
        jComboBox9 = new javax.swing.JComboBox<>();
        jComboBox10 = new javax.swing.JComboBox<>();
        jComboBox11 = new javax.swing.JComboBox<>();
        jComboBox12 = new javax.swing.JComboBox<>();
        jComboBox13 = new javax.swing.JComboBox<>();
        jComboBox14 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        esporadicaRadioButton = new javax.swing.JRadioButton();
        periodicaRadioButton = new javax.swing.JRadioButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("REGISTRAR UNA NUEVA RESERVA");
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Registrar una nueva reserva");

        jLabel6.setText("Dias de la semana");

        jLabel7.setText("Horarios");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "08:00", "08:45", "09:30", "10:15", "10:30", "11:15", "12:00", "12:45", "13:15", "13:30", "14:00", "14:15", "14:45", "15:30", "16:15", "16:30", "17:15", "18:00", "18:45", "19:00", "19:45", "20:30", "21:15", "21:30", "22:15", "23:00", "23:45\t" }));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "08:00", "08:45", "09:30", "10:15", "10:30", "11:15", "12:00", "12:45", "13:15", "13:30", "14:00", "14:15", "14:45", "15:30", "16:15", "16:30", "17:15", "18:00", "18:45", "19:00", "19:45", "20:30", "21:15", "21:30", "22:15", "23:00", "23:45" }));

        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel11.setText("Nombre del docente");

        jLabel12.setText("Tipo de aula");

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar tipo", "MULTIMEDIOS", "INFORMATICA", "SINRECURSOS" }));

        jLabel13.setText("Apellido del docente");

        jLabel14.setText("Cantidad de alumnos");

        cantAlumnosComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar cantidad", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", " " }));

        jLabel15.setText("Nombre del curso / catedra / seminario");

        jLabel16.setText("E-mail de contacto");

        aceptarButton.setBackground(new java.awt.Color(0, 102, 255));
        aceptarButton.setText("Aceptar");
        aceptarButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        aceptarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarButtonActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 204, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setText("+");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel8.setText("Agregar nuevo día");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Dia", "Inicio", "Fin"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
        }

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "08:00", "08:45", "09:30", "10:15", "10:30", "11:15", "12:00", "12:45", "13:15", "13:30", "14:00", "14:15", "14:45", "15:30", "16:15", "16:30", "17:15", "18:00", "18:45", "19:00", "19:45", "20:30", "21:15", "21:30", "22:15", "23:00", "23:45" }));

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "08:00", "08:45", "09:30", "10:15", "10:30", "11:15", "12:00", "12:45", "13:15", "13:30", "14:00", "14:15", "14:45", "15:30", "16:15", "16:30", "17:15", "18:00", "18:45", "19:00", "19:45", "20:30", "21:15", "21:30", "22:15", "23:00", "23:45" }));

        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "08:00", "08:45", "09:30", "10:15", "10:30", "11:15", "12:00", "12:45", "13:15", "13:30", "14:00", "14:15", "14:45", "15:30", "16:15", "16:30", "17:15", "18:00", "18:45", "19:00", "19:45", "20:30", "21:15", "21:30", "22:15", "23:00", "23:45" }));

        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "08:00", "08:45", "09:30", "10:15", "10:30", "11:15", "12:00", "12:45", "13:15", "13:30", "14:00", "14:15", "14:45", "15:30", "16:15", "16:30", "17:15", "18:00", "18:45", "19:00", "19:45", "20:30", "21:15", "21:30", "22:15", "23:00", "23:45" }));

        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "08:00", "08:45", "09:30", "10:15", "10:30", "11:15", "12:00", "12:45", "13:15", "13:30", "14:00", "14:15", "14:45", "15:30", "16:15", "16:30", "17:15", "18:00", "18:45", "19:00", "19:45", "20:30", "21:15", "21:30", "22:15", "23:00", "23:45" }));

        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "08:00", "08:45", "09:30", "10:15", "10:30", "11:15", "12:00", "12:45", "13:15", "13:30", "14:00", "14:15", "14:45", "15:30", "16:15", "16:30", "17:15", "18:00", "18:45", "19:00", "19:45", "20:30", "21:15", "21:30", "22:15", "23:00", "23:45" }));

        jComboBox13.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "08:00", "08:45", "09:30", "11:15", "10:30", "10:15", "12:00", "12:45", "13:15", "13:30", "14:00", "14:15", "14:45", "15:30", "16:15", "16:30", "17:15", "18:00", "18:45", "19:00", "19:45", "20:30", "21:15", "21:30", "22:15", "23:00", "23:45" }));

        jComboBox14.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "08:00", "08:45", "09:30", "11:15", "10:30", "10:15", "12:00", "12:45", "13:15", "13:30", "14:00", "14:15", "14:45", "15:30", "16:15", "16:30", "17:15", "18:00", "18:45", "19:00", "19:45", "20:30", "21:15", "21:30", "22:15", "23:00", "23:45" }));

        jLabel9.setText("Lunes");

        jLabel17.setText("Martes");

        jLabel18.setText("Miercoles");

        jLabel19.setText("Viernes");

        jLabel20.setText("Jueves");

        esporadicaRadioButton.setText("Esporádica");
        esporadicaRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esporadicaRadioButtonActionPerformed(evt);
            }
        });

        periodicaRadioButton.setText("Periodica");
        periodicaRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                periodicaRadioButtonActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ANUAL", "PRIMERO", "SEGUNDO", "NONE", " " }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(aceptarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)
                            .addComponent(cantAlumnosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(58, 58, 58)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jCheckBox8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel9))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jCheckBox9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel17))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jCheckBox10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel18)))
                                .addGap(72, 72, 72)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jComboBox11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBox12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jComboBox13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBox14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBox12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel19))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBox11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel20))
                            .addComponent(periodicaRadioButton)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(esporadicaRadioButton)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(esporadicaRadioButton)
                    .addComponent(periodicaRadioButton))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jButton3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9))
                            .addComponent(jCheckBox8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel17))
                            .addComponent(jCheckBox9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel18)))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox11)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jComboBox11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel20)))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox12)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jComboBox13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel19))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cantAlumnosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aceptarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void periodicaRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_periodicaRadioButtonActionPerformed
        esporadicaRadioButton.setSelected(false);

        jButton3.setEnabled(false);
        jTable1.setEnabled(false);

        jComboBox1.setEnabled(true);
        jCheckBox8.setEnabled(true);
        jCheckBox9.setEnabled(true);
        jCheckBox10.setEnabled(true);
        jCheckBox11.setEnabled(true);
        jCheckBox12.setEnabled(true);
        jComboBox3.setEnabled(true);
        jComboBox4.setEnabled(true);
        jComboBox7.setEnabled(true);
        jComboBox8.setEnabled(true);
        jComboBox9.setEnabled(true);
        jComboBox10.setEnabled(true);
        jComboBox11.setEnabled(true);
        jComboBox12.setEnabled(true);
        jComboBox13.setEnabled(true);
        jComboBox14.setEnabled(true);
    }//GEN-LAST:event_periodicaRadioButtonActionPerformed

    private void esporadicaRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esporadicaRadioButtonActionPerformed

        periodicaRadioButton.setSelected(false);

        jButton3.setEnabled(true);
        jTable1.setEnabled(true);

        jComboBox1.setEnabled(false);
        jCheckBox8.setEnabled(false);
        jCheckBox9.setEnabled(false);
        jCheckBox10.setEnabled(false);
        jCheckBox11.setEnabled(false);
        jCheckBox12.setEnabled(false);
        jComboBox3.setEnabled(false);
        jComboBox4.setEnabled(false);
        jComboBox7.setEnabled(false);
        jComboBox8.setEnabled(false);
        jComboBox9.setEnabled(false);
        jComboBox10.setEnabled(false);
        jComboBox11.setEnabled(false);
        jComboBox12.setEnabled(false);
        jComboBox13.setEnabled(false);
        jComboBox14.setEnabled(false);
    }//GEN-LAST:event_esporadicaRadioButtonActionPerformed

    public void agregarFilaATabla(DiaReserva dia) {

        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        Object rowData[] = new Object[3];
        rowData[0] = dia.fecha.toString();

        rowData[1] = dia.horaInicio;
        rowData[2] = dia.horaFin;
        modelo.addRow(rowData);

    }


    private void aceptarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarButtonActionPerformed

        Date inicio = new Date();
        Date fin = new Date();
        Calendar aux = Calendar.getInstance();
        //comportamiento del botón aceptar
        calendario = Calendar.getInstance();
        diasDeSemana = new ArrayList<>();
        horariosPorDia = new ArrayList<>();
        tipo = TipoDeAula.valueOf(jComboBox5.getSelectedItem().toString());
        if (periodicaRadioButton.isSelected()) {//Asignación del período según sea periodica o esporádica
            periodo = Periodo.valueOf(jComboBox1.getSelectedItem().toString());
        } else {
            periodo = Periodo.NONE;
        }

        //SE INICIALIZA LA RESERVA CON LOS DATOS BÁSICOS, FALTA DOCENTE yTIPO DE AULA
//        calendario.getTime().getDay();    para obtener entero como dia de la semana domingo=0
        //SE AGREGAN LOS DIAS DE LA SEMANA - EN ENTEROS - QUE ESTÁN SELECCIONADOS
        if (jCheckBox8.isSelected()) {
            diasDeSemana.add(1);
            horariosPorDia.add(new horariosAUX(jComboBox3.getSelectedItem().toString(), jComboBox4.getSelectedItem().toString()));
        }//lunes
        if (jCheckBox9.isSelected()) {
            diasDeSemana.add(2);
            horariosPorDia.add(new horariosAUX(jComboBox7.getSelectedItem().toString(), jComboBox8.getSelectedItem().toString()));
        }//martes
        if (jCheckBox10.isSelected()) {
            diasDeSemana.add(3);
            horariosPorDia.add(new horariosAUX(jComboBox9.getSelectedItem().toString(), jComboBox10.getSelectedItem().toString()));
        }//miercoles
        if (jCheckBox11.isSelected()) {
            diasDeSemana.add(4);
            horariosPorDia.add(new horariosAUX(jComboBox11.getSelectedItem().toString(), jComboBox12.getSelectedItem().toString()));
        }//jueves
        if (jCheckBox12.isSelected()) {
            diasDeSemana.add(5);
            horariosPorDia.add(new horariosAUX(jComboBox13.getSelectedItem().toString(), jComboBox14.getSelectedItem().toString()));
        }//viernes

        //HASTA ACA SE GUARDA TODO CORRECTO EN LOS ARREGLOS DE LOS DIAS Y HORARIOS  
        //SETEO DE LAS FECHAS INICIAL Y FINAL DE LAS RESERVAS A REALIZAR
        //VER BIEN LAS FECHAS ESTAS
        if (periodicaRadioButton.isSelected()) {
            if (jComboBox1.getSelectedIndex() == 0) {
                inicio = inicio1C;
                fin = fin2C;
            }
            if (jComboBox1.getSelectedIndex() == 1) {
                inicio = inicio1C;
                fin = fin1C;
            }
            if (jComboBox1.getSelectedIndex() == 2) {
                inicio = inicio2C;
                fin = fin2C;
            }
        }

        //SE AGREGAN LOS DIASRESERVA, LUEGO SE USAN PARA BUSCAR LOS AULAS DISPONIBLES   
        if (periodicaRadioButton.isSelected()) {//<------RESERV PERIODICA
            Boolean h = false;
            for (int i = 0; i < diasDeSemana.size(); i++) {
                System.out.println("for");
                aux.setTime(inicio);//se setea el calendario auxiliar en la fecha inicial CAMBIAR
                //Seteo en primer dia de semana
                boolean j = true;
                while (j) {
                    System.out.println("0");
                    if (aux.getTime().getDay() == Integer.parseInt(diasDeSemana.get(i).toString())) {
                        j = false;
                    } else {
                        aux.add(Calendar.DATE, 1);
                    }
                }
                //Sale aux en el primer dia de la semana que coincide
                if (aux.getTime().compareTo(fin) < 0) {
                    h = true;
                } else {
                    h = false;
                }
                while (h) {//while para agregar los dias de reserva
                    System.out.println("2");
                    reserva.diasReserva.add(new DiaReserva(aux.getTime(), horariosPorDia.get(i).horainicio, horariosPorDia.get(i).horafin));
                    aux.add(Calendar.DATE, 7);//Se incrementa en 1 semana el dia aux
                    //SE CHEQUEA h
                    if (aux.getTime().compareTo(fin) < 0) {
                        h = true;
                    } else {
                        h = false;
                    }
                }
                //se va a incrementar i, se vuelve al dia de hor, se acomoda en el siguiente dia seleccionado y se agregan todos los dias reserva
            }
            //aca ya estan generados todos los diasreserva iniciales de nuestra reserva periodica

            gestor.obtenerDisponibilidadPeriodica(reserva);// asignar a una variable la lista que se devuelve

        } else {//SI ES ESPORÁDICA
            reserva.setCantidadAlumnos(cantAlumnosComboBox.getSelectedIndex());
            reserva.setTipoDeAula(tipo);
            //System.out.println("pasamos a la ventana nueva");
            OBTENER_DISPONIBILIDAD_DE_AULAS vent = new OBTENER_DISPONIBILIDAD_DE_AULAS(reserva);
            vent.setVisible(true);

        }


    }//GEN-LAST:event_aceptarButtonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //ACCION DE NUEVO DIA

        NUEVO_DIA ventana_NUEVO_DIA = new NUEVO_DIA(reserva, this.inicio1C, this.fin2C, this);
        ventana_NUEVO_DIA.setVisible(true);


    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(REGISTRAR_RESERVA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(REGISTRAR_RESERVA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(REGISTRAR_RESERVA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(REGISTRAR_RESERVA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new REGISTRAR_RESERVA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarButton;
    private javax.swing.JComboBox<String> cantAlumnosComboBox;
    private javax.swing.JRadioButton esporadicaRadioButton;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox10;
    private javax.swing.JComboBox<String> jComboBox11;
    private javax.swing.JComboBox<String> jComboBox12;
    private javax.swing.JComboBox<String> jComboBox13;
    private javax.swing.JComboBox<String> jComboBox14;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JComboBox<String> jComboBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JRadioButton periodicaRadioButton;
    // End of variables declaration//GEN-END:variables
}
