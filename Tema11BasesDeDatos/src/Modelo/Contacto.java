
package Modelo;

public class Contacto {
    private String nom, dir, tlf, email, localidad;
    private int edad;

    public Contacto(String nom, String dir, String tlf, String email, String localidad, int edad) {
        this.nom = nom;
        this.dir = dir;
        this.tlf = tlf;
        this.email = email;
        this.localidad = localidad;
        this.edad = edad;
    }

    public String getNom() {
        return nom;
    }

    public String getDir() {
        return dir;
    }

    public String getTlf() {
        return tlf;
    }

    public String getEmail() {
        return email;
    }

    public String getLocalidad() {
        return localidad;
    }

    public int getEdad() {
        return edad;
    }
    

}
