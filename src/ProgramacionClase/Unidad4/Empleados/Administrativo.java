package ProgramacionClase.Unidad4.Empleados;

public class Administrativo extends Empleado{
    protected int horasExtra;

    public Administrativo(int codigo, String nombre, Empresa empresa, int horasExtra) {
        super(codigo, nombre, 1300, empresa);
        this.horasExtra = horasExtra;
    }

    @Override
    public double calcularSueldoMensual() {
        return sueldoFijo+(30*this.horasExtra);
    }
}
