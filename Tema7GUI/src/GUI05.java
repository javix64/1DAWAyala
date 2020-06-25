import java.awt.*;

public class GUI05 {

    public static void main(String[]arg){
        Frame ventana= new Frame("Ejemplo de BorderLayout");
        Button nNorte= new Button("Norte");
        Button nCentro= new Button("Centro");
        Button nEste= new Button("Este");
        Panel p= new Panel(new GridLayout(3,1));
        CheckboxGroup cbg = new CheckboxGroup();
        Checkbox cb1 = new Checkbox("Hombres", cbg, true);
        Checkbox cb2 = new Checkbox("Mujeres", cbg, false);
        Checkbox cb3 = new Checkbox("Mostrar", true);
        p.add(cb1,BorderLayout.NORTH);//p.add(cb1);
        p.add(cb2,BorderLayout.SOUTH);//p.add(cb2);
        p.add(cb3);
        
        ventana.add(nNorte, BorderLayout.NORTH);
        ventana.add(nCentro, BorderLayout.CENTER);
        ventana.add(p, BorderLayout.WEST);
        ventana.add(nEste, BorderLayout.EAST);
        ventana.setVisible(true);
        ventana.pack();
        ventana.setLocationRelativeTo(null);
    }
}    

