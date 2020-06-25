/*
Haced un programa que nos sume los números naturales, comprendidos entre dos números
introducidos por teclado.
 */

/**
 *
 * @author x535
 */
import javax.swing.*;
public class cuatro09 {
    public static void main(String[] args){
        int suma=0;
        int num1=Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce primer valor:"));
        int num2=Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce último valor:"));
        for (int i=num1;i<=num2; ++i){
            suma=suma+i;
        }
        JOptionPane.showMessageDialog(null, "La suma es" +suma);
    }
}
