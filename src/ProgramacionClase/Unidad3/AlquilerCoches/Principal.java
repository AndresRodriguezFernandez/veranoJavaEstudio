package ProgramacionClase.Unidad3.AlquilerCoches;

import java.util.Scanner;

public class Principal {
    static Scanner sc = new Scanner(System.in);

    static Motor m1 = new Motor("Diesel", 120);
    static Motor m2 = new Motor("Gasolina", 90);

    static Vehiculo v1 = new Vehiculo("3024 JHT", 5, false, m1);
    static Vehiculo v2 = new Vehiculo("2078 HTL", 7, false, m2);

    static Vehiculo[] listaVehiculos = {v1, v2};

    public static void visualizarMenu() {
        System.out.println("------Seleccione una opción: -------");
        System.out.println("1. Alquilar coche" + "\n2. Devolver coche");
    }

    public static int elegirOpcion(Scanner sc){
        int opcion = sc.nextInt();
        while (opcion != 1 && opcion != 2){
            System.out.println("Opción inexistente. Por favor, introduzca una opción válida.");
            visualizarMenu();
            opcion = sc.nextInt();
        }
        return opcion;
    }

    public static int meter_plazas(Scanner sc){
        System.out.println("Introduzca el número de plazas que desea en su automóvil (5/7): ");
        int plazas = sc.nextInt();
        while (plazas != 5 && plazas != 7) {
            System.out.println("Introduzca un número de plazas válido (5 o 7 plazas): ");
            plazas=sc.nextInt();
        }
        return plazas;
    }

    public static void ejecutarOpcion(int opcion){
        if (opcion == 1){
            int plazas = meter_plazas(sc);
            Vehiculo v = null;
            for (int i = 0; i < listaVehiculos.length; i++) {
                if (plazas == listaVehiculos[i].getPlazas()) {
                    v =listaVehiculos[i];
                }
            }
            if (v.isReservado()) {
                System.out.println("Lo sentimos, no hay coches diponibles para alquilar.");
            }else {
                System.out.println(v.toString());
                v.setReservado(true);
            }
        } else if (opcion == 2) {
            System.out.println("----Vehículo a devoler-----");
            Vehiculo dev = null;
            for (int i = 0; i < listaVehiculos.length; i++) {
                if (listaVehiculos[i].isReservado()) {
                    dev =listaVehiculos[i];
                }
            }
            if (dev == null) {
                System.out.println("Lo sentimos, no ha alquilado ningún vehículo.");
            }else {
                System.out.println(dev.toString());
                dev.setReservado(false);
            }
        }
    }

    public static void main(String[] args) {
        while (true) {
            visualizarMenu();
            ejecutarOpcion(elegirOpcion(sc));
        }
    }
}
