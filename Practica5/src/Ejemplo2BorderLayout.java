import java.awt.*;
public class Ejemplo2BorderLayout {
    public static void main(String[]arg){
        //miContainer.add("North", new Button("Norte"));
        Frame ventana= new Frame("Ejemplo de BorderLayout");
        Button nNorte= new Button("Norte");
        Button nCentro= new Button("Centro");
        Button nSur= new Button("Sur");
        Button nEste= new Button("Este");
        Button nOeste= new Button("Oeste");
        ventana.add(nNorte, BorderLayout.NORTH);
        ventana.add(nSur, BorderLayout.SOUTH);
        ventana.add(nCentro, BorderLayout.CENTER);
        ventana.add(nOeste, BorderLayout.WEST);
        ventana.add(nEste, BorderLayout.EAST);
        ventana.setVisible(true);
        ventana.pack();
        ventana.setLocationRelativeTo(null);
        
    }
}
