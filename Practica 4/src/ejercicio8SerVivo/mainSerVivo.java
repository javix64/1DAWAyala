package ejercicio8SerVivo;

public class mainSerVivo {
    public static void main(String[] args) {
        String[] letrasVegetal= {"Las lechugas son muy saludables","Son sabrosas"};
        Vegetales vegetalis= new Vegetales("Lechuga", "Lechugilis",2,letrasVegetal);
        System.out.println(vegetalis.describete());
        
        String[] letrasTomates= {"Los tomates son muy buenos","Un poco de ajo, aceite y vinagre."};
        Vegetales tomatis= new Vegetales("Tomates","Tomatus",2,letrasTomates);
        System.out.println(tomatis.describete());
        
        Animales lobo = new Animales("Lobo","Canis Lupus",4);
        System.out.println(lobo.describete());
        
        Aves gallina=new Aves("gallina", "Gallus gallus domesticus", 2);
        System.out.println(gallina.describete());
        
        Reptiles salamanca=new Reptiles("gecko salamanca", "Homonota fasciata", 4);
        System.out.println(salamanca.describete());
        
        Mamiferos ballena= new Mamiferos("Ballena", "Balaenidae");
        
        
}
}
