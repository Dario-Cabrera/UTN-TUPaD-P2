package Ejercicio1.newpackage;

class Pasaporte {
    private int numero;
    private String fechaEmision;
    private Foto foto;
    private Titular titular;

    public Pasaporte(int numero, String fechaEmision, String imagenFoto, String formatoFoto, Titular titular) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto(imagenFoto, formatoFoto);
        this.titular = titular;
        titular.setPasaporte(this);
    }
}