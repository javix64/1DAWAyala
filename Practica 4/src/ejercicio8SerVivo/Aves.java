package ejercicio8SerVivo;

public class Aves extends Animales{
    String cualidadAve="Las aves pueden volar";

    public String getCualidadAve() {
        return cualidadAve;
    }

    public void setCualidadAve(String cualidadAve) {
        this.cualidadAve = cualidadAve;
    }
    
    public Aves(){
        super();
        this.cualidadAve=cualidadAve;
    

}

    public Aves(String nombreVulgar, String nombreCientifico, int numeroDePatas) {
        super(nombreVulgar, nombreCientifico, numeroDePatas);
        this.cualidadAve=cualidadAve;
    }
    

    public String describete() {
        return super.describete()+this.cualidadAve; //To change body of generated methods, choose Tools | Templates.
    }
    
}