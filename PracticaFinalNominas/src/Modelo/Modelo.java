package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author drago
 */
public class Modelo {
    private Connection conexion;
    private Statement sentencia;
    private ResultSet resultadoConsulta;
    private String url="nominas.s3db";
    
    public Modelo(){
        try{
            conexion=DriverManager.getConnection("jdbc:sqlite:"+url);
            if(conexion!=null){
                System.out.println("Conectado a la base de datos");
            }
        }catch(Exception e){
            System.out.println("Se ha producido un error al establecer la conexión con la Base de Datos");
        }
    }
    
    public ResultSet showLocales(){
        String sentenciaSql="select * from local";
        try{
            sentencia=conexion.createStatement();
            resultadoConsulta=sentencia.executeQuery(sentenciaSql);
            return resultadoConsulta;
        }catch(Exception e){
            System.err.println("ERROR \n"+ e);
        }
        return null;
    }
    
    public ResultSet showEmpleados(String local){
        String sentenciaSql="select emp.nombre from empleado as emp, local as loc\n" +
" where emp.id_local=loc.id_local\n" +
"and loc.nombre='"+local+"'";
        try{
            sentencia=conexion.createStatement();
            resultadoConsulta=sentencia.executeQuery(sentenciaSql);
            return resultadoConsulta;
        }catch(Exception e){
            System.err.println("ERROR empleados\n"+ e);
        }
        return null;
    }
    public ResultSet showTodoEmpleado(String nombre){
        String sentenciaSql="select nombre,apellidos,direccion,telefono,email,descripcion,id_observacion,observaciones.id_empleado from empleado,observaciones \n" +
" where empleado.id_Empleado=observaciones.id_Empleado \n" +
" and empleado.nombre='"+nombre+"'";
        try{
            sentencia=conexion.createStatement();
            resultadoConsulta=sentencia.executeQuery(sentenciaSql);
            return resultadoConsulta;
        }catch(Exception e){
            System.err.println("Error mostrar todos los datos de empleados \n"+e);
        }
        return null;
    }
    public ResultSet showFoto(String foto){
        String sentenciaSql="select foto from empleado\n" +
        " where empleado.nombre='"+foto+"'";
        try{
            sentencia=conexion.createStatement();
            resultadoConsulta=sentencia.executeQuery(sentenciaSql);
            return resultadoConsulta;
        }catch(Exception e){
            System.err.println("Error foto \n"+e);
        }
        return null;
    }
    
    public ResultSet shownNominas(String nombre){
        String sentenciaSql="select mes.Mes,mes.year,nom.id_nomina,nom.total from mes, empleado as emp, nomina as nom\n" +
        " where emp.id_empleado=mes.id_empleado\n" +
        " and nom.id_nomina=mes.id_nomina\n" +
        " and emp.nombre='"+nombre+"'";
        
        try{
            sentencia=conexion.createStatement();
            resultadoConsulta=sentencia.executeQuery(sentenciaSql);
            return resultadoConsulta;
        }catch(Exception e){
            System.err.println("ERROR \n"+ e);
        }
        return null;
    }
    public ResultSet showSumatorias(String nombre){
        String sqlTotalBrutoIRPF="select sum(nom.total) as totalNomina,sum(nom.irpf) as totalIrpf "+ 
            " from mes, empleado as emp, nomina as nom\n" +
            " where nom.id_nomina=mes.id_nomina\n" +
            " and emp.id_empleado=mes.id_empleado\n" +
            " and emp.nombre='"+nombre+"'";
        try{
            sentencia=conexion.createStatement();
            resultadoConsulta=sentencia.executeQuery(sqlTotalBrutoIRPF);
            return resultadoConsulta;
        }catch(Exception e){
            System.err.println("ERROR \n"+ e);
        }
        return null;
        
    }
    public ResultSet showObservaciones(){
            String sentenciaSql="select id_observacion,descripcion,id_empleado from observaciones";
        try{
            sentencia=conexion.createStatement();
            resultadoConsulta=sentencia.executeQuery(sentenciaSql);
            return resultadoConsulta;
        }catch(Exception e){
            System.err.println("ERROR \n"+ e);
        }
        return null;
    }
    public ResultSet editarObservaciones(String nombre){
            String sentenciaSql="select obs.id_observacion,obs.descripcion,obs.id_empleado from empleado as emp, observaciones as obs\n" +
            " where obs.id_empleado=emp.id_empleado\n" +
            " and emp.nombre='"+nombre+"'";
        try{
            sentencia=conexion.createStatement();
            resultadoConsulta=sentencia.executeQuery(sentenciaSql);
            return resultadoConsulta;
        }catch(Exception e){
            System.err.println("ERROR \n"+ e);
        }
        return null;
    }
    
    public void updateNominas(DefaultTableModel tabla,int id_empleado){
        int filas=tabla.getRowCount();
        String sentenciaSql="";
        String sentenciaSql2="";
        for (int i = 0; i < filas; i++) {
            String id_nomina=(String)tabla.getValueAt(i, 0);
            String nomina=(String)tabla.getValueAt(i, 1);

            int mes=(int)tabla.getValueAt(i, 2);
            int year=(int)tabla.getValueAt(i, 3);
            sentenciaSql="INSERT OR REPLACE INTO nomina (id_nomina,total,irpf)\n" +
            " Values ("+id_nomina+","+nomina+",12)";
            sentenciaSql2="INSERT OR REPLACE INTO mes (id_nomina,id_empleado,mes,year)\n" +
            "Values ("+id_nomina+","+id_empleado+","+String.valueOf(mes)+","+String.valueOf(year)+")";
            System.out.println(sentenciaSql);
            System.out.println("''''''''");
            System.out.println(sentenciaSql2);
            System.out.println("''''''''");
            System.out.println(tabla.getValueAt(i, 0).getClass());
            System.out.println(tabla.getValueAt(i, 1).getClass());
            System.out.println(tabla.getValueAt(i, 2).getClass());
            System.out.println(tabla.getValueAt(i, 3).getClass());
        }
        
        try{
            sentencia=conexion.createStatement();
            sentencia.executeQuery(sentenciaSql);
            sentencia.executeQuery(sentenciaSql2);
            
        }catch(Exception e){
            System.err.println("ERROR update nominas\n"+ e);
        }
        
        }
    
        
    
    }
    /*
    REPLACE INTO nomina (id_nomina,total,irpf)
    Values (5,1500,12);
    
    HACER INSERTS
    insert into nomina (id_nomina,total,irpf) values(id_nomina,total,irpf)

    insert into mes(id_fecha_nomina,id_nomina,id_empleado,mes,año)
    values(id_fecha_nomina,id_nomina,id_empleado,mes,año)
    ---------------
    select mes.Mes,nom.total,mes.Año from nomina as nom, mes, empleado as emp
where emp.id_empleado=mes.id_empleado
and nom.id_nomina=mes.id_nomina
    */
