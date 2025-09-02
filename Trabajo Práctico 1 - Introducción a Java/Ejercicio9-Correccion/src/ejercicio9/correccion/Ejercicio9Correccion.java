package ejercicio9.correccion;

import java.util.Scanner;

public class Ejercicio9Correccion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        System.out.print("Ingresa tu nombre: "); 
        String nombre = scanner.nextLine(); // ERROR 
        
        System.out.println("Hola, " + nombre); 
    }
    
}

// El error se encuentra en que luego de declarar el String nombre intentamos utilizar
// el metodo scanner.nextInt() que se usa en enteros, pero como es un String debemos usar el metodo nextLine