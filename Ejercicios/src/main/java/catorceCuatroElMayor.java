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

public class catorceCuatroElMayor {
    public static void main(String atr[]) {
        int numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero uno;"));
        int numero2=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero dos"));
        int numero3=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero tres "));
        
        
        if ((numero>numero2)&&(numero>numero3))
            JOptionPane.showMessageDialog(null, numero + " es el numero mayor");
        else 
            if (numero2>numero && numero2>numero3)
            JOptionPane.showMessageDialog(null, numero2 + " es el numero mayor.");
            else
            JOptionPane.showMessageDialog(null, numero3 + " es el numero mayor.");
            
    }
}
