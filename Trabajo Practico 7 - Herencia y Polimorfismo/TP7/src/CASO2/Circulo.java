package CASO2;

public class Circulo extends Figura {
    private double radio;
    private static final double PI = 3.14; // Usaremos un valor fijo simple

    public Circulo(double radio, String nombre) {
        super(nombre);
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
        double area = PI * radio * radio; // Fórmula: PI * radio^2
        System.out.println("El area del circulo " + nombre + " es: " + area);
    }
}
