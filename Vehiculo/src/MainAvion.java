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
public class MainAvion {
    public static void main(String[] args) {
        avion avion = new avion();
        int opcion;
        
        String textoMenu = "0: Finalizar programa\n"
                + "1: Arrancar\n"
                + "2: Parar\n"
                + "3: Girar a la derecha\n"
                + "4: Girar a la izquierda\n"
                + "5: Despegar\n"
                + "6: Subir\n"
                + "7: Bajar\n"
                + "8: Mover\n"
                + "9: Mostrar estado por consola\n"
                + "Introduzca una opción";
        
        do{
            opcion=Integer.parseInt(JOptionPane.showInputDialog(textoMenu));
            
            switch (opcion){
                /* Arrancar */
                case 1: avion.arrancar();
                        JOptionPane.showMessageDialog(null, "Avión arrancado");break;
                /* Parar */
                case 2: avion.parar(); 
                        JOptionPane.showMessageDialog(null, "Avión parado"); break;
                /* Girar a la derecha */
                case 3: avion.girarDerecha();
                        switch (avion.getDireccion()){
                            case 0: JOptionPane.showMessageDialog(null, "Mirando al Norte"); break;
                            case 1: JOptionPane.showMessageDialog(null, "Mirando al Este"); break;
                            case 2: JOptionPane.showMessageDialog(null, "Mirando al Sur"); break;
                            case 3: JOptionPane.showMessageDialog(null, "Mirando al Oeste"); break;
                        }
                        break;
                /* Girar a la izquierda */
                case 4: avion.girarIzquierda();
                        switch (avion.getDireccion()){
                            case 0: JOptionPane.showMessageDialog(null, "Mirando al Norte"); break;
                            case 1: JOptionPane.showMessageDialog(null, "Mirando al Este"); break;
                            case 2: JOptionPane.showMessageDialog(null, "Mirando al Sur"); break;
                            case 3: JOptionPane.showMessageDialog(null, "Mirando al Oeste"); break;
                        }
                        break;
                /* Despegar */
                case 5: if (avion.estaArrancado()){
                            if (avion.getDespegado()){
                                JOptionPane.showMessageDialog(null, "El avión ya estaba en el aire");
                            } else {
                                avion.despegar();
                                JOptionPane.showMessageDialog(null, "El avión despega");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Primero es necesario arrancar el avión");
                        } break;
                /* Subir */        
                case 6: if (avion.estaArrancado() && avion.getDespegado()){
                            int n=Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos metros desea subir?"));
                            avion.subir(n); 
                            JOptionPane.showMessageDialog(null, "Ha subido hasta los "+avion.getZ()+" metros");
                        } else {
                            JOptionPane.showMessageDialog(null, "El avión debe estar arrancado y haber despegado");
                        } break;
                /* Bajar */
                case 7: if (avion.estaArrancado() && avion.getDespegado()){
                            int m=Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos metros desea bajar?"));
                            avion.bajar(m); 
                            JOptionPane.showMessageDialog(null, "Ha bajado hasta los "+avion.getZ()+" metros"); break;
                        } else {
                            JOptionPane.showMessageDialog(null, "El avión debe estar arrancado y haber despegado");
                        } break;
                /* Mover */
                case 8: if (avion.estaArrancado()){
                            int o=Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos metros desea avanzar?"));
                            avion.mover(o); 
                            JOptionPane.showMessageDialog(null, "Está en "+avion.getX()+","+avion.getY());break;
                        } else {
                            JOptionPane.showMessageDialog(null, "Primero es necesario arrancar el avión");
                        } break;
                /* Imprimir estado */
                case 9: avion.imprimeEstado(); break;
            }
        }while (opcion!=0);
    }
}