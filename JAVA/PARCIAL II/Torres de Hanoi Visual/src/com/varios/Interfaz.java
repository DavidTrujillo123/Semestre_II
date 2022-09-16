/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.varios;

import java.awt.Color;
import java.awt.Panel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Graphics;

/**
 *
 * @author Asus
 */
public class Interfaz extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    Graphics g;
    public Interfaz() {
        initComponents();
        g = jPanel1.getGraphics();
        jPanel1.paintComponents(g);
        BotonTransparente();
    }
    public void BotonTransparente(){
        this.btnTorre1.setOpaque(false);
        this.btnTorre1.setContentAreaFilled(false);
        this.btnTorre1.setBorderPainted(false);
        this.btnTorre2.setOpaque(false);
        this.btnTorre2.setContentAreaFilled(false);
        this.btnTorre2.setBorderPainted(false);
        this.btnTorre3.setOpaque(false);
        this.btnTorre3.setContentAreaFilled(false);
        this.btnTorre3.setBorderPainted(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCrear = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnTorre1 = new javax.swing.JButton();
        btnTorre2 = new javax.swing.JButton();
        btnTorre3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCrear.setText("CREAR");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setForeground(new java.awt.Color(153, 153, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 400));

        btnTorre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTorre1ActionPerformed(evt);
            }
        });

        btnTorre2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTorre2ActionPerformed(evt);
            }
        });

        btnTorre3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTorre3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(btnTorre1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(169, 169, 169)
                .addComponent(btnTorre2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTorre3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnTorre3, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTorre2, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTorre1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap(1016, Short.MAX_VALUE)
                        .addComponent(btnCrear)))
                .addGap(72, 72, 72))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(btnCrear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        // TODO add your handling code here:
        
        int n = 5;
        disco_Torre1 = new JPanel[n];
        
        //Llenar arreglo de paneles
        for (int i = 0; i < disco_Torre1.length; i++) {
            disco_Torre1[i] = new JPanel();
        }
        
        int aux =0;
        int base = 250;
        int altura = 40;
        int x = 20;
        int y = 300;
        int iter;
        
        //Inicializar los paneles
        for (int i = 0; i < disco_Torre1.length; i++) {
            disco_Torre1[i].setBounds(x, y, base, altura);
            x+=25;
            y-=40;
            base -= 50;
            
            
            disco_Torre1[i].setBackground(Color.red);
            disco_Torre1[i].setBorder(new LineBorder(Color.yellow));
            //discos[i].setVisible(true);
            jPanel1.add(disco_Torre1[i]);
        }
        //Dibujo de torres
        JPanel torre1 = new JPanel();
        torre1.setBounds(140, 120, 10, 200);
        torre1.setBackground(Color.BLACK);
        
        jPanel1.add(torre1);
        
        JPanel torre2 = new JPanel();
        torre2.setBounds(440, 120, 10, 200);
        torre2.setBackground(Color.BLACK);
        
        jPanel1.add(torre2);
        
        JPanel torre3 = new JPanel();
        torre3.setBounds(740, 120, 10, 200);
        torre3.setBackground(Color.BLACK);
        
        jPanel1.add(torre3);
        
        //Dibuja
        jPanel1.revalidate();
        jPanel1.repaint();
        
        cont = n-1;
        disco_Torre2 = new JPanel[n];
        disco_Torre3 = new JPanel[n];
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnTorre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTorre1ActionPerformed
        // TODO add your handling code here:   
        int iter = -1;
        //selecDisco = disco_Torre1[4];
        //disco_Torre1[4].setLocation(125, 50);
         
        for (int i = disco_Torre1.length-1; i >= 0; i--) {
            if(disco_Torre1[i] != null){
                iter = i;
                i = -1;
            }
            System.out.println(i);
        }
        
        if(iter >= 0){
            selecDisco = disco_Torre1[iter];
            disco_Torre1[iter].setLocation(125, 50);
            disco_Torre1[iter] = null;
        }
        jPanel1.revalidate();
        jPanel1.repaint();
    }//GEN-LAST:event_btnTorre1ActionPerformed
    
    private void btnTorre2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTorre2ActionPerformed
        // TODO add your handling code here:
            disco_Torre2[cont] = (JPanel)selecDisco;
            disco_Torre2[cont].setLocation(420, 300);
            jPanel1.add(disco_Torre2[cont]);
        jPanel1.revalidate();
        jPanel1.repaint();   
    }//GEN-LAST:event_btnTorre2ActionPerformed

    private void btnTorre3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTorre3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTorre3ActionPerformed

    
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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Interfaz().setVisible(true);
//            }
//        });
    }
    //Mis atibutos
    private JPanel[] disco_Torre1;
    private JPanel[] disco_Torre2;
    private JPanel[] disco_Torre3;
    private boolean comprobar = false;
    private Object selecDisco;
    private static int cont = 0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnTorre1;
    private javax.swing.JButton btnTorre2;
    private javax.swing.JButton btnTorre3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
