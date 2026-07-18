package com.mycompany.mavenproject1;

/**
 * Clase hija que hereda de Producto.
 */
public class ProductoElectronico extends Producto {

    // Atributo propio
    private int garantia;

    // Constructor
    public ProductoElectronico(String nombre, double precio, int garantia) {
        super(nombre, precio);
        this.garantia = garantia;
    }

    // Sobrescribe el método de la clase padre
    @Override
    public void mostrarProducto() {
        super.mostrarProducto();
        System.out.println("Garantía: " + garantia + " años");
    }

    // Método exclusivo de esta clase
    public void encender() {
        System.out.println("El producto electrónico está encendido.");
    }
}