package Ej4;

public class Cilindro extends Forma{
    private double radio;
    private double altura;

    public Cilindro(String nombre, double radio, double altura) {
        super(nombre);
        this.radio = radio;
        this.altura = altura;
    }

    @Override
    public double area() {
        double area;
        area = Math.PI * radio * radio * altura;
        return area;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
