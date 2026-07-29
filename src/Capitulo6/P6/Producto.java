package Capitulo6.P6;

import java.text.DecimalFormat;

public class Producto {
    private int cantidad;
    private double precio;

    public Producto(int cantidad, double precio) {
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public int getCantidad(){
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public double precioFinal(){
        DecimalFormat df = new DecimalFormat("#,##");
        return Double.parseDouble(df.format(this.precio*this.cantidad));
    }
}
