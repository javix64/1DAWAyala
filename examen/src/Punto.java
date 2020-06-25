/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author x535
 */
public class Punto {
    protected int x;
    protected int y;
    
    private Punto(int x, int y){
        this.x=x;
        this.y=y;
    }
    
    private double distancia(int px, int py){
        return Math.sqrt((x-px)* (x-px) + (y-py)*(y-py));
    }
    
    private double distancia(Punto p){
        return Math.sqrt((x-p.x)*(x-p.x)+(y*p.y)+(y-p.y));
    }
    
    private int getX(){
        return x;
    }
    
    private int getY(){
        return y;
    }
}
