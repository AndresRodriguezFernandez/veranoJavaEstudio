package ProgramacionClase.Unidad4.InterfaceVehiculos;

public class Automovil extends Vehiculos implements MedidasSeguridad{
    private String estilo;
    private int nPasajeros;

    public Automovil(String fabricante, String modelo, int anniofabricacion, long kilometraje, String estilo, int nPasajeros) {
        super(fabricante, modelo, anniofabricacion, kilometraje);
        this.estilo = estilo;
        this.nPasajeros = nPasajeros;
    }

    @Override
    public boolean coumplien_medidas() {
        boolean cumplir = true;
        if (this.nPasajeros > 7 && this.estilo.equalsIgnoreCase("van")){
            cumplir=false;
        } else if (this.nPasajeros > 5 && !this.estilo.equalsIgnoreCase("van")) {
            cumplir=false;
        }
        return cumplir;
    }

    @Override
    public String toString() {
        return super.toString() + " estilo: " + this.estilo + " Numero pasajeros: " + this.nPasajeros;
    }
}
