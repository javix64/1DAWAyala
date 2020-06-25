/*
Utilizando la clase Lista, anteriormente creada, construid la clase Cola con la
siguiente interface: 
extraeDeCola()
, ponEnCola(Object ob)
, vacia()
y frente().
Haced un programa para comprobar el buen funcionamiento de dicha clase.
s
 */
package ejercicio123Lista;

/**
 *
 * @author x535
 */
public class Cola extends Lista{
    public Cola(){
        super();
    }
    public Object extraeDeCola(){
        return extraePrimero();
    }
    public void ponEnCola(Object ob){
        ponUltimo(ob);
    }
    public boolean vacia(){
        return estaVacia();
    }
    public Object frente(){
        return firstElement();
    }
    
}