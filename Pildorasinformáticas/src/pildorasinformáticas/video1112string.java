/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pildorasinformáticas;

/**
 *
 * @author x535
 */
public class video1112string {
    public static void main(String[] args){
    String lel= "hola";
    String lol= "hole";
    int ultimaLetra;
    ultimaLetra=lol.length();
    String frase="Hoy es un estupendo dia para aprender a programar en Java";
    String fraseResumen=frase.substring(0,28)+" irnos a la playa y olvidarnos de todo..."+frase.substring(29, 57);
    String alumno1,alumno2;
    alumno1="Jesus";
    alumno2="JESUS";
        System.out.println("Mi palabra tiene "+lel.length()+" caracteres.");
        System.out.println("El primer caracter de mi palabra es "+lel.charAt(0));
        System.out.println("Las palabras "+lel+" "+lol+" son "+lel.equals(lol));
        System.out.println("La ultima letra es "+lel.charAt(ultimaLetra-1));
        System.out.println("--------------------");
        System.out.println(fraseResumen);
        System.out.println("--------------------");
        System.out.println(alumno1.equalsIgnoreCase(alumno2));
    }
}
