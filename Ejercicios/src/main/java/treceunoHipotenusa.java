/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author x535
 */
import javax.swing.*;

public class treceunoHipotenusa {
    public static void main(String arg[]){
        int cateto1=Integer.parseInt(JOptionPane.showInputDialog("Introduce cateto 1"));
        int cateto2=Integer.parseInt(JOptionPane.showInputDialog("Introduce cateto 2"));
        double hipotenusa=Math.sqrt(cateto1*cateto1+cateto2*cateto2);
        JOptionPane.showMessageDialog(null,"Hipotenusa ="+hipotenusa);
        
    }
}
