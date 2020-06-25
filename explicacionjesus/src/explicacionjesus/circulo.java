/*
explicacion jesus
public: esta variable se puede cambiar desde cualquier lado
private: esta variable solo se puede cambiar desde la misma clase
protected: esta variable solo se puede acceder desde la propia clase y las clases que heredan.
static(clases): la variable sea de clase

variable de clase/objeto

*/
package explicacionjesus;

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
