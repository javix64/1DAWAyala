/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ModeloBD;
import java.sql.ResultSet;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
///// CON EL CONTROLADOR SE HACEN LAS FUNCIONES CON LOS DATOS DEL MODELO////
public class Controlador {
    //////////////////////////////////////////
    ///////////////////ATRIBUTOS/////////////
    /////////////////////////////////////////
    ModeloBD modelo;
    
        //////////////////////////////////////////
    ///////////////////CONSTRUCTORES/////////////
    /////////////////////////////////////////
    public Controlador(){
        modelo= new ModeloBD();
    }
    
    //////////////////////////////////////////
    ///////////////////METODOS/////////////
    /////////////////////////////////////////
    public void LlenarComboConductores(JComboBox lista){
        ResultSet resultado=modelo.MostrarConductores();
        try{
            
        while(resultado.next()){
            lista.addItem(resultado.getString("nombre"));
        }
        
        }catch(Exception e){}
    }
    
       public void mostrarDatosCoches(String nombreConductor, JTextField coche, JTextField matricula){
        ResultSet resultado=modelo.MostrarDatosCoche(nombreConductor);
        try{
            
        while(resultado.next()){
            
            coche.setText(resultado.getString("coche"));
            matricula.setText(resultado.getString("matricula"));
            
        }
        
        }catch(Exception e){}
    }
       public void MostrarMultas(String nombre, JTable tabla){
           DefaultTableModel modeloTabla=new DefaultTableModel();
           System.out.println("mostrar modelo CONTROLADOR");
           ResultSet resultado=modelo.MostrarMultas(nombre);
        try{
            modeloTabla.addColumn("infraccion");
            modeloTabla.addColumn("penalizacion");
            modeloTabla.addColumn("fecha");
            while(resultado.next()){
                Object [] fila=new Object[4];
                fila[0]=resultado.getString("infraccion");
                fila[1]=resultado.getString("penalizacion");
                fila[2]=resultado.getString("fecha");
                modeloTabla.addRow(fila);
            }
            tabla.setModel(modeloTabla);
            
        }catch(Exception e){}
       }
    
    
}
