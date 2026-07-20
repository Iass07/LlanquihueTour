package app;

import data.GestorClientes;
import data.GestorReservas;
import data.GestorTours;
import interfaces.Registrable;
import model.*;
import utils.ArchivoUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        GestorClientes gestorClientes = new GestorClientes();
        GestorTours gestorTours = new GestorTours();
        GestorReservas gestorReservas = new GestorReservas();

        // Lista polimórfica
        List<Registrable> personas = new ArrayList<>();

        // Cargar tours desde archivo TXT
        ArrayList<Tour> listaTours = ArchivoUtil.leerTours("datos/tours.txt");

        for (Tour tour : listaTours) {
            gestorTours.agregarTour(tour);
        }

        int opcion;

        do {

            System.out.println("\n===== LLANQUIHUE TOUR =====");
            System.out.println("1. Registrar cliente");
            System.out.println("2. Mostrar clientes");
            System.out.println("3. Mostrar tours");
            System.out.println("4. Crear reserva");
            System.out.println("5. Mostrar reservas");
            System.out.println("6. Mostrar personas registradas");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();


            switch (opcion) {


                case 1:

                    System.out.print("Número de cliente: ");
                    int numeroCliente = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Apellido: ");
                    String apellido = scanner.nextLine();

                    System.out.print("Número de RUT (sin DV): ");
                    String numeroRut = scanner.nextLine();

                    System.out.print("Dígito Verificador: ");
                    char dv = scanner.nextLine().charAt(0);


                    System.out.print("Calle: ");
                    String calle = scanner.nextLine();

                    System.out.print("Número: ");
                    int numeroDireccion = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Ciudad: ");
                    String ciudad = scanner.nextLine();

                    System.out.print("Región: ");
                    String region = scanner.nextLine();

                    System.out.print("Teléfono: ");
                    String telefono = scanner.nextLine();

                    System.out.print("Correo: ");
                    String correo = scanner.nextLine();


                    try {

                        Rut rut = new Rut(numeroRut, dv);

                        Direccion direccion =
                                new Direccion(calle, numeroDireccion, ciudad, region);


                        Cliente cliente = new Cliente(
                                numeroCliente,
                                nombre,
                                apellido,
                                rut,
                                direccion,
                                telefono,
                                correo
                        );


                        gestorClientes.agregarCliente(cliente);

                        // Polimorfismo
                        personas.add(cliente);


                    } catch (Exception e) {

                        System.out.println(e.getMessage());

                    }


                    break;



                case 2:

                    gestorClientes.mostrarClientes();

                    break;



                case 3:

                    gestorTours.mostrarTours();

                    break;



                case 4:

                    System.out.print("Número de cliente: ");
                    int idCliente = scanner.nextInt();


                    Cliente clienteReserva =
                            gestorClientes.buscarCliente(idCliente);


                    if (clienteReserva == null) {

                        System.out.println("Cliente no encontrado.");
                        break;

                    }


                    scanner.nextLine();


                    System.out.print("Código del tour: ");
                    String codigoTour = scanner.nextLine();


                    Tour tour =
                            gestorTours.buscarTour(codigoTour);


                    if (tour == null) {

                        System.out.println("Tour no encontrado.");
                        break;

                    }


                    System.out.print("ID de reserva: ");
                    int idReserva = scanner.nextInt();

                    scanner.nextLine();


                    System.out.print("Fecha: ");
                    String fecha = scanner.nextLine();


                    System.out.print("Cantidad de personas: ");
                    int cantidad = scanner.nextInt();



                    Reserva reserva = new Reserva(
                            idReserva,
                            clienteReserva,
                            tour,
                            fecha,
                            cantidad
                    );


                    gestorReservas.agregarReserva(reserva);


                    break;



                case 5:

                    gestorReservas.mostrarReservas();

                    break;



                case 6:


                    if (personas.isEmpty()) {

                        System.out.println("No hay personas registradas.");

                    } else {


                        for (Registrable persona : personas) {


                            persona.mostrarDatos();


                            if (persona instanceof Cliente) {

                                System.out.println("Tipo: Cliente");

                            }
                            else if (persona instanceof Guia) {

                                System.out.println("Tipo: Guía");

                            }
                            else if (persona instanceof Proveedor) {

                                System.out.println("Tipo: Proveedor");

                            }


                            System.out.println("----------------------");

                        }

                    }


                    break;



                case 7:

                    System.out.println("Gracias por utilizar Llanquihue Tour.");

                    break;



                default:

                    System.out.println("Opción inválida.");

            }


        } while (opcion != 7);


        scanner.close();

    }
}
