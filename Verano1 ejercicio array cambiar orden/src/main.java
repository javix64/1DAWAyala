
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class main {
    
    public static void main(String[] args) {
       Persona p1 = new Persona("juan", "sanchez", 20);
Persona p2 = new Persona("ana", "gomez", 12);
Persona p3 = new Persona("pedro", "gutierrez", 40);
List<Persona> lista=Arrays.asList(p1,p2,p3);

       for (Persona p:lista) {
// formato clasico
            System.out.println(p.getNombre());
            System.out.println(p.getApellidos());
            System.out.println(p.getEdad());
        }
//        ArrayList<String> ordenar=new ArrayList<String>();
//        ArrayList<String> ordenarTresPalabras=new ArrayList<String>();
//        ordenar.add("mundo hola");
//        ordenar.add("hola mundo");
//        
//        
//        
//        for (int i = 0; i < ordenar.size(); i++) {
//            
//        }
//        
    }
    public static class Persona {
private String nombre;
private String apellidos;
private int edad;
public String getNombre() {
return nombre;
}
public void setNombre(String nombre) {
this.nombre = nombre;
}
public int getEdad() {
return edad;
}
public void setEdad(int edad) {
this.edad = edad;
}
public String getApellidos() {
return apellidos;
}
public void setApellidos(String apellidos) {
this.apellidos = apellidos;
}
public Persona(String nombre, String apellidos, int edad) {
super();
this.nombre = nombre;
this.apellidos = apellidos;
this.edad = edad;
}
}
        
}
