/*
Un Carrete tiene capacidad para un número determinado de fotografías (12, 24, 36).
Sobre un objeto Carrete se puede hacer nueva() lo que hace que se incremente el
número de fotografías ya hechas, hasta que se finalice el carrete en cuyo caso no se
permite realizar nuevas fotografías. Se tiene también los métodos sePuedeHacer()
que nos devuelve verdadero si quedan fotografías por hacer, estaLLeno() que
devuelve verdadero si el carrete se ha llenado y numeroFotos() que nos devuelve el
número de fotos que se han hecho actualmente del carrete. Un carrete se puede
revelar(). Este proceso hace que se obtenga fotografías válidas y no válidas. Las
fotografías no válidas son aquellas que no se hayan hecho en el momento del
revelado y las que salen veladas (se tiene un 2% de probabilidad de que una foto se
vele).
 */
package camarafotografica;

/**
 *
 * @author x535
 */
public class Carrete {
    private int fotografiasTotales;
    private int fotografiasHechas;
    private int fotografiasValidas;
    public Carrete (int n){
        if (n!=12 || n!=24 || n!=36){
        fotografiasTotales=36;    
        }

        else
            fotografiasTotales=n;
            fotografiasHechas=0;
            fotografiasValidas=0;
    }
    public Carrete () {
        this(36);
    }
    public void nueva(){
        if (this.sePuedeHacer()==true){
        fotografiasHechas++;
        }
    }

    public boolean sePuedeHacer(){  
        if(fotografiasHechas!=fotografiasTotales){
            return true;
        }
        //return (fotografiasHechas!=fotografiasTotales);
    }
    public boolean estaLleno(){
        return (fotografiasHechas==fotografiasTotales);
    }
    public int numeroFotos(){
        return fotografiasHechas;
    }
    public void revelar(){
        for (int i=0; i<fotografiasHechas;i++){
            int n=(int)(Math.random()*100+1);
            if (n>2){
                fotografiasValidas++;
            }
        }
    }
    public int getFotografiasValidas(){
        return fotografiasValidas;
    }
    public int getFotografiasTotales(){
        return fotografiasTotales;
    }
}
