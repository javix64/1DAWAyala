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
public class catorceTresDivisionEntero {
    public static void main(String arg[]){
        int numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
        int numerodos=Integer.parseInt(JOptionPane.showInputDialog("Introduce otro numero"));
        if (numero%numerodos==0){
            JOptionPane.showMessageDialog(null,numero+"El numero es divisible por "+ numerodos);
        }
        else if(numerodos%numero==0)
            JOptionPane.showMessageDialog(null,numerodos+" El numero es impar"+numero);
        else
            JOptionPane.showMessageDialog(null, "Ninguno divide de forma entera al otro");
    }
}
