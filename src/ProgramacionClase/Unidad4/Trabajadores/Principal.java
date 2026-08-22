package ProgramacionClase.Unidad4.Trabajadores;

public class Principal {
    public static void main(String[] args) {
        Empleado men = new Mensajero(1, "Paco", 27);
        Empleado mozo = new MozoAlmacen(2, "Miguel", 2);
        Empleado[] listaEmpleados = {men, mozo};
        double salarioPagado = 0;

        for (int i = 0; i < listaEmpleados.length; i++) {
            listaEmpleados[i].verinfo();
            salarioPagado+=listaEmpleados[i].getSalario();
            System.out.println("-------");
        }

        System.out.println("Total pagado por la empresa: " + salarioPagado);
    }
}
