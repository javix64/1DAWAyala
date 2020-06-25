
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

/*
con esta clase lo que hacemos es contar las palabras de una pagina web
las separamos y las metemos dentro de un HashMap
podemos separar las palabras por: 1 palabra, 2 palabras...
y las ordenamos con una lista Map
*/
public class ContarPalabras {
    String inputDatos;
    JTextArea outputDatos;
    HashMap <String, Integer> buscarHash;
    String[] palabras;
    DefaultTableModel tablilla;
    
    public ContarPalabras(String inputDatos) {
        this.inputDatos = inputDatos;
        buscarHash= new HashMap<String, Integer>();
    }
    
    public void SepararPalabras(JComboBox comboPalabras){
        try{
        //guarda en un string el texto, remplaza los saltos de linea por espacios, lo pasa a minusculas
        //y divide el string por espacios para obtener todas las palabras de la web.
        //ademas divide el texto en 1 palabra, en 2 palabras, 3 palabras o 4 palabras.
        buscarHash.clear();
        String saltosLinea=inputDatos.replaceAll("\n", " ").toLowerCase();
        palabras=saltosLinea.split(" ");
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
                    //saltosLinea+="c ";
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
        }catch(Exception e){
            System.err.println("Error separarPalabras \n"+e);
        }
    }
    public DefaultTableModel ordenarDatos(int densidad){
        //con este metodo, metemos todas las palabras que obtenemos con el metodo anterior
        //en un modelo para una tabla y los ordena de mayor a menor.
        try{
            tablilla=new DefaultTableModel();
        List<Entry<String, Integer>> list= new LinkedList<Entry<String, Integer>>(buscarHash.entrySet());
        
        Collections.sort(list, new Comparator<Entry<String, Integer>>(){
            @Override
            public int compare(Entry<String, Integer> t, Entry<String, Integer> t1) {
                return t1.getValue().compareTo(t.getValue());
            }
        });
        
        tablilla.addColumn("Veces que aparece");
        tablilla.addColumn("Palabra");
        tablilla.addColumn("Densidad de KeyWord");

        for (Entry<String, Integer> item: list){
            String[] separado=item.toString().split("=");
            Object [] fila=new Object[3];
            Double calcularDensidad;
            calcularDensidad=(double)(Integer.parseInt(separado[1])*100)/densidad;
            fila[0]=Integer.parseInt(separado[1]);
            fila[1]=separado[0];
            fila[2]=Math.round(calcularDensidad)+" %";
            tablilla.addRow(fila);
        }
        }catch(Exception e){
            
        }
        
        return tablilla;
    }
    
    //este metodo esta en desuso pero lo guardo porque en un futuro seguro que lo necesitare
//    public void mostrarDatos(){
//        int mayor=0;
//        int[] clav=new int[buscarHash.size()];
//        for (String i : buscarHash.keySet()) {
//            outputDatos.append("-"+" "+i+buscarHash.get(i)+"\n");
//            System.out.println("-"+buscarHash.get(i)+" "+i);
//        }
//    }
}
