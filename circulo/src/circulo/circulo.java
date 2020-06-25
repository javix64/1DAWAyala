    /*
Cread la clase Circulo con la variable de instancia radio y la variable de clase
numCirculos (que nos irá contando los objetos Circulo creados) de tipo protected y la
interface compuesta por:
- función constructora.
- area(): devuelve el área del círculo.
- circunferencia(): devuelve la circunferencia.
- getRadio(): devuelve el radio.
- getNumCirculos(): devuelve cuantos círculos hay creados.
 */
package circulo;

/**
 *
 * @author x535
 */
public class circulo {
    private double radio;
    protected static int numCirculos=0;
    public final double PI=3.14;
    public circulo(double radio){
        this.radio=radio;
        numCirculos++;
    }
    public circulo(){
        this (1.0);
    }
    public double getArea(){return PI*Math.pow(radio, 2);}
    public double getCircunferencia(){return 2*PI*radio;}
    public double getRadio(){return radio;}
}
