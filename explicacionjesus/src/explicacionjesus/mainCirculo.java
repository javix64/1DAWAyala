/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package explicacionjesus;
import javax.swing.*;
/**
 *
 * @author x535
 */
public class mainCirculo {
    public static void main(String[] args){
        double radio;
        radio=Double.parseDouble(JOptionPane.showInputDialog("Introduce radio"));
        
        //circulo circulo1;
        //circulo1 = new circulo(radio);//esto se peude hacer asi
        circulo circulo1= new circulo(radio);
        
//        double area =circulo1.area();
//        double circunferencia = circulo1.circunferencia();
//        int numCirculos= circulo1.getnumCirculos();
//        //int numCirculos= circulo.numCirculos;  
        
        JOptionPane.showMessageDialog(null,"El area circulo vale: "+circulo1.area()+"\n y su circunferencia es"+circulo1.circunferencia()+"\n El numero circulos es: "+circulo.numCirculos+"\n El radio es:"+circulo1.getRadio());
        
        circulo circulo2= new circulo();
        JOptionPane.showMessageDialog(null,"El area circulo vale: "+circulo2.area()+"\n y su circunferencia es"+circulo2.circunferencia()+"\n El numero circulos es: "+circulo.numCirculos+"\n El radio es:"+circulo2.getRadio());
        
        
    }
}
