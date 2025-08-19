
package ejercicio8.conversiones;

import java.util.Scanner;

public class Ejercicio8Conversiones {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, resultadoDivEntera;
        double resultadoDivFloat;
        
        System.out.print("Ingrese el primero número: ");
        num1 = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese el segundo número: ");
        num2 = Integer.parseInt(input.nextLine());
        
        resultadoDivEntera = num1 / num2;
        resultadoDivFloat = (double) num1 / num2;
        
        System.out.println("Division entera: " + resultadoDivEntera);
        System.out.println("Division float: " + resultadoDivFloat);
    }
    
}
