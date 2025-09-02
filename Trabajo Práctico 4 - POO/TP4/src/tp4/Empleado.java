package tp4;

public class Empleado {

    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;

    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }

    public Empleado(String nombre, String puesto) {
        this(totalEmpleados + 1, nombre, puesto, 150000.00); 
    }
    
    public void actualizarSalario(double porcentajeAumento) {
        this.salario += this.salario * (porcentajeAumento / 100.0);
    }

    public void actualizarSalario(int cantidadFija) {
        this.salario += cantidadFija;
    }

    @Override
    public String toString() {
        return "Empleado{" +
               "id=" + id +
               ", nombre='" + nombre + '\'' +
               ", puesto='" + puesto + '\'' +
               ", salario=" + salario +
               '}';
    }

    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }
}