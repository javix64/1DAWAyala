/*
- Lista(). Constructor de la clase Lista. Crea una lista vacía.

- void ponPrimero(Object ob). Almacena ob como primer elemento de nuestra lista.
- void ponUltimo(Object ob). Almacena ob como último elemento de nuestra lista.
- boolean estaVacia(). Devuelve verdadero si la lista está vacía y falso en caso contrario.
- Object extraePrimero(). Devuelve el primer elemento almacenado en la lista, eliminándolo de esta.
- Object extraeUltimo(). Devuelve el último elemento almacenado en la lista,eliminándolo de esta.
- void visualizaElementos(). Visualiza todos los elementos almacenados en la lista.
 */
package ejercicio123Lista;
import java.util.*;
/**
 *
 * @author x535
 */
public class Lista extends Vector{
    public Lista(){ //con esto creamos un constructor VACIO
        super();    //llama al constructor de la clase superior, en este caso Vector.
    }
    public void ponPrimero(Object ob){
        insertElementAt(ob,0);
    }
    public void ponUltimo(Object ob){
        addElement(ob);
    }
    public boolean estaVacia(){
        return isEmpty();
    }
    public Object extraePrimero(){
        Object ob= firstElement();
        removeElementAt(0);
            return ob;
    }
    public Object extraeUltimo(){
        Object ob= lastElement();
        removeElementAt(size()-1);
            return ob;
    }
    public void visualizaElemento(){
        for(Enumeration e = elements(); e.hasMoreElements();)
        {System.out.println( e.nextElement().toString());}
    }
    
}
