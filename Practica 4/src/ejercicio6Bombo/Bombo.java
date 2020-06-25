/*
Cread la clase Bombo con al menos la siguiente interfaz:

Bombo(int): crea un objeto bombo con n bolas numeradas de 0 a n-1.
int sacaBola(): devuelve la bola sacada del bombo.
void meteBola(int): introduce la bola pasada como argumento en el bombo.-
boolean quedanBolas(): devuelve true si queda al menos una bola en el bombo y false en caso contrario.

Utilizando dicha clase haced un programa que nos visualice los 6 números de una bonoloto
 */
package ejercicio6Bombo;

/**
 *
 * @author x535
 */
public class Bombo {
    protected boolean bombo[];//=new boolean[50]; esto lo hacen algunos programadores, pero lo correcto es ponerlo en el constructor por defecto
    int total;//esto no es necsario
    public Bombo(int n){
        bombo=new boolean [n];
        total=n;//esto tampoco
        for(int i=0;i<=n;i++){
            bombo[i]=true;
        }
    }
    public int sacaBola(){
        int bola;
        do{
            bola=(int)(Math.random()*bombo.length+1);
        } while (bombo[bola]=false);

        total--;
        bombo[bola]=false;
        return bola;
    }
    
    public void meteBola(int bola){
        if(bola>=0 && bola <bombo.length && bombo[bola]==false){
        bombo[bola]=true;
        total++;
    }
            
    }
    public boolean quedanBolas(){
        return(total>0);
    }
}
