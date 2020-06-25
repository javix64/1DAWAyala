/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4Caracter;

/**
 *
 * @author x535
 */
public class mainCadena {
    public static void main(String[] args) {
        Cadena cad = new Cadena("Hola que tal");
	System.out.print("Cadena Creada:");
	cad.visualizaCadena();
        
        System.out.print("Invertir Cadena:");
	cad.invierteCadena();
	cad.visualizaCadena();
        
        System.out.println("Cadena a la normalidad");
	cad.invierteCadena();
	cad.visualizaCadena();
        
        System.out.println("Cadena Encriptada");
        cad.encriptarCadena();
        cad.visualizaCadena();
        
        System.out.println("Cadena desecriptada");
	cad.desencriptaCadena();
	cad.visualizaCadena();
    }
}

