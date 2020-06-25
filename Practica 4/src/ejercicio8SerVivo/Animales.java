package ejercicio8SerVivo;

public class Animales extends SerVivo{
    /*
    Los animales tienen un número de patas que se indican al crearse. Este número de
patas se puede mostrar y modificar en cualquier momento y aparece cuando se
llama a descríbete().
    */
    int numeroDePatas;

    public int getNumeroDePatas() {
        return numeroDePatas;
    }

    public void setNumeroDePatas(int numeroDePatas) {
        this.numeroDePatas = numeroDePatas;
    }

    @Override
    public String describete() {
        String superResultado = super.describete(); //To change body of generated methods, choose Tools | Templates.
        superResultado+="\nLos animales se pueden mover \n";
        superResultado+="El numero de patas es: "+ this.getNumeroDePatas()+"\n";
        return superResultado;
    }
    
    public Animales(){
        super();
        this.numeroDePatas=0;
    }
    public Animales(String nombreVulgar,String nombreCientifico,int numeroDePatas){
        super(nombreVulgar,nombreCientifico);
        this.numeroDePatas=numeroDePatas;
    }
}
