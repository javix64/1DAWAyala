/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Controlador;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.text.Caret;

/**
 *
 * @author drago
 */
public class Vista extends javax.swing.JFrame {

    /**
     * Creates new form Vista
     */
    Controlador controlaTodo= new Controlador();
    public Vista() {
        initComponents();
        observacionesText.setLineWrap(true);
        controlaTodo.showLocales(comboLocal);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        local = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comboEmpleado = new javax.swing.JComboBox<>();
        comboLocal = new javax.swing.JComboBox<>();
        seleccionarEmpleado = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        putFoto = new javax.swing.JLabel();
        empleadoNombre = new javax.swing.JLabel();
        empleadoApellidos = new javax.swing.JLabel();
        empleadoDireccion = new javax.swing.JLabel();
        empleadoTelefono = new javax.swing.JLabel();
        empleadoEmai = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaNominas = new javax.swing.JTable();
        totalBruto = new javax.swing.JLabel();
        totalIRPF = new javax.swing.JLabel();
        totalNeto = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        putApellidos = new javax.swing.JLabel();
        putDireccion = new javax.swing.JLabel();
        putTelefono = new javax.swing.JLabel();
        putEmail = new javax.swing.JLabel();
        putNombre = new javax.swing.JLabel();
        putBruto = new javax.swing.JLabel();
        putIRPF = new javax.swing.JLabel();
        putNeto = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        observacionesText = new javax.swing.JTextArea();
        seleccionarLocal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        local.setText("Local:");

        jLabel2.setText("Empleado:");

        comboEmpleado.setEnabled(false);

        comboLocal.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboLocalItemStateChanged(evt);
            }
        });
        comboLocal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboLocalMouseClicked(evt);
            }
        });

        seleccionarEmpleado.setText("Seleccionar Empleado");
        seleccionarEmpleado.setEnabled(false);
        seleccionarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionarEmpleadoActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Empleado"));

        putFoto.setText("foto");

        empleadoNombre.setText("Nombre:");

        empleadoApellidos.setText("Apellidos:");

        empleadoDireccion.setText("Direccion:");

        empleadoTelefono.setText("telefono:");

        empleadoEmai.setText("email:");

        tablaNominas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id_nomina", "Nomina", "Mes", "Año"
            }
        ));
        jScrollPane1.setViewportView(tablaNominas);

        totalBruto.setText("Total bruto nominas:");

        totalIRPF.setText("Total IRPF:");

        totalNeto.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        totalNeto.setText("Total netos:");

        jButton2.setText("Añadir fila");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Insertar/actualizar tabla");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        putApellidos.setText(" ");

        putDireccion.setText("       ");

        putTelefono.setText("          ");

        putEmail.setText("         ");

        putNombre.setText(" ");

        putBruto.setText("      ");

        putIRPF.setText("      ");

        putNeto.setText("      ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(putFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(empleadoDireccion)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(empleadoNombre)
                                        .addComponent(empleadoApellidos))
                                    .addComponent(empleadoTelefono, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(empleadoEmai, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(putDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(putTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(putEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(putApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(putNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(totalIRPF)
                                    .addComponent(totalBruto)
                                    .addComponent(totalNeto))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(putBruto)
                                    .addComponent(putIRPF)
                                    .addComponent(putNeto)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3)))
                        .addGap(0, 105, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(putFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(empleadoNombre)
                            .addComponent(putNombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(empleadoApellidos)
                            .addComponent(putApellidos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(empleadoDireccion)
                            .addComponent(putDireccion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(empleadoTelefono)
                            .addComponent(putTelefono))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(empleadoEmai)
                            .addComponent(putEmail))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalBruto)
                    .addComponent(putBruto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalIRPF, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(putIRPF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalNeto, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(putNeto))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Observaciones"));

        observacionesText.setColumns(20);
        observacionesText.setRows(5);
        jScrollPane2.setViewportView(observacionesText);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        seleccionarLocal.setText("Seleccionar Local");
        seleccionarLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionarLocalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(local, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(seleccionarLocal)
                            .addComponent(seleccionarEmpleado))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(local)
                            .addComponent(comboLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(comboEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(seleccionarLocal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(seleccionarEmpleado)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(163, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        TableModel tablaAntes= tablaNominas.getModel();
        DefaultTableModel tablaDespues= (DefaultTableModel)tablaAntes;
        Object [] fila=new Object[4];
                fila[0]="";
                fila[1]="";
                fila[2]="";
                fila[3]="";
        tablaDespues.addRow(fila);
        tablaNominas.setModel(tablaDespues);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        controlaTodo.updateNominas(tablaNominas);
        System.out.println(tablaNominas.getValueAt(0, 0).getClass());
        System.out.println(tablaNominas.getValueAt(0, 1).getClass());
        System.out.println(tablaNominas.getValueAt(0, 2).getClass());
        System.out.println(tablaNominas.getValueAt(0, 3).getClass());
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void comboLocalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboLocalMouseClicked

        comboEmpleado.setEnabled(true);

    }//GEN-LAST:event_comboLocalMouseClicked

    private void comboLocalItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboLocalItemStateChanged
        comboEmpleado.removeAllItems();

    }//GEN-LAST:event_comboLocalItemStateChanged

    private void seleccionarLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionarLocalActionPerformed
        controlaTodo.showEmpleados(comboEmpleado,comboLocal.getSelectedItem().toString());
        seleccionarEmpleado.setEnabled(true);
        comboEmpleado.setEnabled(true);
    }//GEN-LAST:event_seleccionarLocalActionPerformed

    private void seleccionarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionarEmpleadoActionPerformed
        String nombreEmpleado= comboEmpleado.getSelectedItem().toString();
        tablaNominas.setModel(controlaTodo.showNominas(nombreEmpleado));
        controlaTodo.showTodoEmpleado(nombreEmpleado,putNombre, putApellidos, putDireccion, putTelefono, putEmail, observacionesText);
        controlaTodo.ponerDatosNomina(nombreEmpleado, putBruto, putIRPF, putNeto);
        try {
            controlaTodo.obtenerFoto(nombreEmpleado, putFoto);
        } catch (IOException ex) {
            Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_seleccionarEmpleadoActionPerformed

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
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboEmpleado;
    private javax.swing.JComboBox<String> comboLocal;
    private javax.swing.JLabel empleadoApellidos;
    private javax.swing.JLabel empleadoDireccion;
    private javax.swing.JLabel empleadoEmai;
    private javax.swing.JLabel empleadoNombre;
    private javax.swing.JLabel empleadoTelefono;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel local;
    private javax.swing.JTextArea observacionesText;
    private javax.swing.JLabel putApellidos;
    private javax.swing.JLabel putBruto;
    private javax.swing.JLabel putDireccion;
    private javax.swing.JLabel putEmail;
    private javax.swing.JLabel putFoto;
    private javax.swing.JLabel putIRPF;
    private javax.swing.JLabel putNeto;
    private javax.swing.JLabel putNombre;
    private javax.swing.JLabel putTelefono;
    private javax.swing.JButton seleccionarEmpleado;
    private javax.swing.JButton seleccionarLocal;
    private javax.swing.JTable tablaNominas;
    private javax.swing.JLabel totalBruto;
    private javax.swing.JLabel totalIRPF;
    private javax.swing.JLabel totalNeto;
    // End of variables declaration//GEN-END:variables
}
