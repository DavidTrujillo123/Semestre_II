/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package paquete1;

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
        ordenar = new Orden();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelContenedor = new javax.swing.JPanel();
        lblPrevisualizar = new javax.swing.JLabel();
        txtVerAreglo = new javax.swing.JTextField();
        btnCrear = new javax.swing.JButton();
        btnOrdenar = new javax.swing.JButton();
        lblQuickSort = new javax.swing.JLabel();
        lblBurbuja = new javax.swing.JLabel();
        lblinsercion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtImprimirQuick = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtImprimirBurbuja = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtImprimirInsercion = new javax.swing.JTextArea();
        lblTamanio1 = new javax.swing.JLabel();
        txtTamanio = new javax.swing.JTextField();
        btnReiniciar = new javax.swing.JButton();
        lblPrevisualizar1 = new javax.swing.JLabel();
        txtVerAregloOrdenado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelContenedor.setPreferredSize(new java.awt.Dimension(850, 650));
        panelContenedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPrevisualizar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblPrevisualizar.setText("PREVISUALIZAR:");
        panelContenedor.add(lblPrevisualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 132, -1, -1));

        txtVerAreglo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        panelContenedor.add(txtVerAreglo, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 135, 552, 32));

        btnCrear.setText("CREAR");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });
        panelContenedor.add(btnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 81, 35));

        btnOrdenar.setText("ORDENAR");
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });
        panelContenedor.add(btnOrdenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, 136, 35));

        lblQuickSort.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblQuickSort.setText("QUICKSORT");
        panelContenedor.add(lblQuickSort, new org.netbeans.lib.awtextra.AbsoluteConstraints(647, 196, 149, -1));

        lblBurbuja.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblBurbuja.setText("BURBUJA");
        panelContenedor.add(lblBurbuja, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 196, 111, -1));

        lblinsercion.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblinsercion.setText("INSERCIÓN");
        panelContenedor.add(lblinsercion, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 196, 149, -1));

        txtImprimirQuick.setColumns(20);
        txtImprimirQuick.setRows(5);
        jScrollPane1.setViewportView(txtImprimirQuick);

        panelContenedor.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(601, 246, -1, 173));

        txtImprimirBurbuja.setColumns(20);
        txtImprimirBurbuja.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtImprimirBurbuja.setRows(5);
        jScrollPane2.setViewportView(txtImprimirBurbuja);

        panelContenedor.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 246, -1, 173));

        txtImprimirInsercion.setColumns(20);
        txtImprimirInsercion.setRows(5);
        jScrollPane3.setViewportView(txtImprimirInsercion);

        panelContenedor.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 246, -1, 173));

        lblTamanio1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTamanio1.setText("Tamaño:");
        panelContenedor.add(lblTamanio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        txtTamanio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTamanio.setText("10000");
        panelContenedor.add(txtTamanio, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 99, 32));

        btnReiniciar.setText("REINICIAR");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });
        panelContenedor.add(btnReiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 100, 35));

        lblPrevisualizar1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblPrevisualizar1.setText("PREVISUALIZAR:");
        panelContenedor.add(lblPrevisualizar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, -1, -1));

        txtVerAregloOrdenado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        panelContenedor.add(txtVerAregloOrdenado, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, 552, 32));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        // TODO add your handling code here:
        int tam = Integer.parseInt(this.txtTamanio.getText());
        A = new int[tam];
        ordenar.LlenarArreglo(A);
        
        B = A.clone();
        C = A.clone();
        
//        System.out.println(ordenar.Imprimir3primerosYultimos(B));
//        System.out.println(ordenar.Imprimir3primerosYultimos(C));
//        System.out.println(ordenar.Imprimir3primerosYultimos(A));
        this.txtVerAreglo.setText(ordenar.Imprimir3primerosYultimos(A));
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        // TODO add your handling code here:
        ordenar.BorrarTodo();
        A = null;
        B = null;
        C = null;
        txtImprimirBurbuja.setText("");
        txtImprimirInsercion.setText("");
        txtImprimirQuick.setText("");
        txtVerAreglo.setText("");
        txtVerAregloOrdenado.setText("");
        
        System.gc();
    }//GEN-LAST:event_btnReiniciarActionPerformed

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
        // TODO add your handling code here:
        long a = System.nanoTime();
        ordenar.Burbuja(A);
        long b = System.nanoTime() - a;
        System.out.println(b+"time");
        ordenar.Insercion(B);
        ordenar.QuickSort(C, 0, C.length-1);
        
        
        
        txtImprimirBurbuja.setText(ordenar.ImprimirBurbuja());
        txtImprimirInsercion.setText(ordenar.ImprimirInsercion());
        txtImprimirQuick.setText(ordenar.ImprimirQuick());
        txtVerAregloOrdenado.setText(ordenar.Imprimir3primerosYultimos(A));
        
        int ciclosTotales = (ordenar.ciclosBurbuja+ordenar.ciclosInsercion+ordenar.ciclosQuick);
        
        System.out.println("Ciclos totales: "+ciclosTotales);
        
//        System.out.println(ordenar.Imprimir3primerosYultimos(B));
//        System.out.println(ordenar.Imprimir3primerosYultimos(C));
//        System.out.println(ordenar.Imprimir3primerosYultimos(A));
    }//GEN-LAST:event_btnOrdenarActionPerformed
//
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
////        java.awt.EventQueue.invokeLater(new Runnable() {
////            public void run() {
////                new Formulario().setVisible(true);
////            }
////        });
//    }

    //Mis atributos
    private int[] A;
    private int[] B;
    private int[] C;
    private Orden ordenar;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblBurbuja;
    private javax.swing.JLabel lblPrevisualizar;
    private javax.swing.JLabel lblPrevisualizar1;
    private javax.swing.JLabel lblQuickSort;
    private javax.swing.JLabel lblTamanio1;
    private javax.swing.JLabel lblinsercion;
    private javax.swing.JPanel panelContenedor;
    private javax.swing.JTextArea txtImprimirBurbuja;
    private javax.swing.JTextArea txtImprimirInsercion;
    private javax.swing.JTextArea txtImprimirQuick;
    private javax.swing.JTextField txtTamanio;
    private javax.swing.JTextField txtVerAreglo;
    private javax.swing.JTextField txtVerAregloOrdenado;
    // End of variables declaration//GEN-END:variables
}
