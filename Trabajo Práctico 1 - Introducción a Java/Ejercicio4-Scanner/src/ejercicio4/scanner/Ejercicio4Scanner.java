package ejercicio4.scanner;

import java.util.Scanner;

public class Ejercicio4Scanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nombre;
        int edad;
        
        System.out.print("Ingrese su nombre: ");
        nombre = input.nextLine();
        
        System.out.print("Ingrese su edad: ");
        edad = Integer.parseInt(input.nextLine());
        
        System.out.println("Su nombre es " + nombre + " y su edad es " + edad);
        
    }
    
}
