package data;

import model.Reserva;

import java.util.ArrayList;

public class GestorReservas {

    private ArrayList<Reserva> reservas;

    // Constructor
    public GestorReservas() {
        reservas = new ArrayList<>();
    }

    // Agregar una reserva
    public void agregarReserva(Reserva reserva) {
        reservas.add(reserva);
        System.out.println("Reserva creada correctamente.");
    }

    // Mostrar todas las reservas
    public void mostrarReservas() {
        if (reservas.isEmpty()) {
            System.out.println("No hay reservas registradas.");
        } else {
            for (Reserva reserva : reservas) {
                System.out.println(reserva);
            }
        }
    }

    // Buscar una reserva por ID
    public Reserva buscarReserva(int idReserva) {
        for (Reserva reserva : reservas) {
            if (reserva.getIdReserva() == idReserva) {
                return reserva;
            }
        }
        return null;
    }

    // Eliminar una reserva
    public boolean eliminarReserva(int idReserva) {
        Reserva reserva = buscarReserva(idReserva);

        if (reserva != null) {
            reservas.remove(reserva);
            return true;
        }

        return false;
    }

    // Obtener la lista de reservas
    public ArrayList<Reserva> getReservas() {
        return reservas;
    }
}
