/*
4.5. Haced un programa para ver si un número introducido por teclado es par o impar
 */

/**
 *
 * @author x535
 */
import javax.swing.*;
public class cuatro05 {
    public static void main(String[] args){
        int numero=Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un número"));
        if (numero%2==0)
            JOptionPane.showMessageDialog(null, "El número es par.");
        else
            JOptionPane.showMessageDialog(null, "El número es impar.");
    }
    
}
