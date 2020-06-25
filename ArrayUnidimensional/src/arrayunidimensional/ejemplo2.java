/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayunidimensional;

import javax.swing.*;
/**
 *
 * @author x535
 */
public class ejemplo2 {
        public static void main(String[] args) {
    int v[] = new int [10];
    introValores(v);
    visualiza(v);
    ordena(v);
    int ult
    
    }       
    public static void introValores(int vector[]){
        for (int i=0;i<vector.length;i++)
        vector[i]= Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce elemento "+ i+" :"));    
    }
    public static void visualiza(int vector[]){
        
        for (int i=0;i<vector.length;i++)
        System.out.println(vector[i]+ " ");
    }
    public static void mayorultimaposicion(int ult, int aux, int vector[]){
    for(int i=0; i<=ult-1;){
            if (vector[i]>vector[i+1]){
                aux=vector[i+1];
                
            }
}
    public static void ordena(int vector[]){
        
                
            }
        
    }
