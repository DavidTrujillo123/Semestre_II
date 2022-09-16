/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.varios;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class Formulario extends javax.swing.JFrame{

    public Formulario() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        panelSecundiario = new javax.swing.JPanel();
        panelDibujarTorre1 = new javax.swing.JPanel();
        btnCrear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtNbloques = new javax.swing.JTextPane();
        btnT1toT2 = new javax.swing.JButton();
        btnT2toT1 = new javax.swing.JButton();
        panelDibujarTorre2 = new javax.swing.JPanel();
        btnT3toT1 = new javax.swing.JButton();
        panelDibujarTorre3 = new javax.swing.JPanel();
        btnT1toT3 = new javax.swing.JButton();
        btnT2toT3 = new javax.swing.JButton();
        btnT3toT2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelDibujarTorre1.setBackground(new java.awt.Color(153, 153, 255));
        panelDibujarTorre1.setPreferredSize(new java.awt.Dimension(200, 400));

        javax.swing.GroupLayout panelDibujarTorre1Layout = new javax.swing.GroupLayout(panelDibujarTorre1);
        panelDibujarTorre1.setLayout(panelDibujarTorre1Layout);
        panelDibujarTorre1Layout.setHorizontalGroup(
            panelDibujarTorre1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        panelDibujarTorre1Layout.setVerticalGroup(
            panelDibujarTorre1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        btnCrear.setText("CREAR");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        txtNbloques.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtNbloques.setText("3");
        jScrollPane1.setViewportView(txtNbloques);

        btnT1toT2.setText("T1 A T2");
        btnT1toT2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnT1toT2ActionPerformed(evt);
            }
        });

        btnT2toT1.setText("T2 A T1");
        btnT2toT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnT2toT1ActionPerformed(evt);
            }
        });

        panelDibujarTorre2.setBackground(new java.awt.Color(153, 153, 255));
        panelDibujarTorre2.setPreferredSize(new java.awt.Dimension(200, 400));

        javax.swing.GroupLayout panelDibujarTorre2Layout = new javax.swing.GroupLayout(panelDibujarTorre2);
        panelDibujarTorre2.setLayout(panelDibujarTorre2Layout);
        panelDibujarTorre2Layout.setHorizontalGroup(
            panelDibujarTorre2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        panelDibujarTorre2Layout.setVerticalGroup(
            panelDibujarTorre2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        btnT3toT1.setText("T3 A T1");
        btnT3toT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnT3toT1ActionPerformed(evt);
            }
        });

        panelDibujarTorre3.setBackground(new java.awt.Color(153, 153, 255));
        panelDibujarTorre3.setPreferredSize(new java.awt.Dimension(200, 400));

        javax.swing.GroupLayout panelDibujarTorre3Layout = new javax.swing.GroupLayout(panelDibujarTorre3);
        panelDibujarTorre3.setLayout(panelDibujarTorre3Layout);
        panelDibujarTorre3Layout.setHorizontalGroup(
            panelDibujarTorre3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        panelDibujarTorre3Layout.setVerticalGroup(
            panelDibujarTorre3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        btnT1toT3.setText("T1 A T3");
        btnT1toT3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnT1toT3ActionPerformed(evt);
            }
        });

        btnT2toT3.setText("T2 A T3");
        btnT2toT3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnT2toT3ActionPerformed(evt);
            }
        });

        btnT3toT2.setText("T3 A T2");
        btnT3toT2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnT3toT2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelSecundiarioLayout = new javax.swing.GroupLayout(panelSecundiario);
        panelSecundiario.setLayout(panelSecundiarioLayout);
        panelSecundiarioLayout.setHorizontalGroup(
            panelSecundiarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSecundiarioLayout.createSequentialGroup()
                .addGroup(panelSecundiarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSecundiarioLayout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(panelDibujarTorre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelSecundiarioLayout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addGroup(panelSecundiarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnT1toT3)
                            .addComponent(btnT1toT2))))
                .addGroup(panelSecundiarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSecundiarioLayout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(panelDibujarTorre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelSecundiarioLayout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addGroup(panelSecundiarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnT2toT3)
                            .addComponent(btnT2toT1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addGroup(panelSecundiarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelDibujarTorre3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelSecundiarioLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCrear))
                    .addGroup(panelSecundiarioLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(panelSecundiarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnT3toT2)
                            .addComponent(btnT3toT1))))
                .addGap(112, 112, 112))
        );
        panelSecundiarioLayout.setVerticalGroup(
            panelSecundiarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSecundiarioLayout.createSequentialGroup()
                .addGroup(panelSecundiarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSecundiarioLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btnCrear))
                    .addGroup(panelSecundiarioLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(panelSecundiarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSecundiarioLayout.createSequentialGroup()
                        .addGap(0, 6, Short.MAX_VALUE)
                        .addComponent(btnT3toT1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnT3toT2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelDibujarTorre3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelSecundiarioLayout.createSequentialGroup()
                        .addGroup(panelSecundiarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelSecundiarioLayout.createSequentialGroup()
                                .addGroup(panelSecundiarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnT1toT2)
                                    .addComponent(btnT2toT1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnT1toT3)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSecundiarioLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnT2toT3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelSecundiarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelDibujarTorre1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelDibujarTorre2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSecundiario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSecundiario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        t1 = new Torre(Integer.parseInt(txtNbloques.getText()));
        t2 = new Torre(Integer.parseInt(txtNbloques.getText()));
        t3 = new Torre(Integer.parseInt(txtNbloques.getText()));
        
        Bloque1 b;
        int x, y, largo, alto;
        x = 10;
        y = 300;
        largo = 185;
        alto = 50;
        for (int i = 0; i < t1.bloques.length; i++) {
            b = new Bloque1(x, y, largo, alto);
            t1.Apilar(b);
            x+=25;
            y -=50;
            largo -= 50;
        }
        for (int i = 0; i < t1.bloques.length; i++) {
            panelDibujarTorre1.add(t1.getPanel(i));
        }
        
        panelDibujarTorre1.revalidate();
        panelDibujarTorre1.repaint();
         
    }//GEN-LAST:event_btnCrearActionPerformed
    private void Dibujar(Torre t, JPanel panelDibuja){
        System.out.println(t);
        Bloque1 b;
        int cont=0;
        
        for (int i = 0; i < t.bloques.length; i++) {
            if(t.bloques[i]!=null){
                panelDibuja.add(t.getPanel(i)); 
                //cont++;
            }else cont++;   
        }
        if(cont == t.bloques.length){
            panelDibuja.removeAll();
        }
        panelDibuja.revalidate();
        panelDibuja.repaint();
    }
    public boolean Comprobar(Torre t){
        
        for (int i = 0; i < t.bloques.length; i++) {
            if(t.bloques[i] == null || t==t1){
                return false;
            }
        }
        return true;
    }
    public void Limpiar(){
        panelDibujarTorre1.removeAll();
        panelDibujarTorre2.removeAll();
        panelDibujarTorre3.removeAll();
        panelDibujarTorre1.revalidate();panelDibujarTorre2.revalidate();panelDibujarTorre3.revalidate();
        panelDibujarTorre1.repaint();panelDibujarTorre2.repaint();panelDibujarTorre3.repaint();
        t1.Limpiar();
        t2.Limpiar();
        t3.Limpiar();
    }
    private void btnT1toT2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnT1toT2ActionPerformed
        
        t1.Mover(t2);
        
        Dibujar(t2, panelDibujarTorre2);
        Dibujar(t1, panelDibujarTorre1);
        if(Comprobar(t2)){
            JOptionPane.showMessageDialog(null, "HAS GANADOOO...");
            Limpiar();
        }
    }//GEN-LAST:event_btnT1toT2ActionPerformed
    
    private void btnT2toT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnT2toT1ActionPerformed
        t2.Mover(t1);
        Dibujar(t1, panelDibujarTorre1);
        Dibujar(t2, panelDibujarTorre2);
        if(Comprobar(t1)){
            JOptionPane.showMessageDialog(null, "HAS GANADOOO...");
            Limpiar();
        }
    }//GEN-LAST:event_btnT2toT1ActionPerformed

    private void btnT3toT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnT3toT1ActionPerformed
        t3.Mover(t1);
        Dibujar(t1, panelDibujarTorre1);
        Dibujar(t3, panelDibujarTorre3);
        if(Comprobar(t1)){
            JOptionPane.showMessageDialog(null, "HAS GANADOOO...");
            Limpiar();
        }
    }//GEN-LAST:event_btnT3toT1ActionPerformed

    private void btnT1toT3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnT1toT3ActionPerformed
        t1.Mover(t3);
        Dibujar(t3, panelDibujarTorre3);
        Dibujar(t1, panelDibujarTorre1);
        if(Comprobar(t3)){
            JOptionPane.showMessageDialog(null, "HAS GANADOOO...");
            Limpiar();
        }
    }//GEN-LAST:event_btnT1toT3ActionPerformed

    private void btnT2toT3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnT2toT3ActionPerformed
        t2.Mover(t3);
        Dibujar(t3, panelDibujarTorre3);
        Dibujar(t2, panelDibujarTorre2);
        if(Comprobar(t3)){
            JOptionPane.showMessageDialog(null, "HAS GANADOOO...");
            Limpiar();
        }
    }//GEN-LAST:event_btnT2toT3ActionPerformed

    private void btnT3toT2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnT3toT2ActionPerformed
        t3.Mover(t2);
        Dibujar(t2, panelDibujarTorre2);
        Dibujar(t3, panelDibujarTorre3);
        if(Comprobar(t2)){
            JOptionPane.showMessageDialog(null, "HAS GANADOOO...");
            Limpiar();
        }
    }//GEN-LAST:event_btnT3toT2ActionPerformed
    
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Formulario().setVisible(true);
//            }
//        });
//    }
    
    //Mis atributos
    public Torre t1,t2,t3;
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnT1toT2;
    private javax.swing.JButton btnT1toT3;
    private javax.swing.JButton btnT2toT1;
    private javax.swing.JButton btnT2toT3;
    private javax.swing.JButton btnT3toT1;
    private javax.swing.JButton btnT3toT2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelDibujarTorre1;
    private javax.swing.JPanel panelDibujarTorre2;
    private javax.swing.JPanel panelDibujarTorre3;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelSecundiario;
    private javax.swing.JTextPane txtNbloques;
    // End of variables declaration//GEN-END:variables
}
