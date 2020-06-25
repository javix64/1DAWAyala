/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package explicacionjesus;

import javax.swing.JOptionPane;

/**
 *
 * @author x535
 */
public class mainCilindro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double radio;
        double altura;
        radio=Double.parseDouble(JOptionPane.showInputDialog("Introduce radio"));
        
        altura=Double.parseDouble(JOptionPane.showInputDialog("Introduce altura"));
        
        cilindro cilindro1= new cilindro(radio, altura);
     
        JOptionPane.showMessageDialog(null,"\nEl area del cilindro es"+cilindro1.area()+"\nEl volumen del cilindro es"+cilindro1.volumen()+"\n La altura es:"+cilindro1.getAltura()+"\nEl radio es: "+cilindro1.getRadio());
        
        cilindro cilindro2= new cilindro();
     
        JOptionPane.showMessageDialog(null,"\nEl area del cilindro es"+cilindro2.area()+"\nEl volumen del cilindro es"+cilindro2.volumen()+"\n La altura es:"+cilindro2.getAltura()+"\nEl radio es: "+cilindro2.getRadio());
        
        
    }
    
}
