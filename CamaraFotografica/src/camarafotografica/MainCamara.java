/*
Programa principal de Camara
 */
package camarafotografica;
import javax.swing.*;
/**
 *
 * @author x535
 */
public class MainCamara {
    public static void main(String[] args) {
        CamaraFotografica cam= new CamaraFotografica();
        int n, car, validas, totales;
        boolean numfotos=false;
        Carrete i;
        do{
         n=Integer.parseInt(JOptionPane.showInputDialog("Selecciona una opcion:"+"\n1.Nuevo carrete"+"\n2.Comprobar si hay carrete"+"\n3.Hacer nueva fotografia"+"\n4.Quitar y revelar carrete"+"\n5.Ver total de fotos realizadas con la camara"+"\n6.Ver el numero de fotos validas y veladas"+"\n7.Ver numero de fotos realizadas con el carrete actual"+"\n8.Ver numero de carretes totales introducidos en esta camara"+"\n9.Salir del programa"));
            switch (n){
            case 1:{
                    if (cam.hayCarrete()==false){
                        do{
                            car=Integer.parseInt(JOptionPane.showInputDialog("Introduce un tamaño para el carrete:"+"\n12 fotos"+"\n24 fotos"+"\n36 fotos"));                         
                        }while(car!=12&&car!=24&&car!=36);
                        i= new Carrete(car);
                        cam.ponerCarrete(i);
                    } else {
                        JOptionPane.showMessageDialog(null, "Ya hay un carrete introducido");                        
                    }
                };break;
            case 2:{
                    if (cam.hayCarrete()==true){
                        JOptionPane.showMessageDialog(null, "Hay un carrete introducido");
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay un carrete introducido, vuelva al meno en introduzca uno.");
                    }
                     };break;
            case 3:{
                    if (cam.sePuedeHacerFoto()==true){
                        cam.nuevaFotografia();
                        JOptionPane.showMessageDialog(null, "Se ha realizado correctamente");
                    }else{
                        if (cam.hayCarrete()==true){
                            JOptionPane.showMessageDialog(null, "El carrete esta lleno, quitalo y pon uno nuevo");
                        } else {
                            JOptionPane.showMessageDialog(null, "No has introducido ningun carrete aun3");                            
                        }
                    }
                     };break;
            case 4:{
                    if (cam.hayCarrete()==true){
                        cam.quitarCarrete();
                        JOptionPane.showMessageDialog(null, "Se ha quitado y revelado el carrete correctamente");
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay carrete, introduce uno");
                    }
                     };break;
            case 5:{
                    JOptionPane.showMessageDialog(null, cam.getFotosHechas()+" fotos realizadas con esta camara");
                     };break;
            case 6:{
                    if (cam.getNumeroCarretes()!=0){
                        validas=cam.getFotosValidas();
                        totales=cam.getFotosTotales();
                        JOptionPane.showMessageDialog(null, validas+" fotos validas y "+(totales-validas)+" fotos veladas");
                    } else {
                        JOptionPane.showMessageDialog(null, "Aun no ha revelado ningun carrete");
                    }
                    };break;
            case 7:{
                  if (cam.getFotosCarrete()!=-1){
                      JOptionPane.showMessageDialog(null, cam.getFotosCarrete()+" fotos realizadas con este carrete");
                  } else {
                      JOptionPane.showMessageDialog(null, "No hay ningun carrete introducido");
                  }
                    };break;
            case 8:{
                    JOptionPane.showMessageDialog(null,cam.getNumeroCarretes()+" carretes usados por esta camara");
                };break;
            }
        }while (n!=9);
                                                                
    }
}