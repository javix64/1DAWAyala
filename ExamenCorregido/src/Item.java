
import java.awt.PopupMenu;


public class Item {
    private String nombre;

        public Item(String nombre) {
        this.nombre = nombre;
        }        
        public Item() {
        this.nombre = "";
        }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    PopupMenu get(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}