package examencorregido;

/**
 *
 * @author x535
 */
public class Segmento {
    protected Punto p,q;
    public Segmento(Punto p, Punto q){
        if(!p.esIgual(q)){
        this.p =p;
        this.q =q;
        } else
            System.out.println("ERROR");
    }
    public Segmento(){
        this(new Punto(0,0), new Punto(1,1) );
    }
    public double longitudSegmento(){
        return p.distancia(q);
    }
    public boolean esIgual(Segmento s){
        return longitudSegmento()==s.longitudSegmento();
        //return(p.esIgual(s.getP() && q.esIgual(s.getQ() )));
    }
    public Punto getP(){return p;}
    public Punto getQ(){return q;}
    
    public boolean esPerpendicular(Segmento s){
        if(p.esIgual(s.getP())){
            //if(p.distancia(q)*p.distancia(q)+p.distancia(s.getQ())*p.distancia(s.getQ())==q.distancia(s.getQ())*q.distancia(s.getQ()))
            return (this.longitudSegmento()*this.longitudSegmento()+s.longitudSegmento()*s.longitudSegmento()==q.distancia(s.getQ())*q.distancia(s.getQ()));
        }
    return false;
    }
}
