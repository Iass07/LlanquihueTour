package model;

public class Tour {

    private String codigo;
    private String nombre;
    private String destino;
    private double precio;
    private int duracion; // Duración en horas

    // Constructor vacío
    public Tour() {
    }

    // Constructor con parámetros
    public Tour(String codigo, String nombre, String destino, double precio, int duracion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.destino = destino;
        this.precio = precio;
        this.duracion = duracion;
    }

    // Getters
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDestino() {
        return destino;
    }

    public double getPrecio() {
        return precio;
    }

    public int getDuracion() {
        return duracion;
    }

    // Setters
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    // toString
    @Override
    public String toString() {
        return "Tour{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", destino='" + destino + '\'' +
                ", precio=" + precio +
                ", duracion=" + duracion + " horas" +
                '}';
    }
}
