/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package paquete1;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

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
        modeloBurbuja = new DefaultTableModel();
        modeloBurbuja.addColumn("TAMAÑO");
        modeloBurbuja.addColumn("TIEMPO");
        modeloBurbuja.addColumn("INTERCAMBIOS");
        modeloBurbuja.addColumn("CICLOS");
        tblBurbuja.setModel(modeloBurbuja);
        
        modeloInsercion = new DefaultTableModel();
        modeloInsercion.addColumn("TAMAÑO");
        modeloInsercion.addColumn("TIEMPO");
        modeloInsercion.addColumn("INTERCAMBIOS");
        modeloInsercion.addColumn("CICLOS");
        tblInsercion.setModel(modeloInsercion);
        
        modeloQuick = new DefaultTableModel();
        modeloQuick.addColumn("TAMAÑO");
        modeloQuick.addColumn("TIEMPO");
        modeloQuick.addColumn("INTERCAMBIOS");
        modeloQuick.addColumn("CICLOS");
        tblQuick.setModel(modeloQuick);
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
        panelTabla = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblQuick = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblBurbuja = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblInsercion = new javax.swing.JTable();
        lblPrevisualizar2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        panelContenedor.add(lblQuickSort, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 190, 149, -1));

        lblBurbuja.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblBurbuja.setText("BURBUJA");
        panelContenedor.add(lblBurbuja, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 111, -1));

        lblinsercion.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblinsercion.setText("INSERCIÓN");
        panelContenedor.add(lblinsercion, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 190, 149, -1));

        txtImprimirQuick.setColumns(20);
        txtImprimirQuick.setRows(5);
        jScrollPane1.setViewportView(txtImprimirQuick);

        panelContenedor.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 240, -1, 173));

        txtImprimirBurbuja.setColumns(20);
        txtImprimirBurbuja.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtImprimirBurbuja.setRows(5);
        jScrollPane2.setViewportView(txtImprimirBurbuja);

        panelContenedor.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, -1, 173));

        txtImprimirInsercion.setColumns(20);
        txtImprimirInsercion.setRows(5);
        jScrollPane3.setViewportView(txtImprimirInsercion);

        panelContenedor.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 240, -1, 173));

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
        lblPrevisualizar1.setText("RESUMEN:");
        panelContenedor.add(lblPrevisualizar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, -1, -1));

        txtVerAregloOrdenado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        panelContenedor.add(txtVerAregloOrdenado, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, 552, 32));

        panelTabla.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblQuick.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(tblQuick);

        panelTabla.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, 380, 190));

        tblBurbuja.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(tblBurbuja);

        panelTabla.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 370, 190));

        tblInsercion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane7.setViewportView(tblInsercion);

        panelTabla.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 410, 190));

        panelContenedor.add(panelTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, 1230, 220));

        lblPrevisualizar2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblPrevisualizar2.setText("PREVISUALIZAR:");
        panelContenedor.add(lblPrevisualizar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, -1, -1));

        getContentPane().add(panelContenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void LlenarArreglo(int[] A){
        for (int i = 0; i < A.length; i++) {
            A[i]= (int)(Math.random()*1000)+1;
        }
    }
    public static String VerArreglo(int A[]){
        String c = "";
//        for (int i = 0; i < A.length; i++) {
//            c+= A[i]+"  ";
//        }
        c+=(A[0]+" ; "+A[2]+" ; "+A[3]+" ... "
                +A[A.length-3]+" ; "+A[A.length-2]+" ; "+A[A.length-1]);
        return c;
    }
    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        // TODO add your handling code here:
        A = new int[Integer.parseInt(txtTamanio.getText())];
        LlenarArreglo(A);
        
        bur = new Burbuja(A);
        in = new Insercion(A);
        qu = new Quick(A);
        
        this.txtVerAreglo.setText(VerArreglo(A));
        this.btnCrear.setEnabled(false);
        
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        // TODO add your handling code here:
        A = null;
        
        bur = null;
        in = null;
        qu = null;
        
        txtImprimirBurbuja.setText("");
        txtImprimirInsercion.setText("");
        txtImprimirQuick.setText("");
        txtVerAreglo.setText("");
        txtVerAregloOrdenado.setText("");
        
        this.btnCrear.setEnabled(true);
        System.gc();
    }//GEN-LAST:event_btnReiniciarActionPerformed

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
        // TODO add your handling code here:
        
        try{
            bur.Ordenar();
            txtImprimirBurbuja.setText(bur.toString());
            
            in.Ordenar();
            txtImprimirInsercion.setText(in.toString());
            
            qu.Ordenar();
            txtImprimirQuick.setText(qu.toString());
            
            txtVerAregloOrdenado.setText(VerArreglo(qu.getArreglo()));
            
            //tablas
            String[] infoBur = new String[4];
            infoBur[0] = cont+"";
            infoBur[1] = bur.tiempo+"";
            infoBur[2] = bur.intercambios+"";
            infoBur[3] = bur.ciclos+"";
            modeloBurbuja.addRow(infoBur);
            
            String[] infoInser = new String[4];
            infoInser[0] = cont+"";
            infoInser[1] = in.tiempo+"";
            infoInser[2] = in.intercambios+"";
            infoInser[3] = in.ciclos+"";
            modeloInsercion.addRow(infoInser);
            
            String[] infoQuck = new String[4];
            infoQuck[0] = cont+"";
            infoQuck[1] = qu.tiempo+"";
            infoQuck[2] = qu.intercambios+"";
            infoQuck[3] = qu.ciclos+"";
            modeloQuick.addRow(infoQuck);
            
            cont++;
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "CREE UN ARREGLO");
            System.out.println(ex.getMessage());
        }
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
    private Burbuja bur;
    private Insercion in;
    private Quick qu;
    private DefaultTableModel modeloBurbuja;
    private DefaultTableModel modeloInsercion;
    private DefaultTableModel modeloQuick;
    private int cont = 1;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JLabel lblBurbuja;
    private javax.swing.JLabel lblPrevisualizar;
    private javax.swing.JLabel lblPrevisualizar1;
    private javax.swing.JLabel lblPrevisualizar2;
    private javax.swing.JLabel lblQuickSort;
    private javax.swing.JLabel lblTamanio1;
    private javax.swing.JLabel lblinsercion;
    private javax.swing.JPanel panelContenedor;
    private javax.swing.JPanel panelTabla;
    private javax.swing.JTable tblBurbuja;
    private javax.swing.JTable tblInsercion;
    private javax.swing.JTable tblQuick;
    private javax.swing.JTextArea txtImprimirBurbuja;
    private javax.swing.JTextArea txtImprimirInsercion;
    private javax.swing.JTextArea txtImprimirQuick;
    private javax.swing.JTextField txtTamanio;
    private javax.swing.JTextField txtVerAreglo;
    private javax.swing.JTextField txtVerAregloOrdenado;
    // End of variables declaration//GEN-END:variables
}
