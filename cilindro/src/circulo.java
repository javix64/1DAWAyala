/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author x535
 */
public class circulo {
    protected double radio;
    protected static int numCirculos=0;
    
    public circulo(double radio){
        this.radio=radio;
        numCirculos++;
    }
    
    public circulo(){
        //radio=1;
        //numCirculos++;
        this(1);
    }
    public double area(){
        //double area=Math.PI*radio*radio;
        //return area;
        return Math.PI*radio*radio;
    }
    public double circunferencia(){
        return 2*Math.PI*radio;
    }
    
    public double getRadio(){
        return radio;
    }
    public int getnumCirculos(){
        return numCirculos;
    }
}
