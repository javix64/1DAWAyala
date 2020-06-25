
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Stream;
import javax.swing.JComboBox;
import javax.swing.JTextArea;

public class ContarPalabras {
    String inputDatos;
    JTextArea outputDatos;
//    HashMap <Integer, String> buscarHash;
    HashMap <String, Integer> buscarHash;
    String[] palabras;
    
    
    public ContarPalabras(String inputDatos,JTextArea outputDatos) {
        this.inputDatos = inputDatos;
        this.outputDatos = outputDatos;
        buscarHash= new HashMap<String, Integer>();
    }
    
    public void SepararPalabras(JComboBox comboPalabras){
        // guarda en un string el texto, remplaza los saltos de linea por espacios y lo pasa a minusculas
        buscarHash.clear();
        String saltosLinea=inputDatos.replaceAll("\n", " ").toLowerCase();
//        //separa el string por espacios
        palabras=saltosLinea.split(" ");
        System.out.println(palabras.length);
        switch(comboPalabras.getSelectedItem().toString()){
            case "1 palabra":
                for (int i = 0; i < palabras.length; i++) {
                   if(buscarHash.containsKey(palabras[i])){
                        int valor=buscarHash.get(palabras[i])+1;
                        buscarHash.replace(palabras[i], valor);
                    }else{
                    buscarHash.put(palabras[i], 1);
                    }            
                }
            break;
            case "2 palabras":
                if (palabras.length%2!=0) {
                    saltosLinea+="p";
                    palabras=saltosLinea.split(" ");
                }
                for (int i = 0; i < palabras.length; i=i+2) {
                    if(buscarHash.containsKey(palabras[i]+" "+palabras[i+1])){
                        int valor=buscarHash.get(palabras[i]+" "+palabras[i+1])+1;
                        buscarHash.replace(palabras[i]+" "+palabras[i+1], valor);
                    }else{
                        buscarHash.put(palabras[i]+" "+palabras[i+1], 1);
                    }  
                }
                
                
            break;
            case "3 palabras":
                if (palabras.length%2!=0) {
                    saltosLinea+="p ";
                    palabras=saltosLinea.split(" ");
                }
                for (int i = 0; i < palabras.length; i=i+3) {
                    if(buscarHash.containsKey(palabras[i]+" "+palabras[i+1]+" "+palabras[i+2])){
                        int valor=buscarHash.get(palabras[i]+" "+palabras[i+1]+" "+palabras[i+2])+1;
                        buscarHash.replace(palabras[i]+" "+palabras[i+1]+" "+palabras[i+2], valor);
                    }else{
                        buscarHash.put(palabras[i]+" "+palabras[i+1]+" "+palabras[i+2], 1);
                }            
        }
            break;
            case "4 palabras":
                if (palabras.length%2!=0) {
                    saltosLinea+="p ";
                    saltosLinea+="b ";
                    saltosLinea+="c ";
                    palabras=saltosLinea.split(" ");
                }
                for (int i = 0; i < palabras.length; i=i+4) {
                    if(buscarHash.containsKey(palabras[i]+" "+palabras[i+1]+" "+palabras[i+2]+" "+palabras[i+3])){
                        int valor=buscarHash.get(palabras[i]+" "+palabras[i+1]+" "+palabras[i+2]+" "+palabras[i+3])+1;
                        buscarHash.replace(palabras[i]+" "+palabras[i+1]+" "+palabras[i+2]+" "+palabras[i+3], valor);
                    }else{
                        buscarHash.put(palabras[i]+" "+palabras[i+1]+" "+palabras[i+2]+" "+palabras[i+3], 1);
                    }            
                }
                break;
        }
    }
    public void ordenarDatos(){
        List<Entry<String, Integer>> list= new LinkedList<Entry<String, Integer>>(buscarHash.entrySet());
        Collections.sort(list, new Comparator<Entry<String, Integer>>(){
            @Override
            public int compare(Entry<String, Integer> t, Entry<String, Integer> t1) {
                return t1.getValue().compareTo(t.getValue());
            }
        });
        for (Entry<String, Integer> item: list){
            String[] separado=item.toString().split("=");
            //System.out.println(item);
            outputDatos.append(separado[1]+" - "+separado[0]+"\n");
        }   
    }
    
    public void mostrarDatos(){
        int mayor=0;
        int[] clav=new int[buscarHash.size()];
        for (String i : buscarHash.keySet()) {
            outputDatos.append("-"+" "+i+buscarHash.get(i)+"\n");
            System.out.println("-"+buscarHash.get(i)+" "+i);
        }
    }
}
