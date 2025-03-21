package Ej4;

public class Pintura {
    protected double cobertura;

    public Pintura(double cobertura) {
        this.cobertura = cobertura;
    }

    public double calcularPintura(Forma forma){ //Al metodo se le pasa un objeto Forma
        return forma.area() / this.cobertura;
    }
}
