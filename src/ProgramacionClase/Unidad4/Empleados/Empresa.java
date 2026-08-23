package ProgramacionClase.Unidad4.Empleados;

public class Empresa {
    protected String denominacion;
    protected String cif;
    protected int nEmpleados;
    protected double totalPagado;

    public Empresa(String cif, String denominacion) {
        this.cif = cif;
        this.denominacion = denominacion;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public String getCif() {
        return cif;
    }

    public int getnEmpleados() {
        return nEmpleados;
    }

    public double getTotalPagado() {
        return totalPagado;
    }

    public void setnEmpleados(Empleado[] empleados) {
        int numEmpleados = 0;
        for (int i = 0; i < empleados.length; i++) {
            if (empleados[i].getEmpresa().getDenominacion().equals(this.getDenominacion())) {
                numEmpleados++;
            }
        }
        this.nEmpleados = numEmpleados;
    }

    public void setTotalPagado(Empleado[] empleados) {
        double total = 0;
        for (int i = 0; i < empleados.length; i++) {
            if (empleados[i].getEmpresa().getDenominacion().equals(this.getDenominacion())) {
                total+=empleados[i].calcularSueldoMensual();
            }
        }
        this.totalPagado = total;
    }

    public void imprimir() {
        System.out.println("Total de empleados: " + this.nEmpleados);
        System.out.println("Total pagado a los trabajdores: " + this.totalPagado);
    }
}
