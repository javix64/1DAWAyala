package ejercicio8SerVivo;

public class SerVivo {
    private String nombreVulgar;
    private String nombreCientifico;
    
        public SerVivo(){
        this.nombreVulgar="";
        this.nombreCientifico="";
    }
    public SerVivo(String nombreVulgar,String nombreCientifico){
        this.nombreVulgar=nombreVulgar;
        this.nombreCientifico=nombreCientifico;
    }
    
    
    public String getNombreVulgar() {
        return nombreVulgar;
    }

    public void setNombreVulgar(String nombreVulgar) {
        this.nombreVulgar = nombreVulgar;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }
    

    
    public String describete(){
       String resultado="Nombre vulgar: "+this.getNombreVulgar()+"\n"+"Nombre cientifico: "+this.getNombreCientifico();
       return resultado;
    }

    
}