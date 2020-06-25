/*
3. A partir de la Urna del ejercicio anterior implementad la clase UrnaTrampa con el
siguiente comportamiento: cada vez que se saque una bola, hay una probabilidad
del 0.2 % de que una de las bolas que quedan dentro cambie de color (para ello ha
de haber de ambos colores en la urna).
 */
package practica2;
/**
 *
 * @author x535
 */
public class UrnaTrampa extends Urna {
    public UrnaTrampa(int blancas, int negras) {super(blancas, negras);}
    @Override
    public int sacaBola(){
        int color=super.sacaBola();
        cambiaColor();
        return color;
    }
    protected void cambiaColor(){
        if (bolablanca>0 && bolanegra>0){
        double num=(Math.random()*100);
            if (num<=0.2){
                int num2 =(int)(Math.random()*bolas() + 1);
                if(num2<=bolanegra){
                    bolanegra--;
                    bolablanca++;
                } 
                else {
                    bolablanca--;
                    bolanegra++;
                }
            }
        }
    }    
}
