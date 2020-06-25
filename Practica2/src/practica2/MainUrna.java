/*
Cread la clase Urna, la cual contiene inicialmente un número determinado de bolas
blancas y un número determinado de bolas negras y presenta como interface los
siguientes métodos:

- sacaBola(). Devolverá el color de la bola sacada. Decrementa en uno el
número de bolas de ese color.
- meteBola(color). Incrementa en uno el número de bolas del color dado.
- quedanBolas(). Devuelve verdadero si hay bolas en la urna y falso en caso
contrario.
- quedaMasDeUnaBola(). Devuelve verdadero si hay más de una bola en la
urna y falso en caso contrario.
- totalBolas(). Devuelve el número total de bolas que hay en la urna.

Utilizando un objeto de la clase anteriormente creada, realizad un programa que
haga lo siguiente: mientras en la urna quede más de una bola, sacar dos bolas de la
misma. Si ambas son del mismo color, introducir una bola negra en la urna. Si
ambas son de distinto color , introducir una bola blanca en la urna. Extraer la última
bola que queda y determinar su color.
 */
package practica2;
import javax.swing.*;
/**
 *
 * @author x535
 */
public class MainUrna {
     public static void main(String[] args) {
        int bolanegra =Integer.parseInt(JOptionPane.showInputDialog("Introduce cantidad de bolas negras:"));
        int bolablanca =Integer.parseInt(JOptionPane.showInputDialog("Introduce cantidad de bolas blancas"));
        Urna urna1= new Urna(bolanegra,bolablanca);
        
        while(urna1.quedaMasDeUnaBola() == true){
            int saca1 = urna1.sacaBola();
            int saca2 = urna1.sacaBola();
                if (saca1==saca2){
                    urna1.meteBola(0);
                }
                else{
                    urna1.meteBola(1);
                }
            if(urna1.bolas()==1){
                int saca3 = urna1.sacaBola();
                    if(saca3==0){
                        JOptionPane.showMessageDialog(null,"La ultima bola es de color NEGRA.");
                    }
                    else
                        JOptionPane.showMessageDialog(null,"La ultima bola es de color BLANCA.");
            }
        }
    }   
}
