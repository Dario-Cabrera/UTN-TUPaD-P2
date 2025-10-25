package CASO1.modelo;

public class Producto {
    private String id;
    private String nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoria;

    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }
    
    // Métodos Getters
    public String getId() {
        return id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }
    
    public String getNombre() {
    return nombre;
    }

    public CategoriaProducto getCategoria() {
        return categoria;
    }

    // Método Setters
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    // Método requerido
    public void mostrarInfo() {
        System.out.printf("  [ID: %s] %s - Precio: $%.2f - Stock: %d - Categoria: %s (%s)\n",
                id, nombre, precio, cantidad, categoria.name(), categoria.getDescripcion());
    }

    @Override
    public String toString() {
        return String.format("Producto{ID='%s', Nombre='%s', Precio=%.2f, Cantidad=%d, Categoria=%s}",
                id, nombre, precio, cantidad, categoria.name());
    }
}
