package model;

import interfaces.Registrable;

public class Proveedor extends Persona implements Registrable {

    private String empresa;
    private String tipoServicio;

    // Constructor vacío
    public Proveedor() {
    }

    // Constructor con parámetros
    public Proveedor(String empresa, String tipoServicio, String nombre,
                     String apellido, Rut rut, Direccion direccion,
                     String telefono, String correo) {

        super(nombre, apellido, rut, direccion, telefono, correo);
        this.empresa = empresa;
        this.tipoServicio = tipoServicio;
    }

    // Getters
    public String getEmpresa() {
        return empresa;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    // Setters
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    // Métodos de la interfaz
    @Override
    public void registrar() {
        System.out.println("Proveedor registrado correctamente.");
    }

    @Override
    public void mostrarDatos() {
        System.out.println(this);
    }

    // toString
    @Override
    public String toString() {
        return "Proveedor{" +
                "empresa='" + empresa + '\'' +
                ", tipoServicio='" + tipoServicio + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", apellido='" + getApellido() + '\'' +
                ", rut=" + getRut() +
                ", direccion=" + getDireccion() +
                ", telefono='" + getTelefono() + '\'' +
                ", correo='" + getCorreo() + '\'' +
                '}';
    }
}
