package ProgramacionClase.Unidad4.Empleados;

public abstract class Empleado {
    protected int codigo;
    protected String nombre;
    protected double sueldoFijo;
    protected Empresa empresa;

    public Empleado(int codigo, String nombre, double sueldoFijo, Empresa empresa) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.sueldoFijo = sueldoFijo;
        this.empresa = empresa;
    }

    public abstract double calcularSueldoMensual();

    public void imprimir(){
        System.out.println("Nombre: "+this.nombre
        +"\nCódigo: " + this.codigo
        +"\nSueldo fijo: " + this.sueldoFijo
        +"\nDenominación de la empresa: " + this.empresa.getDenominacion()
        +"\nSueldo mensual: " + calcularSueldoMensual());
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSueldoFijo() {
        return sueldoFijo;
    }

    public Empresa getEmpresa() {
        return empresa;
    }
}
