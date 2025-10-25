package tp3.Ejercicio4;

public class Gallina {
    private int idGallina;
    private int edad;
    private int huevosPuestos;
    
    public Gallina(int id, int ed) {
        idGallina = id;
        edad = ed;
        huevosPuestos = 0;
    }
    
    public void ponerHuevo() {
        huevosPuestos += 1;
        System.out.println("La gallina " + idGallina + " ha puesto un huevo. Total de huevos puestso: " + huevosPuestos);
    }
    
    public void envejecer() {
        edad += 1;
        System.out.println("La gallina " + idGallina + " ha envejecido. Ahora tiene " + edad + " años");
    }
    
    public void mostrarEstado() {
        System.out.println("ID: " + idGallina);
        System.out.println("Edad: " + edad);
        System.out.println("Huevos Puestos: " + huevosPuestos);
    }
}
