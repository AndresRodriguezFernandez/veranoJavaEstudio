package Capitulo6.P7;

import java.util.ArrayList;
import java.util.Iterator;


public class Principal {
    static ArrayList<Producto> listaProductos = new ArrayList<>();
    public static void crearProductos(){
        int productosAleatorio = (int)(Math.random()*(8-1+1)+1);
        for (int i = 0; i < productosAleatorio; i++) {
            double precioAleatorio = Math.round(Math.random() * (10 - 1) + 1);
            int cantidadAleatorio = (int)(Math.random()*(8-1)+1);
            Producto producto = new Producto(cantidadAleatorio, precioAleatorio);
            listaProductos.add(producto);
        }
    }

    public static double calcularPrecio(){
        Iterator<Producto> it = listaProductos.iterator();
        double precioVenta = 0;
        int p = 1;
        System.out.println("Producto    Cant     Precio  Precio F");
        while (it.hasNext()){
            Producto prod = it.next();
            System.out.println("Producto " +p+":   "+ prod.getCantidad() + "       " + prod.getPrecio() + "€    " + prod.precioFinal() + "€" );
            precioVenta = precioVenta + prod.precioFinal();
            p++;
        }
        return precioVenta;
    }

    public static void precioFinal(double precioFinal) {
        System.out.println("--------------------------------");
        System.out.println("Precio final:              " + precioFinal+"€");
    }

    public static void main(String[] args) {
        crearProductos();
        precioFinal(calcularPrecio());
    }
}
