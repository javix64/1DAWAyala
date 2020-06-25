    import java.awt.*;

public class Ejemplo3gridLayout {
    public static void main(String[]arg){
        
        Frame ventana= new Frame("Ejemplo de gridLayout");
        
        ventana.setLayout(new GridLayout(3,4,10,10));
        
        for(int i=0;i<(3*4); ++i){
            ventana.add(new Button("Boton "+ (i+1)));
        }
        
        ventana.setVisible(true);
        
        ventana.pack();
        
        ventana.setLocationRelativeTo(null);
    }

}
