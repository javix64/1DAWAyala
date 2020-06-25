import static java.lang.Thread.sleep;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class MainOrdenador {
    
    public static void main(String[] args) throws InterruptedException {
        Sobremesa ordenador=null;
        Portatil miniordenador=null;
        Object instanciador;
        MenusOrdenador menu = new MenusOrdenador();
        int opcion;
        do {
                opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"Menú "
                + "\n 1-Crear ordenador "
                + "\n 2-Mostrar características"
                + "\n 3-Mostrar precio del ordenador."
                + "\n 4-Salir"));  
            
                switch(opcion){
                    case 1:
                        instanciador= menu.opcionaTipoOrdenador();
                        
                        if(instanciador instanceof Portatil){
                            miniordenador= (Portatil)instanciador;
                        }else{
                            ordenador= (Sobremesa)instanciador;
                        }
                        break;
                        
                    case 2:
                        if (ordenador!=null) {
                            System.out.println(ordenador.caracteristicas());
                            miniordenador=null;
                        }else{
                            System.out.println(miniordenador.caracteristicas());
                            ordenador=null;
                        }
                        
                        break;
                        
                    case 3:
                        if (ordenador!=null) {
                            System.out.println(ordenador.precioTotal());
                            miniordenador=null;
                        }else{
                            System.out.println(miniordenador.precioTotal());
                            ordenador=null;
                        }

                        break;
                        
                    case 4:
                        System.exit(0);
                        break;
                    }
            }while (opcion!=4); 
    }


}
