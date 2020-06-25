import java.util.ArrayList;
public class ConsultaMedico extends javax.swing.JFrame {
    ArrayList <Persona> pacientes;
    /**
     * Creates new form ConsultaMedico
     */
    public ConsultaMedico() {
        initComponents();
        pacientes = new ArrayList <Persona>();//defines arraylist y lo ultimo es el 
                                        //inicializar el arrayList por su constructor por defecto
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        citaNueva = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pacienteNuevo = new javax.swing.JTextField();
        telefonoNuevo = new javax.swing.JTextField();
        addPaciente = new javax.swing.JButton();
        pacientesAtendidos = new java.awt.List();
        listaEspera = new java.awt.List();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pacienteConsulta = new javax.swing.JTextField();
        solicitarCita = new javax.swing.JButton();
        comenzarConsulta = new javax.swing.JButton();
        siguientePaciente = new javax.swing.JButton();
        finalizarPaciente = new javax.swing.JButton();

        citaNueva.setMinimumSize(new java.awt.Dimension(395, 228));
        citaNueva.setModal(true);

        jLabel4.setText("Paciente");

        jLabel5.setText("Telefono");

        pacienteNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pacienteNuevoActionPerformed(evt);
            }
        });

        telefonoNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoNuevoActionPerformed(evt);
            }
        });

        addPaciente.setText("Añadir");
        addPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPacienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout citaNuevaLayout = new javax.swing.GroupLayout(citaNueva.getContentPane());
        citaNueva.getContentPane().setLayout(citaNuevaLayout);
        citaNuevaLayout.setHorizontalGroup(
            citaNuevaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(citaNuevaLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(citaNuevaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addPaciente)
                    .addGroup(citaNuevaLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(telefonoNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(citaNuevaLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pacienteNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        citaNuevaLayout.setVerticalGroup(
            citaNuevaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(citaNuevaLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(citaNuevaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(pacienteNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(citaNuevaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(telefonoNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(addPaciente)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(890, 588));
        setResizable(false);

        pacientesAtendidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pacientesAtendidosActionPerformed(evt);
            }
        });

        jLabel1.setText("Lista de espera");

        jLabel2.setText("Pacientes atendidos");

        jLabel3.setText("Paciente en consulta");

        solicitarCita.setText("Solicitar cita");
        solicitarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solicitarCitaActionPerformed(evt);
            }
        });

        comenzarConsulta.setText("Comenzar consulta");
        comenzarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comenzarConsultaActionPerformed(evt);
            }
        });

        siguientePaciente.setText("Siguiente paciente");
        siguientePaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguientePacienteActionPerformed(evt);
            }
        });

        finalizarPaciente.setText("Finalizar paciente");
        finalizarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizarPacienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(solicitarCita)
                        .addGap(63, 63, 63)
                        .addComponent(comenzarConsulta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(siguientePaciente))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(45, 45, 45))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pacienteConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                        .addComponent(finalizarPaciente)))
                .addGap(204, 204, 204))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pacientesAtendidos, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(214, 214, 214))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(56, 56, 56)
                    .addComponent(listaEspera, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(605, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel1)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(34, 34, 34)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pacientesAtendidos, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(pacienteConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(finalizarPaciente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(solicitarCita)
                    .addComponent(comenzarConsulta)
                    .addComponent(siguientePaciente))
                .addGap(41, 41, 41))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(100, 100, 100)
                    .addComponent(listaEspera, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(177, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pacientesAtendidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pacientesAtendidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pacientesAtendidosActionPerformed

    private void addPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPacienteActionPerformed
        Persona persona1 = new Persona(pacienteNuevo.getText(),
                Integer.parseInt(telefonoNuevo.getText()));
        pacientes.add(persona1);
        pacienteNuevo.setText("");
        telefonoNuevo.setText("");
        pacienteNuevo.requestFocus();
    }//GEN-LAST:event_addPacienteActionPerformed

    private void solicitarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solicitarCitaActionPerformed
        citaNueva.setVisible(true);
    }//GEN-LAST:event_solicitarCitaActionPerformed

    private void pacienteNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pacienteNuevoActionPerformed
        telefonoNuevo.requestFocus();
    }//GEN-LAST:event_pacienteNuevoActionPerformed

    private void telefonoNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoNuevoActionPerformed
        addPaciente.requestFocus();
    }//GEN-LAST:event_telefonoNuevoActionPerformed

    private void comenzarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comenzarConsultaActionPerformed
        listaEspera.removeAll();
        pacientesAtendidos.removeAll();
        
        for (int i = pacientes.size()-1; i>=0; i--) {
            listaEspera.add(pacientes.get(i).getNombre());
        }
    }//GEN-LAST:event_comenzarConsultaActionPerformed

    private void siguientePacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguientePacienteActionPerformed
        pacienteConsulta.setText(listaEspera.getItem(listaEspera.getItemCount()-1));
        listaEspera.remove(listaEspera.getItemCount()-1);
    }//GEN-LAST:event_siguientePacienteActionPerformed

    private void finalizarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizarPacienteActionPerformed
        pacientesAtendidos.add(pacienteConsulta.getText());
        pacienteConsulta.setText(null);
    }//GEN-LAST:event_finalizarPacienteActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultaMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaMedico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPaciente;
    private javax.swing.JDialog citaNueva;
    private javax.swing.JButton comenzarConsulta;
    private javax.swing.JButton finalizarPaciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private java.awt.List listaEspera;
    private javax.swing.JTextField pacienteConsulta;
    private javax.swing.JTextField pacienteNuevo;
    private java.awt.List pacientesAtendidos;
    private javax.swing.JButton siguientePaciente;
    private javax.swing.JButton solicitarCita;
    private javax.swing.JTextField telefonoNuevo;
    // End of variables declaration//GEN-END:variables
}
