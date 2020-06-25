import java.awt.*;
public class GUI04 {
    public static void main(String[]arg){
        Frame ventana= new Frame("Ejemplo de BorderLayout");
        Button nNorte= new Button("Norte");
        Button nCentro= new Button("Centro");
        Button nEste= new Button("Este");
        Button nOeste= new Button("Oeste");
        Button nPanel1= new Button("Panel1");
        Button nPanel2= new Button("Panel2");
        Panel p= new Panel(new GridLayout(2,1));
        p.add(nPanel1,BorderLayout.NORTH);
        p.add(nPanel2,BorderLayout.SOUTH);
        ventana.add(nNorte, BorderLayout.NORTH);
        ventana.add(nCentro, BorderLayout.CENTER);
        ventana.add(p, BorderLayout.WEST);
        ventana.add(nEste, BorderLayout.EAST);
        ventana.setVisible(true);
        ventana.pack();
        ventana.setLocationRelativeTo(null);
    }
}