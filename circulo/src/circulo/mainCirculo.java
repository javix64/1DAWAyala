/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circulo;

import javax.swing.*;

/**
 *
 * @author x535
 */
public class mainCirculo {
    public static void main(String[] args){
        circulo circulo1;//circulo circulo1=new circulo();
        double radio=Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio"));
        //Creamos el primer objeto circulo mediante el constructor con parametros
        circulo1=new circulo(radio);
        System.out.println("Esta es la circunferencia: "+circulo1.getCircunferencia()+
                "\nEste es su area: " +circulo1.getArea()+
                "\nEste es el numero de circulos="+circulo.numCirculos);
    }
}
