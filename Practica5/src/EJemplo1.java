import java.awt.*;
public class EJemplo1 {
    public static void main(String []args){
        Frame ventana= new Frame("Ejemplo GUI");
        ventana.setLayout(new FlowLayout(FlowLayout.RIGHT));
        Button bSi= new Button("SI");
        Button bNo= new Button("NO");
        Label etiqueta= new Label("Nombre");
        ventana.add(bSi);
        ventana.add(bNo);
        ventana.add(etiqueta);
        //ventana.setSize(300,200);
        ventana.setVisible(true);
        ventana.pack();
        
    }
}
