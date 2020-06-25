package examencorregido;

/**
 *
 * @author x535
 */
public class Array {
    private int v[]; //creamos
    public Array(int n){//creamos el constructor
        v = new int[n];//creamos un nuevo objeto con n elementos
        for(int i=0;i<n;i++)
            v[i]=i+1;
        
    }
    public Array(){
        this(5);
    }
    public void rotaDerecha(){
        int aux= v[v.length-1];
        for (int i=v.length-1;i>0;i--)
            v[i] = v[i-1];
        v[0] = aux;
    }
    public void visualizaArray(){
        for(int i=0;i<v.length;i++)
            System.out.print(v[i]+" ");
        System.out.println("");
        
    }
}
