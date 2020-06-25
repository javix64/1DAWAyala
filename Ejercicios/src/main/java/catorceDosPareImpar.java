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
public class catorceDosPareImpar {
    public static void main(String arg[]) {
        //% es el operador
        int numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
        if (numero%2==0){
            JOptionPane.showMessageDialog(null,("El numero es par"));
        }
        else
            JOptionPane.showMessageDialog(null,("EL numero es impar"));
    }
}
