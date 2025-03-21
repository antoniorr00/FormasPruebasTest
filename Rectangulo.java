package Ej4;

public class Rectangulo extends Forma{
    private double ancho;
    private double longitud;

    public Rectangulo(String nombre, double ancho, double longitud) {
        super(nombre);
        this.ancho = ancho;
        this.longitud = longitud;
    }

    @Override
    public double area() {
        double area;
        area = longitud * ancho;
        return area;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
