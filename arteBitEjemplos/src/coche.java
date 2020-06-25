/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author x535
 */
public class coche {
    private String marca;
    private String modelo;
    private int numRuedas;
    private int capCombustible;
    private int velocidad;

    public coche() {
        this.marca ="Mercedes";
        this.modelo = "Clase A";
        this.numRuedas = 4;
        this.capCombustible = 100;
        this.velocidad = 0;
    }
    coche coche1=new coche();

    public coche(String marca, String modelo, int numRuedas, int capCombustible, int velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.numRuedas = numRuedas;
        this.capCombustible = capCombustible;
        this.velocidad = velocidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }

    public int getCapCombustible() {
        return capCombustible;
    }

    public void setCapCombustible(int capCombustible) {
        this.capCombustible = capCombustible;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public coche getCoche1() {
        return coche1;
    }

    public void setCoche1(coche coche1) {
        this.coche1 = coche1;
    }
    

    
}

