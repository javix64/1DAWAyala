/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author x505
 */
import java.util.ArrayList;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;


public class Practica11 extends javax.swing.JFrame {
            DefaultTableModel modelo;
            DefaultTableModel modeloDialog;
            DefaultTableModel modeloNuevo;
            ArrayList <String> datos;

    /**
     * Creates new form Practica11
     */
    public Practica11() {
        initComponents();
        modelo=(DefaultTableModel) tabla.getModel();
        modeloDialog=(DefaultTableModel) tablaDialog.getModel();
        modeloNuevo=new DefaultTableModel();

        datos = new ArrayList <String>();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cambiarNombreColumna = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        siguiente = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaDialog = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        addFila = new javax.swing.JButton();
        deleteFila = new javax.swing.JButton();
        clean = new javax.swing.JButton();
        newColumna = new javax.swing.JButton();
        changeNameColumna = new javax.swing.JButton();
        borrarColumnas = new javax.swing.JButton();
        textoColumna = new javax.swing.JTextField();

        cambiarNombreColumna.setMinimumSize(new java.awt.Dimension(504, 378));
        cambiarNombreColumna.setModal(true);

        jLabel1.setText("Cambia el nombre de las columnas y pulsa siguiente");

        jLabel2.setText("Recuerda pulsar Enter para aplicar los nombres antes de pulsar siguiente.");

        siguiente.setText("Siguiente");
        siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteActionPerformed(evt);
            }
        });

        tablaDialog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tablaDialog);

        javax.swing.GroupLayout cambiarNombreColumnaLayout = new javax.swing.GroupLayout(cambiarNombreColumna.getContentPane());
        cambiarNombreColumna.getContentPane().setLayout(cambiarNombreColumnaLayout);
        cambiarNombreColumnaLayout.setHorizontalGroup(
            cambiarNombreColumnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cambiarNombreColumnaLayout.createSequentialGroup()
                .addGroup(cambiarNombreColumnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cambiarNombreColumnaLayout.createSequentialGroup()
                        .addGroup(cambiarNombreColumnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cambiarNombreColumnaLayout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(siguiente))
                            .addGroup(cambiarNombreColumnaLayout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(jLabel1))
                            .addGroup(cambiarNombreColumnaLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 68, Short.MAX_VALUE))
                    .addGroup(cambiarNombreColumnaLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );
        cambiarNombreColumnaLayout.setVerticalGroup(
            cambiarNombreColumnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cambiarNombreColumnaLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(siguiente)
                .addGap(33, 33, 33))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        addFila.setText("Añadir fila");
        addFila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFilaActionPerformed(evt);
            }
        });

        deleteFila.setText("Eliminar fila");
        deleteFila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteFilaActionPerformed(evt);
            }
        });

        clean.setText("Limpiar");
        clean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanActionPerformed(evt);
            }
        });

        newColumna.setText("Nueva columna");
        newColumna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newColumnaActionPerformed(evt);
            }
        });

        changeNameColumna.setText("Cambiar nombres de columnas");
        changeNameColumna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeNameColumnaActionPerformed(evt);
            }
        });

        borrarColumnas.setText("Borrar columnas");
        borrarColumnas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarColumnasActionPerformed(evt);
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
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(changeNameColumna)
                                .addGap(79, 79, 79)
                                .addComponent(borrarColumnas))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addFila)
                                    .addComponent(newColumna))
                                .addGap(63, 63, 63)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(deleteFila)
                                        .addGap(38, 38, 38)
                                        .addComponent(clean))
                                    .addComponent(textoColumna, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addFila)
                    .addComponent(deleteFila)
                    .addComponent(clean))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newColumna)
                    .addComponent(textoColumna, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(changeNameColumna)
                    .addComponent(borrarColumnas))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addFilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFilaActionPerformed
        modelo.addRow(new Object[]{});
    }//GEN-LAST:event_addFilaActionPerformed

    private void deleteFilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteFilaActionPerformed
        try{
            modelo.removeRow(tabla.getSelectedRow());
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.err.println("No hay fila para borrar "+e);
        }

        
    }//GEN-LAST:event_deleteFilaActionPerformed

    private void cleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanActionPerformed
        /*for (int i = modelo.getRowCount()-1; i >= 0; i--) {
            modelo.removeRow(i);
        }*/
        modelo.setRowCount(0);
    }//GEN-LAST:event_cleanActionPerformed

    private void newColumnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newColumnaActionPerformed
        modelo.addColumn(textoColumna.getText());
        textoColumna.setText(null);
        
    }//GEN-LAST:event_newColumnaActionPerformed

    private void changeNameColumnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeNameColumnaActionPerformed

        if (modeloDialog.getRowCount()!=1) {
            modeloDialog.addRow(new Object[]{});
        }
        modeloDialog.setColumnCount(0);
        
        for (int i = 0; i < modelo.getColumnCount(); i++) {
            modeloDialog.addColumn(modelo.getColumnName(i));
        }

        cambiarNombreColumna.setVisible(true);
        
    }//GEN-LAST:event_changeNameColumnaActionPerformed

    private void borrarColumnasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarColumnasActionPerformed

        modelo.setColumnCount(modelo.getColumnCount()-1);
    }//GEN-LAST:event_borrarColumnasActionPerformed

    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed
        for (int i = 0; i < tablaDialog.getColumnCount(); i++) {
            datos.add((String)tablaDialog.getValueAt(0, i));
        }      
        for (int i = 0; i < datos.size(); i++) {
            modeloNuevo.addColumn(datos.get(i));
                }
        modelo=modeloNuevo;
        modeloDialog=modeloNuevo;
        tabla.setModel(modelo);
        tablaDialog.setModel(modeloDialog);
        tabla.repaint();
    }//GEN-LAST:event_siguienteActionPerformed

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
            java.util.logging.Logger.getLogger(Practica11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Practica11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Practica11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Practica11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Practica11().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addFila;
    private javax.swing.JButton borrarColumnas;
    private javax.swing.JDialog cambiarNombreColumna;
    private javax.swing.JButton changeNameColumna;
    private javax.swing.JButton clean;
    private javax.swing.JButton deleteFila;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton newColumna;
    private javax.swing.JButton siguiente;
    private javax.swing.JTable tabla;
    private javax.swing.JTable tablaDialog;
    private javax.swing.JTextField textoColumna;
    // End of variables declaration//GEN-END:variables
}
