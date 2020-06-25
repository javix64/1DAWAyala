/*
    Realizad un programa para deducir el mayor de tres valores introducidos por teclado.
 */

/**
 *
 * @author x535
 */
import javax.swing.*;
public class cuatro07 {
    public static void main(String[] args){
        int num1=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce el primer número:"));
        int num2=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce el segundo número:"));
        int num3=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce el tercer número:"));
        if (num1>num2 && num1>num3)
            JOptionPane.showMessageDialog(null, "El número "+num1+ " Es mayor que "+num2+" y "+num3);
        else if(num2>num1 && num2>num3)
            JOptionPane.showMessageDialog(null, "El número "+num2+ " Es mayor que "+num1+" y "+num3);
        else
            JOptionPane.showMessageDialog(null, "El número "+num3+ " Es mayor que "+num1+" y "+num2);
    }
}
