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

public class cuatroTrece {
    public static void main(String arg[]){
        int desde, hasta, suma=0, contar=0;
        desde=Integer.parseInt(JOptionPane.showInputDialog("Introduce primer numero:"));
        hasta=Integer.parseInt(JOptionPane.showInputDialog("Introduce último numero:"));
        if(desde%2==1)
            desde++;
        for(int i=desde;i<=hasta;i+=2){
          suma+=i;
          contar++;
          System.out.print(i + "  ");
        }
        JOptionPane.showMessageDialog(null, "La suma es "+ suma+ "Los numeros totales son: " +contar );
    }
}
