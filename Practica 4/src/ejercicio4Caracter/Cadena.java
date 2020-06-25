/*
Cread la clase Cadena de forma que nos permita almacenar una cadena de
caracteres, con al menos la siguiente interface y utilizando composición:

invierteCadena(). Invierte la cadena miembro.
encriptaCadena(). Encripta la cadena miembro.
desencriptaCadena(). Desencripta la cadena miembro.
visualizaCadena(). Visualiza la cadena miembro.

Haced un programa para comprobar el buen funcionamiento de dicha clase.
 */
package ejercicio4Caracter;

/**
 *
 * @author x535
 */
public class Cadena {
    protected String c;
    
    public Cadena(String c){
        this.c=c;
    }
    
    public Cadena(){
        c="";//hay que crearlo  para 
    }
    
    public void visualizaCadena(){
        System.out.println("");
    }
    
    public void invierteCadena(){
        StringBuffer aux = new StringBuffer (c);
        aux.reverse();
        c=aux.toString();
    }
    public void encriptarCadena(){ //programa de manolo
        String aux="";
        for(int i=c.length()-1;i>=0;i--){
            aux+=c.charAt(i)+3;
        }
    c=aux;
    }
    public void desencriptaCadena(){
        String aux="";
        for(int i=c.length()-1;i>=0;i--){
            aux+=c.charAt(i)-3;
        }
    c=aux;
    }
}
