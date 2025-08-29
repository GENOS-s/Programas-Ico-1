public class TestFigura {
    public static void main(String[] args) {
        Figura cuadrado = new Cuadrado(5);
        Figura circulo = new Circulo(3);
        Figura triangulo = new Triangulo(4, 5, 6, 3);

        Figura[] figuras = {cuadrado, circulo, triangulo};

        for (Figura figura : figuras) {
            System.out.println("Área: " + figura.calcularArea());
            System.out.println("Perímetro: " + figura.calcularPerimetro());
            System.out.println("----------------------");
        }
    }
}
