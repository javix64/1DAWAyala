package ejercicio6Bombo;

/**
 *
 * @author x535
 */
import ejercicio6Bombo.Bombo;

public class mainBonoloto {
    public static void main(String arg[]){
        Bombo bombo=new Bombo(50);
        for(int i=0;i<6;i++)
            System.out.println(bombo.sacaBola()+" ");
    }
}
