package ProgramacionClase.Unidad5.ArrayslistAlumnos;

public class Principal {
    public static void main(String[] args) {
        ColeccionAlumnos ca = new ColeccionAlumnos();
        int opcion;
        do {
            ca.menu();
            opcion = ca.devoler_opcion();
            ca.tramitar_opcion(opcion);
        }while (opcion != 5);
    }
}
