
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ModeloBD {
    private Connection conexion;
    private Statement sentencia;
    private Statement Sentenciasql;
    private ResultSet resultado;
    private String url="restaurante.s3db";
    
    public ModeloBD(){
        System.out.println(url);
        try {
            
            conexion=DriverManager.getConnection("jdbc:sqlite:" + url);
            if (conexion!=null) {
                System.out.println("Conectado");
            }
            } catch (SQLException e) {
                System.out.println("Se ha producido un error al establecer la conexión con la Base de Datos");
                }
    }
    
    public ResultSet MostrarPrograma(){
        String sentenciaSql="select * from Barra";
        
        try{
            sentencia=conexion.createStatement();
            resultado=sentencia.executeQuery(sentenciaSql);
        }catch(Exception e){}
        return resultado;
    }
    public ResultSet MostrarCuenta(String seleccionar, String fecha){
        
        String sentenciaSql="SELECT art.articulo,con.unidades, art.pvp,(con.unidades*art.pvp) as importe\n" +
        "from Articulo as art,Consumo as con, barra as bar\n" +
        "where art.codigoArticulo=con.codigoArticulo and\n" +
        "bar.codigoBarra=con.codigoBarra and\n" +
        "bar.barra='"+seleccionar+"' and\n"+
        "con.fecha='"+fecha+"'";
        try{
            
            sentencia=conexion.createStatement();
            resultado=sentencia.executeQuery(sentenciaSql);
        }catch(Exception E){}
        
        return resultado;
    }
}
