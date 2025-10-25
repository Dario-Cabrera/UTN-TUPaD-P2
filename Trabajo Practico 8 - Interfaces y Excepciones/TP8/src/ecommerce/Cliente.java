package ecommerce;

public class Cliente implements Notificable {
    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void notificarCambio(String mensaje) {
        System.out.println("Cliente " + nombre + " notificado: " + mensaje);
    }
}