/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package paquete1;

import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class Formulario extends javax.swing.JFrame {

   
    public Formulario() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCrearCuenta = new javax.swing.JButton();
        bntConsultaCuenta = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnMovimientos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BANCO");

        btnCrearCuenta.setText("CREAR NUEVA CUENTA");
        btnCrearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearCuentaActionPerformed(evt);
            }
        });

        bntConsultaCuenta.setText("CONSULTAR CUENTA");
        bntConsultaCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntConsultaCuentaActionPerformed(evt);
            }
        });

        jLabel1.setText("CUENTA BANCARIA");

        btnMovimientos.setText("MOVIMIENTOS");
        btnMovimientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMovimientosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(btnCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addComponent(bntConsultaCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnMovimientos, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(166, 166, 166))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCrearCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                    .addComponent(bntConsultaCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnMovimientos, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearCuentaActionPerformed
        // TODO add your handling code here:
        if(vc == null) vc = new VentanaCrearCuenta();
        vc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCrearCuentaActionPerformed

    private void bntConsultaCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntConsultaCuentaActionPerformed
        // TODO add your handling code here:
        
        int id = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL ID DEL USUARIO: "));
        
        Cuenta c1 = vc.usuarios[id];
        
        if(c1 != null){
            vcon = new VentanaConsultar(c1);
            vcon.setVisible(true);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "USUARIO NO ENCONTRADO");
        }
        
    }//GEN-LAST:event_bntConsultaCuentaActionPerformed

    private void btnMovimientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMovimientosActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL ID DEL USUARIO: "));
        
        Cuenta c1 = vc.usuarios[id];
        
        if(c1 != null){
            mov = new VentanaMovimientos(c1);
            mov.setVisible(true);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "USUARIO NO ENCONTRADO");
        }
        
    }//GEN-LAST:event_btnMovimientosActionPerformed
  
    
    
    //Mis Atributos
    //public static int id;
    VentanaCrearCuenta vc;
    VentanaConsultar vcon;
    VentanaMovimientos mov;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntConsultaCuenta;
    private javax.swing.JButton btnCrearCuenta;
    private javax.swing.JButton btnMovimientos;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
