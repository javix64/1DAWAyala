/*
Diseñad un programa que a partir de las longitudes de los lados de un triángulo, calcule el área del
mismo, de acuerdo con la siguiente fórmula:
Area = SQRT(T*(T-S1)*(T-S2)*(T-S3))
donde T = (S1+S2+S3) / 2 y S1, S2, S3 son las longitudes de los lados del triángulo.
 */

/**
 *
 * @author x535
 */
import javax.swing.*;
public class cuatro03 {
    public static void main(String[] args){
        double s1=Double.parseDouble(JOptionPane.showInputDialog(null,"Introduce lado 1:"));
        double s2=Double.parseDouble(JOptionPane.showInputDialog(null,"Introduce lado 1:"));
        double s3=Double.parseDouble(JOptionPane.showInputDialog(null,"Introduce lado 1:"));
        double T=(s1+s2+s3)/2;
        JOptionPane.showMessageDialog(null,"Area del triangulo:"+Math.sqrt(T*(T-s1)*(T-s2)*(T-s3)));
    }
}
