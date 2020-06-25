/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author andres
 */
public class Modelo {
    private Connection conexion;
    private Statement sentencia;
    private ResultSet resultadoConsulta;
    private String url="Gimnasio.s3db";
    
    public Modelo(){
        try{
            conexion=DriverManager.getConnection("jdbc:sqlite:"+url);
            if(conexion!=null){
                System.out.println("Conectado");
            }
        }catch(Exception e){
            System.out.println("Error al conectar BD");
        }
    }
    
    public ResultSet MostrarFinalidad(){
        String sentenciaSql="select * from finalidad";
        try{
            sentencia=conexion.createStatement();
            resultadoConsulta=sentencia.executeQuery(sentenciaSql);
            return resultadoConsulta;
        }catch(Exception e){
            System.err.println("ERROR "+ e);
        }
        return null;
    }
    public ResultSet MostrarRepeticiones(String repeticiones){
        String sentenciaSql="select eje.ejercicio,fin.finalidad,rep.repeticiones,rep.series,rep.minutos,rep.veces_en_semana\n" +
        "from repeticiones as rep,finalidad as fin,ejercicio as eje\n" +
        "where fin.id_finalidad=rep.id_finalidad\n" +
        "and eje.id_ejercicio=rep.id_ejercicios\n" + 
        "and fin.finalidad='"+repeticiones+"'";
        try{
            sentencia=conexion.createStatement();
            resultadoConsulta=sentencia.executeQuery(sentenciaSql);
            return resultadoConsulta;
        }catch(Exception e){
            System.err.println("ERROR "+ e);
        }
        return null;
    }
}
