package ProgramacionClase.Unidad5.ArraysObjetos2;

public class Producto {
    private String identificador;
    private double precio;
    private String descripcion;
    private double descuento;

    public Producto(String identificador, double precio, String descripcion, double descuento) {
        this.identificador = identificador;
        this.precio = precio;
        this.descripcion = descripcion;
        this.descuento = descuento;
    }

    public Producto(String identificador, double precio, String descripcion) {
        this.identificador = identificador;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "identificador='" + identificador + '\'' +
                ", precio=" + precio +
                ", descripcion='" + descripcion + '\'' +
                ", descuento=" + descuento +
                 ", precio final: "+(this.precio-this.descuento)+"€";
    }
}
