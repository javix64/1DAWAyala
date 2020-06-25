package Modelo;

public class Multas {
    private String codigoCoche, nif, nombre, direccion, matricula, coche, codigoInfraccion, infraccion, fecha;
    private int penalizacion;

    public Multas(String codigoCoche, String nif, String nombre, String direccion, String matricula, String coche, String codigoInfraccion, String infraccion, String fecha, int penalizacion) {
        this.codigoCoche = codigoCoche;
        this.nif = nif;
        this.nombre = nombre;
        this.direccion = direccion;
        this.matricula = matricula;
        this.coche = coche;
        this.codigoInfraccion = codigoInfraccion;
        this.infraccion = infraccion;
        this.fecha = fecha;
        this.penalizacion = penalizacion;
    }

    public String getCodigoCoche() {
        return codigoCoche;
    }

    public String getNif() {
        return nif;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getCoche() {
        return coche;
    }

    public String getCodigoInfraccion() {
        return codigoInfraccion;
    }

    public String getInfraccion() {
        return infraccion;
    }

    public String getFecha() {
        return fecha;
    }

    public int getPenalizacion() {
        return penalizacion;
    }
    
}
