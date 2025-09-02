package tp4;

public class SistemaGestionEmpleados {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado(1, "Juan Perez", "Gerente de Proyectos", 500000.00);
        Empleado empleado2 = new Empleado("Maria Lopez", "Analista de Datos");
        Empleado empleado3 = new Empleado("Carlos Sanchez", "Desarrollador Java");

        System.out.println("--- Información inicial de los empleados ---");
        System.out.println(empleado1.toString());
        System.out.println(empleado2.toString());
        System.out.println(empleado3.toString());

        System.out.println("\n--- Actualización de salarios ---");
        empleado1.actualizarSalario(10.0); 
        System.out.println("Salario de Juan Perez actualizado (aumento 10%): " + empleado1.toString());

        empleado2.actualizarSalario(25000); 
        System.out.println("Salario de Maria Lopez actualizado (aumento 25000): " + empleado2.toString());

        System.out.println("\n--- Total de Empleados ---");
        System.out.println("Total de empleados creados: " + Empleado.mostrarTotalEmpleados());
    }
}
