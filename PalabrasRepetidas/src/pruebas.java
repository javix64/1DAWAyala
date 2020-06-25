import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import javax.swing.JTextArea;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jmg39
 */
public class pruebas {
    JTextArea prueba;
    /**
     * @param args the command line arguments
     */
    
    //se genera un metodo que recorre el string compara los valores y guarda el numero de veces que aparece cada uno
    public static ArrayList<palabras> buscarValoresaparecen( String[] frase,ArrayList<palabras> palabras ){

        int j=0;
        int contador=0;
        while(j<frase.length){ 
        for(int x=0;x<frase.length;x++) {
        if(frase[x].equals(frase[j])){
             contador++;
             palabras.add(new palabras());
             palabras.get(j).setPalabra(frase[x]);
             palabras.get(j).setIteracion(contador);
            }
        if(x==frase.length-1){
           j++;
           contador=0;
        }
       }
     } 
    
    return palabras;
    }
    //funcion para imprimir el array de palabras duplicadas
    public static ArrayList<String> imprimir(ArrayList<String> dups){
        System.out.println("En esta frase se repiten las palabras:");
        for(int i=0;i<dups.size();i++){
        System.out.println(dups.get(i));
        
     }
        return dups;
    }
    //función para comprobar si una palabra existe en un arrayList
    public static boolean duplicado( ArrayList<String> dups,String palabras){
      boolean existe=false;
      for(int i=0; i<dups.size();i++){
       if(dups.get(i).equals(palabras)){
        existe=true;
       }
    }
    return existe;
    }
   // se crea una clase con constructores setters y getters para tratar el como objetos las palabras extraidas de la frase
    public static class palabras{
      String palabra;
      int iteracion;
      //constructor con parametros
    public palabras(String palabra, int iteracion){
     this.palabra=palabra;
    }
    
    //contructor vacio
     public palabras() {
        }
    //setter palabra
    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }
    //setter iteraciones
    public void setIteracion(int iteracion) {
        this.iteracion = iteracion;
    }

    public int getIteracion() {
        return iteracion;
    }

        public  String getPalabra() {
            return palabra;
        }
    }
}