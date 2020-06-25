/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5Cadena;

import javax.swing.JOptionPane;

/**
 *
 * @author java_
 */
public class MainCadena {
        public static void main(String[] args) {
        Cadena cadena=new Cadena(JOptionPane.showInputDialog(null,"Introduce la cadena"));
        System.out.println("Visualizar cadena");
        System.out.println(cadena.visualizarCadena());
        System.out.println("-------------------");

        System.out.println("Cadena invertida");
        cadena.invierteCadena();
        System.out.println(cadena.invierteCadena());
        System.out.println("-------------------");

        System.out.println("Encripta Cadena");
        cadena.encriptaCadena();
        System.out.println("-------------------");

        System.out.println("Desencriptar Cadena");
        cadena.desencriptarCadena(cadena.encriptaCadena());
    }
    
}
