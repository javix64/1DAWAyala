/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.Alumnado;

import vista.alumnosManager;

/**
 *
 * @author Luis Miguel
 */
public class Controlador {

    private Connection conexion;
    private Statement sentencia;
    private ResultSet resultado;
    private String url;
    alumnosManager alumn;

    public Controlador() {

        this.url = "alumnos.s3db";

        iniciarConexion();

    }

    public void iniciarConexion() {

        try {
            conexion = DriverManager.getConnection("jdbc:sqlite:" + url);
            if (conexion != null) {
                System.out.println("Conexion realizada");
            }

        } catch (SQLException e) {
            System.out.println("no se pudo realizar conexion");
        }
    }

    public ResultSet ejecutaConsulta(String sentenciaSQL) {

        System.out.println(sentenciaSQL);
        resultado = null;
        try {
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(sentenciaSQL);

        } catch (SQLException e) {

        }
        return resultado;
    }

    public boolean analizarNota(String nombre, String curso, String asig, String eva) {

        nombre = traerIdalum(nombre);
        asig = traerIdAsig(asig, curso);

        String not = "";

        String sentenciaSQL = "select nota from notas where notas.evaluacion='" + eva + "' "
                + "and notas.idAlumno='" + nombre + "' and notas.idAsignatura='" + asig + "'";
        

        try {
            while (resultado.next()) {
                not = resultado.getString("nota");

            }
        } catch (SQLException e) {

            System.out.println("no se conoce la nota");
        }

        if (not == "") {
            System.out.println("falso");
            return false;
         
        } else {
            System.out.println("verdadero");
            return true;
        }

    }
    
    public void cambiarNotas(String nombre, String eva, String curso, String asig, String nota) {

        String not = "";

        nombre = traerIdalum(nombre);
        asig = traerIdAsig(asig, curso);
        String sentenciaSQL;

        if (analizarNota(nombre, curso, asig, eva)) {
            sentenciaSQL = "update notas set nota='" + nota + "' "
                    + "where notas.idAlumno='" + nombre + "' and notas.idAsignatura='" + asig + "' "
                    + "and notas.evaluacion='" + eva + "'";
            System.out.println(sentenciaSQL);
          
            resultado = ejecutaConsulta(sentenciaSQL);

            try {
                while (resultado.next()) {

                    not = resultado.getString("nota");

                }
            } catch (SQLException e) {

                System.out.println("fallo al cambiar la nota");
            }
        } else { 
            sentenciaSQL = "insert into notas values('" + nombre + "','" + asig + "','" + eva + "','" + nota + "')";
            
            try{
                  sentencia = conexion.createStatement();
               resultado=  ejecutaConsulta(sentenciaSQL);
            
            }catch (SQLException e){
            
                System.out.println("fallo al hacer los insert");
            }
         

        }
    }

    public ResultSet obtenerCursos() {

        String sentenciaSQL = "SELECT curso from cursos";

        System.out.println(sentenciaSQL);

        try {

            sentencia = conexion.createStatement();

            return resultado = sentencia.executeQuery(sentenciaSQL);

        } catch (SQLException e) {

            System.out.println("Fallo en ObtenerCursos");

            return null;

        }

    }

    public ResultSet obtenerAsignaturas(String curso) {

        String sentenciaSQL = "select asignatura from asignaturas,cursos where cursos.idCurso=asignaturas.idCurso and cursos.curso = '" + curso + "'";

        System.out.println(sentenciaSQL);

        try {

            sentencia = conexion.createStatement();

            return resultado = sentencia.executeQuery(sentenciaSQL);

        } catch (SQLException e) {

            System.out.println("Fallo en obtenerAsignaturas");

            return null;

        }

    }

    public ArrayList<Alumnado> guardarAlumnos(String curso, String asig) {
        ArrayList<Alumnado> arrayAlumnos = new ArrayList();
        Alumnado alumnos = null;

        String sentenciaSQL = "select distinct alumnos.alumno from alumnos,asignaturas,cursos where "
                + "cursos.idCurso=alumnos.idCurso"
                + " and asignaturas.idCurso=cursos.idCurso"
                + " and asignaturas.asignatura= '" + asig + "' and cursos.curso='" + curso + "'";
        resultado = ejecutaConsulta(sentenciaSQL);
        System.out.println(sentenciaSQL);

        try {
            while (resultado.next()) {
                String alum = resultado.getString("alumno");

                alumnos = new Alumnado(alum);
                arrayAlumnos.add(alumnos);

            }
        } catch (SQLException e) {

            System.out.println("no se pudo realizar conexcion");
        }

        return arrayAlumnos;

    }

    

    public String traerNota(String nombre, String curso, String asig, String eva) {

        nombre = traerIdalum(nombre);
        asig = traerIdAsig(asig, curso);

        String not = "";

        String sentenciaSQL = "select nota from notas where notas.evaluacion='" + eva + "' "
                + "and notas.idAlumno='" + nombre + "' and notas.idAsignatura='" + asig + "'";

        resultado = ejecutaConsulta(sentenciaSQL);
        System.out.println(sentenciaSQL);

        try {
            while (resultado.next()) {
                not = resultado.getString("nota");

            }
        } catch (SQLException e) {

            System.out.println("no se pudo realizar conexcion");
        }

        return not;

    }

    public String traerIdalum(String nombre) {

        String id = "";

        String sentenciaSQL = "select idAlumno from alumnos where alumno = '" + nombre + "'";
        resultado = ejecutaConsulta(sentenciaSQL);
        System.out.println(sentenciaSQL);

        try {
            while (resultado.next()) {

                id = resultado.getString("idAlumno");

            }
        } catch (SQLException e) {

            System.out.println("no se pudo realizar conexcion");
        }
        return id;

    }

    public String traerIdAsig(String asig, String curso) {

        String idAsig = "";

        String sentenciaSQL = "select asignaturas.idAsignatura from asignaturas,cursos where cursos.idCurso=asignaturas.idCurso"
                + " and asignaturas.asignatura='" + asig + "' and cursos.curso='" + curso + "'";

        resultado = ejecutaConsulta(sentenciaSQL);
        System.out.println(sentenciaSQL);

        try {
            while (resultado.next()) {

                idAsig = resultado.getString("idAsignatura");

            }
        } catch (SQLException e) {

            System.out.println("no se pudo realizar conexcion");
        }
        return idAsig;

    }
}
