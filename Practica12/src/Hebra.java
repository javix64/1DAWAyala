
import javax.swing.JTextField;

public class Hebra extends Thread {
    int desde;
    int hasta;
    JTextField contar;

    public Hebra(int desde, int hasta , JTextField contar) {
        this.desde = desde;
        this.hasta = hasta;
        this.contar= contar;
    }
    
    public void run(){
        try{
            for (int i=desde; i<=hasta; i++) {
                sleep(1000);
                System.out.println(i);
                contar.setText(i+"");
            }
        }catch(Exception e){}
    }
}
