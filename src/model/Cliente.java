package model;

import interfaces.Registrable;

public class Cliente extends Persona implements Registrable {

    private int numeroCliente;

    // Constructor vacío
    public Cliente() {
    }

    // Constructor con parámetros
    public Cliente(int numeroCliente, String nombre, String apellido, Rut rut,
                   Direccion direccion, String telefono, String correo) {

        super(nombre, apellido, rut, direccion, telefono, correo);
        this.numeroCliente = numeroCliente;
    }

    // Getter
    public int getNumeroCliente() {
        return numeroCliente;
    }

    // Setter
    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    // Implementación de la interfaz
    @Override
    public void registrar() {
        System.out.println("Cliente registrado correctamente.");
    }

    @Override
    public void mostrarDatos() {
        System.out.println(this);
    }

    // toString
    @Override
    public String toString() {
        return "Cliente{" +
                "numeroCliente=" + numeroCliente +
                ", nombre='" + getNombre() + '\'' +
                ", apellido='" + getApellido() + '\'' +
                ", rut=" + getRut() +
                ", direccion=" + getDireccion() +
                ", telefono='" + getTelefono() + '\'' +
                ", correo='" + getCorreo() + '\'' +
                '}';
    }
}