/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Clases.Periodo;
import bd.model.Reserva;
import Clases.TipoDeAula;
import Clases.horariosAUX;
import Control.GestorDocente;
import Control.GestorReserva;
import DAO.DocenteDAO;
import bd.model.Diareserva;
import bd.model.DiareservaId;
import bd.model.Docente;
import java.awt.Color;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rodri
 */
public class RegistrarReserva extends javax.swing.JFrame {

    private ArrayList<Date> dias;
    private Calendar calendario;
    public Date inicio1C;
    public Date fin1C;
    public Date inicio2C;
    public Periodo periodo;
    public Date inicio;
    public Date fin;
    public Date fin2C;
    private TipoDeAula tipo;
    public ArrayList<Integer> diasDeSemana;
    public Reserva reserva;
    private ArrayList<horariosAUX> horariosPorDia;
    private GestorReserva gestor;
    private GestorDocente DocenteGestor;
    private ArrayList<Docente> listaDocentes;
    private ArrayList<String> docentesArreglo;
    public SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public Integer reservaNumero = 0;
    private final ArrayList<String> cola;
    public ArrayList<Diareserva> diasReserva;

    public JTable getjTable1() {
        return jTable1;
    }

    public RegistrarReserva() {
        initComponents();
        jLabel2.setText("");
        DocenteGestor = new GestorDocente();
        docentesArreglo = new ArrayList<>();
        listaDocentes = DocenteGestor.read();
        reserva = new Reserva();
        cola = new ArrayList<>();
        diasDeSemana = new ArrayList<>();
        horariosPorDia = new ArrayList<>();

        this.cola.add("08:00");
        this.cola.add("08:30");
        this.cola.add("09:00");
        this.cola.add("09:30");
        this.cola.add("10:00");
        this.cola.add("10:30");
        this.cola.add("11:00");
        this.cola.add("11:30");
        this.cola.add("12:00");
        this.cola.add("12:30");
        this.cola.add("13:00");
        this.cola.add("13:30");
        this.cola.add("14:00");
        this.cola.add("14:30");
        this.cola.add("15:00");
        this.cola.add("15:30");
        this.cola.add("16:00");
        this.cola.add("16:30");
        this.cola.add("17:00");
        this.cola.add("17:30");
        this.cola.add("18:00");
        this.cola.add("18:30");
        this.cola.add("19:00");
        this.cola.add("19:30");
        this.cola.add("20:00");
        this.cola.add("20:30");
        this.cola.add("21:00");
        this.cola.add("21:30");
        this.cola.add("22:00");
        this.cola.add("22:30");
        this.cola.add("23:00");
        this.cola.add("23:30");

        jLabel3.setText("");
        jLabel2.setText("");

        for (int i = 0; i < listaDocentes.size(); i++) {

            docentesArreglo.add(listaDocentes.get(i).getNombre() + " " + listaDocentes.get(i).getApellido());

        }

        DefaultComboBoxModel modelito = new DefaultComboBoxModel();
        jComboBox2.setModel(modelito);

        for (int i = 0; i < docentesArreglo.size(); i++) {

            modelito.addElement(docentesArreglo.get(i));

        }

        esporadicaRadioButton.setSelected(false);
        periodicaRadioButton.setSelected(true);
        nuevoDiaButton.setEnabled(false);
        jTable1.setEnabled(false);
        gestor = new GestorReserva();

        try {
            inicio1C = sdf.parse("15/03/2017");
        } catch (ParseException ex) {
            Logger.getLogger(RegistrarReserva.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            fin1C = sdf.parse("9/06/2017");
        } catch (ParseException ex) {
            Logger.getLogger(RegistrarReserva.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            inicio2C = sdf.parse("08/07/2017");
        } catch (ParseException ex) {
            Logger.getLogger(RegistrarReserva.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            fin2C = sdf.parse("25/12/2017");
        } catch (ParseException ex) {
            Logger.getLogger(RegistrarReserva.class.getName()).log(Level.SEVERE, null, ex);
        }

        //Las fechas están verificadas
        this.setLocationRelativeTo(null);
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
        jLabel12 = new javax.swing.JLabel();
        tipoComboBox = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        cantAlumnosComboBox = new javax.swing.JComboBox<>();
        cursoLabel = new javax.swing.JLabel();
        cursoTextField = new javax.swing.JTextField();
        aceptarButton = new javax.swing.JButton();
        cancelarButton = new javax.swing.JButton();
        nuevoDiaButton = new javax.swing.JButton();
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
        periodoComboBox = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("REGISTRAR UNA NUEVA RESERVA");
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Registrar una nueva reserva");

        jLabel6.setText("Dias de la semana");

        jLabel7.setText("Horarios");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30" }));
        jComboBox3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30" }));
        jComboBox4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jCheckBox8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jCheckBox9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jCheckBox10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jCheckBox11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jCheckBox12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel11.setText("Nombre del docente");

        jLabel12.setText("Tipo de aula");

        tipoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MULTIMEDIOS", "INFORMATICA", "SINRECURSOS" }));
        tipoComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel14.setText("Cantidad de alumnos");

        cantAlumnosComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "" }));
        cantAlumnosComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        cursoLabel.setText("Nombre del curso / catedra / seminario");

        aceptarButton.setBackground(new java.awt.Color(204, 204, 204));
        aceptarButton.setText("Aceptar");
        aceptarButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        aceptarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        aceptarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarButtonActionPerformed(evt);
            }
        });

        cancelarButton.setText("Cancelar");
        cancelarButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cancelarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarButtonActionPerformed(evt);
            }
        });

        nuevoDiaButton.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.highlight"));
        nuevoDiaButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nuevoDiaButton.setText("+");
        nuevoDiaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        nuevoDiaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoDiaButtonActionPerformed(evt);
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

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30" }));
        jComboBox7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30" }));
        jComboBox8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30" }));
        jComboBox9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30" }));
        jComboBox10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30" }));
        jComboBox11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30" }));
        jComboBox12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jComboBox13.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30" }));
        jComboBox13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jComboBox14.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30" }));
        jComboBox14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel9.setText("Lunes");

        jLabel17.setText("Martes");

        jLabel18.setText("Miercoles");

        jLabel19.setText("Viernes");

        jLabel20.setText("Jueves");

        esporadicaRadioButton.setText("Esporádica");
        esporadicaRadioButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        esporadicaRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esporadicaRadioButtonActionPerformed(evt);
            }
        });

        periodicaRadioButton.setText("Periodica");
        periodicaRadioButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        periodicaRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                periodicaRadioButtonActionPerformed(evt);
            }
        });

        periodoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ANUAL", "PRIMERO", "SEGUNDO", "NONE", " " }));
        periodoComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jComboBox2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("jLabel2");

        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cancelarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(aceptarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tipoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(cursoLabel)
                            .addComponent(cursoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cantAlumnosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                            .addComponent(periodoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(esporadicaRadioButton)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(nuevoDiaButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(esporadicaRadioButton)
                    .addComponent(periodicaRadioButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nuevoDiaButton)
                    .addComponent(jLabel8)
                    .addComponent(periodoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cursoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cursoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tipoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cantAlumnosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aceptarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void periodicaRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_periodicaRadioButtonActionPerformed
        esporadicaRadioButton.setSelected(false);
        nuevoDiaButton.setEnabled(false);
        jTable1.setEnabled(false);
        periodoComboBox.setEnabled(true);
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
        nuevoDiaButton.setEnabled(true);
        jTable1.setEnabled(true);
        periodoComboBox.setEnabled(false);
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

    public void agregarFilaATabla(Diareserva dia) {

        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        Object rowData[] = new Object[3];
        rowData[0] = dia.getId().getFecha();
        rowData[1] = dia.getId().getHoraInicio();
        rowData[2] = dia.getId().getHoraFin();
        modelo.addRow(rowData);

    }

    public boolean verificarErrores() {
        boolean error = false; //con este verifico que TODO ESTE BIEN

        if (cursoTextField.getText().equals("")) {
            cursoLabel.setForeground(Color.red);
            error = true;
        } else {
            cursoLabel.setForeground(Color.black);
            error = false;
        }

        //VERIFICACIONES PERIODICAS
        if (periodicaRadioButton.isSelected()) {

            boolean errorHorario = false;

            if (jCheckBox8.isSelected()) {

                if (this.cola.indexOf(jComboBox3.getSelectedItem().toString()) >= this.cola.indexOf(jComboBox4.getSelectedItem().toString())) {
                    jLabel2.setText("Error en horario");
                    error = true;
                    errorHorario = true;

                } else {

                    jLabel2.setText("");
                    diasDeSemana.add(1);
                    horariosPorDia.add(new horariosAUX(jComboBox3.getSelectedItem().toString(), jComboBox4.getSelectedItem().toString()));
                }
            }//lunes
            if (jCheckBox9.isSelected()) {

                if (this.cola.indexOf(jComboBox7.getSelectedItem().toString()) >= this.cola.indexOf(jComboBox8.getSelectedItem().toString())) {
                    jLabel2.setText("Error en horario");
                    error = true;
                    errorHorario = true;

                } else {

                    jLabel2.setText("");
                    diasDeSemana.add(2);
                    horariosPorDia.add(new horariosAUX(jComboBox7.getSelectedItem().toString(), jComboBox8.getSelectedItem().toString()));
                }
            }//martes
            if (jCheckBox10.isSelected()) {
                if (this.cola.indexOf(jComboBox9.getSelectedItem().toString()) >= this.cola.indexOf(jComboBox10.getSelectedItem().toString())) {
                    jLabel2.setText("Error en horario");
                    error = true;
                    errorHorario = true;

                } else {

                    jLabel2.setText("");
                    diasDeSemana.add(3);
                    horariosPorDia.add(new horariosAUX(jComboBox9.getSelectedItem().toString(), jComboBox10.getSelectedItem().toString()));
                }
            }//miercoles
            if (jCheckBox11.isSelected()) {
                if (this.cola.indexOf(jComboBox11.getSelectedItem().toString()) >= this.cola.indexOf(jComboBox12.getSelectedItem().toString())) {
                    jLabel2.setText("Error en horario");
                    error = true;
                    errorHorario = true;

                } else {

                    jLabel2.setText("");
                    diasDeSemana.add(4);
                    horariosPorDia.add(new horariosAUX(jComboBox11.getSelectedItem().toString(), jComboBox12.getSelectedItem().toString()));
                }
            }//jueves
            if (jCheckBox12.isSelected()) {
                if (this.cola.indexOf(jComboBox13.getSelectedItem().toString()) >= this.cola.indexOf(jComboBox14.getSelectedItem().toString())) {
                    jLabel2.setText("Error en horario");
                    error = true;
                    errorHorario = true;

                } else {

                    jLabel2.setText("");
                    diasDeSemana.add(5);
                    horariosPorDia.add(new horariosAUX(jComboBox13.getSelectedItem().toString(), jComboBox14.getSelectedItem().toString()));
                }
            }//viernes
            if (!errorHorario) {

                if (diasDeSemana.isEmpty()) {
                    jLabel2.setText("Seleccionar un día");
                    error = true;
                }

            }

        }
        if (esporadicaRadioButton.isSelected()) {
            if (reserva.diareservas.isEmpty()) {
                error = true;
                jLabel3.setText("ingrese un dia");
            } else {
                jLabel3.setText("");
            }
        }

        return error;
    }

    private void setearFechasPeriodicas() {
        if (periodoComboBox.getSelectedIndex() == 0) {
            inicio = inicio1C;
            fin = fin2C;
        }
        if (periodoComboBox.getSelectedIndex() == 1) {
            inicio = inicio1C;
            fin = fin1C;
        }
        if (periodoComboBox.getSelectedIndex() == 2) {
            inicio = inicio2C;
            fin = fin2C;
        }
        Date hoy = new Date();
        if (hoy.after(inicio)) {
            inicio = hoy;
        }
    }

    private void setearFechasEsporadicas() {

        Date hoy = new Date();
        inicio = hoy;
        fin = fin2C;

    }

    private void agregarDiasReservaPeriodicas() {

        Calendar aux = Calendar.getInstance();
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
            boolean h = aux.getTime().compareTo(fin) < 0;
            diasReserva = new ArrayList<>();
            while (h) {//while para agregar los dias de reserva
                //System.out.println("2");
                Date fechaAux = aux.getTime();

                // Display a date in day, month, year format
                DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
                String fecha = formatter.format(fechaAux);
                DiareservaId idAux = new DiareservaId(fecha, horariosPorDia.get(i).getHorainicio(), horariosPorDia.get(i).getHorafin(), reserva.getId());
                diasReserva.add(new Diareserva(idAux, reserva));
                aux.add(Calendar.DATE, 7);//Se incrementa en 1 semana el dia aux
                //SE CHEQUEA h
                h = aux.getTime().compareTo(fin) < 0;
            }
            //se va a incrementar i, se vuelve al dia de hor, se acomoda en el siguiente dia seleccionado y se agregan todos los dias reserva
        }
        reserva.diareservas = new HashSet<>(diasReserva);
    }

    private void registrarDatosReserva() {
        reserva.setCantidadAlumnos(Integer.parseInt((String) cantAlumnosComboBox.getSelectedItem()));
        reserva.setTipoAula((String) this.tipoComboBox.getSelectedItem());
        reserva.setNombreCurso(cursoTextField.getText());
        reserva.setDocente(listaDocentes.get(jComboBox2.getSelectedIndex()));
        if (periodicaRadioButton.isSelected()) {
            reserva.setPeriodo((String) periodoComboBox.getSelectedItem());
        } else {
            reserva.setPeriodo("ESPORADICA");
        }
    }

    private void aceptarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarButtonActionPerformed

        //VERIFICACIONES GENERALES
        if (!this.verificarErrores()) {
            
            
            this.registrarDatosReserva();
            if (periodicaRadioButton.isSelected()) {
                this.setearFechasPeriodicas();
                //System.out.println(inicio.toString());
                this.agregarDiasReservaPeriodicas();

                //ir a la ventana
                this.GenerarElegirAulaPeriodica(diasReserva);
            } else {
                try {
                    this.setearFechasEsporadicas();
                    //ya se agregaron los dias
                    //se crea la ventana elegir aula con diasReserva como arreglo
                    diasReserva = new ArrayList<>(reserva.getDiareservas());
                    this.GenerarElegirAulaEsporadica(diasReserva);
                } catch (ParseException ex) {
                    Logger.getLogger(RegistrarReserva.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_aceptarButtonActionPerformed

    public void GenerarElegirAulaEsporadica(ArrayList<Diareserva> diasReserva) throws ParseException {
        //System.out.println("pasamos a la ventana nueva");
        if (reservaNumero < reserva.getDiareservas().size()) {
            ElegirAulaEsporadica vent;
            vent = new ElegirAulaEsporadica(reserva, diasReserva.get(reservaNumero), reservaNumero, this, diasReserva);
            vent.setVisible(true);
        }
        reservaNumero++;

        if (reservaNumero > diasReserva.size()) {
            this.Guardar();
        }
    }

    public void GenerarElegirAulaPeriodica(ArrayList<Diareserva> diasReserva) {
        //System.out.println("pasamos a la ventana nueva");
        if (reservaNumero < this.diasDeSemana.size()) {
            ElegirAulaPeriodica vent = null;
            try {
                vent = new ElegirAulaPeriodica(reserva, reservaNumero, this, this.diasDeSemana.get(reservaNumero));
            } catch (ParseException ex) {
                Logger.getLogger(RegistrarReserva.class.getName()).log(Level.SEVERE, null, ex);
            }
            vent.setVisible(true);
        }
        reservaNumero++;

        if (reservaNumero > this.diasDeSemana.size()) {
            aceptarButton.setText("Guardar");
        }

    }

    public Reserva getReserva() {
        return reserva;
    }

    private void Guardar() {
        if (this.esporadicaRadioButton.isSelected()) {
            if (reservaNumero >= reserva.getDiareservas().size() + 1) {
                //ArrayList<Diareserva> arrayAux = new ArrayList<>(reserva.getDiareservas());
                gestor.nuevaReserva(reserva, diasReserva);
                
                this.reservaNumero = 0;
                reserva.getDiareservas().clear();
                DefaultTableModel modelo = new DefaultTableModel();
                modelo =(DefaultTableModel) this.getjTable1().getModel();
                modelo.setRowCount(0);
                 reserva = new Reserva();
            }
        } else {
            if (reservaNumero >= diasDeSemana.size() + 1) {
                //ArrayList<Diareserva> arrayAux = new ArrayList<>(reserva.getDiareservas());
                reserva.diareservas = new HashSet<>(diasReserva);
                gestor.nuevaReserva(reserva, diasReserva);
                
                this.reservaNumero = 0;
                reserva.getDiareservas().clear();
                DefaultTableModel modelo = new DefaultTableModel();
                modelo =(DefaultTableModel) this.getjTable1().getModel();
                modelo.setRowCount(0);
                reserva = new Reserva();
            }
        }
        Exito bien = new Exito();
        bien.setVisible(true);
    }

    private void nuevoDiaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoDiaButtonActionPerformed
        //ACCION DE NUEVO DIA

        NuevoDia ventana_NUEVO_DIA = new NuevoDia(reserva, this.inicio1C, this.fin2C, this);
        ventana_NUEVO_DIA.setVisible(true);


    }//GEN-LAST:event_nuevoDiaButtonActionPerformed

    private void cancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarButtonActionPerformed
       System.exit(0);
    }//GEN-LAST:event_cancelarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarReserva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarButton;
    private javax.swing.JButton cancelarButton;
    private javax.swing.JComboBox<String> cantAlumnosComboBox;
    private javax.swing.JLabel cursoLabel;
    private javax.swing.JTextField cursoTextField;
    private javax.swing.JRadioButton esporadicaRadioButton;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JComboBox<String> jComboBox10;
    private javax.swing.JComboBox<String> jComboBox11;
    private javax.swing.JComboBox<String> jComboBox12;
    private javax.swing.JComboBox<String> jComboBox13;
    private javax.swing.JComboBox<String> jComboBox14;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JComboBox<String> jComboBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton nuevoDiaButton;
    private javax.swing.JRadioButton periodicaRadioButton;
    private javax.swing.JComboBox<String> periodoComboBox;
    private javax.swing.JComboBox<String> tipoComboBox;
    // End of variables declaration//GEN-END:variables

}
