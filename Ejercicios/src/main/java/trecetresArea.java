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

public class trecetresArea {
    public static void main(String arg[]){
        double lado1=Double.parseDouble(JOptionPane.showInputDialog(null,"Introduce lado1"));
        double lado2=Double.parseDouble(JOptionPane.showInputDialog(null,"Introduce lado2"));
        double lado3=Double.parseDouble(JOptionPane.showInputDialog(null,"Introduce lado3"));
        double t=((lado1+lado2+lado3)/2);
        double area=Math.sqrt(t*(t-lado1)*(t-lado2)*(t-lado3));
        JOptionPane.showMessageDialog(null, "Area = "+area);
    }
}
