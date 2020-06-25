import java.util.Vector;
public class Lista extends Vector{
    public void Lista(){
        super();
    }
    void ponPrimero(Object ob){
        insertElementAt(ob, 1);
    }
    void ponUltimo(Object ob){
        addElement(ob);
    }
    boolean estaVacia(){
        return isEmpty();
    }
    Object extraeUltimo(){
        
    }
}