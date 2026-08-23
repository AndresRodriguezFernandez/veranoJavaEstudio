package ProgramacionClase.Unidad4.Empleados;

public class Vendedor extends Empleado{
    protected int volumenVentas;

    public Vendedor(int codigo, String nombre, Empresa empresa, int volumenVentas) {
        super(codigo, nombre, 1200, empresa);
        this.volumenVentas = volumenVentas;
    }

    @Override
    public double calcularSueldoMensual() {
        return sueldoFijo+((double) (10 * this.volumenVentas) /100);
    }

}
