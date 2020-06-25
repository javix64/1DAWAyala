public class GUI06 extends java.awt.Frame {

    public GUI06() {
        cbg=new java.awt.CheckboxGroup() ;
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        bNorte = new java.awt.Button();
        bEste = new java.awt.Button();
        bSur = new java.awt.Button();
        panel1 = new java.awt.Panel();
        checkbox1 = new java.awt.Checkbox();
        checkbox2 = new java.awt.Checkbox();
        bCentro = new java.awt.Button();

        setBackground(java.awt.Color.lightGray);
        setMinimumSize(new java.awt.Dimension(600, 400));
        setTitle("BorderLayout");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        bNorte.setActionCommand("Norte");
        bNorte.setLabel("Norte");
        bNorte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNorteActionPerformed(evt);
            }
        });
        add(bNorte, java.awt.BorderLayout.NORTH);

        bEste.setActionCommand("bEste");
        bEste.setLabel("Este");
        bEste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEsteActionPerformed(evt);
            }
        });
        add(bEste, java.awt.BorderLayout.EAST);

        bSur.setLabel("Sur");
        bSur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSurActionPerformed(evt);
            }
        });
        add(bSur, java.awt.BorderLayout.SOUTH);

        panel1.setMinimumSize(new java.awt.Dimension(40, 244));
        panel1.setName("pOeste"); // NOI18N
        panel1.setLayout(new java.awt.GridLayout(2, 1));

        checkbox1.setCheckboxGroup(cbg);
        checkbox1.setLabel("checkbox1");
        panel1.add(checkbox1);

        checkbox2.setCheckboxGroup(cbg);
        checkbox2.setLabel("checkbox2");
        panel1.add(checkbox2);

        add(panel1, java.awt.BorderLayout.WEST);

        bCentro.setLabel("Centro");
        add(bCentro, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    private void bNorteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNorteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bNorteActionPerformed

    private void bEsteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEsteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bEsteActionPerformed

    private void bSurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bSurActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI06().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button bCentro;
    private java.awt.Button bEste;
    private java.awt.Button bNorte;
    private java.awt.Button bSur;
    private javax.swing.ButtonGroup buttonGroup1;
    private java.awt.Checkbox checkbox1;
    private java.awt.Checkbox checkbox2;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables
    private java.awt.CheckboxGroup cbg;

}

