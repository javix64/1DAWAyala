
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Metodos {
    Document website;
    public Metodos(String web) {
         try {
            //para ahorrar utilizaremos la pagina de la claqueta.
            
            website =Jsoup.connect("https://laclaqueta.net/").get();
            //Document doc = Jsoup.connect("https://"+website.getText()).get();
            //ponerTexto.setText(doc.outerHtml());
        } catch (Exception e) {
             System.err.println("ERROR EN METODOS STRING WEB " + e);
        }
        this.website = website;
    }
    public void verBody(JLabel palabras){
        palabras.setText(website.text().split(" ").length+"");
        //se supone que en la web de la claqueta me tienen que salir 1630 palabras y 16.456 caracteres
//        System.out.println("palabras solo el body -> "+website.select("body").text().split(" ").length);
//        System.out.println("palabras solo el html -> "+website.select("html").text().split(" ").length);
//        System.out.println("---------------------------------------------------------");
        
    }
    public void verJavascript(JLabel javascript){
        javascript.setText(website.select("script").size()+"");
}
    public void verEncabezados(JLabel setH1,JLabel setH2,JLabel setH3,JLabel setH4,JTextArea areaWeb){
            
        int h1= website.select("h1").size();
        int h2= website.select("h2").size();
        int h3= website.select("h3").size();
        int h4= website.select("h4").size();
        setH1.setText(h1+"");
        setH2.setText(h2+"");
        setH3.setText(h3+"");
        setH4.setText(h4+"");
        
        areaWeb.append("///////////////////////////h1/////////////////////////////////"+"\n");
        for (int i = 0; i < website.select("h1").size(); i++) {
            areaWeb.append(website.select("h1").get(i).text()+"\n");
        }
        areaWeb.append("///////////////////////////h2/////////////////////////////////"+"\n");
        for (int i = 0; i < website.select("h2").size(); i++) {
            areaWeb.append(website.select("h2").get(i).text()+"\n");
        }
        areaWeb.append("///////////////////////////h3/////////////////////////////////"+"\n");
        for (int i = 0; i < website.select("h3").size(); i++) {
            areaWeb.append(website.select("h3").get(i).text()+"\n");
        }
        areaWeb.append("///////////////////////////h4/////////////////////////////////"+"\n");
        for (int i = 0; i < website.select("h4").size(); i++) {
            areaWeb.append(website.select("h4").get(i).text()+"\n");
        }
        
    }
    
    public void outputTexto(){
        //guardar la web en un archivo dentro de la carpeta output\ y como se llame la web
            String content = website.outerHtml();
            String path = "output\\"+"laclaqueta"+".txt";
        try {
            //String path = "output\\"+website.getText()+".txt";
            Files.write(Paths.get(path), content.getBytes());
        } catch (IOException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void metaDescripcion(JLabel titulo, JLabel metadescripcion, JLabel lenguaje){
        if (website.select("title").text()!=null) {
            titulo.setText(website.select("title").text());
        }else{
            titulo.setText("NO TIENE ETIQUETA TITULO");
        }
        
        if (website.select("meta[property=og:description]").first().attr("content")!=null) {
            metadescripcion.setText(website.select("meta[property=og:description]").first().attr("content"));
        }else{
            metadescripcion.setText("NO TIENE ETIQUETA METADESCRIPCION");
        }
        
        if (website.select("html").first().attr("lang")!=null) {
            lenguaje.setText(website.select("html").first().attr("lang"));
        }else{
           lenguaje.setText("NO TIENE ETIQUETA LENGUAJE");
        }
        
        
    }
    public void mediadePalabras(){
        
        int parrafos=website.select("p").size();
        System.out.println(parrafos);
        int sumaTotalDeParrafos=0;
        for (int i = 0; i < website.select("p").size(); i++) {
            System.out.println(website.select("p").get(i).text()+"\n");
            int sizeP=website.select("p").get(i).text().split(" ").length;
            
            sumaTotalDeParrafos+=sizeP;
            
        }
        int averagePalabras=0;
        averagePalabras=sumaTotalDeParrafos/parrafos;
        
        System.out.println(averagePalabras);
    }
    public void mediadeEncabezados(){
        int sumaTotalDeParrafos=0;
        
        for (int j = 1; j <= 4; j++) {
            int h=0;
            int parrafos=website.select("h"+j).size();            
            for (int i = 0; i < website.select("h"+j).size(); i++) {
                //System.out.println(website.select("h"+j).get(i).text()+"\n");
                int sizeP=website.select("h"+j).get(i).text().split(" ").length;
                sumaTotalDeParrafos+=sizeP;
        }
            System.out.println("-----MEDIA DE PALABRAS-----");
            System.out.println("------------h"+j+"------------");
        int averagePalabras=0;
        averagePalabras=sumaTotalDeParrafos/parrafos;
            
        System.out.println(averagePalabras);
        }
    }
//    public void verRobotsTxt(){
//        String robots=website.;
//        System.out.println(robots);
//        
//    }
    
    
    
}


