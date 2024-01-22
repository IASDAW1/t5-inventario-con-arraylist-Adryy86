package com.primerproyecto.inventario;


import java.util.ArrayList;
import java.util.Scanner;

class Producto {
    String nombre;
    double precio;
    int cantidadEnStock;

    public Producto(String nombre, double precio, int cantidadEnStock) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadEnStock = cantidadEnStock;
    }
}

public class Inventario {
    public static void main(String[] args) {
        ArrayList<Producto> inventario = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Agregar producto");
            System.out.println("2. Actualizar inventario");
            System.out.println("3. Buscar producto");
            System.out.println("4. Mostrar inventario");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del producto: ");
                    String nombre = scanner.next();
                    System.out.print("Ingrese el precio del producto: ");
                    double precio = scanner.nextDouble();
                    System.out.print("Ingrese la cantidad en stock: ");
                    int cantidad = scanner.nextInt();
                    Producto nuevoProducto = new Producto(nombre, precio, cantidad);
                    inventario.add(nuevoProducto);
                    break;
                case 2:
                    // Implementar lógica para actualizar inventario
                    break;
                case 3:
                    // Implementar lógica para buscar producto
                    break;
                case 4:
                    System.out.println("Inventario actualizado:");
                    for (Producto producto : inventario) {
                        System.out.println("Nombre: " + producto.nombre + " Precio: " + producto.precio + " Cantidad en stock: " + producto.cantidadEnStock);
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida");
            }
        }
    }
}
