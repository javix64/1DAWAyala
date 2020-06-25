/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examencorregido;

/**
 *
 * @author x535
 */
public class Ejercicio2 {
    public static void main(String[]args){
    Punto p= new Punto(0,0);
    Punto q= new Punto(4,0);
    Punto r= new Punto(0,3);
        System.out.println("Distancia de p a q: "+p.distancia(q));
        System.out.println("Distancia de p a r: "+p.distancia(r));
        System.out.println("Distancia de q a r:"+ q.distancia(r));
        Segmento seg1=new Segmento(p,q);
        System.out.println("Longitud segmento seg1:"+ seg1.longitudSegmento());
        Segmento seg2= new Segmento(p,q);
        System.out.println("Longitud segmento seg1:"+ seg1.longitudSegmento());
        if(seg1.esIgual(seg2)){
            System.out.println("Los segmentos son perpendiculares");
            Rectangulo rec = new Rectangulo(seg1,seg2);
            System.out.println("Area: "+rec.area());
            System.out.println("Perimetro: " + rec.perimetro());
        }else
            System.out.println("LOs segmentos no son perpendiculares");
    }
}
