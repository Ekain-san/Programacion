/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Errores.OrdenNoValido;
import javax.swing.JOptionPane;
import ejercicio1.Ejercicio1;

/**
 *
 * @author Asus
 */
public class Ventana1 extends javax.swing.JFrame {

    private Integer aciertos;
    private Integer fallos;
    private Integer intentos;
    
    public Ventana1() {
        initComponents();
        // Centrar la ventana
        setLocationRelativeTo(null);
        // inicialización de variables
        aciertos = 0;
        fallos = 0;
        intentos = 0;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Nombre_Numero1 = new javax.swing.JLabel();
        Numero1 = new javax.swing.JTextField();
        Nombre_Numero2 = new javax.swing.JLabel();
        Numero2 = new javax.swing.JTextField();
        suma = new javax.swing.JLabel();
        igual_a = new javax.swing.JLabel();
        Solucion = new javax.swing.JTextField();
        Intentos = new javax.swing.JLabel();
        Cantidad_Intentos = new javax.swing.JTextField();
        Faltas = new javax.swing.JLabel();
        Cantidad_Aciertos = new javax.swing.JTextField();
        Nombre_Solucion = new javax.swing.JLabel();
        Aciertos = new javax.swing.JLabel();
        Cantidad_Faltas = new javax.swing.JTextField();
        Activar = new javax.swing.JButton();
        Comprobar = new javax.swing.JButton();
        Salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Nombre_Numero1.setText("Numero1:");

        Numero1.setEnabled(false);
        Numero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Numero1ActionPerformed(evt);
            }
        });

        Nombre_Numero2.setText("Numero 2:");

        Numero2.setEnabled(false);
        Numero2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Numero2ActionPerformed(evt);
            }
        });

        suma.setText("+");

        igual_a.setText("=");

        Solucion.setEnabled(false);
        Solucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SolucionActionPerformed(evt);
            }
        });

        Intentos.setText("Intentos:");

        Cantidad_Intentos.setText("0");
        Cantidad_Intentos.setEnabled(false);
        Cantidad_Intentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cantidad_IntentosActionPerformed(evt);
            }
        });

        Faltas.setText("Faltas:");

        Cantidad_Aciertos.setText("0");
        Cantidad_Aciertos.setEnabled(false);
        Cantidad_Aciertos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cantidad_AciertosActionPerformed(evt);
            }
        });

        Nombre_Solucion.setText("Resultado:");

        Aciertos.setText("Aciertos:");

        Cantidad_Faltas.setText("0");
        Cantidad_Faltas.setEnabled(false);

        Activar.setText("Activar");
        Activar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActivarActionPerformed(evt);
            }
        });

        Comprobar.setText("Comprobar");
        Comprobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprobarActionPerformed(evt);
            }
        });

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(Faltas))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Nombre_Numero1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Cantidad_Faltas, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Numero1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(suma, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(Aciertos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Cantidad_Aciertos, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(Intentos, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Cantidad_Intentos, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Nombre_Numero2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Numero2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(igual_a)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Nombre_Solucion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Solucion, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(Activar)
                        .addGap(18, 18, 18)
                        .addComponent(Comprobar)
                        .addGap(18, 18, 18)
                        .addComponent(Salir)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Numero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nombre_Numero2)
                    .addComponent(Numero2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(suma)
                    .addComponent(igual_a)
                    .addComponent(Solucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nombre_Solucion)
                    .addComponent(Nombre_Numero1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Intentos, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cantidad_Intentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cantidad_Aciertos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Aciertos)
                    .addComponent(Faltas)
                    .addComponent(Cantidad_Faltas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Salir)
                    .addComponent(Comprobar)
                    .addComponent(Activar))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Numero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Numero1ActionPerformed
          
    }//GEN-LAST:event_Numero1ActionPerformed

    private void Numero2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Numero2ActionPerformed
       
    }//GEN-LAST:event_Numero2ActionPerformed

    private void SolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SolucionActionPerformed
     
    }//GEN-LAST:event_SolucionActionPerformed

    private void Cantidad_IntentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cantidad_IntentosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cantidad_IntentosActionPerformed

    private void Cantidad_AciertosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cantidad_AciertosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cantidad_AciertosActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
       Ejercicio1.salir();
    }//GEN-LAST:event_SalirActionPerformed

    private void ActivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActivarActionPerformed
       Integer numero = (int)(Math.random()*1000);
        Numero1.setText(numero.toString());
        numero = (int)(Math.random()*1000);
        Numero2.setText(numero.toString());
    }//GEN-LAST:event_ActivarActionPerformed

    private void ComprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprobarActionPerformed
          try{
            if (Numero1.getText().isEmpty())
                throw new OrdenNoValido();
            intentos += 1;
            Cantidad_Intentos.setText(intentos.toString());
            int resultado = Integer.parseInt(JOptionPane.showInputDialog(this,"Introduce valor"));
            Integer resultadoReal = Integer.parseInt(Numero1.getText()) + Integer.parseInt(Numero2.getText());
            // tfResultado.setText(resultadoReal.toString());
            if (resultadoReal == resultado){
                aciertos += 1;
                Cantidad_Aciertos.setText(aciertos.toString());
                // Inicializo
                Numero1.setText("");
                Numero2.setText("");
            }
            else{
                fallos += 1;
                Cantidad_Faltas.setText(fallos.toString());
            }
        }
        catch(OrdenNoValido e)
        {
            JOptionPane.showMessageDialog(this,"Antes de adivinar el resultado hay que generar los números");
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(this,"El resultado debe ser un dato numérico");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,"Problemas");
           Ejercicio1.salir();
        }
    }//GEN-LAST:event_ComprobarActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Aciertos;
    private javax.swing.JButton Activar;
    private javax.swing.JTextField Cantidad_Aciertos;
    private javax.swing.JTextField Cantidad_Faltas;
    private javax.swing.JTextField Cantidad_Intentos;
    private javax.swing.JButton Comprobar;
    private javax.swing.JLabel Faltas;
    private javax.swing.JLabel Intentos;
    private javax.swing.JLabel Nombre_Numero1;
    private javax.swing.JLabel Nombre_Numero2;
    private javax.swing.JLabel Nombre_Solucion;
    private javax.swing.JTextField Numero1;
    private javax.swing.JTextField Numero2;
    private javax.swing.JButton Salir;
    private javax.swing.JTextField Solucion;
    private javax.swing.JLabel igual_a;
    private javax.swing.JLabel suma;
    // End of variables declaration//GEN-END:variables
}
