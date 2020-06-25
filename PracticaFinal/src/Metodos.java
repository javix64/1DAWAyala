import java.awt.Image;
import java.awt.List;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
/*
Con esta clase "Metodos" lo que hacemos es obtener una web y 
poder analizarla como queramos, sacar texto, sacar encabezados,
sacar parrafos, sacar atributos de las etiquetas...
*/
public class Metodos {
    Document website;
    Connection website2;
    String websi;
    DefaultTableModel tablilla;
    public Metodos(String web) {
         try {
            //esta es la web que utilizamos para "scrapear".
            website=Jsoup.connect("https://"+web).get();
            websi="https://"+web+"/";
        } catch (Exception e) {
             System.err.println("ERROR EN CONSTRUCTOR " + e);
        }
        this.website = website;
    }
    public int palabrasBody(){
        return website.select("body").text().split(" ").length;
    }
    public String ponerPalabrasBody(){
        //con este metodo sacamos todas las palabras del "body"
        String ponerPalabras=website.select("body").text();
        return ponerPalabras;
    }
    public void verJavascript(JLabel javascript){
        //con este metodo obtenemos la cantidad javascripts que utiliza
        //la web
        javascript.setText(website.select("script").size()+"");
}
    public void verEncabezados(JLabel setH1,JLabel setH2,JLabel setH3,JLabel setH4){
        //con este metodo obtenemos obtenemos lo que pone en cada encabezado
        //ademas obtenemos la longitud total de cada encabezado
        int h1= website.select("h1").size();
        int h2= website.select("h2").size();
        int h3= website.select("h3").size();
        int h4= website.select("h4").size();
        setH1.setText(h1+"");
        setH2.setText(h2+"");
        setH3.setText(h3+"");
        setH4.setText(h4+"");
    }
    
    public DefaultTableModel tablaEncabezados(){
        //con este metodo, metemos todas las palabras que obtenemos con el metodo anterior
        //en un modelo para una tabla y los ordena de mayor a menor.
        try{
        tablilla=new DefaultTableModel();
        tablilla.addColumn("Encabezado");
        tablilla.addColumn("Longitud");
        tablilla.addColumn("Contenido");
        ArrayList<String> contenidoCabecera = new ArrayList<String>();
        ArrayList<Integer> sizeCabecera = new ArrayList<Integer>();
        ArrayList<Integer> tipoCabecera = new ArrayList<Integer>();
        Object [] fila= new Object[3];
        
        int h=0;
            for (int i = 1; i <=4; i++) {
                h++;
                for (int j = 0; j < website.select("h"+i).size(); j++) {
                    contenidoCabecera.add(website.select("h"+i).get(j).text());
                    sizeCabecera.add(website.select("h"+i).get(j).text().split(" ").length);
                    tipoCabecera.add(h);
                }
            }

            for (int i = 0; i < contenidoCabecera.size(); i++) {
                fila[0]="h"+tipoCabecera.get(i);
                fila[1]=sizeCabecera.get(i);
                fila[2]=contenidoCabecera.get(i);
                tablilla.addRow(fila);
        }
            
        
        
        }catch(Exception e){
            
        }
        return tablilla;
    }
    
    public void metaDescripcion(JLabel titulo, JLabel metadescripcion, JLabel lenguaje){
        //con este metodo obtenemos la metaDescripcion que usa la web
        try{
            if (website.select("title").text()!=null) {
            titulo.setText(website.select("title").text());
        }else{
            titulo.setText("NO TIENE ETIQUETA TITULO");
        }
        if (website.select("meta[property=og:description]").first()!=null && website.select("meta[property=og:description]").first().attr("content")!=null) {
            metadescripcion.setText(website.select("meta[property=og:description]").first().attr("content"));
        }else{
            metadescripcion.setText("NO TIENE ETIQUETA METADESCRIPCION");
        }
        
        if (website.select("html").first().attr("lang")!=null) {
            lenguaje.setText(website.select("html").first().attr("lang"));
        }else{
           lenguaje.setText("NO TIENE ETIQUETA LENGUAJE");
        }
        }catch(Exception e){
            
        }
        
        
        
        
    }
    public void mediadePalabras(JLabel ponerPalabras){
        //con este metodo obtenemos la media de palabras que usan los parrafos
        try{
            int parrafos=website.select("p").size();
        int sumaTotalDeParrafos=0;
        
        for (int i = 0; i < website.select("p").size(); i++) {
            int sizeP=website.select("p").get(i).text().split(" ").length;
            sumaTotalDeParrafos+=sizeP;
        }
            if (parrafos!=0) {
                int averagePalabras=0;
                averagePalabras=sumaTotalDeParrafos/parrafos;
                ponerPalabras.setText(averagePalabras+"");
            }
        
        
        }catch(Exception e){
            System.err.println("ERROR en mediaPalabras \n"+e);
        }
        
        
        
        
    }
    public void mediadeEncabezados(JLabel h1,JLabel h2,JLabel h3,JLabel h4){
        //con este metodo obtenemos la media de palabras que usan los encabezados
        try{
            
        int[] sumaTotalDeParrafos = new int[5];
        int[] averagePalabras= new int[5];
        int[] parrafos= new int[5];
        
        for (int j = 1; j <= 4; j++) {
            int h=0;
            parrafos[j]=website.select("h"+j).size();            
            for (int i = 0; i < website.select("h"+j).size(); i++) {
                int sizeP=website.select("h"+j).get(i).text().split(" ").length;
                sumaTotalDeParrafos[j]+=sizeP;
            }
            
            averagePalabras[j]=0;
            
            if (parrafos[j]>0) {
                averagePalabras[j]=sumaTotalDeParrafos[j]/parrafos[j];
            }
        }
        h1.setText(averagePalabras[1]+"");
        h2.setText(averagePalabras[2]+"");
        h3.setText(averagePalabras[3]+"");
        h4.setText(averagePalabras[4]+"");
        }catch(Exception e){
            System.err.println("Error en MediaDeEncabezados \n"+e);
        }
    }
    public void verRobotsTxt(JLabel ponerRobots){
        //con este metodo obtenemos el archivo Robots.txt
        //este archivo sirve para que los motores de busqueda puedan ver tu web
        //y saber que paginas puede meter en el buscador o cuales no
        String robots="robots.txt";
        try {
            if (Jsoup.connect(websi+robots).execute().statusCode()==200) {
                String robotsTxt=Jsoup.connect(websi+robots).get().text()+"\n";
                ponerRobots.setText(robotsTxt);
            }else if(Jsoup.connect(websi+robots).execute().statusCode()==404){
                ponerRobots.setText("NO HAY ROBOTS.TXT");
            }
        } catch (Exception e) {
            System.err.println("ERROR AL VER VER ROBOTS "+ e);
        }
        
    }   
    
    public void obtenerImagenes(JScrollPane imagenLabel, JLabel cantidadImagenes, List listaAlt){
        //este metodo es la joya de la corona.
        //con este metodo obtenemos todas las imagenes de la pagina web
        Image image=null;
        JPanel panelImagenes=new JPanel();
        panelImagenes.setBounds(100, 100, 100, 100);
        try {      
            for (Element e : website.select("img")) {
                URL url = new URL(e.attr("src"));
                URLConnection conn = url.openConnection();
                conn.setRequestProperty("User-Agent", "Mozilla/5.0");
                conn.connect();
                InputStream urlStream = conn.getInputStream();
                image = ImageIO.read(urlStream);
                
                JLabel labelsita=new JLabel(new ImageIcon(image));
                labelsita.setBorder(new EmptyBorder(0,20,0,0));
                panelImagenes.add(labelsita);
                listaAlt.add(e.attr("alt"));
            }
            cantidadImagenes.setText(website.select("img").size()+"");
        imagenLabel.setViewportView(panelImagenes);
        }
            catch(IOException ex) {
                System.err.println("Esto ha explotado en IMAGENES "+ex);
            }
    }
    
    public void obtenerVideos() throws IOException{
        //este metodo es igual al de obtenerVideos, pero muestra videos
        try{
            if(website.select("iframe").attr(websi)==""){
        }else{
        JPanel panelImagenes=new JPanel();
        System.out.println(website.select("iframe").attr("src"));
            for(Element video: website.select("iframe")){
                    
                if (java.awt.Desktop.isDesktopSupported()) {
                    java.awt.Desktop desktop = java.awt.Desktop.getDesktop();

                if (desktop.isSupported(java.awt.Desktop.Action.BROWSE)) {
                    try {
                        java.net.URI uri = new java.net.URI(video.attr("src"));
                        desktop.browse(uri);
                    } catch (Exception e) { 
                        System.err.println("error videos");   
                    }
                }
                }   
            }
        }
        }catch(Exception e){
            
        }
        
        
    }
    
}    
