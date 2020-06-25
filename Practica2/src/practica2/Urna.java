/*

- sacaBola(). Devolverá el color de la bola sacada. Decrementa en uno el
número de bolas de ese color.

- meteBola(color). Incrementa en uno el número de bolas del color dado.

- quedanBolas(). Devuelve verdadero si hay bolas en la urna y falso en caso
contrario.

- quedaMasDeUnaBola(). Devuelve verdadero si hay más de una bola en la
urna y falso en caso contrario.

- totalBolas(). Devuelve el número total de bolas que hay en la urna.

 */
package practica2;

/**
 *
 * @author x535
 */
public class Urna {
    protected int bolanegra, bolablanca;
    public Urna(int bolanegra, int bolablanca){
        this.bolanegra= bolanegra;
        this.bolablanca= bolablanca;
    }
    public Urna(){
        this(1,1);
    }
    public int bolas(){
        return(bolanegra + bolablanca);
    }
    public int sacaBola(){
        int num=(int)(Math.random()*bolas() + 1);
        if (num<=bolanegra){
            bolanegra--;
            return 0;
        }
        else{
            bolablanca--;
            return 1;
        }
    }
    public void meteBola(int color){
        if (color==0)
            bolablanca++;
        else
            bolanegra++;
    }
    public boolean quedanBolas(){
        return (bolas()>0);
    }
    public boolean quedaMasDeUnaBola(){
        return (bolas()>=2);
    }
    
}
