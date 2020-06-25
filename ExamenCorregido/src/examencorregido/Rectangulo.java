package examencorregido;

/**
 *
 * @author x535
 */
public class Rectangulo {
    protected Segmento s1, s2;
    public Rectangulo(Segmento s1, Segmento s2){
        //if(s1.getP().esIgual(s2.getP()) && s1.esPerpendicular(s2)){
        if(s1.esPerpendicular(s2)){
        this.s1=s1;
        this.s2=s2;
        }
    }
    public double area(){
        return(s1.longitudSegmento()*s2.longitudSegmento());
    }
    public double perimetro(){
        return(2*(s1.longitudSegmento()+s2.longitudSegmento()));
    }
}
