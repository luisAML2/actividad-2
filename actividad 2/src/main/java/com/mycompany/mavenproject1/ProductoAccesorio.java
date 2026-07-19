package com.mycompany.mavenproject1;

/**
 * Clase hija que hereda de Producto.
 */
public class ProductoAccesorio extends Producto {

    // Atributo propio
    private String color;

    // Constructor
    public ProductoAccesorio(String nombre, double precio, String color) {
        super(nombre, precio);
        this.color = color;
    }

    // Sobrescribe el método de la clase padre
    @Override
    public void mostrarProducto() {
        super.mostrarProducto();
        System.out.println("Color: " + color);
    }

    // Método exclusivo
    public void usar() {
        System.out.println("El accesorio está listo para usarse.");
    }
}