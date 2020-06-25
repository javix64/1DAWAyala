/*
https://blog.openalfa.com/como-trabajar-con-arrays-asociativos-hashtables-en-java
https://es.stackoverflow.com/questions/45846/c%C3%B3mo-separar-un-string-en-java-c%C3%B3mo-utilizar-split
dividimos texto por split
palabra por palabra en un bucle, si no existe lo a;adimos en nuestro hash, si existe lo sumamos
que nos lo muestre por pantalla

split 1 palabra.
patata--2
huevo--3
tortilla--1

split 2 palabras.
patata huevo --1
patatas fritas --2

*/
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Hashtable;
import javax.swing.JTextArea;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import static java.util.stream.Collectors.mapping;

public class ContarPalabrasRepetidas {
    JTextArea inputDatos;
    JTextArea outputDatos;
    //String palabras;
    //ArrayList <PalabrasRepetidas> frasesEditables;
    //HashMap <String, Integer> buscarHash;
    Map <String, Integer> buscarHash;
    String[] palabras;
    //String[] dosPalabras;

    Map<String, Integer> palabrasOrdenadas;
    //List<Integer> porNumeros = new ArrayList<>(buscarHash.values());
    //TreeMap<String, Integer> sorted = new TreeMap<>(buscarHash);
    //Set<Entry<String, Integer>> mappings = sorted.entrySet();
    
    public ContarPalabrasRepetidas(JTextArea inputDatos,JTextArea outputDatos) {
        this.inputDatos = inputDatos;
        this.outputDatos = outputDatos;
        buscarHash= new HashMap<String, Integer>();
        /*
        posible metodo para ordenar el map
        */
        palabrasOrdenadas = new TreeMap<String, Integer>(buscarHash);
        //Iterator ordenarPalabras= buscarHash.entrySet().

    }
    
    public void SepararPalabras(){
        // guarda en un string el texto, remplaza los saltos de linea por espacios y lo pasa a minusculas
        
        String saltosLinea=inputDatos.getText().replaceAll("\n", " ").toLowerCase();
        //separa el string por espacios
        palabras=saltosLinea.split(" ");
        
        
       // palabras=inputDatos.getText().split("\n");
        System.out.println(palabras.length);
        
        for (int i = 0; i < palabras.length; i++) {
            if(buscarHash.containsKey(palabras[i])){
                int valor=buscarHash.get(palabras[i])+1;
                //buscarHash.replace(palabras[i],palabras[i], valor++);                        
                //buscarHash.put(palabras[i], valor++);
                //System.out.println("dentro"+valor);
                buscarHash.replace(palabras[i], valor);
            }else{
                buscarHash.put(palabras[i], 1);
            }            
        }
    }
    
    public void masPalabras(){
        
    }
    
        public void ordenarDatos(){
            //Collections.sort(porNumeros);
           //System.out.println(buscarHash.entrySet().iterator().toString());            
        
    }
        
        
    public void mostrarDatos(){
        //java.util.Enumeration claves=buscarHash.keys();
        /*while(claves.hasMoreElements()){
            Object clave= claves.nextElement();
            Object valor= buscarHash.get(clave);
            outputDatos.append("--"+valor.toString()+" "+clave.toString()+"\n");
            System.out.println("--"+valor.toString()+" "+clave.toString());
        }
        */
        for (String i : buscarHash.keySet()) {
            outputDatos.append("-"+buscarHash.get(i)+" "+i+"\n");
            System.out.println("-"+buscarHash.get(i)+" "+i);
            
        }
    }

    
}
    
    
    

