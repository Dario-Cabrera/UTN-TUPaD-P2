package excepciones; // Crear un nuevo paquete para excepciones

public class EdadInvalidaException extends Exception {
    public EdadInvalidaException(String mensaje) {
        super(mensaje);
    }
}