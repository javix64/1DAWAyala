package Controlador;

import Modelo.Modelo;
import java.sql.ResultSet;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Controlador {
    Modelo modelillo;
    ResultSet resultado=null;
    DefaultTableModel tablilla;
    public Controlador(){
        modelillo=new Modelo();
        
    }
    public void MostrarJornadas(JComboBox comboLista){
        ResultSet resultado=modelillo.Jornada();
        try{
            while(resultado.next()){
                comboLista.addItem(resultado.getString("jornada"));
            }
        }catch(Exception e){
            System.err.println("error al obtener mostrarJornadas");
        }
    }
    
    
    public void MostrarPartidos(JComboBox comboPartido,JComboBox comboJornada,JTextField ponerFecha){
        ResultSet resultado=modelillo.ponerPartidos(comboJornada.getSelectedItem().toString());
        try{
            comboPartido.removeAllItems();
            while(resultado.next()){
                comboPartido.addItem(resultado.getString("codigoPartido"));
                ponerFecha.setText(resultado.getString("fecha"));
            }
        }catch(Exception e){
            System.err.println("error mostrarPartidos \n"+ e);
        }
    }
    public void MostrarEquipos(JTextField equipoLocal,JComboBox codigoPartido,JComboBox codigoJornada, JTextField equipoVisitante){
        ResultSet resultado=modelillo.ponerEquipos(codigoPartido.getSelectedItem().toString(), codigoJornada.getSelectedItem().toString());
        try{
            while(resultado.next()){
               equipoLocal.setText(modelillo.ponerNombreEquipo(resultado.getString("codigoEquipoLocal")));
               equipoVisitante.setText(modelillo.ponerNombreEquipo(resultado.getString("codigoEquipoVisitante")));
               
            }
        }catch(Exception e){
            System.err.println("error mostrarPartidos "+ e);
        }
    }
    
    public void MostrarPorcentajes(JComboBox partido, JComboBox jornada,JTable tabla){
        ResultSet resultado=modelillo.Canastas(partido.getSelectedItem().toString(), jornada.getSelectedItem().toString());
        tablilla= new DefaultTableModel();
        tabla.setModel(tablilla);
        tablilla.addColumn("Canastas de 1");
        tablilla.addColumn("Canastas de 2");
        tablilla.addColumn("Canastas de 3");
        try{
            while(resultado.next()){
                
                tablilla.addRow(new Object []
                {resultado.getString("porcentaje1"),
                resultado.getString("porcentaje2"),
                resultado.getString("porcentaje3")});
            }
            tabla.setModel(tablilla);
        }catch(Exception e){
            System.err.println("error MOSTRAR PORCENTAJES "+e);
        }
    }




}
        
    

