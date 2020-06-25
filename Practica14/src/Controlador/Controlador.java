package Controlador;

import javax.swing.JComboBox;
import Modelo.ModeloBD;
import java.sql.ResultSet;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Controlador {
    ModeloBD modelillo;
    
    public Controlador(){
        modelillo=new ModeloBD();
    }
    
    public void MostrarCuentaCaja(JComboBox cajita){
        ResultSet resultado=modelillo.MostrarPrograma();
        try{
            while(resultado.next()){
                cajita.addItem(resultado.getString("Barra"));
            }
        }catch(Exception e){}
        
    }
    
    public void MostrarCuentaTabla(String seleccionar,String fecha,JTable restauranteTabla){
        DefaultTableModel modeloTabla=new DefaultTableModel();

        ResultSet resultado=modelillo.MostrarCuenta(seleccionar, fecha);
       
        try{
            modeloTabla.addColumn("articulo");
            modeloTabla.addColumn("unidades");
            modeloTabla.addColumn("PVP");
            modeloTabla.addColumn("importe");
            while(resultado.next()){
                Object [] fila=new Object[4];
                fila[0]=resultado.getString("Articulo");
                fila[1]=resultado.getString("Unidades");
                fila[2]=resultado.getString("PVP");
                fila[3]=resultado.getString("importe");
                modeloTabla.addRow(fila);
            }
            restauranteTabla.setModel(modeloTabla);
            
        }catch(Exception e){}
       }
}
