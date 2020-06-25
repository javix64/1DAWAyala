
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.swing.JTextArea;

public class arrays {
    HashMap <String, Integer> buscarHash;
    public arrays() {
        buscarHash= new HashMap<String, Integer>();
    }
    
    public void arraysito(){
        ArrayList<String> mylist = new ArrayList<String>();
        String patata="patata es muy bonita manolo manolo manolo manolo es es es patata";
        patata.split(" ");
        //https://beginnersbook.com/2015/05/java-string-to-arraylist-conversion/
        mylist.add("patata es muy bonita manolo manolo manolo manolo es es es patata");
        mylist.add("patata");
        mylist.add("cocido");
        mylist.add("cocido");
        mylist.add("cocido");
        mylist.add("hiel");
        mylist.add("hiel");
        mylist.add("manolo");
        mylist.add("manolo");
        mylist.add("manolo");
        mylist.add("mesas");
        mylist.add("mesas");
        mylist.add("mesas");
        mylist.add("mesas");
        mylist.add("mesas");
        mylist.add("mesas");
        mylist.add("mesas");
        mylist.add("mesas");
        System.out.println(mylist);
        for (int i = 0; i < mylist.size(); i++) {
            if(buscarHash.containsKey(mylist.get(i))){
                int valor=buscarHash.get(mylist.get(i))+1;
                buscarHash.replace(mylist.get(i), valor);
                
                }else{
                    buscarHash.put(mylist.get(i), 1);
                    }            
                }
        
    }
    public void ordenarDatos(JTextArea ni){
        List<Map.Entry<String, Integer>> list= new LinkedList<Map.Entry<String, Integer>>(buscarHash.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>(){
            @Override
            public int compare(Map.Entry<String, Integer> t, Map.Entry<String, Integer> t1) {
                return t1.getValue().compareTo(t.getValue());
            }
        });
        for (Map.Entry<String, Integer> item: list){
            String[] separado=item.toString().split("=");
            //System.out.println(item);
            ni.append(separado[1]+" - "+separado[0]+"\n");
        }   
    }
}
