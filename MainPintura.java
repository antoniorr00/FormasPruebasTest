package Ej4;

public class MainPintura{
    public static void main(String[] args) {
        Pintura pintura = new Pintura(250);
        Forma rectangulo = new Rectangulo("Rectangulo", 35, 20);
        Forma esfera = new Esfera("Esfera", 15);
        Forma cilindro = new Cilindro("Cilindro", 10, 30);

        System.out.println("Pintura necesaria para el rectángulo: " + pintura.calcularPintura(rectangulo));
        System.out.println("Pintura necesaria para la esfera: " + pintura.calcularPintura(esfera));
        System.out.println("Pintura necesaria para el cilindro: " + pintura.calcularPintura(cilindro));
    }
}
