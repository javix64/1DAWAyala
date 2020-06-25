package Controlador;

import Modelo.Modelo;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author drago
 */
public class Controlador {
    Modelo modelo;

    
    public Controlador(){
        modelo=new Modelo();
    }
    
    public void showLocales(JComboBox mostrarLocales){
        ResultSet resultado=modelo.showLocales();
        try{
            while(resultado.next()){
                mostrarLocales.addItem(resultado.getString("nombre"));
            }
        }catch(Exception e){
            System.err.println("Error showLocales \n"+e);
        }
    }
    public void showEmpleados(JComboBox mostrarEmpleados, String local){
        ResultSet resultado=modelo.showEmpleados(local);
        try{
            while(resultado.next()){
                mostrarEmpleados.addItem(resultado.getString("nombre"));
            }
        }catch(Exception e){
            System.err.println("Error showLocales \n"+e);
        }
    }
    
    public void showTodoEmpleado(String nombre,JLabel nombreLabel, JLabel apellidos,JLabel direccion, JLabel telefono, JLabel email, JTextArea descripcion){
        ResultSet resultado=modelo.showTodoEmpleado(nombre);
        
        try{
            while(resultado.next()){
                
                    nombreLabel.setText(resultado.getString("nombre"));
                    apellidos.setText(resultado.getString("apellidos"));
                    direccion.setText(resultado.getString("direccion"));
                    telefono.setText(resultado.getString("telefono"));
                    email.setText(resultado.getString("email"));
                    descripcion.setText(resultado.getString("descripcion"));
            }
        }catch(Exception e){
            System.err.println("Error showLocales \n"+e);
        }
    }
    
    
    
    public void obtenerFoto(String foto, JLabel fotito) throws IOException{
        ResultSet resultado=modelo.showFoto(foto);
        String fotoPersonal="";
        
        try{
            while(resultado.next()){
                fotoPersonal=resultado.getString("foto");
            }
            BufferedImage img = ImageIO.read(new File("FotosGente/"+fotoPersonal));
            if(foto.equals(foto)){
                Image dimg = img.getScaledInstance(fotito.getWidth(), fotito.getHeight(),
                Image.SCALE_SMOOTH);
                ImageIcon imageIcon = new ImageIcon(dimg);
                fotito.setIcon(imageIcon);
            }
        }catch(Exception e){
            
        }
            
    }
    public void ponerDatosNomina(String nombre,JLabel setTotalBruto, JLabel setTotalIrpf,JLabel setTotalNeto){
        ResultSet resultado=modelo.showSumatorias(nombre);
        Double totalNeto;
        try{
            while(resultado.next()){
                setTotalBruto.setText(resultado.getInt("totalNomina")+"");
                setTotalIrpf.setText(resultado.getInt("totalIrpf")+"");
                totalNeto=resultado.getInt("totalNomina")*0.88;
                setTotalNeto.setText(totalNeto+"");
            }
            
        }catch(Exception e){
            
        }
    }
    
    public DefaultTableModel showNominas(String nombre){
            DefaultTableModel modeloTabla=new DefaultTableModel();
        ResultSet resultado=modelo.shownNominas(nombre);
        modeloTabla.addColumn("id_nomina");
        modeloTabla.addColumn("nomina");
        modeloTabla.addColumn("mes");
        modeloTabla.addColumn("año");
        try{
            while(resultado.next()){
                Object [] fila=new Object[4];
                fila[0]=resultado.getString("id_nomina");
                fila[1]=resultado.getString("total");
                fila[2]=resultado.getInt("Mes");
                fila[3]=resultado.getInt("year");
         
                modeloTabla.addRow(fila);
            }
        }catch(Exception e){
            System.err.println("error Mostrar nominas "+e);
        }
        return modeloTabla;
    }
    public void updateNominas(JTable tablaNominas){
        DefaultTableModel tabla=(DefaultTableModel) tablaNominas.getModel();
        
        modelo.updateNominas(tabla, 2);
        
       
    }
    
}
