package model;

import interfaces.Registrable;

public class Guia extends Persona implements Registrable {

    private String especialidad;

    // Constructor vacío
    public Guia() {
    }

    // Constructor con parámetros
    public Guia(String especialidad, String nombre, String apellido, Rut rut,
                Direccion direccion, String telefono, String correo) {

        super(nombre, apellido, rut, direccion, telefono, correo);
        this.especialidad = especialidad;
    }

    // Getter
    public String getEspecialidad() {
        return especialidad;
    }

    // Setter
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    // Métodos de la interfaz
    @Override
    public void registrar() {
        System.out.println("Guía registrado correctamente.");
    }

    @Override
    public void mostrarDatos() {
        System.out.println(this);
    }

    // toString
    @Override
    public String toString() {
        return "Guia{" +
                "especialidad='" + especialidad + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", apellido='" + getApellido() + '\'' +
                ", rut=" + getRut() +
                ", direccion=" + getDireccion() +
                ", telefono='" + getTelefono() + '\'' +
                ", correo='" + getCorreo() + '\'' +
                '}';
    }
}
