package utils;

import model.Tour;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ArchivoUtil {

    // Leer tours desde un archivo TXT
    public static ArrayList<Tour> leerTours(String rutaArchivo) {

        ArrayList<Tour> tours = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {

            String linea;

            while ((linea = br.readLine()) != null) {

                String[] datos = linea.split(";");

                String codigo = datos[0];
                String nombre = datos[1];
                String destino = datos[2];
                double precio = Double.parseDouble(datos[3]);
                int duracion = Integer.parseInt(datos[4]);

                Tour tour = new Tour(codigo, nombre, destino, precio, duracion);

                tours.add(tour);
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        return tours;
    }
}
