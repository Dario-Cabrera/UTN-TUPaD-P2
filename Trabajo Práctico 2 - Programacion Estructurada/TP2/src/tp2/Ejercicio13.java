package tp2;

public class Ejercicio13 {
    public static void imprimirArray(double[] precios, int index) {
        if (index < precios.length) {
            System.out.println("Precio: $" + precios[index]);
            imprimirArray(precios, index + 1);
        }
    }
    
    public static void main(String[] args) {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        System.out.println("Precios originales: ");
        imprimirArray(precios, 0);
        
        precios[2] = 129.99;
        
        System.out.println("\nPrecios modificados:");
        imprimirArray(precios, 0);
    }
}
