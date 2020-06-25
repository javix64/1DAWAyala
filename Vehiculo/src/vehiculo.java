/*
1. Cread la clase Vehiculo que contenga información de las coordenadas x e y donde se encuentre el objeto vehículo, así como, de su estado (si está arrancado o no) y la
dirección del mismo (Norte=0, Este=1, Sur=2, Oeste=3) con al menos la siguiente interfaz:
-Vehiculo(): inicializa las coordenadas a 0; el estado a no arrancado y la dirección Este.
-parar(): pone el estado a no arrancado.
-arrancar(): pone el estado a arrancado.
-mover(): mueve el vehículo una posición en la dirección actual. Para ello el
vehículo debe estar arrancado.
-mover(int n): mueve el vehículo n posiciones en la dirección actual. Para ello el
vehículo debe estar arrancado.
--------
-girarDerecha(): Gira a la derecha según la direccion que tenga el coche. Por ejemplo si la dirección es Sur pasará a ser Este.
-girarIzquierda(): Gira a la izquierda según la direccion que tenga el coche. Por ejemplo si la dirección es Sur pasará a ser Oeste.
-girarDerecha(int n): Girará n veces a la derecha.
-girarIzquierda(int n): Girará n veces a la izquierda.
-estaArrancado(): devuelve true si el vehículo está arrancado y false en caso
contrario.
-getDirreccion(); devuelve la dirección del vehículo.
-getX(): devuelve la coordenada x del vehículo.
-getY(): devuelve la coordenada y del vehículo.
imprimeEstado(): visualizará por la consola que es un vehículo que estará
arrancado o no, de coordenadas las que sea y dirección la que corresponda.
 */
    
/**
 *
 * @author x535
 */
public class vehiculo {
    protected double x, y;
    protected boolean estado;
    protected int direccion;
    
    public vehiculo (double x, double y, boolean estado, int direccion){
        this.x=x;
        this.y=y;
        this.estado=estado;
        this.direccion=direccion;
    }
    
    public vehiculo (){
        this(0, 0, false, 1);
    }
    
    public void parar(){
        estado=false;
    }
    
    public void arrancar(){
        estado=true;
    }
    
    public void mover(){
        if (estado)
        {
            switch (direccion){
            case 0: x++; break;
            case 1: y++; break;
            case 2: x--; break;
            case 3: y--; break;
            }
        }
    }
    
    public void mover(int n){
        if (estado)
        {
            switch (direccion){
            case 0: x+=n; break;
            case 1: y+=n; break;
            case 2: x-=n; break;
            case 3: y-=n; break;
            }
        }
    }
    
    public void girarDerecha(){
        direccion++;
        if (direccion>3)
                direccion=0;
    }
    
    public void girarIzquierda(){
        direccion--;
        if (direccion<0)
                direccion=3;
    }
    
    public void girarDerecha(int n){
        for (int i=0; i<n; ++i)
            girarDerecha();
    }
    
    public void girarIzquierda(int n){
        for (int i=0; i<n; ++i)
            girarDerecha();
    }
    
    public boolean estaArrancado(){
        return estado;
    }
    
    public int getDireccion(){
        return direccion;
    }
    
    public double getX(){
        return x;
    }
    
    public double getY(){
        return y;
    }
    
    
    
    public void imprimeEstado(){
        String arrancado, orientacion;
        if (estaArrancado())
            arrancado="arrancado";
        else
            arrancado="no arrancado";
        switch(direccion){
            case 0: orientacion="norte"; break;
            case 1: orientacion="este"; break;
            case 2: orientacion="sur"; break;
            case 3: orientacion="oeste"; break;
            default: orientacion="ERROR";
        }
        System.out.println("Tenemos un vehículo que está "+arrancado+" en las coordenadas "+x+","+y+" con direccion hacia el"+orientacion);
    }
}