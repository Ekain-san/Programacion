/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

/**
 *
 * @author Asus
 */import ejercicio1.Ejercicio1;
public class VentanaEmpresa extends javax.swing.JFrame {

    /**
     * Creates new form VentanaEmpresa
     */
    public VentanaEmpresa() {
        initComponents();
    }
    private String tipo;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jPopupMenu3 = new javax.swing.JPopupMenu();
        jRadioButtonMenuItem3 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem4 = new javax.swing.JRadioButtonMenuItem();
        Bienvenida = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Alta = new javax.swing.JRadioButtonMenuItem();
        Modificar = new javax.swing.JRadioButtonMenuItem();
        Baja = new javax.swing.JRadioButtonMenuItem();
        PorNumeroEmpleado = new javax.swing.JMenu();
        PorNumero = new javax.swing.JRadioButtonMenuItem();
        PorContrato = new javax.swing.JRadioButtonMenuItem();
        PorDepartamento = new javax.swing.JRadioButtonMenuItem();
        Salir = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem4.setText("jMenuItem4");

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenuItem6.setText("jMenuItem6");

        jRadioButtonMenuItem3.setSelected(true);
        jRadioButtonMenuItem3.setText("jRadioButtonMenuItem3");

        jRadioButtonMenuItem4.setSelected(true);
        jRadioButtonMenuItem4.setText("jRadioButtonMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Bienvenida.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        Bienvenida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BienvenidaActionPerformed(evt);
            }
        });

        jMenu1.setText("Personas");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        Alta.setSelected(true);
        Alta.setText("Alta");
        Alta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AltaActionPerformed(evt);
            }
        });
        jMenu1.add(Alta);

        Modificar.setSelected(true);
        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });
        jMenu1.add(Modificar);

        Baja.setSelected(true);
        Baja.setText("Baja");
        Baja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BajaActionPerformed(evt);
            }
        });
        jMenu1.add(Baja);

        PorNumeroEmpleado.setText("Listado");

        PorNumero.setSelected(true);
        PorNumero.setText("Por numero de empleado");
        PorNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PorNumeroActionPerformed(evt);
            }
        });
        PorNumeroEmpleado.add(PorNumero);

        PorContrato.setSelected(true);
        PorContrato.setText("Por cotrato");
        PorContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PorContratoActionPerformed(evt);
            }
        });
        PorNumeroEmpleado.add(PorContrato);

        PorDepartamento.setSelected(true);
        PorDepartamento.setText("Por departamento");
        PorDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PorDepartamentoActionPerformed(evt);
            }
        });
        PorNumeroEmpleado.add(PorDepartamento);

        jMenu1.add(PorNumeroEmpleado);

        jMenuBar1.add(jMenu1);

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        jMenuBar1.add(Salir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(Bienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addComponent(Bienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BajaActionPerformed
       tipo="baja";
        Ejercicio1.iniciarCambios(tipo);
    }//GEN-LAST:event_BajaActionPerformed

    private void PorNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PorNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PorNumeroActionPerformed

    private void BienvenidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BienvenidaActionPerformed
        Ejercicio1.mostrar_bienvenida();
    }//GEN-LAST:event_BienvenidaActionPerformed

    private void AltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AltaActionPerformed
        tipo="alta";
        Ejercicio1.iniciarCambios(tipo);
    }//GEN-LAST:event_AltaActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        Ejercicio1.salir();
    }//GEN-LAST:event_SalirActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        tipo="modificar";
        Ejercicio1.iniciarCambios(tipo);
    }//GEN-LAST:event_ModificarActionPerformed

    private void PorContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PorContratoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PorContratoActionPerformed

    private void PorDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PorDepartamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PorDepartamentoActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaEmpresa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButtonMenuItem Alta;
    private javax.swing.JRadioButtonMenuItem Baja;
    private javax.swing.JTextField Bienvenida;
    private javax.swing.JRadioButtonMenuItem Modificar;
    private javax.swing.JRadioButtonMenuItem PorContrato;
    private javax.swing.JRadioButtonMenuItem PorDepartamento;
    private javax.swing.JRadioButtonMenuItem PorNumero;
    private javax.swing.JMenu PorNumeroEmpleado;
    private javax.swing.JMenu Salir;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JPopupMenu jPopupMenu3;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem3;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem4;
    // End of variables declaration//GEN-END:variables
}
