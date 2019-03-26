/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import ejercicio2.Ejercicio2;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.regex.Matcher;
import javax.swing.JOptionPane;
import java.util.regex.Pattern;

/**
 *
 * @author Asus
 */
public class VentanaCambiar extends javax.swing.JFrame {
    
    private Pattern patl=Pattern.compile("^[A-Z][a-z]{0,9}$");

    /**
     * Creates new form VentanaCambios
     */
    public VentanaCambiar() {
        initComponents();
        SNombre.setVisible(false);
        SHFinal.setVisible(false);
        SHInicio.setVisible(false);
        SHFinal.setVisible(false);
        SAforo.setVisible(false);
        SFecha.setVisible(false);
        SUbicacion.setVisible(false);
        rellenar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Elemento = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jCheckBox3 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        SNombre = new javax.swing.JPanel();
        Label1 = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        SUbicacion = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        Ubicacion = new javax.swing.JComboBox<>();
        SHInicio = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        HoraI = new com.github.lgooddatepicker.components.TimePicker();
        SAforo = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        Aforo = new javax.swing.JTextField();
        SHFinal = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        HoraF = new com.github.lgooddatepicker.components.TimePicker();
        SFecha = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Fecha = new com.github.lgooddatepicker.components.DatePicker();
        jLabel1 = new javax.swing.JLabel();
        NombreE = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CNombre = new javax.swing.JCheckBox();
        CUbicacion = new javax.swing.JCheckBox();
        CFecha = new javax.swing.JCheckBox();
        CHInicio = new javax.swing.JCheckBox();
        CHFin = new javax.swing.JCheckBox();
        CAforo = new javax.swing.JCheckBox();
        Volver = new javax.swing.JButton();

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre el evento");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fecha");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Hora de inicio");

        jCheckBox3.setText("jCheckBox3");

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Label1.setText("Nombre el evento");

        Nombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                NombreFocusLost(evt);
            }
        });

        javax.swing.GroupLayout SNombreLayout = new javax.swing.GroupLayout(SNombre);
        SNombre.setLayout(SNombreLayout);
        SNombreLayout.setHorizontalGroup(
            SNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SNombreLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        SNombreLayout.setVerticalGroup(
            SNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SNombreLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(SNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel8.setText("Ubicación");

        Ubicacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", " " }));
        Ubicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UbicacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SUbicacionLayout = new javax.swing.GroupLayout(SUbicacion);
        SUbicacion.setLayout(SUbicacionLayout);
        SUbicacionLayout.setHorizontalGroup(
            SUbicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SUbicacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Ubicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        SUbicacionLayout.setVerticalGroup(
            SUbicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SUbicacionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(SUbicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(Ubicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
        );

        jLabel7.setText("Hora de inicio");

        javax.swing.GroupLayout SHInicioLayout = new javax.swing.GroupLayout(SHInicio);
        SHInicio.setLayout(SHInicioLayout);
        SHInicioLayout.setHorizontalGroup(
            SHInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SHInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(HoraI, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        SHInicioLayout.setVerticalGroup(
            SHInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SHInicioLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(SHInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(HoraI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel9.setText("Aforo");

        Aforo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                AforoFocusLost(evt);
            }
        });

        javax.swing.GroupLayout SAforoLayout = new javax.swing.GroupLayout(SAforo);
        SAforo.setLayout(SAforoLayout);
        SAforoLayout.setHorizontalGroup(
            SAforoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SAforoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Aforo, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        SAforoLayout.setVerticalGroup(
            SAforoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SAforoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SAforoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(Aforo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jLabel10.setText("Hora de final");

        javax.swing.GroupLayout SHFinalLayout = new javax.swing.GroupLayout(SHFinal);
        SHFinal.setLayout(SHFinalLayout);
        SHFinalLayout.setHorizontalGroup(
            SHFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SHFinalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(HoraF, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        SHFinalLayout.setVerticalGroup(
            SHFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SHFinalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(SHFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(HoraF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addContainerGap())
        );

        jLabel5.setText("Fecha");

        javax.swing.GroupLayout SFechaLayout = new javax.swing.GroupLayout(SFecha);
        SFecha.setLayout(SFechaLayout);
        SFechaLayout.setHorizontalGroup(
            SFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SFechaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        SFechaLayout.setVerticalGroup(
            SFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SFechaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel1.setText("Introduzca nombre del evento ");
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N

        NombreE.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                NombreEFocusLost(evt);
            }
        });

        jLabel3.setText("¿Qué desea cambiar?");
        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        CNombre.setText("Nombre");
        CNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CNombreActionPerformed(evt);
            }
        });

        CUbicacion.setText("Ubicación");
        CUbicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CUbicacionActionPerformed(evt);
            }
        });

        CFecha.setText("Fecha");
        CFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CFechaActionPerformed(evt);
            }
        });

        CHInicio.setText("Hora iniocio");
        CHInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CHInicioActionPerformed(evt);
            }
        });

        CHFin.setText("Hora fin");
        CHFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CHFinActionPerformed(evt);
            }
        });

        CAforo.setText("Aforo");
        CAforo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CAforoActionPerformed(evt);
            }
        });

        Volver.setText("Volver");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CNombre)
                            .addComponent(CHInicio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CUbicacion)
                            .addComponent(CHFin))
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CFecha)
                            .addComponent(CAforo))
                        .addGap(72, 72, 72))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(SFecha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SUbicacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SHFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SAforo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SHInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(43, 43, 43))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(NombreE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(Volver)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NombreE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CNombre)
                            .addComponent(CFecha))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(CHInicio))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CAforo)))
                        .addGap(43, 43, 43))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CUbicacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CHFin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(SNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SHInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SHFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SAforo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(Volver)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private String ventana="cambiar";
    private String tipo;
    private String valor;
    private String ubicacion;
    private LocalDate dia;
    private LocalTime hora;
    private boolean seguir;
    private Matcher mat1;

    
    private void CNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CNombreActionPerformed
        SNombre.setVisible(true);
    }//GEN-LAST:event_CNombreActionPerformed

    private void CUbicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CUbicacionActionPerformed
        SUbicacion.setVisible(true);
    }//GEN-LAST:event_CUbicacionActionPerformed

    private void CFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CFechaActionPerformed
        SFecha.setVisible(true);
    }//GEN-LAST:event_CFechaActionPerformed

    private void CHInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CHInicioActionPerformed
        SHInicio.setVisible(true);
    }//GEN-LAST:event_CHInicioActionPerformed

    private void CHFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CHFinActionPerformed
        SHFinal.setVisible(true);
    }//GEN-LAST:event_CHFinActionPerformed

    private void CAforoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CAforoActionPerformed
        SAforo.setVisible(true);
    }//GEN-LAST:event_CAforoActionPerformed

    private void UbicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UbicacionActionPerformed
        ubicacion= (String) Ubicacion.getSelectedItem();
        tipo="ubicacion";
        valor=ubicacion;
        comprobar(tipo, valor);
        Ejercicio2.cambiar(NombreE.getText(),tipo,valor);
        
    }//GEN-LAST:event_UbicacionActionPerformed

    private void NombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NombreFocusLost
        tipo="nombre";
        valor=Nombre.getText();
        comprobar(tipo, valor);
        Ejercicio2.cambiar(NombreE.getText(),tipo,valor);
    }//GEN-LAST:event_NombreFocusLost

    private void NombreEFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NombreEFocusLost
        tipo="nombre";
        valor=Nombre.getText();
        comprobar(tipo, valor);
    }//GEN-LAST:event_NombreEFocusLost

    private void AforoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AforoFocusLost
        tipo="nombre";
        valor=Nombre.getText();
        comprobar(tipo, valor);
        Ejercicio2.cambiar(NombreE.getText(),tipo,valor);
    }//GEN-LAST:event_AforoFocusLost

    private void FechaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FechaFocusLost
        dia = Fecha.getDate();
        comprobar(tipo, valor);
        Ejercicio2.cambiarD(NombreE.getText(),tipo,dia);
    }//GEN-LAST:event_FechaFocusLost

    private void HoraIFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_HoraIFocusLost
        LocalTime hora=HoraI.getTime();
        tipo="horaI";
        comprobar(tipo, valor);
        Ejercicio2.cambiarH(NombreE.getText(),tipo,hora);
    }//GEN-LAST:event_HoraIFocusLost

    private void HoraFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_HoraFFocusLost
        hora=HoraF.getTime();
        tipo="horaF";
        comprobar(tipo, valor);
        Ejercicio2.cambiarH(NombreE.getText(),tipo,hora);
    }//GEN-LAST:event_HoraFFocusLost

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        Ejercicio2.volverAPrincipal(ventana);
    }//GEN-LAST:event_VolverActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaCambiar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCambiar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCambiar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCambiar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaCambiar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Aforo;
    private javax.swing.JCheckBox CAforo;
    private javax.swing.JCheckBox CFecha;
    private javax.swing.JCheckBox CHFin;
    private javax.swing.JCheckBox CHInicio;
    private javax.swing.JCheckBox CNombre;
    private javax.swing.JCheckBox CUbicacion;
    private javax.swing.ButtonGroup Elemento;
    private com.github.lgooddatepicker.components.DatePicker Fecha;
    private com.github.lgooddatepicker.components.TimePicker HoraF;
    private com.github.lgooddatepicker.components.TimePicker HoraI;
    private javax.swing.JLabel Label1;
    private javax.swing.JTextField Nombre;
    private javax.swing.JTextField NombreE;
    private javax.swing.JPanel SAforo;
    private javax.swing.JPanel SFecha;
    private javax.swing.JPanel SHFinal;
    private javax.swing.JPanel SHInicio;
    private javax.swing.JPanel SNombre;
    private javax.swing.JPanel SUbicacion;
    private javax.swing.JComboBox<String> Ubicacion;
    private javax.swing.JButton Volver;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox3;
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
    // End of variables declaration//GEN-END:variables

    private void rellenar() {
        ubicacion=Ejercicio2.tomarUbicacion();
        Ubicacion.addItem(ubicacion); 
    }

    private void comprobar(String tipo, String valor) {
       if(valor.isEmpty()){
            if(tipo.equals("nombreE")){
                JOptionPane.showMessageDialog(null,"Tiene que rellenar el apartado del nombre del acontecimiento cuyos datos desea cambiar");
            }
            
            else{
                JOptionPane.showMessageDialog(null,"Tiene que rellenar el apartado "+tipo);
            }
       }
       
       else{
           mat1=patl.matcher(valor);
           if (mat1.matches()){
            do{
                Ejercicio2.comprobar(tipo, ventana, valor, NombreE.getText(), seguir);
                }while(seguir = false);
            }
       }
    }
}
