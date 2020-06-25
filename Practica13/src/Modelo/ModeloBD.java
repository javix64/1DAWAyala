
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
    //CON EL MODELO SOLO HACEMOS LAS CONSULTAS
public class ModeloBD {
    private Connection conexion;
    private Statement sentencia;
    private Statement sentenciaObtenerDatos;
    private ResultSet resultadoObtenerDatos;
    private ResultSet resultado;
    private String url="multas.s3db";
    
    ////////////////////////////CONSTRUCTOR////////////////////////////
    
    
    public ModeloBD(){
        try {
            conexion=DriverManager.getConnection("jdbc:sqlite:" + url);
            if (conexion!=null) {
                System.out.println("Conectado");
            }
            } catch (SQLException e) {
                System.out.println("Se ha producido un error al establecer la conexión con la Base de Datos agenda");
                }
    }
    
    ////////////////////////////METODOS////////////////////////////
    
    public ResultSet MostrarConductores(){
        String consulta="Select nombre from Coches";
            resultado=null;
        try{
            sentencia=conexion.createStatement();
            resultado=sentencia.executeQuery(consulta);
        }catch(Exception e){}
        return resultado;
    }
    
    public ResultSet MostrarDatosCoche(String nombre){
        String sentenciaSQL="SELECT * FROM Coches where nombre='"+nombre+"'";
        resultado=null;
        try{
            sentencia=conexion.createStatement();
            resultado=sentencia.executeQuery(sentenciaSQL);
        }catch(Exception e){}
        return resultado;
    }
    public ResultSet MostrarMultas(String nombre){
        String sentenciaSQL="select inf.infraccion,inf.penalizacion,mul.fecha" +
        " from Infracciones as inf,Multas as mul, Coches as coc" +
        " where" +
        " inf.codigoInfraccion=mul.codigoInfraccion" +
        " and" +
        " mul.codigoCoche=coc.codigoCoche" +
        " and" +
        " coc.nombre='"+nombre+"'";
        try{
            sentencia=conexion.createStatement();
            resultado=sentencia.executeQuery(sentenciaSQL);
        }catch(Exception e){}
        return resultado;
    }
}
    
    

