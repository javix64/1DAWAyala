/*
A partir de esta clase cread las clases Coche y Avion. De un coche nos interesa
además conocer su modelo, matrícula y color. Deberá tener su correspondiente
constructor. También tendrá métodos get() que nos devuelvan el modelo, matrícula y
color y un método imprimeEstado() que visualice por la consola todas las
características del objeto coche. De un avión nos interesa conocer su altura
(coordenada z) y si esta despegado o no. Tendrá su constructor por defecto. Además
deberá tener la siguiente interfaz:

despegar(): cambiará el estado del avión a despegado true y pondrá z a 1.
Para ello el avión deberá estar arrancado.
subir(): si el avión ha despegado incrementará z en 1.
subir(int n): si el avión ha despegado incrementará z en n.
bajar(): si el avión ha despegado decrementará z en 1, siempre que la nueva
posición no sea menor que 0.
bajar(int n): si el avión ha despegado decrementará z en n, siempre que la
nueva posición no sea menor que 0.
imprimeEstado(): visualizará por la consola que es un avión y las
características del mismo.
 */

/**
 *
 * @author x535
 */
public class avion extends vehiculo {
    protected double z;
    protected boolean despegado;
    public avion(double x, double y, boolean estado, int direccion, double z, boolean despegado) {
        super(x, y, estado, direccion);
        this.z=z;
        this.despegado=despegado;
    }
    
    public avion(double z, boolean despegado) {
        super();
        this.z=z;
        this.despegado=despegado;
    }

    public avion() {
        this(0, false);
    }
    
    public void despegar(){
        if(estaArrancado()){
            despegado=true;
            z=1;
        }
    }
    
    public void subir(){
        if(despegado)
            z++;
    }
    
    public void subir(int n){
        if(despegado)
            z+=n;
    }
    
    public void bajar(){
        if(despegado && z>0)
            z--;
    }
    
    public void bajar(int n){
        if(despegado && z>0)
            z-=n;
        if(z<0)
            z=0;
    }
    
    @Override
    public void imprimeEstado(){
        String enElAire;
        if (despegado)
            enElAire="ha despegado";
        else
            enElAire="no ha despegado";
        super.imprimeEstado();
        System.out.println("Este avión "+enElAire+" y se encuentra a "+z+" metros de altura");
    }
    
    public boolean getDespegado(){
        return despegado;
    }
    
    public double getZ(){
        return z;
    }
    
}