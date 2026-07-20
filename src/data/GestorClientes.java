package data;

import model.Cliente;

import java.util.ArrayList;

public class GestorClientes {

    private ArrayList<Cliente> clientes;

    // Constructor
    public GestorClientes() {
        clientes = new ArrayList<>();
    }

    // Agregar un cliente
    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
        System.out.println("Cliente agregado correctamente.");
    }

    // Mostrar todos los clientes
    public void mostrarClientes() {
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes registrados.");
        } else {
            for (Cliente cliente : clientes) {
                System.out.println(cliente);
            }
        }
    }

    // Buscar cliente por número
    public Cliente buscarCliente(int numeroCliente) {
        for (Cliente cliente : clientes) {
            if (cliente.getNumeroCliente() == numeroCliente) {
                return cliente;
            }
        }
        return null;
    }

    // Obtener la lista de clientes
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
}
