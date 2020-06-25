package ejercicio8SerVivo;

public class Vegetales extends SerVivo{

    int partes;
    String[] descripcionPartes;
    
    public Vegetales(){
        super();
        this.partes=0;
        this.descripcionPartes=new String[0];
    }
    public Vegetales(String nombreVulgar,String nombreCientifico, int partes, String[] descripcionPartes){
        super(nombreVulgar,nombreCientifico);
        this.partes=partes;
        this.descripcionPartes=descripcionPartes;
    }

    public int getPartes() {
        return partes;
    }

    public void setPartes(int partes) {
        this.partes = partes;
    }

    public String[] getDescripcionPartes() {
        return descripcionPartes;
    }

    public void setDescripcionPartes(String[] descripcionPartes) {
        this.descripcionPartes = descripcionPartes;
    }
    
    @Override
    public String describete() {
        String resultado= super.describete(); //To change body of generated methods, choose Tools | Templates
        resultado+="\nUn ser vegetal no tiene movilidad. \n";    
        resultado+="El numero de partes es: "+this.getPartes()+"\n";
        resultado+="Y su descripcion es: \n";
        for (int i = 0; i < descripcionPartes.length; i++) {
            resultado+=descripcionPartes[i]+"\n";
        }
        return resultado;
    }
    
}












