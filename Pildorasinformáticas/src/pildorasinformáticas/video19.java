/*
Numero aleatorio
 */
package pildorasinformáticas;

/**
 *
 * @author x535
 */
import java.util.*;
/*public class video19 {
    public static void main(String[] args){
        
        int aleatorio=(int)(Math.random()*100);
        
        Scanner entrada=new Scanner(System.in);
        
        int numero=0;
        
        int intentos=0;
        
        while (numero!=aleatorio){
        
            intentos++;
            
            System.out.println("Introduce un numero");
            
            numero=entrada.nextInt();
            
            if(aleatorio<numero){
                System.out.println("El numero debe ser mas bajo");
            }
            
            else if(aleatorio>numero){
                
                System.out.println("El numero debe ser mas alto");    
                
            }
            
            
        }
        System.out.println("Has acertado en "+intentos+" intentos");
        
        
    }
}
*/

//hacer un programa que adivine un numero comprendido entre 1 y 100.
//
public class video19{
    public static void main(String[] arg){
        int aleatorio=(int)(Math.random()*100);
        
        int numero=0;
        
        
        int intentos=0;
        
        Scanner entrada=new Scanner(System.in);
        
        while(numero!=aleatorio){
            intentos++;
            System.out.println("Introduce un numero");
            
            numero=entrada.nextInt();
            
            if(aleatorio<numero){
                System.out.println("Introduce un numero menor");
            }
            else if(aleatorio>numero){
                System.out.println("Introduce un numero mayor");
            }
            
            
        }
        
        System.out.println("Correcto, has acertado en " +intentos+ " intentos, y el numero era: "+aleatorio);
        
        
    }
}