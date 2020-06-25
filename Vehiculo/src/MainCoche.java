/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
/**
 *
 * @author x535
 */
public class MainCoche {

public static void main(String[] args) {
        String modelo = JOptionPane.showInputDialog("Introduzca el modelo del coche");
        String matricula = JOptionPane.showInputDialog("Introduzca la matricula del coche");
        String color = JOptionPane.showInputDialog("Introduzca el color del coche");
        
        Coche coche = new Coche(modelo, matricula, color);
        
        
        int opcion;
        String textoMenu = "0: Finalizar programa\n"
                + "1: Arrancar\n"
                + "2: Parar\n"
                + "3: Girar a la derecha\n"
                + "4: Girar a la izquierda\n"
                + "5: Mover\n"
                + "6: Mostrar estado por consola\n"
                + "Introduzca una opción";
        
        do{
            opcion=Integer.parseInt(JOptionPane.showInputDialog(textoMenu));
            
            switch (opcion){
                /* Arrancar */
                case 1: coche.arrancar();
                        JOptionPane.showMessageDialog(null, "Coche arrancado");break;
                /* Parar */
                case 2: coche.parar(); 
                        JOptionPane.showMessageDialog(null, "Coche parado"); break;
                /* Girar a la derecha */
                case 3: coche.girarDerecha();
                        switch (coche.getDireccion()){
                            case 0: JOptionPane.showMessageDialog(null, "Mirando al Norte"); break;
                            case 1: JOptionPane.showMessageDialog(null, "Mirando al Este"); break;
                            case 2: JOptionPane.showMessageDialog(null, "Mirando al Sur"); break;
                            case 3: JOptionPane.showMessageDialog(null, "Mirando al Oeste"); break;
                        }
                        break;
                /* Girar a la izquierda */
                case 4: coche.girarIzquierda();
                        switch (coche.getDireccion()){
                            case 0: JOptionPane.showMessageDialog(null, "Mirando al Norte"); break;
                            case 1: JOptionPane.showMessageDialog(null, "Mirando al Este"); break;
                            case 2: JOptionPane.showMessageDialog(null, "Mirando al Sur"); break;
                            case 3: JOptionPane.showMessageDialog(null, "Mirando al Oeste"); break;
                        }
                        break;
                /* Mover */
                case 5: if (coche.estaArrancado()){
                            int o=Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos metros desea avanzar?"));
                            coche.mover(o); 
                            JOptionPane.showMessageDialog(null, "Está en "+coche.getX()+","+coche.getY());break;
                        } else {
                            JOptionPane.showMessageDialog(null, "Primero es necesario arrancar el coche");
                        } break;
                /* Imprimir estado */
                case 6: coche.imprimeEstado(); break;
            }
        }while (opcion!=0);
    }
    
}
