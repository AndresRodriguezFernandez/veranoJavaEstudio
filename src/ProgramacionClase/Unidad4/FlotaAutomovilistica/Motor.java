package ProgramacionClase.Unidad4.FlotaAutomovilistica;

public enum Motor {
    DIESEL(0.38),
    GASOLINA(0.47);

    private final double impuesto;

    private Motor(double impuesto){
        this.impuesto=impuesto;
    }

    public double getImpuesto() {
        return impuesto;
    }


}
