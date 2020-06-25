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

public class catorceSeisSumaNumerosReales {
    public static void main(String arg[]){
        double suma=0, desde, hasta;
        desde=Double.parseDouble(JOptionPane.showInputDialog("Introduce primer numero"));
        hasta=Double.parseDouble(JOptionPane.showInputDialog("Introduce último numero"));
        for(double i=desde;i<=hasta;i++){
          suma=suma+i;//suma+=i; es lo mismo
        }
        JOptionPane.showMessageDialog(null, "La suma es "+ suma);
    }
}
