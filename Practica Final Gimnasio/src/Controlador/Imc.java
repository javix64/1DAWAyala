/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author andres
 */
public class Imc {
    double imc;
    double peso;
    double altura;
    public Imc() {
        imc=0;
        peso=0;
        altura=0;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void calcularImc(Double peso,Double altura,JLabel imc,JLabel recomendar,JLabel ponerPeso){
        Double calculadoraImc;
        calculadoraImc=peso/(altura*altura);
        DecimalFormat df=new DecimalFormat("#.##");
        String imcLabel;
        imcLabel=df.format(calculadoraImc);
        imc.setOpaque(true);
        ponerPeso.setText(peso+" kg");
        if (calculadoraImc<16) {
            recomendar.setText("Ganar masa muscular");
            imc.setBackground(Color.decode("#FD0100"));
            imc.setText(imcLabel+"- Tienes desnutrición severa");
        }else if(calculadoraImc>16.1 && calculadoraImc<18.4){
            recomendar.setText("Ganar masa muscular");
            imc.setBackground(Color.decode("#FE9901"));
            imc.setText(imcLabel+"- desnutricion moderada");
        }else if(calculadoraImc>18.5 && calculadoraImc<22){
            recomendar.setText("Ganar masa muscular");
            imc.setBackground(Color.decode("#FE9901"));
            imc.setText(imcLabel+"- bajo peso");
        }else if(calculadoraImc>22.1 && calculadoraImc<24.9){
            recomendar.setText("Tonificar");
            imc.setBackground(Color.decode("#00B04E"));
            imc.setText(imcLabel+"- peso normal");
        }else if(calculadoraImc>25 && calculadoraImc<29.9){
            recomendar.setText("Tonificar");
            imc.setBackground(Color.decode("#FE9901"));
            imc.setText(imcLabel+"- sobrepeso");
        }else if(calculadoraImc>30 && calculadoraImc<34.9){
            recomendar.setText("Perder peso");
            imc.setBackground(Color.decode("#FE9901"));
            imc.setText(imcLabel+"- obesidad tipo I");
        }else if(calculadoraImc>35 && calculadoraImc<39.9){
            recomendar.setText("Un poco de todo");
            imc.setBackground(Color.decode("#FD0100"));
            imc.setText(imcLabel+"- obesidad tipo II");
        }else if(calculadoraImc>40){
            recomendar.setText("Un poco de todo");
            imc.setBackground(Color.decode("#FD0100"));
            imc.setText(imcLabel+"- obesidad tipo III");
        }
    }
    public void ponerImagen(String tipoImagen, JLabel imagen) throws IOException{
            BufferedImage img = null;
            BufferedImage img2 = null;
            BufferedImage img3 = null;
            BufferedImage img4 = null;
            img = ImageIO.read(new File("imagenes/tonificar.jpg"));
            img2 = ImageIO.read(new File("imagenes/ganar_musculo.jpg"));
            img3 = ImageIO.read(new File("imagenes/perder_peso.jpg"));
            img4 = ImageIO.read(new File("imagenes/un_poco_de_todo.jpg"));
        if(tipoImagen.equals("Tonificar")){
            Image dimg = img.getScaledInstance(imagen.getWidth(), imagen.getHeight(),
            Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(dimg);
            imagen.setIcon(imageIcon);
        }else if(tipoImagen.equals("Ganar musculo")){
            Image dimg = img2.getScaledInstance(imagen.getWidth(), imagen.getHeight(),
            Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(dimg);
            imagen.setIcon(imageIcon);
        }else if(tipoImagen.equals("Perder peso")){
            Image dimg = img3.getScaledInstance(imagen.getWidth(), imagen.getHeight(),
            Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(dimg);
            imagen.setIcon(imageIcon);
            
        }else{
            Image dimg = img4.getScaledInstance(imagen.getWidth(), imagen.getHeight(),
            Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(dimg);
            imagen.setIcon(imageIcon);
        }
    }
    public void calcularPesoIdeal(Double altura,JLabel ponerPesoIdeal){
        Double calcularPesoMin;
        Double calcularPesoMax;
        calcularPesoMin=22*(altura*altura);
        calcularPesoMax=25*(altura*altura);
        DecimalFormat df=new DecimalFormat("#.##");
        String pesoMin;
        String pesoMax;
        pesoMin=df.format(calcularPesoMin);
        pesoMax=df.format(calcularPesoMax);
        
        ponerPesoIdeal.setOpaque(true);
        ponerPesoIdeal.setBackground(Color.white);
        ponerPesoIdeal.setText(pesoMin+"kg - "+pesoMax+"kg");
    }
}
