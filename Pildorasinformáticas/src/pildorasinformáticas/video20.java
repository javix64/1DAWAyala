package pildorasinformáticas;

import javax.swing.*;
import java.util.*;
/**
 *
 * @author x535
 */
/*
public class video20{
    public static void main(String[] arg){
        String genero="";
        
        do{
            
            genero=JOptionPane.showInputDialog("Introduce tu genero H/M");
            
        }while(genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);

        
        int altura=Integer.parseInt(JOptionPane.showInputDialog("introduce tu altura en cm"));
        
        int pesoideal=0;
        
        if(genero.equalsIgnoreCase("H")){
            pesoideal=altura-110;
        }
        else if(genero.equalsIgnoreCase("M")){
            pesoideal=altura-120;
        }
        
        System.out.println("Tu peso ideal es "+pesoideal);
    }

}
*/

//hacer un programa que nos calcule el peso ideal de una persona segun su genero
public class video20{
    public static void main(String[] arg){
        
        String genero="";
        
        do{
        
            genero=JOptionPane.showInputDialog("Introduce tu genero H / M)");
        
        }while(genero.equals("H")==false && genero.equals("M")==false);
        
        int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en cm"));
        
        int pesoideal=0;
        
        if(genero.equals("H")){
            
        
            pesoideal=altura-110;
            System.out.println("El peso ideal de este hombre es: "+pesoideal);
        }
        else if(genero.equals("M")){
            pesoideal=altura-120;
            System.out.println("El peso ideal de esta mujer es: "+pesoideal);
        }
        
    }
}