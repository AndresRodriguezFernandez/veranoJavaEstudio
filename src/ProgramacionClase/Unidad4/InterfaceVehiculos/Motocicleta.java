package ProgramacionClase.Unidad4.InterfaceVehiculos;

public class Motocicleta extends Vehiculos{
    private String uso;

    public Motocicleta(String fabricante, String modelo, int anniofabricacion, long kilometraje, String uso) {
        super(fabricante, modelo, anniofabricacion, kilometraje);
        this.uso = uso;
    }

    @Override
    public String toString() {
        return super.toString() + "Uso: " + this.uso;
    }
}
