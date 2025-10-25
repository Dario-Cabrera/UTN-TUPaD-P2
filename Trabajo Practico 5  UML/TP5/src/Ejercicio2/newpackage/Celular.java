package Ejercicio2.newpackage;

public class Celular {
    private String imei;
    private String marca;
    private String modelo;

    // Atributo para la Agregación (Batería)
    private Bateria bateria; 
    
    // Atributo para la Asociación Bidireccional (Usuario)
    private Usuario usuario; 

    public Celular(String imei, String marca, String modelo, Bateria bateria, Usuario usuario) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        
        // IMPLEMENTACIÓN DE LA AGREGACIÓN: Recibe un objeto ya existente
        this.bateria = bateria; 
        
        // IMPLEMENTACIÓN DE LA ASOCIACIÓN BIDIRECCIONAL: Cierra el lazo
        this.usuario = usuario;
        usuario.setCelular(this); // Llama al setter en Usuario
    }
}