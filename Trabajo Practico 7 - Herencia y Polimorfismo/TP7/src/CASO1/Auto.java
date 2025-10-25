package CASO1;

public class Auto extends Vehiculo {
    private int cantidadDePuertas;

    public Auto(int cantidadDePuertas, String marca, String modelo) {
        super(marca, modelo);
        this.cantidadDePuertas = cantidadDePuertas;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Modelo: " + this.modelo + ", marca: " + this.marca + ", cantidad de puertas: " + cantidadDePuertas);
    }
}
