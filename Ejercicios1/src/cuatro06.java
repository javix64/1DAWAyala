/*
Realizad un programa que lea dos valores desde teclado y diga si cualquiera de ellos divide de forma
entera al otro.
 */

/**
 *
 * @author x535
 */
import javax.swing.*;
public class cuatro06 {
    public static void main(String[] args){
        int numero1=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce el primer numero:"));
        int numero2=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce el segundo numero:"));
        if (numero1%numero2==0)
            JOptionPane.showMessageDialog(null,"El numero "+numero1+" es divisible por "+numero2);
        else if (numero2%numero1==0)
            JOptionPane.showMessageDialog(null,"El numero "+numero2+" no es divisible por "+numero1);
        else
            JOptionPane.showMessageDialog(null,"Ninguno divide al otro de forma entera");
        
    }
    
}
