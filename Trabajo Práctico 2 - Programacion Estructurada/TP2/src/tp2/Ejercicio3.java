package tp2;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese su edad: ");
        int edad = input.nextInt();
        
        if (edad < 12) {
            System.out.println("Eres un niño");
        } else if (edad >= 12 && edad <= 17) {
            System.out.println("Eres un adolescente");
        } else if (edad >= 18 && edad <= 59) {
            System.out.println("Eres un adulto");
        } else {
            System.out.println("Eres un adulto mayor");
        }
        
        input.close();
    }
}
