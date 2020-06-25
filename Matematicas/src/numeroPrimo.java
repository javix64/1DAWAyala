/*
    Ulizando dicha clase haced un programa para calcular si un número es primo o no.
 */

/**
 *
 * @author x535
 */
import javax.swing.*;
public class numeroPrimo {
    public static void main(String[] arg){
        int num=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
        boolean esPrimo = Mate.esPrimos(num);
        if (esPrimo)
            JOptionPane.showMessageDialog(null,"El número no es primo");
        else    
            JOptionPane.showMessageDialog(null,"El número es primo");
    }
}