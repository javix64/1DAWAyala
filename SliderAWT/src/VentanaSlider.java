
public class VentanaSlider extends javax.swing.JFrame {
    int diasMes[]={0,31,59,90,120,151,181,212,242,273,303,334};
    public VentanaSlider() {
        initComponents();  
        setLocationRelativeTo(null);
        setSize(400,250);
    }   
    
    public void actualizaChoiceDia(int mes) {
        int diasActuales=chDia.getItemCount();
        int nuevosDias;
        switch(mes) {
           case 1:
           case 3:
           case 5:
           case 7:
           case 8:
           case 10:
           case 12: nuevosDias=31; break;
           case 2: nuevosDias=28; break;
           default: nuevosDias=30;
        }       
        if(nuevosDias<diasActuales)
            for(int i=diasActuales; i>nuevosDias; i--)
                chDia.remove(i-1);
        if(nuevosDias>diasActuales)
            for(int i=diasActuales; i<nuevosDias; i++)
                chDia.add(""+(i+1));
        
        // Una forma de hacerlo mas sencillo
        /*chDia.removeAll();
        for(int i=1; i<=n; i++)
           chDia.addItem("" + i);*/
    }
   
    public void actualizarScroll() {
        /*int mes=chMes.getSelectedIndex() + 1;
        int dia=chDia.getSelectedIndex() + 1;
        switch(mes) {
           case 1: break;
           case 2: dia+=31; break;
           case 3: dia+=59; break;
           case 4: dia+=90; break;
           case 5: dia+=120; break;
           case 6: dia+=151; break;
           case 7: dia+=181; break;
           case 8: dia+=212; break;
           case 9: dia+=242; break;
           case 10: dia+=273; break;
           case 11: dia+=303; break;
           case 12: dia+=334; break;
        }
        scb1.setValue(dia);*/
        
        // Otra forma de hacerlo mas facil
        int valorScroll=diasMes[chMes.getSelectedIndex()]+chDia.getSelectedIndex()+1;
        scb1.setValue(valorScroll);
    }
   
    public void actualizaChoices() {
        /*int x=scb1.getValue();
        int mes=0, dia=0;
        if(x<=31) {
            mes=1; dia=x;
        } else
            if(x<=59) {
                mes=2; dia=x-31;
            } else
                if(x<=90) {
                    mes=3; dia=x-59;
                } else
                    if(x<=120) {
                        mes=4; dia=x-90;
                    } else
                        if(x<=151) {
                            mes=5; dia=x-120;
                        } else
                            if(x<=181) {
                                mes=6; dia=x-151;
                            } else
                                if(x<=212) {
                                    mes=7; dia=x-181;
                                } else
                                    if(x<=243) {
                                        mes=8; dia=x-212;
                                    } else
                                        if(x<=273) {
                                            mes=9; dia=x-243;
                                        } else
                                            if(x<=304) {
                                                mes=10; dia=x-273;
                                            } else
                                                if(x<=334) {
                                                    mes=11; dia=x-304;
                                                } else {
                                                    mes=12; dia=x-334;
                                                }        
        actualizaChoiceDia(mes);
        chDia.select(dia-1);
        chMes.select(mes-1);*/
        
        // Otra forma de hacerlo mas sencillo
        int valorScroll=scb1.getValue();
        int mes=0;
        while(valorScroll<diasMes[mes])
            mes++;
        actualizaChoiceDia(mes);
        int dia=valorScroll-diasMes[mes-1];
        chDia.select(dia-1);
        chMes.select(mes-1);
    }
  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chDia = new java.awt.Choice();
        chMes = new java.awt.Choice();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        scb1 = new java.awt.Scrollbar();
        button1 = new java.awt.Button();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Con AWT");

        chDia.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chDiaItemStateChanged(evt);
            }
        });

        chMes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chMesItemStateChanged(evt);
            }
        });

        label1.setText("Dia");

        label2.setText("Mes");

        scb1.setMaximum(375);
        scb1.setMinimum(1);
        scb1.setOrientation(java.awt.Scrollbar.HORIZONTAL);
        scb1.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            public void adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {
                scb1AdjustmentValueChanged(evt);
            }
        });

        button1.setLabel("Resetear");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(30, 30, 30)
                .add(label1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(chDia, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(27, 27, 27)
                        .add(label2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 38, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(12, 12, 12)
                        .add(chMes, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 130, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(17, 17, 17)
                        .add(scb1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 205, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(72, 72, 72))))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(button1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 80, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(135, 135, 135))
            .add(layout.createSequentialGroup()
                .add(139, 139, 139)
                .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 72, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(60, 60, 60)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(label1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(label2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(chMes, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(chDia, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(28, 28, 28)
                .add(scb1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 41, Short.MAX_VALUE)
                .add(button1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 14, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        for(int i=1; i<=31; i++)
        chDia.addItem(""+i);
        chMes.addItem("Enero");
        chMes.addItem("Febrero");
        chMes.addItem("Marzo");
        chMes.addItem("Abril");
        chMes.addItem("Mayo");
        chMes.addItem("Junio");
        chMes.addItem("Julio");
        chMes.addItem("Agosto");
        chMes.addItem("Septiembre");
        chMes.addItem("Octubre");
        chMes.addItem("Noviembre");
        chMes.addItem("Diciembre");
    }// </editor-fold>//GEN-END:initComponents

    private void chMesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chMesItemStateChanged
        int mes=chMes.getSelectedIndex()+1;
        actualizaChoiceDia(mes);
        actualizarScroll();
}//GEN-LAST:event_chMesItemStateChanged
    
    private void chDiaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chDiaItemStateChanged
        actualizarScroll();
}//GEN-LAST:event_chDiaItemStateChanged

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        chDia.select("1");
        chMes.select("Enero");
        scb1.setValue(1);
        actualizaChoices();
    }//GEN-LAST:event_button1ActionPerformed

    private void scb1AdjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {//GEN-FIRST:event_scb1AdjustmentValueChanged
        actualizaChoices();
    }//GEN-LAST:event_scb1AdjustmentValueChanged
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private java.awt.Choice chDia;
    private java.awt.Choice chMes;
    private javax.swing.JLabel jLabel1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Scrollbar scb1;
    // End of variables declaration//GEN-END:variables
     public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaSlider().setVisible(true);
            }
        });
    }
   
}
