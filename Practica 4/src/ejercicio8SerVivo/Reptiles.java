package ejercicio8SerVivo;

public class Reptiles extends Animales{

    String sangrefria="Los reptiles tienen sangre fría";

    public String getSangrefria() {
        return sangrefria;
    }

    public void setSangrefria(String sangrefria) {
        this.sangrefria = sangrefria;
    }
    
    public Reptiles(){
        super();
        this.sangrefria=sangrefria;
    

}

    public Reptiles(String nombreVulgar, String nombreCientifico, int numeroDePatas) {
        super(nombreVulgar, nombreCientifico, numeroDePatas);
        this.sangrefria=sangrefria;
    }
    

    @Override
    public String describete() {
        return super.describete()+this.sangrefria; //To change body of generated methods, choose Tools | Templates.
    }
    
}
