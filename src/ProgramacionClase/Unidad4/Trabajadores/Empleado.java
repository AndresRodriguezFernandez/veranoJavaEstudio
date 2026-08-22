package ProgramacionClase.Unidad4.Trabajadores;

public abstract class Empleado {
    protected int codigoEmpleado;
    protected String nombre;
    protected final double sueldoBase = 1000;

    public Empleado(int codigoEmpleado, String nombre) {
        this.codigoEmpleado = codigoEmpleado;
        this.nombre = nombre;
    }

    public abstract double getSalario();

    public void verinfo(){
        System.out.println("Nombre: " + this.nombre
                + "\nCódigo: " + this.codigoEmpleado);
    }
}
