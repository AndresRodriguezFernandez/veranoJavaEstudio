package Capitulo5.P5;

public class Articulo {
    private String nombre;
    private int precio;
    private final int iva = 21;
    private int cuantosQuedan;

    public Articulo(String nombre, int precio, int cuantosQuedan) {
        this.nombre = nombre;
        this.precio = precio;
        this.cuantosQuedan = cuantosQuedan;
    }

    public Articulo(){}

    public int getCuantosQuedan() {
        return cuantosQuedan;
    }

    public void setCuantosQuedan(int cuantosQuedan) {
        this.cuantosQuedan = cuantosQuedan;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double PVP() {
        return precio + ((double) (precio * iva) /100);
    }
    @Override
    public String toString() {
        return  nombre +
                " - Precio:" + precio +
                "€ - IVA:" + iva +
                " - PVP:" + PVP() +
                "€";
    }
}
