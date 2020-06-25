/*
2. Cread la clase Carta, de baraja española, con al menos el siguiente interfaz:


visualizaCarta(). Nos visualiza el número y el palo de la carta.

valorCarta(). Nos devuelve el valor numérico de esa carta. El valor será el
número de la carta si este es <=7 y 0.5 si es una sota, caballo o rey.


 */
package ejercicio7BarajaDeCartas;

import javax.swing.JOptionPane;

/**
 *
 * @author x535
 */
public class Carta {
    private int numero, palo;
    
    public Carta(int numero, int palo){
        this.numero=numero;
        this.palo=palo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPalo() {
        return palo;
    }

    public void setPalo(int palo) {
        this.palo = palo;
    }
    
    public Carta(){
        this(1,1);
    }
    
    public void visualizaCarta(){
        String primeraParte="", segundaParte="";
        if(numero<=7){
            primeraParte=numero+ " de ";
        }
        else if(numero==8){
            primeraParte="Sota de "
                    + ""
                    + "";
        }
        else if(numero==9){
            primeraParte="Caballo de ";
        }
        else if (numero==10){
            primeraParte="Rey de ";
        }
        switch(palo){
            case 1:
                segundaParte="bastos"; break;
            case 2:
                segundaParte="espadas"; break;
            case 3:
                segundaParte="copas"; break;
            case 4:
                segundaParte="oros"; break;
        }
        JOptionPane.showMessageDialog(null, primeraParte + segundaParte);
    }
    
    public double valorCarta(){
        if (numero==10||numero==11|numero==12)
            return 0.5;
        return numero;
    }
}