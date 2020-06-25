/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author x535
 */
import javax.swing.*;
public class cuatroCatorce100veces {
    public static void main(String arg[]){
    boolean sw=true;
    int i;
    for (i=1;i<=100;i++) {
        if (sw==true){
            System.out.print("Hola...");
            sw=false;
        }
        else {
            System.out.print("Adios...");
            sw=true;
        }       
    }
    }
}
