/*
invierteCadena(). Invierte la cadena miembro. 
encriptaCadena(). Encripta la cadena miembro.
desencriptaCadena(). Desencripta la cadena miembro. 
visualizaCadena(). Visualiza la cadena miembro. 
 */
package ejercicio5Cadena;
import java.util.Base64;
/**
 *
 * @author java_
 */
public class Cadena {
    String cadena="";
    //CONSTRUCTOR POR DEFECTO
    public Cadena(){
        this.cadena="";
    }
    // CONSTRUCTOR POR PARAMETROS
    public Cadena(String cadena){
        this.cadena=cadena;
    }
    // METODOS
    public String invierteCadena(){
        String cadenaInvertida="";
        for (int i = cadena.length()-1; i >= 0; i--) {
           cadenaInvertida+= cadena.charAt(i);
        }
        return cadenaInvertida;
    }
    public String encriptaCadena(){
        byte[] encriptarBase64 = Base64.getEncoder().encode(cadena.getBytes());
        System.out.println("encodedBytes " + new String(encriptarBase64));        
        return new String(encriptarBase64);
    }
    public String desencriptarCadena(String cadenaEncriptada){
        byte[] encriptarBase64=cadenaEncriptada.getBytes();
        encriptarBase64 = Base64.getDecoder().decode(encriptarBase64);
        System.out.println("decodedBytes " + new String(encriptarBase64));
        return new String(encriptarBase64);
    }
    public String visualizarCadena(){
        return cadena;
    }

}
