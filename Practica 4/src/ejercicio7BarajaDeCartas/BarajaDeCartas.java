/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7BarajaDeCartas;

/**
 *
 * @author x535
 */
public class BarajaDeCartas {
    private Carta baraja[][];
    private Carta c;//variable de metodo
    
    public BarajaDeCartas(){
        baraja=new Carta[10][4];
        for(int i=1;i<4;i++){
            for(int j=1;j<10;j++){
                baraja [j][i]=new Carta(j,i);
            }
        }
    }
    public Carta sacaCarta(){
        int numero,palo;
        Carta c=null;
        if (quedanCartas()){
            do{
                numero=(int) (Math.random()*10);
                palo=(int) (Math.random()*4);
            }
            while (baraja[numero][palo]==null);
            c=baraja[numero][palo];
            baraja[numero][palo]=null;
        }
        return c;
    }
    public void meteCarta(Carta c){
        if (baraja[c.getNumero()][c.getPalo()]!=null) {
            System.err.println("ESTA CARTA YA ESTABA EN LA BARAJA");
        }else{
            baraja[c.getNumero()][c.getPalo()]=c;
            System.out.println("Hemos metido la carta "+c.getNumero()+"del palo "+c.getPalo());
        }
        
        
    }
    public boolean quedanCartas(){
        for(int i=1;i<4;i++){
        
            for(int j=1; j<10;j++){
                
                
                if(baraja[j][i]!=null){
                    return true;   
                }
            }
        }
            return false;
    }
    public static void main(String[] args) {
        BarajaDeCartas b=new BarajaDeCartas();
        //Carta ca=b.sacaCarta();
        //ca.visualizaCarta();
        Carta ca=new Carta();
        b.meteCarta(ca);
        
        
    }
   
}  

