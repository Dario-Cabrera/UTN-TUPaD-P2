package CASO3;

import java.util.ArrayList;

public class Main_E3 {
    public static void main(String[] args) {
        // Inicializamos un array de empleados
        ArrayList<Empleado> empleados = new ArrayList<>();

        // Creamos empleados y los agregamos al array (Upcasting implícito)
        empleados.add(new EmpleadoPlanta());
        empleados.add(new EmpleadoPlanta());
        empleados.add(new EmpleadoTemporal());
        empleados.add(new EmpleadoTemporal());

        int i = 0; 
        // Recorremos el array y llamamos al metodo para calcular sueldo
        for (Empleado e : empleados) {
            // Se invoca el método del padre, que internamente usa instanceof
            System.out.println("El empleado " + i + " cobra: " + e.calcularSueldo(e));
            i++; 
        }
    }
}