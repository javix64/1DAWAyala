/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author x535
 */
public class Segmento {
    protected int p,q;
    
    private Segmento(int p, int q){
        this.p = p;
        this.q = q;
    }
    private Segmento(){
        this(1,1);
    }
    private double longitudSegmento(){
        double distancia;
        double puntoP=Math.pow(p, 2);
        double puntoQ=Math.pow(q, 2);
        distancia = p+q;
        return Math.sqrt(distancia);
    }
    private boolean esIgual(Segmento s){
        if (p!=q){
            
        }
            return true;
       
    }
    private int getP(){
        return p;
    }
    private int getQ(){
        return q;
    }
    private boolean esPerpendicular(Segmento s){
        if(Segmento s==Segmento){
        return true;
        }
        return false;
    }
    
}
