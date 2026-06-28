package com.mycompany.mavenproject1;

// Clase Producto
class Producto {

    // Atributos
    String nombre;
    double precio;

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

// Clase principal
public class Mavenproject1 {

    public static void main(String[] args) {

        // Crear objetos
        Producto producto1 = new Producto("Laptop Gamer", 18000);
        Producto producto2 = new Producto("Mouse Gamer", 850);

        // Mostrar la información del primer producto
        producto1.mostrarProducto();

        // Línea en blanco para separar los productos
        System.out.println();

        // Mostrar la información del segundo producto
        producto2.mostrarProducto();
    }
}