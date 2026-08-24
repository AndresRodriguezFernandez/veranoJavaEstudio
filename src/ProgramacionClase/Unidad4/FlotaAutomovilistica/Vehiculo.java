package ProgramacionClase.Unidad4.FlotaAutomovilistica;

public class Vehiculo {
    protected String matricula;
    protected int nRuedas;
    protected double precio;
    private String color;

    public Vehiculo(String matricula, int nRuedas, double precio, String color) {
        this.matricula = matricula;
        this.nRuedas = nRuedas;
        this.precio = precio;
        this.color = color;
    }

    public double establecer_precio() {
        return this.precio + (this.precio*21/100);
    }

    @Override
    public String toString() {
        return "Matrícula:"+this.matricula + " " +this.nRuedas+" ruedas. Color: "+this.color + " Precio: " ;
    }
}
