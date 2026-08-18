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
    
    
}