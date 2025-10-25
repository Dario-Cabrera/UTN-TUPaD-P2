package ecommerce;

import java.util.ArrayList;
import java.util.List;

public class Pedido implements Pagable {
    private List<Producto> productos;
    private Cliente cliente;
    private String estado;

    public Pedido(Cliente cliente) {
        this.productos = new ArrayList<>();
        this.cliente = cliente;
        this.estado = "Creado";
    }

    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.calcularTotal();
        }
        return total;
    }

    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        this.cliente.notificarCambio("El estado del pedido ha cambiado a: " + nuevoEstado);
    }
}