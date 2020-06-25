package Modelo;

import Modelo.Contacto;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ModeloBD {
    private Connection conexion;
    private Statement sentencia;
    private Statement sentenciaObtenerDatos;
    private ResultSet resultadoObtenerDatos;
    private ResultSet resultado;
    private String url="agenda.s3db";
    
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
    public ResultSet obtenerContactos(){
        String sentenciaSQL="SELECT * FROM guia ORDER BY nombre ASC";
        resultado=null;
        try{
            sentencia=conexion.createStatement();
            resultado=sentencia.executeQuery(sentenciaSQL);
        }catch(Exception e){}
        return resultado;
    }
    public ResultSet obtenerDatosContacto(String nombre){
        String sentenciaSQL="SELECT * FROM guia where nombre='"+nombre+"'";
        resultado=null;
        try{
            sentencia=conexion.createStatement();
            resultado=sentencia.executeQuery(sentenciaSQL);
        }catch(Exception e){}
        return resultado;
    }
    public ResultSet actualizarDatos(String nombre,String direccion, String edad,int telefono,String nombreAntiguo){
        String sentenciaSQL="Update guia SET nombre='"+nombre+"',direccion='"+direccion+"',telefono='"+telefono+"',edad='"+edad+"'where nombre='"+nombreAntiguo+"'";
        resultado=null;
        try{
            sentencia=conexion.createStatement();
            resultado=sentencia.executeQuery(sentenciaSQL);
        }catch(Exception e){}
        return resultado;
    }
        public void nuevoDatos(String nombre,String direccion, String edad,int telefono){
            String crearNuevoContacto="Insert into guia (nombre,direccion,edad,telefono) values('"+nombre+"','"+direccion+"','"+edad+"','"+telefono+"')";
            resultado=null;
        try {
            sentencia=conexion.createStatement();
            resultado=obtenerContactos();
            //el unico sirve para ver si ya existe el contacto
            boolean unico=true;
            while(resultado.next()){
                    String actual=resultado.getString("nombre");
                if(actual.equals(nombre)){
                    unico=false;
                    System.err.println("4a3y5hsdrx");
                }
            }
            if (unico) {
                System.out.println("estoy entrando");
            }else{
                    System.err.println("Nombre repetido");
                }
            
        } catch (SQLException ex) {
        }
            System.out.println(crearNuevoContacto);
        }
        /*
        public Contacto primerContacto(){
        String sentenciaSQL="SELECT * FROM guia ORDER BY nombre ASC";
        System.out.println(sentenciaSQL);
        Contacto contacto=null;
        try{
            sentencia=conexion.createStatement();
            resultado=sentencia.executeQuery(sentenciaSQL);
            if(resultado.next()){
                String nom=resultado.getString("nombre");
                String dir=resultado.getString("direccion");
                String tel=resultado.getString("telefonos");
                int edad=resultado.getInt("edad");
                contacto=new Contacto(nombre, direccion, telefono, edad); 
            }
        } catch(SQLException e){
            System.out.println("No se pudo obtener el primer contacto");
        }
        return contacto;
    }
*/
    
}
