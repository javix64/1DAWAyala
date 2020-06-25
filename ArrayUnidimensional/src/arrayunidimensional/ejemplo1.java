package arrayunidimensional;

/**
 *
 * @author x535
 */
public class ejemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int v[]; //variable referencia  al array
        v = new int[20]; //crea un nuevo ojeto array de 20 int
        for (int i=0;i<v.length;i++)
            v[i]= (int)(Math.random()*100+1);
        for (int i=0;i<v.length; i++)
            System.out.println(v[i]+ " ");
            
        
    }
    
}
