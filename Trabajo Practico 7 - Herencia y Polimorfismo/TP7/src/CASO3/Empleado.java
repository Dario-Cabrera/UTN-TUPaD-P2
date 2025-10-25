package CASO3;

public abstract class Empleado {
    
    // El método debe recibir un objeto del tipo GENÉRICO Empleado.
    public double calcularSueldo(Empleado e) { // <-- ¡AQUÍ ESTÁ LA CLAVE!
        
        if (e instanceof EmpleadoPlanta) {
            return 900000.0;
        } else if (e instanceof EmpleadoTemporal) {
            return 850000.0;
        } else {
            return 0.0; // Caso por defecto
        }
    }
}