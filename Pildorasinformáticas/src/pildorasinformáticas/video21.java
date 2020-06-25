/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pildorasinformáticas;
import javax.swing.*;
/**
 *
 * @author x535
 */

//bucle FOR
public class video21 {
    
    public static void main(String[] args){
        // int(inicializacion;hasta cuando;incremento)
        
        boolean arroba=false;
        
        String mail=JOptionPane.showInputDialog("Introduce mail");
        
        
        for(int i=0; i<mail.length()-1;i++){
            if(mail.charAt(i)=='@'){
                arroba=true;
            }
        }
        if(arroba==true){
            System.out.println("Tiene arroba");
        }
        else{
            System.out.println("No tiene arroba");
        }
        
    }
    
}
