package com.mycompany.mavenproject1;

/**
 * Clase principal.
 * Aquí se crean los objetos y se prueba la herencia.
 */
public class Mavenproject1 {

    public static void main(String[] args) {

        // Crear un producto electrónico
        ProductoElectronico laptop = new ProductoElectronico("Laptop Gamer", 18000, 2);

        // Crear un accesorio
        ProductoAccesorio mouse = new ProductoAccesorio("Mouse Gamer", 850, "Negro");

        // Mostrar información del producto electrónico
        laptop.mostrarProducto();
        laptop.encender();

        System.out.println();

        // Mostrar información del accesorio
        mouse.mostrarProducto();
        mouse.usar();
    }
}