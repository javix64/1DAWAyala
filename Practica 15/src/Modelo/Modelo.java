package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JComboBox;

public class Modelo {
    //Creamos la conexion con la base de datos
    private Connection conexion;
    //es una consulta
    private Statement sentencia;
    //es el resultado de la consulta
    private ResultSet resultadoConsulta;
    //decimos donde esta la url de la base de datos
    private String url="baloncesto.s3db";
    public Modelo(){
        //metemos dentro de un bloque try y catch la conexion
        try{
            conexion=DriverManager.getConnection("jdbc:sqlite:"+url);
            if(conexion!=null){
                System.out.println("Conectado");
            }
        }catch(Exception e){
            System.out.println("Se ha producido un error al establecer la conexión con la Base de Datos");
        }
    }
    
    public ResultSet Jornada(){
        String sentenciaSql="select * from jornadas";
        try{
            sentencia=conexion.createStatement();
            resultadoConsulta=sentencia.executeQuery(sentenciaSql);
            return resultadoConsulta;
        }catch(Exception e){
            System.err.println("ERROR \n"+ e);
        }
        return null;
    }
    public ResultSet Partidos(){
        String sentenciaSql="select * from partidos";
        try{
            sentencia=conexion.createStatement();
            resultadoConsulta=sentencia.executeQuery(sentenciaSql);
            return resultadoConsulta;
        }catch(Exception e){
            System.err.println("ERROR AL ENTRAR EN PARTIDOS");
        }
        return null;
    }
    
    
      public ResultSet ponerPartidos(String jornada){
        String sentenciaSql="select pa.codigoEquipoLocal,pa.codigoEquipoVisitante,jo.fecha,pa.codigoPartido "
                + "from partidos as pa, jornadas as jo "
                + "where jo.jornada=pa.jornada and "
                + "jo.jornada='"+jornada+"'";
        try{
            sentencia=conexion.createStatement();
            resultadoConsulta=sentencia.executeQuery(sentenciaSql);
            return resultadoConsulta;
        }catch(Exception e){
            System.err.println("ERROR AL ENTRAR EN PARTIDOS");
        }
        return null;
    }
      
        public String ponerNombreEquipo(String codigoEquipo){
            String sentenciaSql="select nombre\n" +
            "from equipos\n" +
            "where codigoEquipo='"+codigoEquipo+"'";
            try{
                sentencia=conexion.createStatement();
                resultadoConsulta=sentencia.executeQuery(sentenciaSql);
                
                resultadoConsulta.next();
                return resultadoConsulta.getString("nombre");
                
            }catch(Exception e){
                System.err.println("ERROR EN "+e);
            }
            return null;
        }
        public ResultSet ponerEquipos(String codigoPartido,String codigoJornada){
            String sentenciaSql="select jo.fecha,pa.jornada,pa.codigoPartido,pa.codigoEquipoLocal,pa.codigoEquipoVisitante\n" +
"from jornadas as jo, partidos as pa\n" +
"where jo.jornada=pa.jornada and\n" +
"pa.jornada='"+codigoJornada+"' and\n" +
"pa.codigoPartido='"+codigoPartido+"'";
    
            try{
                sentencia=conexion.createStatement();
                resultadoConsulta=sentencia.executeQuery(sentenciaSql);
                return resultadoConsulta;
            }catch(Exception e){
                System.err.println("ERROR EN "+e);
            }
            return null;
        }
        
        
    public ResultSet Canastas(String codigoPartido,String codigoJornada){
        String sentenciaSql="select canastas1*100/intentos1 as porcentaje1,\n" +
"canastas2*100/intentos2 as porcentaje2,\n" +
"canastas3*100/intentos3 as porcentaje3\n" +
"from partidos as par,puntuaciones as pun, jornadas as jor\n" +
"where par.jornada=pun.codigoJornada and\n" +
"par.codigoPartido=pun.codigoPartido   and\n" +
"jor.jornada=par.jornada and\n" +
"jor.jornada='"+codigoJornada+"' and\n" +
"par.codigoPartido='"+codigoPartido+"'";
        
        try{
            sentencia=conexion.createStatement();
            resultadoConsulta=sentencia.executeQuery(sentenciaSql);
        }catch(Exception e){}
                return resultadoConsulta;
    }
}