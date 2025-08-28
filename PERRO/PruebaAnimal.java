public class PruebaAnimal {

    public static void main(String[] args) {
        perro perro1 = new perro("Kenay","Meztizo",3.5);
        perro perro2 = new perro("Daysi","Meztizo","arf-arf",5.5);
        // CASO 1
        System.out.println("Nombre del perro:"+ perro1.getNombre());
        System.out.println("Raza:"+ perro1.getRaza());
        System.out.println("Ladrido:");
        perro1.Ladrar();
        System.out.println("Peso:" + perro1.getPeso());
        // CASO 2
        System.out.println("Nombre del perro:"+ perro2.getNombre());
        System.out.println("Raza:"+ perro2.getRaza());
        System.out.println("Ladrido:");
        perro2.Ladrar();
        System.out.println("Peso:" +perro2.getPeso());
    }
}