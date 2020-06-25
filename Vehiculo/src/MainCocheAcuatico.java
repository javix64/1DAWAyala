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

public class MainCocheAcuatico {


    public static void main(String[] args) {
        String modelo = JOptionPane.showInputDialog("Introduzca el modelo del coche acuático");
        String matricula = JOptionPane.showInputDialog("Introduzca la matricula del coche acuático");
        String color = JOptionPane.showInputDialog("Introduzca el color del coche acuático");
        CocheAcuatico cocheAcuatico = new CocheAcuatico(modelo, matricula, color);
        int opcion;
        
        String textoMenu = "0: Finalizar programa\n"
                + "1: Arrancar\n"
                + "2: Parar\n"
                + "3: Girar a la derecha\n"
                + "4: Girar a la izquierda\n"
                + "5: Cambio de medio\n"
                + "6: Inmersión\n"
                + "7: Ascender\n"
                + "8: Descender\n"
                + "9: Mover\n"
                + "10: Mostrar estado por consola\n"
                + "Introduzca una opción";
        
        do{
            do{
                opcion=Integer.parseInt(JOptionPane.showInputDialog(textoMenu));
            } while (opcion<0 || opcion>10);
            
            switch (opcion){
                /* Arrancar */
                case 1: cocheAcuatico.arrancar();
                        JOptionPane.showMessageDialog(null, "Coche acuático arrancado");break;
                /* Parar */
                case 2: cocheAcuatico.parar(); 
                        JOptionPane.showMessageDialog(null, "Coche acuático parado"); break;
                /* Girar a la derecha */
                case 3: cocheAcuatico.girarDerecha();
                        switch (cocheAcuatico.getDireccion()){
                            case 0: JOptionPane.showMessageDialog(null, "Mirando al Norte"); break;
                            case 1: JOptionPane.showMessageDialog(null, "Mirando al Este"); break;
                            case 2: JOptionPane.showMessageDialog(null, "Mirando al Sur"); break;
                            case 3: JOptionPane.showMessageDialog(null, "Mirando al Oeste"); break;
                        }
                        break;
                /* Girar a la izquierda */
                case 4: cocheAcuatico.girarIzquierda();
                        switch (cocheAcuatico.getDireccion()){
                            case 0: JOptionPane.showMessageDialog(null, "Mirando al Norte"); break;
                            case 1: JOptionPane.showMessageDialog(null, "Mirando al Este"); break;
                            case 2: JOptionPane.showMessageDialog(null, "Mirando al Sur"); break;
                            case 3: JOptionPane.showMessageDialog(null, "Mirando al Oeste"); break;
                        }
                        break;
                /* Cambio de medio */
                case 5: if (cocheAcuatico.getZ()==0){
                            cocheAcuatico.cambioDeMedio();
                            JOptionPane.showMessageDialog(null, "El coche está ahora en "+cocheAcuatico.getMedio());
                        } else {
                            JOptionPane.showMessageDialog(null, "El coche debe estar en la superficie");
                        } break;
                /* Inmersión */
                case 6: if (cocheAcuatico.estaArrancado()){
                            if (cocheAcuatico.getMedio().equals("agua")){
                                cocheAcuatico.inmersion();
                                JOptionPane.showMessageDialog(null, "El coche acuático se ha sumergido");
                            } else {
                                JOptionPane.showMessageDialog(null, "El coche tiene que estar en el agua");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Primero es necesario arrancar el coche");
                        } break;
                /* Ascender */
                case 7: if (cocheAcuatico.estaArrancado() && cocheAcuatico.getMedio().equals("agua") && cocheAcuatico.estaInmerso()){
                            int n=Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos metros desea ascender?"));
                            cocheAcuatico.ascender(n); 
                            JOptionPane.showMessageDialog(null, "Ha subido hasta los "+cocheAcuatico.getZ()+" metros de profundidad");
                            if (cocheAcuatico.getZ()==0){
                                JOptionPane.showMessageDialog(null, "El coche ha emergido");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "El coche debe estar arrancado, en el agua e inmerso");
                        } break;
                /* Descender */
                case 8: if (cocheAcuatico.estaArrancado() && cocheAcuatico.getMedio().equals("agua") && cocheAcuatico.estaInmerso()){
                            int n=Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos metros desea descender?"));
                            cocheAcuatico.descender(n); 
                            JOptionPane.showMessageDialog(null, "Ha bajado hasta los "+cocheAcuatico.getZ()+" metros de profundidad");
                        } else {
                            JOptionPane.showMessageDialog(null, "El coche debe estar arrancado, en el agua e inmerso");
                        } break;
                /* Mover */
                case 9: if (cocheAcuatico.estaArrancado()){
                            int o=Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos metros desea avanzar?"));
                            cocheAcuatico.mover(o); 
                            JOptionPane.showMessageDialog(null, "Está en "+cocheAcuatico.getX()+","+cocheAcuatico.getY());break;
                        } else {
                            JOptionPane.showMessageDialog(null, "Primero es necesario arrancar el coche");
                        } break;
                /* Imprimir estado */
                case 10: cocheAcuatico.imprimeEstado(); break;
            }
        }while (opcion!=0);
    }
    
}