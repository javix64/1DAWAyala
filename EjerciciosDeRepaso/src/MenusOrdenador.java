
import javax.swing.JOptionPane;

public class MenusOrdenador {
    String opcionTipoMonitor;
    String opcionSizeMonitor;    
    String opcionVelocidadCpu;
    String opcionHdCpu;
    String opcionNumeroTeclasTeclado;
    String opcionTipoDeTeclado;
    String crearNuevoOrdenador;
    int precioTipoMonitor;
    int precioSizeMonitor;
    int precioVelocidadCpu;
    int precioHdCpu;
    int precioNumeroTeclasTeclado;
    int precioTipoDeTeclado;
    String opcionTipoOrdenador;
    
    public Object opcionaTipoOrdenador(){
        opcionTipoOrdenador=JOptionPane.showInputDialog(null, "Selecciona tipo de ordenador."
                + "\n1 Portatil"
                + "\n2 Sobremesa");
        switch(opcionTipoOrdenador){
            case "1":
                Portatil miniordenador=new Portatil();
                miniordenador.setVelocidadCpu(opcionaVelocidadCpu());
                miniordenador.setHdCpu(opcionaHdCpu());
                return miniordenador;
                
            case "2":
                Sobremesa ordenador=new Sobremesa();
                ordenador.setTipoMonitor(opcionaTipoMonitor());
                ordenador.setSizeMonitor(opcionaSizeMonitor());
                ordenador.setVelocidadCpu(opcionaVelocidadCpu());
                ordenador.setHdCpu(opcionaHdCpu());
                ordenador.setNumeroTeclasTeclado(opcionaNumeroTeclasTeclado());
                ordenador.setTipoDeTeclado(opcionaTipoDeTeclado());
                return ordenador;

            default:
                return "Sobremesa";
            
        }
    }

    public MenusOrdenador() {
        
    }
    
    public String opcionaTipoMonitor(){
    opcionTipoMonitor=JOptionPane.showInputDialog(null,"Tipo de Monitor"
        + "\n1-LCD"
        + "\n2-Analogico");
        switch(opcionTipoMonitor){
            case "1":
                opcionTipoMonitor="LCD";
                precioTipoMonitor=50;
                break;
            case "2":
                opcionTipoMonitor="Analogico";
                precioTipoMonitor=30;
                break;
        }
        return opcionTipoMonitor; 
        
}

public String opcionaSizeMonitor(){
    opcionSizeMonitor=JOptionPane.showInputDialog(null,"Tamaño del monitor"
        + "\n1- 14 pulgadas"
        + "\n2- 15 pulgadas"
        + "\n3- 17 pulgadas");
        switch(opcionSizeMonitor){
            case "1":
                opcionSizeMonitor="14 pulgadas";
                precioSizeMonitor=100;
                break;
            case "2":
                opcionSizeMonitor="15 pulgadas";
                precioSizeMonitor=120;
                break;
            case "3":
                opcionSizeMonitor="17 pulgadas";
                precioSizeMonitor=180;
                break;
        }
        return opcionSizeMonitor;
}

public String opcionaVelocidadCpu(){
    opcionVelocidadCpu=JOptionPane.showInputDialog(null, "Velocidad de CPU:"
    + "\n1- 1000Mhz"
    + "\n2- 2000Mhz"
    + "\n3- 3000Mhz");
    switch(opcionVelocidadCpu){
        case "1":
            opcionVelocidadCpu="1000Mhz";
            precioVelocidadCpu=30;
            break;
        case "2":
            opcionVelocidadCpu="2000Mhz";
            precioVelocidadCpu=40;
            break;
        case "3":
            opcionVelocidadCpu="4000Mhz";
            precioVelocidadCpu=80;
            break;       
    }
    return opcionVelocidadCpu;
}
public String opcionaHdCpu(){
    opcionHdCpu=JOptionPane.showInputDialog(null,"Seleccione el tamaño de la CPU"
    + "\n1- 100GB"
    + "\n2- 500GB"
    + "\n3- 4TB");
    switch(opcionHdCpu){
        case "1":
            opcionHdCpu="100GB";
            precioHdCpu=40;
            break;
        case "2":
            opcionHdCpu="500GB";
            precioHdCpu=60;
            break;
        case "3":
            opcionHdCpu="4TB";
            precioHdCpu=120;
            break;
    }
    return opcionHdCpu;
}
public String opcionaNumeroTeclasTeclado(){
    opcionNumeroTeclasTeclado=JOptionPane.showInputDialog(null, "Configuración de las teclas:"
    + "\n1- 101 teclas"
    + "\n2- 102 teclas");
    switch(opcionNumeroTeclasTeclado){
        case "1":
            opcionNumeroTeclasTeclado="101 teclas";
            precioNumeroTeclasTeclado=5;
            break;
        case "2":
            opcionNumeroTeclasTeclado="102 teclas";
            precioNumeroTeclasTeclado=20;
            break;
    }
    return opcionNumeroTeclasTeclado;
}

public String opcionaTipoDeTeclado(){
    opcionTipoDeTeclado=JOptionPane.showInputDialog(null, "Escoge el tipo de teclado que quieres."
    + "\n1- Inalambrico"
    + "\n2- Cable");
    switch(opcionTipoDeTeclado){
        case "1":
            opcionTipoDeTeclado="Inalambrico";
            precioTipoDeTeclado=40;
            break;
        case "2":
            opcionTipoDeTeclado="Cable";
            precioTipoDeTeclado=20;
            break;
    }
    return opcionTipoDeTeclado;

}    
}
