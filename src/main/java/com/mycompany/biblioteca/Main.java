package com.mycompany.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
static ArrayList<Cliente>clientes =new ArrayList<>();
static ArrayList<Libro> libros = new ArrayList<>();
static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Sistema Biblioteca");
    }

    public static void crearCliente() {
        System.out.println("ID: ");
        String id = sc.nextLine();
        
        System.out.println("Nombre: ");
        String nombre = sc.nextLine();
        
        System.out.println("Telefono: ");
        String telefono = sc.nextLine();
        
        System.out.println("Email: ");
        String email = sc.nextLine();
        
        clientes.add(new Cliente(email, id, nombre, telefono));
        
        System.out.println("Cliente creado correctamente.");
    }
    
    public static void listarClientes() {
        if (clientes.isEmpty()){
            System.out.println("No hay clientes registrados");
            return;
        }
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
         }
    }
    public static Cliente buscarCliente(String id) {
        for (Cliente cliente : clientes){
            if(cliente.getId().equals(id)){
                return cliente;
            }
        }
        return null;
    }
    public static void actualizarCliente(){
        System.out.println("Ingrese ID del cliente: ");
        String id = sc.nextLine();
        
        Cliente cliente = buscarCliente(id);
        
        if(cliente != null){
            System.out.println("Nuevo nombre: ");
            cliente.setNombre(sc.nextLine());
            
            System.out.println("Nuevo telefono: ");
            cliente.setTelefono(sc.nextLine());
            
            System.out.println("Nuevo email: ");
            cliente.setEmail(sc.nextLine());
            
            System.out.println("Cliente Actualizado.");
        }else{
            System.out.println("Cliente no encontrado.");
        }
    }
    public static void eliminarCliente(){
        System.out.println("Ingrese ID del cliente a eliminar: ");
        String id = sc.nextLine();
        
        Cliente cliente = buscarCliente(id);
        
        if(cliente != null){
            clientes.remove(cliente);
            System.out.println("Cliente eliminado.");
        }else {
            System.out.println("Cliente no encontrado");
        }
    }
    
    public static void crearLibro() {
    System.out.println("Codigo: ");
    String codigo = sc.nextLine();

    System.out.println("Titulo: ");
    String titulo = sc.nextLine();

    System.out.println("Autor: ");
    String autor = sc.nextLine();

    libros.add(new Libro(autor, codigo, titulo));

    System.out.println("Libro creado correctamente.");
}
    
    public static void listarLibros() {
    if (libros.isEmpty()) {
        System.out.println("No hay libros registrados.");
        return;
    }

    for (Libro libro : libros) {
        System.out.println(libro);
    }
}

public static Libro buscarLibro(String codigo) {
    for (Libro libro : libros) {
        if (libro.getCodigo().equals(codigo)) {
            return libro;
        }
    }

    return null;
}

public static void actualizarLibro() {
    System.out.println("Ingrese el codigo del libro: ");
    String codigo = sc.nextLine();

    Libro libro = buscarLibro(codigo);

    if (libro != null) {

        System.out.println("Nuevo titulo: ");
        libro.setTitulo(sc.nextLine());

        System.out.println("Nuevo autor: ");
        libro.setAutor(sc.nextLine());

        System.out.println("Libro actualizado correctamente.");

    } else {
        System.out.println("Libro no encontrado.");
    }
}
public static void eliminarLibro() {
    System.out.println("Ingrese el codigo del libro a eliminar: ");
    String codigo = sc.nextLine();

    Libro libro = buscarLibro(codigo);

    if (libro != null) {
        libros.remove(libro);
        System.out.println("Libro eliminado correctamente.");
    } else {
        System.out.println("Libro no encontrado.");
    }
}

public static void main(String[] args) {

    int opcion;

    do {
        System.out.println("\n==============================");
        System.out.println("     SISTEMA DE BIBLIOTECA");
        System.out.println("==============================");
        System.out.println("1. Crear cliente");
        System.out.println("2. Listar clientes");
        System.out.println("3. Buscar cliente");
        System.out.println("4. Actualizar cliente");
        System.out.println("5. Eliminar cliente");
        System.out.println("------------------------------");
        System.out.println("6. Crear libro");
        System.out.println("7. Listar libros");
        System.out.println("8. Buscar libro");
        System.out.println("9. Actualizar libro");
        System.out.println("10. Eliminar libro");
        System.out.println("------------------------------");
        System.out.println("0. Salir");
        System.out.println("==============================");
        System.out.print("Seleccione una opcion: ");

        opcion = Integer.parseInt(sc.nextLine());

        switch (opcion) {

            case 1:
                crearCliente();
                break;

            case 2:
                listarClientes();
                break;

            case 3:
                System.out.print("Ingrese el ID del cliente: ");
                String id = sc.nextLine();

                Cliente cliente = buscarCliente(id);

                if (cliente != null) {
                    System.out.println(cliente);
                } else {
                    System.out.println("Cliente no encontrado.");
                }
                break;
                case 4:
                actualizarCliente();
                break;

            case 5:
                eliminarCliente();
                break;

            case 6:
                crearLibro();
                break;

            case 7:
                listarLibros();
                break;

            case 8:
                System.out.print("Ingrese el codigo del libro: ");
                String codigo = sc.nextLine();

                Libro libro = buscarLibro(codigo);

                if (libro != null) {
                    System.out.println(libro);
                } else {
                    System.out.println("Libro no encontrado.");
                }
                break;

            case 9:
                actualizarLibro();
                break;

            case 10:
                eliminarLibro();
                break;

            case 0:
                System.out.println("Saliendo del sistema...");
                break;

            default:
                System.out.println("Opcion no valida.");
        }

    } while (opcion != 0);
}
}