package ProgramacionClase.Unidad4.Trabajadores;

public class Mensajero extends Empleado{
    private int edad;
    private final int DIETA = 48;

    public Mensajero(int codigoEmpleado, String nombre, int edad) {
        super(codigoEmpleado, nombre);
        this.edad = edad;
    }

    @Override
    public double getSalario() {
        return super.sueldoBase+DIETA;
    }

    @Override
    public void verinfo() {
        super.verinfo();
        System.out.println("Edad: " + this.edad + "\nSalario: " + getSalario());
    }
}
