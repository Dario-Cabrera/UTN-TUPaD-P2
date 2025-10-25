package Ejercicio14.newpackage;

public class EditorVideo {
    // Dependencia de Creación: Crea Render dentro del método
    public Render exportar(String formato, Proyecto proyecto) { 
        // Genera la instancia dentro del método
        Render render = new Render(formato, proyecto); 
        System.out.println("Exportando proyecto: " + proyecto.getNombre());
        return render;
    }
}
