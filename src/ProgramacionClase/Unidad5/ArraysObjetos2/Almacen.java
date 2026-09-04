package ProgramacionClase.Unidad5.ArraysObjetos2;

import java.util.Scanner;

public class Almacen {
    private int capacidad;
    private Producto[] productosAlmacenados;

    public Almacen(int capacidad) {
        this.capacidad = capacidad;
    }

    public Producto[] getProductosAlmacenados() {
        return productosAlmacenados;
    }

    public void setProductosAlmacenados(Producto[] productosAlmacenados) {
        this.productosAlmacenados = productosAlmacenados;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void llenarAlmacen(Scanner sc) {
        productosAlmacenados = new Producto[capacidad];
        for (int i = 0; i < productosAlmacenados.length; i++) {
            System.out.print("Introduce el identificador del producto nuevo: ");
            String iden = sc.nextLine();
            System.out.print("Introduce el precio del producto: ");
            double pv = sc.nextDouble();
            sc.nextLine();
            System.out.println("Introduce una descripción del producto: ");
            String descrip = sc.nextLine();
            System.out.print("Introduce el descuento del producto (0 para ningún descuento): ");
            double desc = sc.nextDouble();
            sc.nextLine();
            if (desc == 0) {
                productosAlmacenados[i] = new Producto(iden, pv, descrip);
            }else {
                productosAlmacenados[i] = new Producto(iden, pv, descrip, desc);
            }
        }
    }

    public Producto buscarProducto(String identif) {
        Producto prod = null;
        for (int i = 0; i < this.productosAlmacenados.length; i++) {
            if (productosAlmacenados[i].getIdentificador().equals(identif)) {
                prod = productosAlmacenados[i];
            }
        }
        return prod;
    }

    public void visualizar(Producto prod) {
        if (prod != null) {
            System.out.println(prod.toString());
        }else {
            System.out.println("Este prodcuto no existe.");
        }
    }
}
