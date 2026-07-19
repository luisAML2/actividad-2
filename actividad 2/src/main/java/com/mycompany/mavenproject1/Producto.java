package com.mycompany.mavenproject1;

/**
 * Clase padre Producto.
 * Contiene los atributos y métodos que heredarán las demás clases.
 */
public class Producto {

    // Atributos protegidos para que las clases hijas puedan utilizarlos
    protected String nombre;
    protected double precio;

    // Constructor
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Método para mostrar la información del producto
    public void mostrarProducto() {
        System.out.println("Producto: " + nombre);
        System.out.println("Precio: $" + precio);
    }
}