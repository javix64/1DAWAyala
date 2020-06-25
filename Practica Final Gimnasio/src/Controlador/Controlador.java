/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Modelo;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author andres
 */
public class Controlador {
    Modelo modelo;
    ResultSet resultado=null;
    
    public Controlador(){
        modelo=new Modelo();
    }
    
    public void MostrarFinalidad(JComboBox mostrarFinalidad){
        resultado=modelo.MostrarFinalidad();
        try{
            while(resultado.next()){
                mostrarFinalidad.addItem(resultado.getString("finalidad"));
            }
        }catch(Exception e){
            System.err.println("error al obtener "+e);
        }
    }
    
    public DefaultTableModel MostrarRepeticiones(String repeticiones){
        resultado=modelo.MostrarRepeticiones(repeticiones);
        DefaultTableModel modeloTabla=new DefaultTableModel();
        modeloTabla.addColumn("ejercicio");
        modeloTabla.addColumn("finalidad");
        modeloTabla.addColumn("repeticiones");
        modeloTabla.addColumn("series");
        modeloTabla.addColumn("minutos");
        modeloTabla.addColumn("veces_en_semana");
        try{
            while(resultado.next()){
                Object [] fila=new Object[6];
                fila[0]=resultado.getString("ejercicio");
                fila[1]=resultado.getString("finalidad");
                fila[2]=resultado.getString("repeticiones");
                fila[3]=resultado.getString("series");
                fila[4]=resultado.getString("minutos");
                fila[5]=resultado.getString("veces_en_semana");
                modeloTabla.addRow(fila);
            }
        }catch(Exception e){
            System.err.println("error Mostrar repeticiones "+e);
        }
        return modeloTabla;
    }
    
}
