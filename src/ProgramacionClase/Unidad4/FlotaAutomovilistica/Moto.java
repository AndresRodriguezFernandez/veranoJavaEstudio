package ProgramacionClase.Unidad4.FlotaAutomovilistica;

public class Moto extends Vehiculo{
    private boolean antiniebla;

    public Moto(String matricula, double precio, String color, boolean antiniebla) {
        super(matricula, 2, precio, color);
        this.antiniebla = antiniebla;
    }

    public Moto(String matricula, int nRuedas, double precio, String color, boolean antiniebla) {
        super(matricula, nRuedas, precio, color);
        this.antiniebla = antiniebla;
    }

    @Override
    public double establecer_precio() {
        double plusPrecio = 0;
        if (antiniebla){
            plusPrecio = 200;
        }
        return super.establecer_precio() + plusPrecio;
    }

    @Override
    public String toString() {
        String texto;
        if (antiniebla){
            texto= "Tiene";
        }else {
            texto="No tiene";
        }
        return super.toString() + this.establecer_precio()+" euros." + texto + " antiniebla.";
    }
}
