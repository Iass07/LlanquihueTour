package model;

public class Reserva {

    private int idReserva;
    private Cliente cliente;
    private Tour tour;
    private String fecha;
    private int cantidadPersonas;

    // Constructor vacío
    public Reserva() {
    }

    // Constructor con parámetros
    public Reserva(int idReserva, Cliente cliente, Tour tour, String fecha, int cantidadPersonas) {
        this.idReserva = idReserva;
        this.cliente = cliente;
        this.tour = tour;
        this.fecha = fecha;
        this.cantidadPersonas = cantidadPersonas;
    }

    // Getters
    public int getIdReserva() {
        return idReserva;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Tour getTour() {
        return tour;
    }

    public String getFecha() {
        return fecha;
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    // Setters
    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setTour(Tour tour) {
        this.tour = tour;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    // toString
    @Override
    public String toString() {
        return "Reserva{" +
                "idReserva=" + idReserva +
                ", cliente=" + cliente.getNombre() + " " + cliente.getApellido() +
                ", tour=" + tour.getNombre() +
                ", fecha='" + fecha + '\'' +
                ", cantidadPersonas=" + cantidadPersonas +
                '}';
    }
}