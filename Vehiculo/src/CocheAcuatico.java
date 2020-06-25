/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author x535
 */
public class CocheAcuatico extends Coche implements sumergible{
    protected double z;
    protected boolean inmersion;
    protected String medio;
    public CocheAcuatico(double x, double y, boolean estado, int direccion, String modelo, String matricula, String color, double z, boolean inmersion, String medio) {
        super(x, y, estado, direccion, modelo, matricula, color);
        this.z=z;
        this.inmersion=inmersion;
        this.medio=medio;
    }

    public CocheAcuatico(String modelo, String matricula, String color, double z, boolean inmersion, String medio) {
        super(modelo, matricula, color);
        this.z=z;
        this.inmersion=inmersion;
        this.medio=medio;
    }
    
    public CocheAcuatico(String modelo, String matricula, String color){
        super(modelo, matricula, color);
        z=0;
        inmersion=false;
        medio="tierra";
    }
    
    public CocheAcuatico(double coordenadaZ, boolean inmersion, String medio) {
        super();
        this.z=z;
        this.inmersion=inmersion;
        this.medio=medio;
    }

    public CocheAcuatico() {
        this(0, false, "tierra");
    }
    
    public boolean estaInmerso(){
        return inmersion;
    }
    
    public boolean estaEnElAgua(){
        return medio.equals("agua");
    }
    
    @Override
    public void cambioDeMedio(){
        if (z==0){
            if (medio.equals("tierra"))
                medio="agua";
            else
                medio="tierra";
        }
    }
    
    @Override
    public void inmersion(){
        if (estado && medio.equals("agua")){
            inmersion=true;
            z=-1;
        }
    }
    
    @Override
    public void ascender(int n){
        if(medio.equals("agua") && estado && inmersion){
            z+=n;
        }
        if(z>=0){
            z=0;
            inmersion=false;
        }
    }
    
    @Override
    public void descender(int n){
        if(medio.equals("agua") && estado && inmersion)
            z-=n;
    }
    
    @Override
    public void imprimeEstado(){
        String enElAgua, inmerso;
        if (medio.equals("agua")){
            enElAgua=" el agua";
            if (inmersion)
                inmerso=" inmerso";
            else
                inmerso=" flotando";
        }else{
            enElAgua=" tierra";
            inmerso="";
        }
        super.imprimeEstado();
        System.out.println("Esta"+inmerso+" en"+enElAgua+" y está a "+Math.abs(z)+" metros de profundidad");
    }
    
    public double getZ(){
        return z;
    }
    
    public String getMedio(){
        return medio;
    }
}
