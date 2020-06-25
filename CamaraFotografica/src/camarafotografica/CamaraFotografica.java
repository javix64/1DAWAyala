/*
Una CamaraFotográfica cuando se crea no tiene carrete. Se tendrá la función
ponerCarrete(Carrete c) que nos permitirá poner un carrete a la cámara fotográfica. Se
tendrá el método hayCarrete() que nos devolverá verdadero si tenemos un carrete
puesto. Se tendrá el método sePuedeHacerFoto() que devolverá verdadero si la cámara
tiene un carrete y se puede hacer fotos con el carrete. Se podrá lanzar una
nuevaFotografia() siempre que se pueda hacer fotos y que hará una nueva fotografía en
el carrete. En cualquier momento se podrá quitarCarrete() (siempre que haya un carrete
puesto). Al quitar el carrete no se pueden hacer fotografías hasta que se ponga otro
carrete. Cuando se quita el carrete se revelar() y se almacena el número de fotografías
válidas y veladas.
 */
package camarafotografica;
/**
 *
 * @author x535
 */
public class CamaraFotografica {

    /**
     * @param arg the command line arguments
     */
    private int fotoshechas;
    private int fotostotales;
    private int fotosvalidas;
    private int ncarretes;
    private Carrete c;
    private boolean carrete;
    public CamaraFotografica(){
        fotoshechas=0;
        fotosvalidas=0;
        fotostotales=0;
        carrete=false;
        ncarretes=0;
    }
    public boolean ponerCarrete(Carrete i){
        if (carrete==false){
            c=i;
            carrete=true;
            ncarretes++;
            return true;
        } else {
            return false;
        }
    }
    public boolean hayCarrete(){
       return (carrete==true);
    }
    public boolean sePuedeHacerFoto(){
        if ((carrete==true)&&(c.estaLleno()==false)){
            return true;
        } 
        else {
            return false;
        }
    }
    public void nuevaFotografia(){
        if (this.sePuedeHacerFoto()==true){
          c.nueva();
          fotoshechas++;
        }
    }
    public void quitarCarrete(){
        if (this.hayCarrete()==true){
            carrete=false;
            c.revelar();
            fotosvalidas+=c.getFotografiasValidas();
            fotostotales+=c.getFotografiasTotales();
        }
    }
    public int getFotosCarrete(){
        if (carrete==true){
            return c.numeroFotos();
        } else {
            return -1;
        }
    }
    public int getFotosValidas(){
        if (ncarretes!=0){
            return fotosvalidas;
        } else {
            return -1;
        }
    }
    public int getFotosTotales(){
            return fotostotales;
    }
    public int getFotosHechas(){
        return fotoshechas;
    }
    public int getNumeroCarretes(){
        return ncarretes;
    }
 }