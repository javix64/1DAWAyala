
import javax.swing.JLabel;

public class HebraDos extends Thread{
    String texto;
    JLabel otra;

    public HebraDos(String texto, JLabel otra) {
        this.texto = texto;
        this.otra = otra;
    }
    
    public void run(){
        try{
            for (int i = 0; i < 30; i++) {
                otra.setText("");
                //System.out.println(texto);
                sleep(100);
                otra.setText(texto);
                sleep(100);
                
            }
        }catch(Exception e){}
    }
        
}
