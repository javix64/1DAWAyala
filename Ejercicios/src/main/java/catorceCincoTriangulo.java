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

public class catorceCincoTriangulo {
    public static void main(String arg[]){
        double a=Double.parseDouble(JOptionPane.showInputDialog("Introduce el lado A:"));
        double b=Double.parseDouble(JOptionPane.showInputDialog("Introduce el lado B:"));
        double c=Double.parseDouble(JOptionPane.showInputDialog("Introduce el lado C:"));
        if (a>=b+c)
            JOptionPane.showMessageDialog(null, "No es un triangulo");
            else if (Math.pow(a,2)==Math.pow(b,2)+Math.pow(c,2))
                JOptionPane.showMessageDialog(null, "es un triangulo rectangulo");
                else if (Math.pow(a,2)>Math.pow(b,2)+Math.pow(c,2))
                JOptionPane.showMessageDialog(null, "es un triangulo obtusangulo");
                    else
                    JOptionPane.showMessageDialog(null, "es un triangulo acutangulo");
    }
}
