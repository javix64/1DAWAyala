import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author x535
 */
public class Actividad2 extends javax.swing.JFrame {
    ArrayList <Item> objetos;

    /**
     * Creates new form Actividad2
     */
    public Actividad2() {
        initComponents();
        objetos = new ArrayList <Item>();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NuevaEntrada = new javax.swing.JDialog();
        inputadd = new javax.swing.JTextField();
        add2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        copiarDerecha = new javax.swing.JButton();
        copiarDtodo = new javax.swing.JButton();
        copiarIzquierda = new javax.swing.JButton();
        copiarItodo = new javax.swing.JButton();
        listaCombo = new javax.swing.JComboBox<>();
        add = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        copiar = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        lista2 = new java.awt.List();
        lista1 = new java.awt.List();

        NuevaEntrada.setTitle("Ventana Examen");
        NuevaEntrada.setMinimumSize(new java.awt.Dimension(327, 150));

        add2.setText("Añadir");
        add2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout NuevaEntradaLayout = new javax.swing.GroupLayout(NuevaEntrada.getContentPane());
        NuevaEntrada.getContentPane().setLayout(NuevaEntradaLayout);
        NuevaEntradaLayout.setHorizontalGroup(
            NuevaEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NuevaEntradaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inputadd, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(add2)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        NuevaEntradaLayout.setVerticalGroup(
            NuevaEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NuevaEntradaLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(NuevaEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputadd, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add2))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Lista 1");

        jLabel2.setText("Lista 2");

        copiarDerecha.setText(">>");
        copiarDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copiarDerechaActionPerformed(evt);
            }
        });

        copiarDtodo.setText(">|");
        copiarDtodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copiarDtodoActionPerformed(evt);
            }
        });

        copiarIzquierda.setText("<<");
        copiarIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copiarIzquierdaActionPerformed(evt);
            }
        });

        copiarItodo.setText("|<");
        copiarItodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copiarItodoActionPerformed(evt);
            }
        });

        add.setText("Añadir");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        copiar.setText("Copiar");

        limpiar.setText("Limpiar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(guardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(copiar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(listaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lista1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(copiarDtodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(copiarDerecha, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                                    .addComponent(copiarIzquierda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(copiarItodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(lista2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(copiarDerecha)
                        .addGap(33, 33, 33)
                        .addComponent(copiarDtodo)
                        .addGap(30, 30, 30)
                        .addComponent(copiarIzquierda)
                        .addGap(29, 29, 29)
                        .addComponent(copiarItodo))
                    .addComponent(lista2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lista1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(limpiar)
                    .addComponent(copiar)
                    .addComponent(guardar)
                    .addComponent(add))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        NuevaEntrada.setVisible(true);
        
    }//GEN-LAST:event_addActionPerformed

    private void add2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add2ActionPerformed
        lista1.add(inputadd.getText());
        inputadd.setText(null);

    }//GEN-LAST:event_add2ActionPerformed

    private void copiarDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copiarDerechaActionPerformed
        lista2.add(lista1.getSelectedItem());
        lista1.remove(lista1.getSelectedItem());
        
        
    }//GEN-LAST:event_copiarDerechaActionPerformed

    private void copiarDtodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copiarDtodoActionPerformed
        for (int i = 0; i < lista1.getItemCount(); i++) {
            lista2.add(lista1.getItem(i));
        }
        lista1.removeAll();

        
    }//GEN-LAST:event_copiarDtodoActionPerformed

    private void copiarIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copiarIzquierdaActionPerformed
        lista1.add(lista2.getSelectedItem());
        lista2.remove(lista2.getSelectedItem());
    }//GEN-LAST:event_copiarIzquierdaActionPerformed

    private void copiarItodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copiarItodoActionPerformed
        for (int i = 0; i < lista2.getItemCount(); i++) {
            lista1.add(lista2.getItem(i));
        }
        lista2.removeAll();

    }//GEN-LAST:event_copiarItodoActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        Item item1 = null;
        for (int i=0; i<lista2.getItemCount(); i++){
            new Item(lista2.getItem(i));
            objetos.add(item1);
            listaCombo.
        }
        lista2.removeAll();
                
    }//GEN-LAST:event_guardarActionPerformed

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
            java.util.logging.Logger.getLogger(Actividad2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Actividad2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Actividad2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Actividad2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Actividad2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog NuevaEntrada;
    private javax.swing.JButton add;
    private javax.swing.JButton add2;
    private javax.swing.JButton copiar;
    private javax.swing.JButton copiarDerecha;
    private javax.swing.JButton copiarDtodo;
    private javax.swing.JButton copiarItodo;
    private javax.swing.JButton copiarIzquierda;
    private javax.swing.JButton guardar;
    private javax.swing.JTextField inputadd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton limpiar;
    private java.awt.List lista1;
    private java.awt.List lista2;
    private javax.swing.JComboBox<String> listaCombo;
    // End of variables declaration//GEN-END:variables
}
