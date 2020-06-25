package practica8;
public class Persona {
    private String nombre;
    private String direccion;
    private int edad;
    private int telefono;

    public Persona() {
        this.nombre ="";
        this.direccion ="";
        this.edad =0;
        this.telefono =0;
    }
    
    public Persona(String nombre, String direccion, int edad, int telefono){
        this.nombre=nombre;
        this.direccion=direccion;
        this.edad=edad;
        this.telefono=telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
}
