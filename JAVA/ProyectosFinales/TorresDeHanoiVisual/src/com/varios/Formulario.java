/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.varios;


import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JDialog;

import javax.swing.JOptionPane;

import javax.swing.JPanel;

public class Formulario extends javax.swing.JFrame implements MouseListener{

    public Formulario() {
        initComponents();
        btnCrear.doClick();
        panelDibujarTorre1.addMouseListener(this);
        panelDibujarTorre2.addMouseListener(this);
        panelDibujarTorre3.addMouseListener(this);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        panelSecundiario = new javax.swing.JPanel();
        panelDibujarTorre1 = new FondoPanel(0, 60, 200, 305, "/imagenes/Imagen9.png");
        btnCrear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtNbloques = new javax.swing.JTextPane();
        panelDibujarTorre2 = new FondoPanel(0, 60, 200, 305, "/imagenes/Imagen9.png");
        panelDibujarTorre3 = new FondoPanel(0, 60, 200, 305, "/imagenes/Imagen9.png");
        txtMovimientos = new javax.swing.JLabel();
        lblMovimientos = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblMovimientos1 = new javax.swing.JLabel();
        txtMovimientosRecomendados = new javax.swing.JLabel();
        btnResolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelDibujarTorre1.setBackground(new java.awt.Color(153, 153, 255));
        panelDibujarTorre1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelDibujarTorre1.setPreferredSize(new java.awt.Dimension(200, 400));
        panelDibujarTorre1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelDibujarTorre1MouseClicked(evt);
            }
        });

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

        panelDibujarTorre2.setBackground(new java.awt.Color(153, 153, 255));
        panelDibujarTorre2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelDibujarTorre2.setPreferredSize(new java.awt.Dimension(200, 400));
        panelDibujarTorre2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelDibujarTorre2MouseClicked(evt);
            }
        });

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

        panelDibujarTorre3.setBackground(new java.awt.Color(153, 153, 255));
        panelDibujarTorre3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelDibujarTorre3.setPreferredSize(new java.awt.Dimension(200, 400));
        panelDibujarTorre3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelDibujarTorre3MouseClicked(evt);
            }
        });

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

        txtMovimientos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtMovimientos.setText("0");

        lblMovimientos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblMovimientos.setText("Movimientos:");

        btnLimpiar.setText("↻");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("TORRES DE HANOI");

        lblMovimientos1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblMovimientos1.setText("Movimientos minimos:");

        txtMovimientosRecomendados.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtMovimientosRecomendados.setText("0");

        btnResolver.setText("RESOLVER");
        btnResolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelSecundiarioLayout = new javax.swing.GroupLayout(panelSecundiario);
        panelSecundiario.setLayout(panelSecundiarioLayout);
        panelSecundiarioLayout.setHorizontalGroup(
            panelSecundiarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSecundiarioLayout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(panelSecundiarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSecundiarioLayout.createSequentialGroup()
                        .addComponent(panelDibujarTorre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150)
                        .addComponent(panelDibujarTorre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelDibujarTorre3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelSecundiarioLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(panelSecundiarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelSecundiarioLayout.createSequentialGroup()
                                .addComponent(lblMovimientos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMovimientos, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCrear)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelSecundiarioLayout.createSequentialGroup()
                                .addGroup(panelSecundiarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelSecundiarioLayout.createSequentialGroup()
                                        .addComponent(lblMovimientos1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtMovimientosRecomendados, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelSecundiarioLayout.createSequentialGroup()
                                        .addGap(790, 790, 790)
                                        .addComponent(btnResolver)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(112, 112, 112))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSecundiarioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(365, 365, 365))
        );
        panelSecundiarioLayout.setVerticalGroup(
            panelSecundiarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSecundiarioLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelSecundiarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSecundiarioLayout.createSequentialGroup()
                        .addGroup(panelSecundiarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSecundiarioLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelSecundiarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelSecundiarioLayout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addGroup(panelSecundiarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(btnCrear)
                                            .addComponent(btnLimpiar))
                                        .addGap(18, 18, 18)
                                        .addComponent(btnResolver))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43))
                            .addGroup(panelSecundiarioLayout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(panelSecundiarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtMovimientosRecomendados, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblMovimientos1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 130, Short.MAX_VALUE)))
                        .addGroup(panelSecundiarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelDibujarTorre3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelSecundiarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(panelDibujarTorre1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(panelDibujarTorre2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(panelSecundiarioLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addGroup(panelSecundiarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMovimientos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMovimientos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
        //Inicializa las torres dependiendo del numero de bloques
        try{
            int tamanio = Integer.parseInt(txtNbloques.getText());
            if(tamanio >4){
                JOptionPane.showMessageDialog(null, "NÚMERO DE DISCOS MÁXIMOS 4");
            }
            else{
                btnResolver.setEnabled(true);
                t1 = new Torre(tamanio);
                t2 = new Torre(tamanio);
                t3 = new Torre(tamanio);

                Bloque b;
                int x, y, largo, alto;
                x = 10;
                y = 300;
                largo = 185;
                alto = 50;


                for (int i = 0; i < t1.bloques.length; i++) {
                    b = new Bloque(x, y, largo, alto);
                    t1.Aniadir(b);//Aniade cada bloque a la torre 1
                    x+=25;
                    y -=50;
                    largo -= 50;
                }
                //Grafica los paneles aniadidos previamente 
                for (int i = 0; i < t1.bloques.length; i++) {
                    panelDibujarTorre1.add(t1.getPanel(i));
                }

                int a = (int)Math.pow(2,Integer.parseInt(txtNbloques.getText())) - 1;
                txtMovimientosRecomendados.setText(a+"");
                panelDibujarTorre1.revalidate();
                panelDibujarTorre1.repaint();
                btnCrear.setEnabled(false);
            
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ingrese un valor correcto");
            txtNbloques.setText("");
            System.out.println(e.getCause());
        }
    }//GEN-LAST:event_btnCrearActionPerformed
    //Dibuja los bloques insertando paneles
    private void Dibujar(Torre t, JPanel panelDibuja){
        //Verifica si la torre tiene bloques a graficar, sino no los grafica
        for (int i = 0; i < t.bloques.length; i++) {
            if(t.bloques[i]!=null){
                panelDibuja.add(t.getPanel(i));    
            }
        }

        //Dibuja
        panelDibuja.revalidate();
        panelDibuja.repaint();
    }
    //Indica si todas los bloques estan en una sola torre para indicar si ha ganado 
    //Nota exclute a la t1 ya que es la origen
    public boolean Comprobar(Torre t){
        
        for (int i = 0; i < t.bloques.length; i++) {
            if(t.bloques[i] == null || t==t1){
                return false;
            }
        }
        return true;
    }
    //Limpia toda la informacion
    public void Limpiar(){
        txtMovimientosRecomendados.setText("0");
        panelDibujarTorre1.removeAll();
        panelDibujarTorre2.removeAll();
        panelDibujarTorre3.removeAll();
        panelDibujarTorre1.revalidate();panelDibujarTorre2.revalidate();panelDibujarTorre3.revalidate();
        panelDibujarTorre1.repaint();panelDibujarTorre2.repaint();panelDibujarTorre3.repaint();
        t1.Limpiar();
        t2.Limpiar();
        t3.Limpiar();
        Torre.cont = 0;//reinicia el contador
        txtMovimientos.setText(Torre.cont+"");
        btnResolver.setEnabled(false);
    }
    private void MoverBloque(Torre tOrigen, Torre tDestino, JPanel panelDibujarOrigen, JPanel panelDibujarDestino){
        tOrigen.Mover(tDestino);
        Dibujar(tOrigen, panelDibujarOrigen);
        Dibujar(tDestino, panelDibujarDestino);
        txtMovimientos.setText(Torre.cont+"");
        if(Comprobar(tDestino)){//GANADOR
            btnCrear.setEnabled(true);
            btnResolver.setEnabled(false);
            JOptionPane.showMessageDialog(null, "HAS GANADOOO...");
            Limpiar();
        } 
    }    
    private void T1toT2(){
        MoverBloque(t1, t2, panelDibujarTorre1, panelDibujarTorre2);
    }    
    private void T2toT1(){
        MoverBloque(t2, t1, panelDibujarTorre2, panelDibujarTorre1);
    }    
    private void T3toT1(){
        MoverBloque(t3, t1, panelDibujarTorre3, panelDibujarTorre1);
    }    
    private void T1toT3(){
        MoverBloque(t1, t3, panelDibujarTorre1, panelDibujarTorre3);       
    }    
    private void T2toT3(){
        MoverBloque(t2, t3, panelDibujarTorre2, panelDibujarTorre3);
       
    }    
    private void T3toT2(){
        MoverBloque(t3, t2, panelDibujarTorre3, panelDibujarTorre2);
        
    }

    private void panelDibujarTorre1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelDibujarTorre1MouseClicked
        //Selecciona o regresa dependiendo del mouse click
        if(comprobar){
            if(c2){
                if(t2.Comprobar(t1)){//Comprueba si el bloque a pasar es de menor tamanio
                    T2toT1();
                    comprobar = false;
                }
                else{//Si es de menor tamanio lo regresa
                    comprobar = true;
                    panelDibujarTorre2MouseClicked(evt);
                }
            }else if(c3){
                if(t3.Comprobar(t1)){
                    T3toT1();
                    comprobar = false;
                }
                else{
                    comprobar = true;
                    panelDibujarTorre3MouseClicked(evt);
                }
            }
            else{
                t1.Regresar();
                comprobar = false;
            }
            
        }
        else if(t1.BuscarBloque() != -1){
           
            t1.Seleccionar();
            t2.Regresar();
            t3.Regresar();
            comprobar=true;
        }     
    }//GEN-LAST:event_panelDibujarTorre1MouseClicked
    
    private void panelDibujarTorre2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelDibujarTorre2MouseClicked
        // TODO add your handling code here:
        if(comprobar){
            if(c1){
                if(t1.Comprobar(t2)){
                    T1toT2();
                    comprobar = false;
                }
                else{
                    comprobar = true;
                    panelDibujarTorre1MouseClicked(evt);
                }
            }else if(c3){
                if(t3.Comprobar(t2)){
                    comprobar = false;
                    T3toT2();
                }else{
                    comprobar = true;
                    panelDibujarTorre3MouseClicked(evt);
                }
            }
            else{
                t2.Regresar();
                comprobar = false;
            }
        }
        else if(t2.BuscarBloque() != -1){
            t2.Seleccionar();
            t1.Regresar();
            t3.Regresar();
            comprobar=true;
        }
    }//GEN-LAST:event_panelDibujarTorre2MouseClicked

    private void panelDibujarTorre3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelDibujarTorre3MouseClicked

        if(comprobar){
            if(c1){
                if(t1.Comprobar(t3)){
                    comprobar = false;
                    T1toT3();
                }
                else{
                    comprobar = true;
                    panelDibujarTorre1MouseClicked(evt);
                }
            }else if(c2){
                if(t2.Comprobar(t3)){
                    comprobar = false;
                    T2toT3();
                }
                else{
                    comprobar = true;
                    panelDibujarTorre2MouseClicked(evt);
                }
            }else{
                t3.Regresar();
                comprobar = false;
            }
            
        }
        else if(t3.BuscarBloque() != -1){
            t3.Seleccionar();
            t1.Regresar();//baja el bloque si esta arriba porque solo puede estar arriba 1
            t2.Regresar();
            comprobar=true;
        }
    }//GEN-LAST:event_panelDibujarTorre3MouseClicked

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        Limpiar();
        btnCrear.setEnabled(true);
    }//GEN-LAST:event_btnLimpiarActionPerformed
    /////
    //RESOLVER
    /////
    
   
    public void Hanoi(Torre t1, JPanel p1, Torre t2, JPanel p2, Torre t3, JPanel p3, int n, String ori, String aux, String des){
        if(n == 1){
            
            JOptionPane.showMessageDialog(null, "TOMAR DISCO "+n);
            t1.Seleccionar();
            
            JOptionPane.showMessageDialog(null, ori+" ---> "+des);
            MoverBloque(t1, t3, p1, p3);
            
        }
        else{
            Hanoi(t1,p1,t3,p3,t2,p2, n-1, ori, des, aux);
            
            JOptionPane.showMessageDialog(null, "TOMAR DISCO "+n);
            t1.Seleccionar();
            
            JOptionPane.showMessageDialog(null, ori+" ---> "+des);
            MoverBloque(t1, t3, p1, p3);

            Hanoi(t2,p2,t1,p1,t3,p3, n-1, aux, ori, des);
        }
    }
    private void btnResolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResolverActionPerformed

        btnLimpiar.doClick();
        btnCrear.doClick();
        int num = Integer.parseInt(txtNbloques.getText());
        Hanoi(t1, panelDibujarTorre1, t2, panelDibujarTorre2, t3, panelDibujarTorre3,num , 
                "ORIGEN","AUXILIAR","DESTINO");
    }//GEN-LAST:event_btnResolverActionPerformed

        

  
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
    private Torre t1,t2,t3;
    private boolean comprobar = false; //Si esta arriba o abajo el bloque
    private boolean c1,c2,c3; //Mouse click 
       
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnResolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMovimientos;
    private javax.swing.JLabel lblMovimientos1;
    private javax.swing.JPanel panelDibujarTorre1;
    private javax.swing.JPanel panelDibujarTorre2;
    private javax.swing.JPanel panelDibujarTorre3;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelSecundiario;
    private javax.swing.JLabel txtMovimientos;
    private javax.swing.JLabel txtMovimientosRecomendados;
    private javax.swing.JTextPane txtNbloques;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == panelDibujarTorre1){
            c1=true;
        }
        else c1 = false;
        if(e.getSource() == panelDibujarTorre2){
            c2=true;
        }
        else c2 = false;
        if(e.getSource() == panelDibujarTorre3) {
            c3 = true;
        }
        else c3 = false;
    }

    @Override
    public void mousePressed(MouseEvent e) { }

    @Override
    public void mouseReleased(MouseEvent e) { }

    @Override
    public void mouseEntered(MouseEvent e) { }

    @Override
    public void mouseExited(MouseEvent e) { }


    
}
