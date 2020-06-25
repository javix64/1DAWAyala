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
public class catorceunoPositivoNegativo {
    public static void main(String arg[]){
        double numero=Double.parseDouble(JOptionPane.showInputDialog("Introduce un numero"));
        if (numero>0){
            JOptionPane.showMessageDialog(null,("El numero es positivo"));
        }
        else
            JOptionPane.showMessageDialog(null,("EL numero es negativo"));
    }
}