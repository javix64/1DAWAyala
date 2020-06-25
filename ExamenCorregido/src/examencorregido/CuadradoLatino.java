package examencorregido;
import javax.swing.*;

/**
 *
 * @author x535
 */
public class CuadradoLatino {
    public static void main(String[] args){
        int n;
        do{
        n=(Integer.parseInt(JOptionPane.showInputDialog("Introduce numero comprendido entre 2 y 9")));
        }
        while(n<2 || n>9);
        Array cuadrado = new Array(n);
        for(int i=1; i<=n; i++){
            cuadrado.visualizaArray();
            cuadrado.rotaDerecha();
        }
    }
}