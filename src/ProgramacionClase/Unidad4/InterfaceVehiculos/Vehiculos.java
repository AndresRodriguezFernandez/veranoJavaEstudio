package ProgramacionClase.Unidad4.InterfaceVehiculos;

public class Vehiculos {
    protected String fabricante;
    protected String modelo;
    protected int anniofabricacion;
    protected long kilometraje;

    public Vehiculos(String fabricante, String modelo, int anniofabricacion, long kilometraje) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.anniofabricacion = anniofabricacion;
        this.kilometraje = kilometraje;
    }

    @Override
    public String toString() {
        return "Vehiculos{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anniofabricacion=" + anniofabricacion +
                ", kilometraje=" + kilometraje +
                '}';
    }
}
