/*
Diseñad un programa para leer las longitudes de los lados de un triángulo y determine que tipo de
triángulo es, de acuerdo a los siguientes casos: suponiendo que A es el mayor de los lados y que B y
C corresponden a los otros 2 lados:
Si A >= B + C No es un triángulo
Si A2 = B2 + C2 Triángulo rectángulo
Si A2 > B2 + C2 Triángulo obtusángulo
Si A2 < B2 + C2 Triángulo acutángulo
 */

/**
 *
 * @author x535
 */
import javax.swing.*;

public class cuatro08 {
    
    public static void main(String[] args){
        
        double lado1=Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce el primer lado"));
        double lado2=Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce el segundo lado"));
        double lado3=Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce el tercer lado"));
        if(lado1>=lado2+lado3)
            JOptionPane.showMessageDialog(null, "No es un triángulo");
            else if(Math.pow(lado1,2)==Math.pow(lado2,2)+Math.pow(lado3,2))
            JOptionPane.showMessageDialog(null,"Es un triángulo rectángulo");
                else if(Math.pow(lado1,2)>Math.pow(lado2,2)+Math.pow(lado3,2))
                JOptionPane.showMessageDialog(null, "Es un triángulo obtusángulo.");
                    else
                    JOptionPane.showMessageDialog(null, "Es un triángulo acutángulo.");
            }
}
