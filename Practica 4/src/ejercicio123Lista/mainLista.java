/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio123Lista;
/**
 *
 * @author x535
 */
import javax.swing.*;

public class mainLista{
    public static void main(String[] args) {
        System.out.println("Introduce elemento en lista:");
        Lista lista = new Lista();
        
        String ob = JOptionPane.showInputDialog("Introduce elemento");
        System.out.println("Visualizar objeto:");
        lista.ponUltimo(ob);
        lista.visualizaElemento();
        
        String ob2 = JOptionPane.showInputDialog("Introduce elemento");
        lista.ponUltimo(ob2);
        lista.visualizaElemento();
        
        System.out.println("Introduce otro elemento en lista:");
        String ob3 = JOptionPane.showInputDialog("Introduce elemento");
        lista.ponUltimo(ob3);
        lista.visualizaElemento();
        
        System.out.println("Esta vacia la lista?");
        System.out.println( lista.estaVacia() );
        System.out.println("Eliminar el primer elemento");
        lista.extraePrimero();
        lista.visualizaElemento();
        
        System.out.println("Eliminar el ultimo elemento");
        lista.extraeUltimo();
        lista.visualizaElemento();
        

	}
}