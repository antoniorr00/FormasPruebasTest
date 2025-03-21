package Ej4;

public class Esfera extends Forma{
    private double radio;

    public Esfera(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    @Override
    public double area() {
        double area;
        area = 4 * Math.PI * radio * radio;
        return area;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
