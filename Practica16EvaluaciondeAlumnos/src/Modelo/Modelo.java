
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Modelo {
    private Connection conexion;
    private Statement sentencia;
    private ResultSet resultadoConsulta;
    private String url="alumnos.s3db";
    
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
    
    public ResultSet MostrarCurso(){
        String sentenciaSql="select * from cursos";
        try{
            sentencia=conexion.createStatement();
            resultadoConsulta=sentencia.executeQuery(sentenciaSql);
            return resultadoConsulta;
        }catch(Exception e){
            System.err.println("ERROR \n"+ e);
        }
        return null;
    }
    public ResultSet MostrarAsignaturas(String asignaturas){
        String sentenciaSql="select * from asignaturas as asi,cursos as cur where\n" +
        "cur.idCurso=asi.idCurso and cur.curso='"+asignaturas+"'" ;
        try{
            sentencia=conexion.createStatement();
            resultadoConsulta=sentencia.executeQuery(sentenciaSql);
            return resultadoConsulta;
        }catch(Exception e){
            System.err.println("ERROR \n"+ e);
        }
        return null;
    }
    public ResultSet MostrarEvaluacion(){
        String sentenciaSql="select distinct evaluacion from notas";
        try{
            sentencia=conexion.createStatement();
            resultadoConsulta=sentencia.executeQuery(sentenciaSql);
            return resultadoConsulta;
        }catch(Exception e){
            System.err.println("ERROR \n"+ e);
        }
        return null;
    }
    public ResultSet MostrarAlumnos(String curso,String asignatura){
        String sentenciaSql="select distinct alumno from cursos as cur, asignaturas as asi,\n" +
        "notas as no, alumnos as alu\n" +
        "where alu.idAlumno=no.idAlumno and\n" +
        "alu.idCurso=cur.idCurso and\n" +
        "curso='"+curso+"' and\n" +
        "asignatura='"+asignatura+"'";
                
        try{
            System.out.println(sentenciaSql);
            sentencia=conexion.createStatement();
            resultadoConsulta=sentencia.executeQuery(sentenciaSql);
            return resultadoConsulta;
        }catch(Exception e){
            System.err.println("ERROR \n"+ e);
        }
        return null;
    }
    
    public ResultSet MostrarEvaluarAlumnos(String evaluacion, String alumno, String asignatura,String curso){
        String sentenciaSql="select distinct alumno,asignatura,nota,curso from alumnos as alu, asignaturas as asi, cursos as cur, notas as no\n" +
"where alu.idAlumno=no.idAlumno and\n" +
"asi.idAsignatura=no.idAsignatura and\n" +
"no.evaluacion='"+evaluacion+"' and\n" +
"alu.alumno='"+alumno+"' and\n" +
"asi.asignatura='"+asignatura+"' and\n" +
"cur.curso='"+curso+"' and\n" +
"nota>=0";
        try{
            sentencia=conexion.createStatement();
            resultadoConsulta=sentencia.executeQuery(sentenciaSql);
            return resultadoConsulta;
        }catch(Exception e){
            System.err.println("Error mostrarEvaluarAlumnos \n"+ e);
        }
        return null;
    }
    public void modificarNotas(String nota, String evaluacion, String alumno, String asignatura){
        String sentenciaSql="UPDATE notas SET nota = '"+nota+"' WHERE evaluacion='"+evaluacion+"'\n" +
"AND idAlumno = ( SELECT idAlumno FROM alumnos WHERE alumno='"+alumno+"')\n" +
"AND idAsignatura = ( SELECT idAsignatura FROM asignaturas WHERE asignatura ='"+asignatura+"') and nota>=0";
        try{
            
            System.out.println(sentenciaSql);
            sentencia=conexion.createStatement();
            sentencia.executeUpdate(sentenciaSql);
            
        }catch(Exception e){
            System.err.println("Error modificarNotas \n"+ e);
        }
        
    }
}
