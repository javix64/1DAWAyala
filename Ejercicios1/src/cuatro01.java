/*
Realizad un programa para calcular el valor de la hipotenusa de un triángulo rectángulo conocidos
los 2 catetos aplicando el teorema de Pitágoras.
la hipotenusa es c²+C²=h² 

*/

/**
 *
 * @author x535
 */
import javax.swing.*;
public class cuatro01 {
    public static void main(String[] args){
        double cateto1=Double.parseDouble(JOptionPane.showInputDialog("Introduce primer cateto: "));
        double cateto2=Double.parseDouble(JOptionPane.showInputDialog("Introduce segundo cateto: "));
        double hipotenusa=Math.sqrt(cateto1*cateto1+cateto2*cateto2);
        JOptionPane.showMessageDialog(null, "La hipotenusa es: "+hipotenusa);

    }
}
