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
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;


public class ContarPalabrasRepetidas {
    JTextArea inputDatos;
    JTextArea outputDatos;
    //String palabras;
    //ArrayList <PalabrasRepetidas> frasesEditables;
    //HashMap <String, Integer> buscarHash;
    HashMap <String, Integer> buscarHash;
    String[] palabras;
    //String[] dosPalabras;
    Map<String, Integer> sortedByCount;

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
        //palabrasOrdenadas = new TreeMap<String, Integer>(buscarHash);
        //Iterator ordenarPalabras= buscarHash.entrySet().

    }
    
    public void SepararPalabras(){
        // guarda en un string el texto, remplaza los saltos de linea por espacios y lo pasa a minusculas
        buscarHash.clear();
        
        String saltosLinea=inputDatos.getText().replaceAll("\n", " ").toLowerCase();
        //separa el string por espacios
        palabras=saltosLinea.split(" ");
        
        
       // palabras=inputDatos.getText().split("\n");
        System.out.println(palabras.length);
        
//        for (int i = 0; i < palabras.length; i++) {
//            if(buscarHash.containsKey(palabras[i])){
//                int valor=buscarHash.get(palabras[i])+1;
//                //buscarHash.replace(palabras[i],palabras[i], valor++);                        
//                //buscarHash.put(palabras[i], valor++);
//                //System.out.println("dentro"+valor);
//                buscarHash.replace(palabras[i], valor);
//            }else{
//                buscarHash.put(palabras[i], 1);
//            }            
//        }
            //para dos palabras
         for (int i = 0; i < palabras.length; i=i+2) {
            if(buscarHash.containsKey(palabras[i]+" "+palabras[i+1])){
                int valor=buscarHash.get(palabras[i]+" "+palabras[i+1])+1;
                //buscarHash.replace(palabras[i],palabras[i], valor++);                        
                //buscarHash.put(palabras[i], valor++);
                //System.out.println("dentro"+valor);
                buscarHash.replace(palabras[i]+" "+palabras[i+1], valor);
            }else{
                buscarHash.put(palabras[i]+" "+palabras[i+1], 1);
            }            
        }
//         //para tres palabras
//         for (int i = 0; i < palabras.length; i=i+3) {
//            if(buscarHash.containsKey(palabras[i]+" "+palabras[i+1]+" "+palabras[i+2])){
//                int valor=buscarHash.get(palabras[i]+" "+palabras[i+1]+" "+palabras[i+2])+1;
//                //buscarHash.replace(palabras[i],palabras[i], valor++);                        
//                //buscarHash.put(palabras[i], valor++);
//                //System.out.println("dentro"+valor);
//                buscarHash.replace(palabras[i]+" "+palabras[i+1]+" "+palabras[i+2], valor);
//            }else{
//                buscarHash.put(palabras[i]+" "+palabras[i+1]+" "+palabras[i+2], 1);
//            }            
//        }
    }
    
    public void masPalabras(){
        
    }
    
        public void ordenarDatos(){
            //Collections.sort(porNumeros);
           //System.out.println(buscarHash.entrySet().iterator().toString());            
      // buscarHash.entrySet().stream().sorted(Map.Entry.<String,Integer>comparingByKey()).forEach(System.out::println);
      // Map<String,Integer> resultado = buscarHash.entrySet()stream().sorted(Map.Entry.comparingByValue()).collect(collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(viejo,nuevo)->viejo, LinkedHashMap::new));
     /* SortedSet<Integer> llaves = new TreeSet<>(buscarHash.values());
            for (int i = 0; i < llaves.size(); i++) {
                System.out.println(llaves.toString());
            }
      */
      TreeMap <String, Integer> sorted = new TreeMap <>();
      sorted.putAll(buscarHash);
      
            //System.out.println(sorted.);
      /*  
        Ordering naturalOrdering = Ordering.natural()
                .onResultOf(Functions.forMap(buscarHash,null));
        ImmutableSortedMap.copyOf(buscarHash,naturalOrdering);
      */
      /*
        SortedSet <Integer> values= new TreeSet <Integer>(buscarHash.values());
            for (int i = 0; i < values.size(); i++) {
                System.out.println(values.last());
            }
        */
    /*    
        sortedByCount = buscarHash.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        */
    /*
        Map<Integer, String> sortedMap = 
     buscarHash.entrySet().stream()
    .sorted(Entry.comparingByValue())
    .collect(Collectors.toMap(buscarHash::getKey, buscarHash::getValue,
                              (e1, e2) -> e1, LinkedHashMap::new));
    */
        }

    public void mostrarDatos(){
      int mayor=0;
      int[] clav=new int[buscarHash.size()];
      
        for (String i : buscarHash.keySet()) {

            outputDatos.append("-"+buscarHash.get(i)+" "+i+"\n");
            System.out.println("-"+buscarHash.get(i)+" "+i);
            
        }
    }    
}
    
    
    

