/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca;

/**
 *
 * @author Migue
 */
public class Libro extends Material {
    private String autor;

    public Libro(String autor, String codigo, String titulo) {
        super(codigo, titulo);
        this.autor = autor;
    }
    
    public Libro() {
        super(null, null);
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    @Override
    public String toString(){
        return "Codigo: "+ codigo +
                " | Titulo: "+ titulo +
                " | Autor: "+ autor;
    }
    
}
