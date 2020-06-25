/*
Utilizando la clase Mate haced un programa para visualizar los números primos
comprendidos entre dos números introducidos por teclado.
poner numero X que es menor que Y.
sacar entre X e Y todos los numeros primos.
para que sean primos cuando se puede dividir entre 1 y el mismo
 */

/**
 *
 * @author x535
 */
import javax.swing.*;
public class numerosPrimosEntreSi {
    public static void main(String[] arg){
        int desde=Integer.parseInt(JOptionPane.showInputDialog("Introduce desde que numero:"));
        int hasta=Integer.parseInt(JOptionPane.showInputDialog("Introduce hasta que numero:"));
        for(int i=desde;i<=hasta;i++){
            if (Mate.esPrimos(i)){
                System.out.println(i);
            }
        }
    }
}
