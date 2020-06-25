
package ExportCSV;

import java.io.File;
import java.io.FileWriter;
import javax.swing.JTable;
import javax.swing.table.TableModel;

public class ExportCSV {
    public void toCsv(JTable tabla, File archivo){
        //con este metodo guardamos la web en un archivo dentro de la carpeta output\ 
        //y como se llame la web
        try{
        TableModel model=tabla.getModel();
        FileWriter csv = new FileWriter(archivo);
        
        for(int i = 0; i < model.getColumnCount(); i++){
            csv.write(model.getColumnName(i) + ";");
        }
        
        csv.write("\n");
        
        for(int i=0; i< model.getRowCount(); i++) {
            for(int j=0; j < model.getColumnCount(); j++) {
                csv.write(model.getValueAt(i,j).toString()+";");
            }
            csv.write("\n");
        }
        
        csv.close();
        
        }catch(Exception e){
            System.err.println("Error toCsv \n"+e);
        }
    }
}
