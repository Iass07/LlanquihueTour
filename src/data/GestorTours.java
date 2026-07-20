package data;

import model.Tour;

import java.util.HashMap;
import java.util.Map;

public class GestorTours {

    private HashMap<String, Tour> tours;

    // Constructor
    public GestorTours() {
        tours = new HashMap<>();
    }

    // Agregar un tour
    public void agregarTour(Tour tour) {
        tours.put(tour.getCodigo(), tour);
        System.out.println("Tour agregado correctamente.");
    }

    // Buscar un tour por código
    public Tour buscarTour(String codigo) {
        return tours.get(codigo);
    }

    // Mostrar todos los tours
    public void mostrarTours() {
        if (tours.isEmpty()) {
            System.out.println("No hay tours registrados.");
        } else {
            for (Map.Entry<String, Tour> entry : tours.entrySet()) {
                System.out.println(entry.getValue());
            }
        }
    }

    // Obtener el HashMap
    public HashMap<String, Tour> getTours() {
        return tours;
    }
}
