/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca;

/**
 *
 * @author Migue
 */
public class Cliente extends Persona {
    private String email;

    public Cliente(String email, String id, String nombre, String telefono) {
        super(id, nombre, telefono);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    @Override
    public String toString(){
       return "ID: "+id+
               ", Nombre: "+nombre+
               ", Telefono: "+telefono+
               ", Email: "+email;
    }
}
