/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica8;

import java.util.ArrayList;

/**
 *
 * @author x535
 */
public class Practica8 extends javax.swing.JFrame {
    ArrayList <Persona> datos;
    /**
     * Creates new form Practica8
     */
    public Practica8() {
        initComponents();
        datos=new ArrayList <Persona>();
        /*esto no va a hacer nada porque estara vacio desde el principio
        for (int i = 0; i < datos.size(); i++) {
            lista.add(datos.get(i).getNombre());
        }
        */
        
        //añadir arrayLIst datos, borrar el choice y volver a carga los datos
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        borrar = new javax.swing.JDialog();
        jLabel11 = new javax.swing.JLabel();
        borrarAceptar = new javax.swing.JButton();
        borrarCancelar = new javax.swing.JButton();
        vacio = new javax.swing.JDialog();
        jLabel10 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        error = new javax.swing.JDialog();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        borrarvacio = new javax.swing.JDialog();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Bborrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nombreInput = new javax.swing.JTextField();
        direccionInput = new javax.swing.JTextField();
        edadInput = new javax.swing.JTextField();
        telefonoInput = new javax.swing.JTextField();
        Bnuevo = new javax.swing.JButton();
        lista = new java.awt.Choice();

        borrar.setMinimumSize(new java.awt.Dimension(560, 170));
        borrar.setModal(true);

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel11.setText("¿Estás seguro de que quieres borrar este contacto?");

        borrarAceptar.setText("Aceptar");
        borrarAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarAceptarActionPerformed(evt);
            }
        });

        borrarCancelar.setText("Cancelar");
        borrarCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout borrarLayout = new javax.swing.GroupLayout(borrar.getContentPane());
        borrar.getContentPane().setLayout(borrarLayout);
        borrarLayout.setHorizontalGroup(
            borrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borrarLayout.createSequentialGroup()
                .addGroup(borrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(borrarLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel11))
                    .addGroup(borrarLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(borrarAceptar)
                        .addGap(137, 137, 137)
                        .addComponent(borrarCancelar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        borrarLayout.setVerticalGroup(
            borrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borrarLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel11)
                .addGap(34, 34, 34)
                .addGroup(borrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(borrarAceptar)
                    .addComponent(borrarCancelar))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        vacio.setMinimumSize(new java.awt.Dimension(400, 300));
        vacio.setModal(true);

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setText("Completa los espacios vacios");

        jButton3.setText("Aceptar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout vacioLayout = new javax.swing.GroupLayout(vacio.getContentPane());
        vacio.getContentPane().setLayout(vacioLayout);
        vacioLayout.setHorizontalGroup(
            vacioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vacioLayout.createSequentialGroup()
                .addGroup(vacioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(vacioLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel10))
                    .addGroup(vacioLayout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jButton3)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        vacioLayout.setVerticalGroup(
            vacioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vacioLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel10)
                .addGap(78, 78, 78)
                .addComponent(jButton3)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel7.setText("Los valores deben ser alfabeticos");

        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout errorLayout = new javax.swing.GroupLayout(error.getContentPane());
        error.getContentPane().setLayout(errorLayout);
        errorLayout.setHorizontalGroup(
            errorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(errorLayout.createSequentialGroup()
                .addGap(227, 227, 227)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, errorLayout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(50, 50, 50))
        );
        errorLayout.setVerticalGroup(
            errorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(errorLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel7)
                .addGap(45, 45, 45)
                .addComponent(jButton1)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        borrarvacio.setMinimumSize(new java.awt.Dimension(364, 209));
        borrarvacio.setModal(true);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel8.setText("No hay nada que borrar");

        jButton2.setText("Cerrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout borrarvacioLayout = new javax.swing.GroupLayout(borrarvacio.getContentPane());
        borrarvacio.getContentPane().setLayout(borrarvacioLayout);
        borrarvacioLayout.setHorizontalGroup(
            borrarvacioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borrarvacioLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, borrarvacioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(138, 138, 138))
        );
        borrarvacioLayout.setVerticalGroup(
            borrarvacioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borrarvacioLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        jLabel9.setText("jLabel9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Seleccionar");

        Bborrar.setText("Borrar");
        Bborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BborrarActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre");

        jLabel3.setText("Direccion");

        jLabel4.setText("Edad");

        jLabel5.setText("Teléfono");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Datos de contacto");

        nombreInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreInputActionPerformed(evt);
            }
        });

        direccionInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccionInputActionPerformed(evt);
            }
        });

        edadInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edadInputActionPerformed(evt);
            }
        });
        edadInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                edadInputKeyReleased(evt);
            }
        });

        telefonoInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoInputActionPerformed(evt);
            }
        });

        Bnuevo.setText("Nuevo");
        Bnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BnuevoActionPerformed(evt);
            }
        });

        lista.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                listaItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(edadInput, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(direccionInput, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                            .addComponent(nombreInput)
                            .addComponent(telefonoInput, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(lista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Bnuevo)
                            .addComponent(Bborrar))))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(Bborrar))
                    .addComponent(lista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nombreInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(direccionInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bnuevo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(edadInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(telefonoInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreInputActionPerformed
        direccionInput.requestFocus();
    }//GEN-LAST:event_nombreInputActionPerformed

    private void direccionInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccionInputActionPerformed
        edadInput.requestFocus();

    }//GEN-LAST:event_direccionInputActionPerformed

    private void edadInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edadInputActionPerformed
        telefonoInput.requestFocus();
    }//GEN-LAST:event_edadInputActionPerformed

    private void telefonoInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoInputActionPerformed

    private void BnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BnuevoActionPerformed
        String nombre = nombreInput.getText();
        String direccion = direccionInput.getText();
        int edad = 0;
        int telefono = 0;
        try {
            edad = Integer.parseInt( edadInput.getText() );
        } catch (java.lang.NumberFormatException e) {
            vacio.setVisible(true);
            edadInput.requestFocus();
        }
        try {
            telefono = Integer.parseInt( telefonoInput.getText() );
        } catch (java.lang.NumberFormatException e) {
            vacio.setVisible(true);
            telefonoInput.requestFocus();
        }
        if("".equals(nombreInput.getText())){
            vacio.setVisible(true);
            nombreInput.requestFocus();
        }else{
            if("".equals(direccionInput.getText())){
                vacio.setVisible(true);
                direccionInput.requestFocus();
            }else{
                if("".equals(edadInput.getText())){
                    edadInput.requestFocus();
                }else{
                    if("".equals(telefonoInput.getText())){
                        telefonoInput.requestFocus(); 
                    }else{
                        Persona persona = new Persona(nombre,direccion,edad,telefono);
        
                        datos.add(persona);
                        lista.add(persona.getNombre());
                        nombreInput.setText(null);
                        direccionInput.setText(null);
                        edadInput.setText(null);
                        telefonoInput.setText(null);
                        nombreInput.requestFocus();
                    }
                }
            }              
        }
        
    }//GEN-LAST:event_BnuevoActionPerformed

    private void listaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_listaItemStateChanged
        lista.requestFocus();
        Persona contacto = datos.get(lista.getSelectedIndex());
        nombreInput.setText( contacto.getNombre() );
        nombreInput.requestFocus();
        direccionInput.setText( contacto.getDireccion() );
        edadInput.setText("" + contacto.getEdad() );
        telefonoInput.setText("" + contacto.getTelefono() );
        
    }//GEN-LAST:event_listaItemStateChanged

    private void BborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BborrarActionPerformed
        //System.out.println(lista.getItemCount());
        if (lista.getItemCount() > 0) {
            borrar.setVisible(true);
        }else{
            borrarvacio.setVisible(true);
        }        
    }//GEN-LAST:event_BborrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         error.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void edadInputKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edadInputKeyReleased

        
    }//GEN-LAST:event_edadInputKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        borrarvacio.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        vacio.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void borrarCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarCancelarActionPerformed
        borrar.setVisible(false);
    }//GEN-LAST:event_borrarCancelarActionPerformed

    private void borrarAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarAceptarActionPerformed
        datos.remove( lista.getSelectedIndex());
        lista.remove(lista.getSelectedIndex());
        borrar.setVisible(false);
        nombreInput.requestFocus(); 
        
        nombreInput.setText(null);
        direccionInput.setText(null);
        telefonoInput.setText(null);
        edadInput.setText(null);
    }//GEN-LAST:event_borrarAceptarActionPerformed

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
            java.util.logging.Logger.getLogger(Practica8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Practica8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Practica8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Practica8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Practica8().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bborrar;
    private javax.swing.JButton Bnuevo;
    private javax.swing.JDialog borrar;
    private javax.swing.JButton borrarAceptar;
    private javax.swing.JButton borrarCancelar;
    private javax.swing.JDialog borrarvacio;
    private javax.swing.JTextField direccionInput;
    private javax.swing.JTextField edadInput;
    private javax.swing.JDialog error;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private java.awt.Choice lista;
    private javax.swing.JTextField nombreInput;
    private javax.swing.JTextField telefonoInput;
    private javax.swing.JDialog vacio;
    // End of variables declaration//GEN-END:variables
}
