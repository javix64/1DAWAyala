
import java.awt.Dialog;




public class ejercicio5 extends javax.swing.JFrame {
    Hebra5 cronometro;
    /**
     * Creates new form ejercicio5
     */
    public ejercicio5() {
        initComponents();
        cronometro = new Hebra5(0, 0, 0, mostrarHora);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogoHora = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ponerHora = new javax.swing.JTextField();
        ponerMinutos = new javax.swing.JTextField();
        ponerSegundos = new javax.swing.JTextField();
        aplicarHora = new javax.swing.JButton();
        mostrarHora = new javax.swing.JTextField();
        resetear = new javax.swing.JButton();
        parar = new javax.swing.JButton();
        reanudar = new javax.swing.JButton();
        ponerHoraPrincipal = new javax.swing.JButton();

        dialogoHora.setMinimumSize(new java.awt.Dimension(415, 178));

        jLabel1.setText("Hora");

        jLabel2.setText("Minutos");

        jLabel3.setText("Segundos");

        ponerSegundos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ponerSegundosActionPerformed(evt);
            }
        });

        aplicarHora.setText("Aplicar");
        aplicarHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aplicarHoraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dialogoHoraLayout = new javax.swing.GroupLayout(dialogoHora.getContentPane());
        dialogoHora.getContentPane().setLayout(dialogoHoraLayout);
        dialogoHoraLayout.setHorizontalGroup(
            dialogoHoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogoHoraLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(dialogoHoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(aplicarHora)
                    .addGroup(dialogoHoraLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ponerHora, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ponerMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ponerSegundos, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        dialogoHoraLayout.setVerticalGroup(
            dialogoHoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogoHoraLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(dialogoHoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(ponerHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ponerMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ponerSegundos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(aplicarHora)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mostrarHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarHoraActionPerformed(evt);
            }
        });

        resetear.setText("Resetear");
        resetear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetearActionPerformed(evt);
            }
        });

        parar.setText("Parar");
        parar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pararActionPerformed(evt);
            }
        });

        reanudar.setText("Reanudar");
        reanudar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reanudarActionPerformed(evt);
            }
        });

        ponerHoraPrincipal.setText("Poner en hora");
        ponerHoraPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ponerHoraPrincipalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(resetear)
                        .addGap(29, 29, 29)
                        .addComponent(reanudar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(parar)
                        .addGap(36, 36, 36)
                        .addComponent(ponerHoraPrincipal)))
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mostrarHora, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(mostrarHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resetear)
                    .addComponent(reanudar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ponerHoraPrincipal)
                    .addComponent(parar))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resetearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetearActionPerformed
        cronometro.setHoras(0);
        cronometro.setMinutos(0);
        cronometro.setSegundos(0);
    }//GEN-LAST:event_resetearActionPerformed

    private void reanudarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reanudarActionPerformed
        cronometro.start();
    }//GEN-LAST:event_reanudarActionPerformed

    private void mostrarHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mostrarHoraActionPerformed

    private void ponerSegundosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ponerSegundosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ponerSegundosActionPerformed

    private void aplicarHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aplicarHoraActionPerformed
        cronometro.setHoras(Integer.parseInt(ponerHora.getText()));
        cronometro.setMinutos(Integer.parseInt(ponerMinutos.getText()));        
        cronometro.setSegundos(Integer.parseInt(ponerSegundos.getText()));
        
    }//GEN-LAST:event_aplicarHoraActionPerformed

    private void ponerHoraPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ponerHoraPrincipalActionPerformed
        dialogoHora.setVisible(true);
        
    }//GEN-LAST:event_ponerHoraPrincipalActionPerformed

    private void pararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pararActionPerformed
        cronometro.suspend();
    }//GEN-LAST:event_pararActionPerformed

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
            java.util.logging.Logger.getLogger(ejercicio5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ejercicio5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ejercicio5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ejercicio5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ejercicio5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aplicarHora;
    private javax.swing.JDialog dialogoHora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField mostrarHora;
    private javax.swing.JButton parar;
    private javax.swing.JTextField ponerHora;
    private javax.swing.JButton ponerHoraPrincipal;
    private javax.swing.JTextField ponerMinutos;
    private javax.swing.JTextField ponerSegundos;
    private javax.swing.JButton reanudar;
    private javax.swing.JButton resetear;
    // End of variables declaration//GEN-END:variables
}