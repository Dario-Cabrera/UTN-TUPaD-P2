package CASO1.principal;

import CASO1.modelo.CategoriaProducto;
import CASO1.modelo.Inventario;
import CASO1.modelo.Producto;

public class Principal {
    public static void main(String[] args) {
        
        Inventario tienda = new Inventario();

        // 1. Crear al menos cinco productos y agregarlos al inventario.
        System.out.println("--- INICIO DE CARGA ---");
        tienda.agregarProducto(new Producto("A101", "Smartphone X", 2500.00, 15, CategoriaProducto.ELECTRONICA));
        tienda.agregarProducto(new Producto("A102", "Camiseta Algodon", 850.50, 40, CategoriaProducto.ROPA));
        tienda.agregarProducto(new Producto("A103", "Arroz Integral 1kg", 350.00, 100, CategoriaProducto.ALIMENTOS));
        tienda.agregarProducto(new Producto("A104", "Licuadora Pro", 4500.00, 8, CategoriaProducto.HOGAR));
        tienda.agregarProducto(new Producto("A105", "Zapatillas Running", 1800.75, 25, CategoriaProducto.ROPA));
        tienda.agregarProducto(new Producto("A106", "Tablet Y", 1200.00, 12, CategoriaProducto.ELECTRONICA));

        // 2. Listar todos los productos.
        tienda.listarProductos();

        // 3. Buscar un producto por ID y mostrar su información.
        System.out.println("\n--- Busqueda por ID (A104) ---");
        Producto buscado = tienda.buscarProductoPorId("A104");
        if (buscado != null) {
            System.out.print("Producto encontrado: ");
            buscado.mostrarInfo();
        } else {
            System.out.println("Producto no encontrado.");
        }

        // 4. Filtrar y mostrar productos que pertenezcan a una categoría específica (ROPA).
        tienda.filtrarPorCategoria(CategoriaProducto.ROPA);

        // 5. Eliminar un producto por su ID (A102) y listar los productos restantes.
        System.out.println("\n--- Eliminacion de producto (A102) ---");
        tienda.eliminarProducto("A102");
        tienda.listarProductos();

        // 6. Actualizar el stock de un producto existente (A101).
        System.out.println("\n--- Actualizacion de Stock (A101) ---");
        tienda.actualizarStock("A101", 30);

        // 7. Mostrar el total de stock disponible.
        System.out.println("\n--- Stock Total ---");
        int stockTotal = tienda.obtenerTotalStock();
        System.out.println("Stock total en el inventario: " + stockTotal);

        // 8. Obtener y mostrar el producto con mayor stock.
        System.out.println("\n--- Producto con Mayor Stock ---");
        Producto mayorStock = tienda.obtenerProductoConMayorStock();
        if (mayorStock != null) {
            System.out.print("Producto con mayor stock: ");
            mayorStock.mostrarInfo();
        }

        // 9. Filtrar productos con precios entre $1000 y $3000.
        tienda.filtrarProductosPorPrecio(1000.00, 3000.00);

        // 10. Mostrar las categorías disponibles con sus descripciones.
        tienda.mostrarCategoriasDisponibles();
    }
}