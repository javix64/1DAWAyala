/*
4. Utilizando la clase Circulo cread la clase Cilindro con la siguiente interface:
- función constructora. Inicializa las variables radio y altura.
- area(). Devuelve el área del cilindro.
- volumen(). Devuelve el volumen del cilindro.
 */

/**
 *
 * @author x535
 */
    public class cilindro extends circulo{
    protected double altura;
    
    public cilindro(double radio, double altura){
    //    this.radio=radio;
    super(radio); 
    this.altura=altura;
    }
    public cilindro(){
        this(1, 2);
    }
    
    @Override
    public double area(){
      //area de base de arriba abajo
      //Dos veces area() y luego la circunferencia por la altura
      return 2*super.area()+altura*circunferencia();
    }
    
    public double volumen(){
    //area por altura
    //return radio*radio*Math.PI*altura;
    return super.area()*altura;
    
}
    public double getAltura(){
        return altura;
    }
}