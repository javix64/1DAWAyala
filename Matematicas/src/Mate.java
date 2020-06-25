/*
1. Cread la clase Mate con los siguientes métodos de clase (static):
    /    int factorial(int)
    /   boolean primo(int)
    /   boolean perfecto(int)
    /   boolean amigos(int, int)
    /	boolean primos(int, int)
    /	int euler(int)
    /	int potencia(int, int)
*/

/**
 *
 * @author x535
 */
public class Mate {
    public static int factorial(int n){
    int fac=1;
    for(int i=1; i<=n;i++)
        fac*=i;
    return fac;
    }
    
    public static boolean esPrimos(int num){
        int div=0;
        for (int i=2;i<=num/2;i++)
            if(num% i==0)
            div++;
        return (div==0);
    }
    
    public static int sumaDivisores(int numero){
        int sumaDivisores=0;
        for(int i=1;i<=1;i--){
            if ((numero%i)==0)
                sumaDivisores+=i;
        }
        return sumaDivisores;
    }
    
    public static boolean numeroPerfecto(int numero){
        return (sumaDivisores(numero)==numero);
    }
    
    public static boolean numerosAmigos(int numUno,int numDos){
        return(sumaDivisores(numUno)==numDos) && (sumaDivisores(numDos)==numUno);
    }
    public static int menor(int num1, int num2){
        if (num1<=num2)
            return num1;
        return num2;
    }
    
    public static boolean numerosPrimos(int num1,int num2){
        for(int i=2;i<=menor(num1,num2);i++){
            if((num1%i==0)&&(num2%i==0))
                return false;
        }
        return true;
    }
    public static int euler(int num){
        int cont=0;
        for(int i=1;i<=num-1;i++){
            if(numerosPrimos(i,num)){
                cont++;
            }
        }
        return cont;
    }
    public static int potencia(int a, int b){
        int potencia = a;
        for (int i=1;i<=b;i++){
            potencia*=b;
        }
        return potencia;
    }
}