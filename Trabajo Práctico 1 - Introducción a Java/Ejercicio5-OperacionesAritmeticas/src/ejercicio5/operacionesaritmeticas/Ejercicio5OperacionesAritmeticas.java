package ejercicio5.operacionesaritmeticas;

import java.util.Scanner;

public class Ejercicio5OperacionesAritmeticas {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, suma, resta, multiplicacion;
        double division;
        
        System.out.println("Ingresa el primer número: ");
        num1 = Integer.parseInt(input.nextLine());
        System.out.println("Ingresa el segundo número: ");
        num2 = Integer.parseInt(input.nextLine());
        
        suma = num1 + num2;
        resta = num1 - num2;
        division = (double)num1 / num2;
        multiplicacion = num1 * num2;
        
        System.out.println("La suma de " + num1 + " y " + num2 + " = " + suma);
        System.out.println("La resta de " + num1 + " y " + num2 + " = " + resta);
        System.out.println("La division de " + num1 + " y " + num2 + " = " + division);
        System.out.println("La multiplicacion de " + num1 + " y " + num2 + " = " + multiplicacion);
    }
    
}
