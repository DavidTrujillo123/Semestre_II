/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package paquete1;

/**
 *
 * @author Asus
 */
public class FormularioPilasYColas extends javax.swing.JFrame {

    public FormularioPilasYColas() {
        initComponents();
        p1 = new Pilas();
        c1 = new Colas();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ImprimirPila = new javax.swing.JTextArea();
        btnApilar = new javax.swing.JButton();
        btnDesapilar = new javax.swing.JButton();
        comboBox = new javax.swing.JComboBox<>();
        txtNpila = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        ImprimirCola = new javax.swing.JTextArea();
        btnColar = new javax.swing.JButton();
        btnDesacolar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ImprimirPila.setEditable(false);
        ImprimirPila.setColumns(20);
        ImprimirPila.setRows(5);
        jScrollPane1.setViewportView(ImprimirPila);

        btnApilar.setText("APILAR");
        btnApilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApilarActionPerformed(evt);
            }
        });

        btnDesapilar.setText("DESAPILAR");
        btnDesapilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesapilarActionPerformed(evt);
            }
        });

        comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Circunferencia", "Cuadrado", "Elipse", "Punto" }));

        txtNpila.setText("0");

        ImprimirCola.setEditable(false);
        ImprimirCola.setColumns(20);
        ImprimirCola.setRows(5);
        jScrollPane3.setViewportView(ImprimirCola);

        btnColar.setText("COLAR");
        btnColar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColarActionPerformed(evt);
            }
        });

        btnDesacolar.setText("DESACOLAR");
        btnDesacolar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesacolarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(btnApilar)
                                .addGap(40, 40, 40)
                                .addComponent(btnDesapilar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(btnColar)
                                .addGap(51, 51, 51)
                                .addComponent(btnDesacolar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNpila, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addComponent(txtNpila, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnColar)
                    .addComponent(btnDesacolar)
                    .addComponent(btnDesapilar)
                    .addComponent(btnApilar))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnApilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApilarActionPerformed
        if(this.comboBox.getSelectedIndex() == 0){
            p1.Apilar(new Circunferencia(cont++));
        }
        else if(this.comboBox.getSelectedIndex() == 1) p1.Apilar(new Cuadrado(cont++));
        ImprimirPila.setText(p1.ImprimirObjeto());
        
    }//GEN-LAST:event_btnApilarActionPerformed

    private void btnDesapilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesapilarActionPerformed
        // TODO add your handling code here:
        //ImprimirPila.setText("");
        int n = Integer.parseInt(txtNpila.getText());
        p1.DesApilar();
        ImprimirPila.setText(p1.ImprimirObjeto());
    }//GEN-LAST:event_btnDesapilarActionPerformed

    private void btnColarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColarActionPerformed
        // TODO add your handling code here:
        if(this.comboBox.getSelectedIndex() == 0){
            c1.Colar(new Circunferencia(cont++));
        }
        else if(this.comboBox.getSelectedIndex() == 1) c1.Colar(new Cuadrado(cont++));
        ImprimirCola.setText(c1.ImprimirObjeto());
    }//GEN-LAST:event_btnColarActionPerformed

    private void btnDesacolarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesacolarActionPerformed
        // TODO add your handling code here:
        int n = Integer.parseInt(txtNpila.getText());
        c1.DesColar();
        ImprimirCola.setText(c1.ImprimirObjeto());
    }//GEN-LAST:event_btnDesacolarActionPerformed

    
    //Mis Atributos
    private Pilas p1;
    private Colas c1;
    private static int cont=0;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea ImprimirCola;
    private javax.swing.JTextArea ImprimirPila;
    private javax.swing.JButton btnApilar;
    private javax.swing.JButton btnColar;
    private javax.swing.JButton btnDesacolar;
    private javax.swing.JButton btnDesapilar;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField txtNpila;
    // End of variables declaration//GEN-END:variables
}
