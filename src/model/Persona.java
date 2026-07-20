package model;

public class Persona {

    private String nombre;
    private String apellido;
    private Rut rut;
    private Direccion direccion;
    private String telefono;
    private String correo;

    // Constructor vacío
    public Persona() {
    }

    // Constructor con parámetros
    public Persona(String nombre, String apellido, Rut rut, Direccion direccion, String telefono, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Rut getRut() {
        return rut;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setRut(Rut rut) {
        this.rut = rut;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    // Método toString
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", rut=" + rut +
                ", direccion=" + direccion +
                ", telefono='" + telefono + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }
}