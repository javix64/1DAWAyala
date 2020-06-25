/*
Cread la clase Pila, a partir de la clase Lista, anteriormente creada, con la siguiente interface: 
pop(),  BORRA elemento
push(Object ob),
vacia()
cima(). 
Utilizando dicha clase, haced un programa de prueba.
 */
package ejercicio123Lista;
import java.util.Stack;

public class Pila extends Lista{
    public Pila(){
        super();
    }
    public Object pop(){
        return extraeUltimo();
    }
    public void push(Object ob){
        ponUltimo(ob);
    }
    public boolean vacia(){
        return estaVacia();
    }
    public Object cima(){
        return lastElement();
    }
}