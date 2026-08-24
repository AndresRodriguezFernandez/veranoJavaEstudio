package ProgramacionClase.Unidad4.InterfaceVehiculos;

public class Camion extends Vehiculos implements MedidasSeguridad{
    private int remolques;
    private int nPasajeros;

    public Camion(String fabricante, String modelo, int anniofabricacion, long kilometraje, int remolques, int nPasajeros) {
        super(fabricante, modelo, anniofabricacion, kilometraje);
        this.remolques = remolques;
        this.nPasajeros = nPasajeros;
    }

    @Override
    public boolean coumplien_medidas() {
        boolean cumple = true;
        if (this.nPasajeros > 3){
            cumple=false;
        }
        return cumple;
    }

    @Override
    public String toString() {
        return super.toString() + "remolques: "+this.remolques + " Numero pasajeros: " + this.nPasajeros;
    }
}
