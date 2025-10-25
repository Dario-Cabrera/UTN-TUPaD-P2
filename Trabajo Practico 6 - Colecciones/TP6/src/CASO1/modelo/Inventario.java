package CASO1.modelo;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    // Métodos CRUD y Búsqueda
    
    public void agregarProducto(Producto p) {
        productos.add(p);
        System.out.println("Producto '" + p.getNombre() + "' agregado al inventario.");
    }

    public Producto buscarProductoPorId(String id) {
        for (Producto p : productos) {
            if (p.getId().equalsIgnoreCase(id)) {
                return p;
            }
        }
        return null;
    }

    public void listarProductos() {
        System.out.println("\n--- LISTADO COMPLETO DE PRODUCTOS ---");
        if (productos.isEmpty()) {
            System.out.println("El inventario está vacío.");
            return;
        }
        for (Producto p : productos) {
            p.mostrarInfo();
        }
    }
    
    public boolean eliminarProducto(String id) {
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            productos.remove(p);
            System.out.println("Producto con ID '" + id + "' eliminado.");
            return true;
        }
        System.out.println("Error: Producto con ID '" + id + "' no encontrado para eliminar.");
        return false;
    }

    public boolean actualizarStock(String id, int nuevaCantidad) {
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            p.setCantidad(nuevaCantidad);
            System.out.println("Stock actualizado para el producto '" + p.getNombre() + "'. Nuevo stock: " + nuevaCantidad);
            return true;
        }
        System.out.println("Error: Producto con ID '" + id + "' no encontrado para actualizar stock.");
        return false;
    }

    // Métodos de Reporte y Filtrado
    
    public void filtrarPorCategoria(CategoriaProducto categoria) {
        System.out.println("\n--- PRODUCTOS EN LA CATEGORIA: " + categoria.name() + " ---");
        boolean encontrado = false;
        for (Producto p : productos) {
            if (p.getCategoria() == categoria) {
                p.mostrarInfo();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No hay productos en la categoria " + categoria.name() + ".");
        }
    }

    public int obtenerTotalStock() {
        int total = 0;
        for (Producto p : productos) {
            total += p.getCantidad();
        }
        return total;
    }

    public Producto obtenerProductoConMayorStock() {
        if (productos.isEmpty()) {
            return null;
        }
        Producto mayorStock = productos.get(0);
        for (Producto p : productos) {
            if (p.getCantidad() > mayorStock.getCantidad()) {
                mayorStock = p;
            }
        }
        return mayorStock;
    }

    public void filtrarProductosPorPrecio(double min, double max) {
        System.out.printf("\n--- PRODUCTOS CON PRECIOS ENTRE $%.2f y $%.2f ---\n", min, max);
        boolean encontrado = false;
        for (Producto p : productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max) {
                p.mostrarInfo();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron productos en ese rango de precios.");
        }
    }
    
    public void mostrarCategoriasDisponibles() {
        System.out.println("\n--- CATEGORIAS DISPONIBLES ---");
        for (CategoriaProducto categoria : CategoriaProducto.values()) {
            System.out.println("- " + categoria.name() + ": " + categoria.getDescripcion());
        }
    }
}
