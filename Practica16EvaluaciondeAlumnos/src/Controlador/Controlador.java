
package Controlador;

import Modelo.Modelo;
import java.awt.List;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

    public class Controlador {
    Modelo modelillo;
    ResultSet resultado=null;
    DefaultTableModel defaultModel;
    ArrayList<String> lista;
    public Controlador(){
        modelillo=new Modelo();
        defaultModel=new DefaultTableModel();
    }
    
    public void MostrarCurso(JComboBox mostrarCurso){
        ResultSet resultado=modelillo.MostrarCurso();
        try{
            while(resultado.next()){
                mostrarCurso.addItem(resultado.getString("curso"));
            }
        }catch(Exception e){
            System.err.println("error al obtener "+e);
        }
    }
    public void MostrarAsignatura(JComboBox mostrarAsignatura,String asignatura){
        ResultSet resultado=modelillo.MostrarAsignaturas(asignatura);
        try{
            mostrarAsignatura.removeAllItems();
            while(resultado.next()){
                mostrarAsignatura.addItem(resultado.getString("asignatura"));
            }
        }catch(Exception e){
            System.err.println("error al obtener "+e);
        }
        
    }
    public void MostrarEvaluacion(JComboBox mostrarEvaluacion){
        ResultSet resultado=modelillo.MostrarEvaluacion();
        try{
            while(resultado.next()){
                mostrarEvaluacion.addItem(resultado.getString("evaluacion"));
            }
        }catch(Exception e){
            System.err.println("error al obtener "+e);
        }
    }
    public void MostrarAlumnos(List list1,String curso, String asignatura){
        ResultSet resultado=modelillo.MostrarAlumnos(curso, asignatura);
        try{
            list1.removeAll();
            while(resultado.next()){
                list1.add(resultado.getString("alumno"));
                
            }
        }catch(Exception e){
            System.err.println("error al obtener "+e);
        }        
    }
    
    public void MostrarEvaluarAlumnos(String evaluacion, String alumnos,String asignatura,String curso, JTable tabla,DefaultTableModel defaultModel){
        try{
            ResultSet resultado=modelillo.MostrarEvaluarAlumnos(evaluacion, alumnos, asignatura, curso);
            while(resultado.next()){
                Object [] fila=new Object[2];                
                fila[0]=resultado.getString("alumno");               
                fila[1]=resultado.getString("nota");
                defaultModel.addRow(fila);
            }
            tabla.setModel(defaultModel);
        }catch(Exception e){
            System.err.println("error al obtener "+e);
        }
    }
    public void ModificarEvaluacion(String nota, String evaluacion, String alumno, String asignatura){
        modelillo.modificarNotas(nota, evaluacion, alumno, asignatura);
        
        
//        try{
//            while(resultado.next()){
//                modelillo.modificarNotas(nota, evaluacion, alumno, asignatura);
//            }
//        }catch(Exception e){
//            System.err.println("error ModificarEvaluacion \n"+e);
//        }
    }
}
