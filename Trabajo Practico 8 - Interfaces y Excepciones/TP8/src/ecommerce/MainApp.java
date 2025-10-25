package ecommerce;

import excepciones.EdadInvalidaException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MainApp {

    public static void main(String[] args) {
        System.out.println("=== PRUEBAS DE E-COMMERCE (INTERFACES) ===");
        probarEcommerce();
        System.out.println("\n=== PRUEBAS DE EXCEPCIONES ===");
        
        // Ejercicio 1: División Segura
        ejercicioDivisionSegura(10, 2);
        ejercicioDivisionSegura(10, 0); 
        
        // Ejercicio 2: Conversión de Cadena
        ejercicioConversionCadena("123");
        ejercicioConversionCadena("Hola");
        
        // Ejercicio 3 y 5: Lectura de Archivo
        // Nota: Asegurar que "archivo_prueba.txt" exista para la prueba de T-W-R.
        ejercicioLecturaArchivoConFinally("archivo_inexistente.txt");
        ejercicioTryWithResources("archivo_prueba.txt"); 
        
        // Ejercicio 4: Excepción Personalizada
        ejercicioExcepcionPersonalizada(25);
        ejercicioExcepcionPersonalizada(150);
    }

    private static void probarEcommerce() {
        Cliente cliente = new Cliente("Marta Gómez");
        Pedido pedido = new Pedido(cliente);
        
        pedido.agregarProducto(new Producto("Libro POO", 500.0));
        pedido.agregarProducto(new Producto("Licencia Java", 750.0));
        
        double totalOriginal = pedido.calcularTotal();
        System.out.println("Total a Pagar (Pagable): $" + totalOriginal);
        
        // Pago con Descuento
        TarjetaCredito tarjeta = new TarjetaCredito();
        double totalDescontado = tarjeta.aplicarDescuento(totalOriginal);
        tarjeta.procesarPago(totalDescontado);
        
        // Notificable
        pedido.cambiarEstado("Preparando Envío");
    }

    // 1. División segura (Manejo de ArithmeticException)
    private static void ejercicioDivisionSegura(double a, double b) {
        try {
            if (b == 0) {
                throw new ArithmeticException("El divisor no puede ser cero.");
            }
            double resultado = a / b;
            System.out.println(a + " / " + b + " = " + resultado);
        } catch (ArithmeticException e) {
            System.err.println("Error (División Segura): " + e.getMessage());
        }
    }

    // 2. Conversión de cadena a número (Manejo de NumberFormatException)
    private static void ejercicioConversionCadena(String texto) {
        try {
            int numero = Integer.parseInt(texto);
            System.out.println("Cadena '" + texto + "' convertida a int: " + numero);
        } catch (NumberFormatException e) {
            System.err.println("Error (Conversión de Cadena): '" + texto + "' no es un número entero válido.");
        }
    }

    // 3. Lectura de archivo (Manejo de FileNotFoundException y uso de finally)
    private static void ejercicioLecturaArchivoConFinally(String nombreArchivo) {
        System.out.println("\n--- Prueba de Lectura de Archivo con finally ---");
        FileReader fr = null;
        try {
            fr = new FileReader(nombreArchivo);
            // Simulación de lectura...
            System.out.println("Archivo " + nombreArchivo + " encontrado y abierto."); 
        } catch (java.io.FileNotFoundException e) {
            System.err.println("Error (Lectura de Archivo): El archivo '" + nombreArchivo + "' no existe.");
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                    System.out.println("Recurso FileReader cerrado en finally.");
                } catch (IOException e) {
                    System.err.println("Error al cerrar recurso: " + e.getMessage());
                }
            }
        }
    }
    
    // 4. Excepción personalizada (Creación y lanzamiento de EdadInvalidaException)
    private static void ejercicioExcepcionPersonalizada(int edad) {
        try {
            validarEdad(edad);
            System.out.println("Edad " + edad + " válida.");
        } catch (EdadInvalidaException e) {
            System.err.println("Error (Excepción Personalizada): " + e.getMessage());
        }
    }

    private static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("La edad (" + edad + ") debe estar entre 0 y 120.");
        }
    }
    
    // 5. Uso de try-with-resources (Manejo de IOException)
    private static void ejercicioTryWithResources(String nombreArchivo) {
        System.out.println("\n--- Prueba de try-with-resources ---");
        // Asegura que BufferedReader se cierre automáticamente
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea = br.readLine();
            System.out.println("Contenido del archivo (T-W-R): " + linea);
        } catch (IOException e) {
            System.err.println("Error (T-W-R): Fallo de I/O (ej. archivo no existe): " + e.getMessage());
        }
    }
}