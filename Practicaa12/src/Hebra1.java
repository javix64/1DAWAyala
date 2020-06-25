
import javax.swing.JTextField;

public class Hebra1 extends Thread {
    int desde;
    int hasta;
    JTextField campoContar;

    public Hebra1(int desde, int hasta, JTextField campoContar) {
        this.desde = desde;
        this.hasta = hasta;
        this.campoContar = campoContar;
    }
    
    public void run(){
        try{
            int mayor;
            int menor;
            if(desde>hasta){
                mayor=desde;
                menor=hasta;
            }else{
                menor=desde;
                mayor=hasta;
            }
            for (int i = mayor; i >= menor; i--) {
                campoContar.setText(i+"");
                sleep(1000);
            }
            
        }
            catch(Exception e){
                System.err.println("error");}
        }
    }