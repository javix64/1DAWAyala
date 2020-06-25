import javax.swing.JTextField;

public class Hebra5 extends Thread{
    private int segundos;
    private int minutos;
    private int horas;
    private boolean activo;
    private JTextField campoTexto;
    
    
    public Hebra5(int segundos, int minutos, int horas, JTextField campoTexto){
        this.segundos=segundos;
        this.minutos=minutos;
        this.horas=horas;
        this.activo=true;
        this.campoTexto=campoTexto;
    }
    
    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getHoras() {
        return horas;
    }
    
    public void setHoras(int horas) {
        this.horas = horas;
    }
    public void run(){
        try{
            
        do{
            segundos++;
            sleep(1000);
            if(segundos==60){
                minutos+=1;
                segundos=0;
             
            }
            if(minutos==60){
                horas+=1;
                minutos=0;
                
            }
            campoTexto.setText(horas+":"+minutos+":"+segundos);
        }while(activo==true);
        
        }catch(Exception e){}
        
    }
}