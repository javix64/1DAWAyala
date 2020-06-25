

public class Bombo {
    protected boolean bombo[];//=new boolean[50]; esto lo hacen algunos programadores, pero lo correcto es ponerlo en el constructor por defecto
    int total;//esto no es necsario
    public Bombo(int n){
        bombo=new boolean [n+1];
        total=n;//esto tampoco
        
        for(int i=1;i<=n;i++){
            bombo[i]=true;
        }
    }
    public int sacaBola(){
        int bola;
        do{
            bola=(int)(Math.random()*bombo.length);
        } while (bombo[bola]==false);

        total--;
        bombo[bola]=false;
        return bola;
    }
    
    public void meteBola(int bola){
        if(bola>=0 && bola <bombo.length && bombo[bola]==false){
        bombo[bola]=true;
        total++;
    }
            
    }
    public boolean quedanBolas(){
        return(total>0);
    }
}
