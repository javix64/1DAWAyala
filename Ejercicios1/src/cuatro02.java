/*
Para sacar al mercado un determinado producto intervienen 4 personas, una que lo diseña y 3 que lo
fabrican. Diseñad un programa que calcule cuanto cobra cada uno de ellos, sabiendo que el
diseñador cobra el doble que los fabricantes y conocidos el no de unidades vendidas y el precio de
venta de cada unidad. 
diseñador cobra el doble que los fabricantes
nº de unidades vendidas
pvp de unidad
 */

/**
 *
 * @author x535
 */
import javax.swing.*;
public class cuatro02 {
    public static void main(String[] arg){
    double unidadesVendidas=Double.parseDouble(JOptionPane.showInputDialog(null,"Introduce unidades vendidas"));
    double pvp=Double.parseDouble(JOptionPane.showInputDialog(null,"Introduce pvp"));
    double salarioFabricante=unidadesVendidas*pvp/5;
    double salarioDiseñador=unidadesVendidas*pvp*(2/5);
    double precioTotalF=unidadesVendidas*pvp;
    double precioTotalD=2*(unidadesVendidas*pvp);
    JOptionPane.showMessageDialog(null,"El salario del diseñador es: "+salarioDiseñador+" "+precioTotalD+" mientras que el del fabricante es:"+salarioFabricante+" "+precioTotalF);
    }
}
