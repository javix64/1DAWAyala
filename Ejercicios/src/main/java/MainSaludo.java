/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Javier
 */
import javax.swing.*;

public class MainSaludo {
    public static void main(String arg[]){
        System.out.println("Eh qué pasa eres el mejor.");
        String nombre=JOptionPane.showInputDialog("Introduce tu nombre");
        JOptionPane.showMessageDialog(null,"HOla que taal"+nombre+"?");
    }
}