/*
WHILE DO
 */
package pildorasinformáticas;

import javax.swing.JOptionPane;

/**
 *
 * @author x535
 */
public class video18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String clave="Javier", pass="";
        
        while(clave.equals(pass)==false){
            pass=JOptionPane.showInputDialog("Introduce la contraseña:");
            
            if(clave.equals(pass)==false){
                System.out.println("Contraseña incorrecta.");
            }
            
    }
        System.out.println("Contraseña correcta");
    }
    
    
}
