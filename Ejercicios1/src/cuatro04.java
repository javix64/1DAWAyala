/*
Haced un programa para que leído desde el teclado un número nos diga si dicho número es positivo
o negativo. 
 */

/**
 *
 * @author x535
 */
import javax.swing.*;
public class cuatro04 {
    public static void main(String[] args){
        double numero=Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce un número:"));
        if (numero>0)
            JOptionPane.showMessageDialog(null,"El número es positivo");
        else
            JOptionPane.showMessageDialog(null, "El número es negativo");
    }
}
