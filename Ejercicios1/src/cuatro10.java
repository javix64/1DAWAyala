/*
Haced un programa que nos sume los números naturales que sean pares y sean menores que un
número introducido por teclado.
 */
import javax.swing.*;
public class cuatro10 {
    public static void main(String[] args){
        int i, pares=0, suma=0,numero=0;
        int ultimo=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce último valor"));
        for (i=numero;i<=ultimo;++i){
            if (i%2==0){
            suma=suma+i;
            pares++;
            }
            
        }
        JOptionPane.showMessageDialog(null,"La suma es: "+suma);
    }
}
