/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author x535
 */
public class Coche extends vehiculo {
    protected String modelo, matricula, color;
    
    public Coche(double x, double y, boolean estado, int direccion, String modelo, String matricula, String color) {
        super(x, y, estado, direccion);
        this.modelo=modelo;
        this.matricula=matricula;
        this.color=color;
    }
    
    public Coche(String modelo, String matricula, String color) {
        super();
        this.modelo=modelo;
        this.matricula=matricula;
        this.color=color;
    }
    
    public Coche() {
        this("Lamborghini Murcielago", "NTGUILTY", "Amarillo");
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public String getMatricula(){
        return matricula;
    }
    
    public String getColor(){
        return color;
    }
    
    @Override
    public void imprimeEstado(){
        super.imprimeEstado();
        System.out.println("Este coche es un "+modelo+" con matrícula "+matricula+" de color "+color);
    }
}
