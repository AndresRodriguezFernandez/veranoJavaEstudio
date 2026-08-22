package ProgramacionClase.Unidad4.Trabajadores;

public class MozoAlmacen extends Empleado{
    private int nTrienios;
    private final int PAGO_TRIENIOS = 60;

    public MozoAlmacen(int codigoEmpleado, String nombre, int nTrienios) {
        super(codigoEmpleado, nombre);
        this.nTrienios = nTrienios;
    }

    @Override
    public double getSalario() {
        return super.sueldoBase+(this.nTrienios*PAGO_TRIENIOS);
    }

    @Override
    public void verinfo() {
        super.verinfo();
        System.out.println("Salario: " + this.getSalario());
        System.out.println("Número de trienios: " +this.nTrienios + " - Equivalente en años: " +this.nTrienios*3);
    }
}
