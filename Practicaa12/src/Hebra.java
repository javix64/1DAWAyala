import javax.swing.JTextField;

public class Hebra extends Thread {
    int desde;
    int hasta;
    JTextField campoContar;
    public Hebra(int desde, int hasta, JTextField campoContar) {
        this.desde = desde;
        this.hasta = hasta;
        this.campoContar = campoContar;
    }
    public static void main(){
        
    }

    public void run(){

        try{
            for (int i = desde; i >= hasta; i--) {
                campoContar.setText(i+"");
                sleep(1000);
            }
            
            for (int i = desde; i <= hasta; i++) {
                campoContar.setText(i+"");
                sleep(10);
            }
        }
            catch(Exception e){
                System.err.println("error");}

        }
    }