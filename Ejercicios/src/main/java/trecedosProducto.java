

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author x535
 */
import javax.swing.*;
public class trecedosProducto {
        public static void main(String arg[]){
        float unidadesVendidas=Float.valueOf(JOptionPane.showInputDialog("Introduce Unidades vendidas"));
        float precioVenta=Float.valueOf(JOptionPane.showInputDialog("Introduce el precio de venta"));
        
        float salarioFabricante=unidadesVendidas*precioVenta/5;
        float salarioDiseñador=unidadesVendidas*precioVenta*2/5;
        //JOptionPane.showMessageDialog(null,"El diseñador gana " + (2*(unidadesVendidas*precioUnitario)/5));
        //JOptionPane.showMessageDialog(null,"Cada fabricante gana " + (unidadesVendidas*precioUnitario)/5);
        
        double precioTotalF=(unidadesVendidas*precioVenta);
        double precioTotalD=(2*(unidadesVendidas*precioVenta));
        JOptionPane.showMessageDialog(null,"EL diseñador cobra:"+precioTotalD+" Los fabricantes cobran:"+precioTotalF);

        }
}