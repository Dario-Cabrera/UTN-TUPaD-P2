package Ejercicio13.newpackage;

public class GeneradorQR {
    // Dependencia de Creación: Crea CodigoQR dentro del método
    public CodigoQR generar(String valor, Usuario usuario) { 
        // Genera la instancia dentro del método
        CodigoQR qr = new CodigoQR(valor, usuario); 
        System.out.println("QR generado para: " + usuario.getNombre());
        return qr;
    }
}
