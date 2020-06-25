
public class Persona {
    private String nombre;
    private int telefono;

    public Persona(String nombre, int telefono) { //constructor por parametros
        this.nombre = nombre;
        this.telefono = telefono;
    }
    public Persona() { //constructor por defecto
        this.nombre = "";
        this.telefono = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
}
