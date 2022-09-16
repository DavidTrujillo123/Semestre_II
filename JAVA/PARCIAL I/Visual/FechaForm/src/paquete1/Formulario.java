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

    /**
     * Creates new form Formulario
     */
    public Formulario() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDia1 = new javax.swing.JTextField();
        txtMes1 = new javax.swing.JTextField();
        txtAnio1 = new javax.swing.JTextField();
        btnAumentar1 = new javax.swing.JButton();
        btnDecrementar1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtDia2 = new javax.swing.JTextField();
        txtMes2 = new javax.swing.JTextField();
        txtAnio2 = new javax.swing.JTextField();
        btnAumentar2 = new javax.swing.JButton();
        btnDecrementar2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnComparar = new javax.swing.JButton();
        btnBisiesto = new javax.swing.JButton();
        btnAumentarNdiasf1 = new javax.swing.JButton();
        btnAumentarNdiasf2 = new javax.swing.JButton();
        btnEdad = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FECHA");

        jLabel1.setText("FECHA");

        jLabel2.setText("FECHA 1");

        jLabel3.setText("DD/MM/AA");

        txtDia1.setText("18");

        txtMes1.setText("5");

        txtAnio1.setText("2001");

        btnAumentar1.setText("+");
        btnAumentar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAumentar1ActionPerformed(evt);
            }
        });

        btnDecrementar1.setText("-");
        btnDecrementar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecrementar1ActionPerformed(evt);
            }
        });

        jLabel4.setText("DD/MM/AA");

        txtDia2.setText("14");

        txtMes2.setText("5");

        txtAnio2.setText("2022");
        txtAnio2.setToolTipText("");

        btnAumentar2.setText("+");
        btnAumentar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAumentar2ActionPerformed(evt);
            }
        });

        btnDecrementar2.setText("-");
        btnDecrementar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecrementar2ActionPerformed(evt);
            }
        });

        jLabel5.setText("FECHA 2");

        btnComparar.setText("COMPARAR");
        btnComparar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompararActionPerformed(evt);
            }
        });

        btnBisiesto.setText("BISIESTO");
        btnBisiesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBisiestoActionPerformed(evt);
            }
        });

        btnAumentarNdiasf1.setText("AUMENTAR N DIAS");
        btnAumentarNdiasf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAumentarNdiasf1ActionPerformed(evt);
            }
        });

        btnAumentarNdiasf2.setText("AUMENTAR N DIAS");
        btnAumentarNdiasf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAumentarNdiasf2ActionPerformed(evt);
            }
        });

        btnEdad.setText("EDAD");
        btnEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEdadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(281, 281, 281)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnComparar)
                .addGap(215, 215, 215))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(btnAumentarNdiasf1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(99, 99, 99)
                            .addComponent(txtDia1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtMes1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtAnio1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(127, 127, 127)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(9, 9, 9)
                                    .addComponent(jLabel2))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(118, 118, 118)
                            .addComponent(btnAumentar1)
                            .addGap(18, 18, 18)
                            .addComponent(btnDecrementar1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEdad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBisiesto, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addComponent(jLabel5)
                            .addGap(44, 44, 44))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtDia2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMes2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAnio2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(btnAumentar2)
                                .addGap(18, 18, 18)
                                .addComponent(btnDecrementar2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(btnAumentarNdiasf2))
                .addGap(60, 60, 60))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtDia1, txtMes1});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAumentar1, btnDecrementar1});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAumentar2, btnDecrementar2});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDia2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMes2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAnio2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAumentar2)
                            .addComponent(btnDecrementar2))
                        .addGap(6, 6, 6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAnio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAumentar1)
                            .addComponent(btnDecrementar1))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(btnAumentarNdiasf1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(btnComparar)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btnAumentarNdiasf2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnBisiesto)))))
                .addGap(18, 18, 18)
                .addComponent(btnEdad)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtAnio1, txtDia1, txtMes1});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAumentar1, btnDecrementar1});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAumentar2, btnDecrementar2});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LlenarDatosf1(){
        int dia = Integer.parseInt(txtDia1.getText());
        int mes = Integer.parseInt(txtMes1.getText());
        int anio = Integer.parseInt(txtAnio1.getText());
        
        if(f1 == null) f1 = new Fecha(dia, mes, anio);
        else{
            f1.setDia(dia);
            f1.setMes(mes);
            f1.setAnio(anio);
        }
    }
    private void LlenarDatosf2(){
        int dia = Integer.parseInt(txtDia2.getText());
        int mes = Integer.parseInt(txtMes2.getText());
        int anio = Integer.parseInt(txtAnio2.getText());
        
        if(f2 == null) f2 = new Fecha(dia, mes, anio);
        else{
            f2.setDia(dia);
            f2.setMes(mes);
            f2.setAnio(anio);
        }
    }
    private void PonerDatos1(){
        txtDia1.setText(f1.getDia()+"");
        txtMes1.setText(f1.getMes()+"");
        txtAnio1.setText(f1.getAnio()+"");
    }
    private void PonerDatos2(){
        txtDia2.setText(f2.getDia()+"");
        txtMes2.setText(f2.getMes()+"");
        txtAnio2.setText(f2.getAnio()+"");
    }
    private void btnAumentar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAumentar1ActionPerformed
        // TODO add your handling code here:
        
        LlenarDatosf1();  
        f1.IncrementarDia();
        PonerDatos1();
    }//GEN-LAST:event_btnAumentar1ActionPerformed

    private void btnDecrementar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecrementar1ActionPerformed
        LlenarDatosf1();
        f1.DecrementarDia();
        PonerDatos1();
        
    }//GEN-LAST:event_btnDecrementar1ActionPerformed

    private void btnAumentar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAumentar2ActionPerformed
        // TODO add your handling code here:
        LlenarDatosf2();
        f2.IncrementarDia();
        PonerDatos2();
    }//GEN-LAST:event_btnAumentar2ActionPerformed

    private void btnDecrementar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecrementar2ActionPerformed
        // TODO add your handling code here:
        LlenarDatosf2();
        f2.DecrementarDia();
        PonerDatos2();
    }//GEN-LAST:event_btnDecrementar2ActionPerformed

    private void btnCompararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompararActionPerformed
        // TODO add your handling code here:
        LlenarDatosf1();
        LlenarDatosf2();
        String c;
        int comparar = f1.Comparar(f2);
        if(comparar == 1){
            c ="La fecha 1 es mayor";
        }
        else if(comparar == -1){
            c ="La fecha 2 es mayor";
        }
        else c = "Las fechas son iguales";
        JOptionPane.showMessageDialog(null, c);
        
    }//GEN-LAST:event_btnCompararActionPerformed

    private void btnBisiestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBisiestoActionPerformed
        // TODO add your handling code here:
        LlenarDatosf1();
        LlenarDatosf2();
        String c = "";
        
        if(f1.AnioBisiesto()) c += "Fecha 1 --> Bisiesto\n";
        else c += "Fecha 1 ---> NO bisiesto\n";
        
        if(f2.AnioBisiesto()) c += "La fecha 2 --> Bisiesto";
        else c += "Fecha 2 ---> NO bisiesto";
        
        JOptionPane.showMessageDialog(null, c);
    }//GEN-LAST:event_btnBisiestoActionPerformed

    private void btnAumentarNdiasf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAumentarNdiasf1ActionPerformed
        // TODO add your handling code here:
        LlenarDatosf1();
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Número de dias a aumentar:"));
        f1.IncrementarDia(num);
        JOptionPane.showMessageDialog(null, "Nueva fecha: "+f1.Imprimir());
        PonerDatos1();
    }//GEN-LAST:event_btnAumentarNdiasf1ActionPerformed

    private void btnAumentarNdiasf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAumentarNdiasf2ActionPerformed
        // TODO add your handling code here:
        LlenarDatosf2();
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Número de dias a aumentar:"));
        f2.IncrementarDia(num);
        JOptionPane.showMessageDialog(null, "Nueva fecha: "+f2.Imprimir());
        PonerDatos2();
    }//GEN-LAST:event_btnAumentarNdiasf2ActionPerformed

    private void btnEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEdadActionPerformed
        // TODO add your handling code here:
        
        LlenarDatosf1();
        LlenarDatosf2();
        f1 = f1.Edad(f2);
        JOptionPane.showMessageDialog(null, "DD/MM/AA\n"+"Edad: "+f1.Imprimir());
    }//GEN-LAST:event_btnEdadActionPerformed

    
    
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

    
    //Mis Atributos
    Fecha f1,f2;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAumentar1;
    private javax.swing.JButton btnAumentar2;
    private javax.swing.JButton btnAumentarNdiasf1;
    private javax.swing.JButton btnAumentarNdiasf2;
    private javax.swing.JButton btnBisiesto;
    private javax.swing.JButton btnComparar;
    private javax.swing.JButton btnDecrementar1;
    private javax.swing.JButton btnDecrementar2;
    private javax.swing.JButton btnEdad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtAnio1;
    private javax.swing.JTextField txtAnio2;
    private javax.swing.JTextField txtDia1;
    private javax.swing.JTextField txtDia2;
    private javax.swing.JTextField txtMes1;
    private javax.swing.JTextField txtMes2;
    // End of variables declaration//GEN-END:variables
}
