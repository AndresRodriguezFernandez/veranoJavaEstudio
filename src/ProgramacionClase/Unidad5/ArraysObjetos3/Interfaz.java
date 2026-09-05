package ProgramacionClase.Unidad5.ArraysObjetos3;

import java.util.Scanner;

public class Interfaz {
    public static int menu(Scanner sc) {
        int opc;
        System.out.println("1. Dar de alta un vuelo."+
                "\n2. Dar de baja un vuelo."+
                "\n3. Visualizar todos los vuelos."+
                "\n4. Salir");
        do {
            System.out.println("Introduce una opción: ");
            opc = sc.nextInt();
        }while (opc > 4 || opc <=0);
        return opc;
    }

    public static void elegirOpcion(int opcion, Scanner sc, Aeropuerto aeropuerto) {
        switch (opcion) {
            case 1:
                aeropuerto.annadirVuelos(sc);
                break;
            case 2:
                aeropuerto.borrarVuelo(sc);
                break;
            case 3:
                aeropuerto.visualizar();
                break;
            case 4:
                break;
        }
    }

    public static void main(String[] args) {
        Aeropuerto aerop = new Aeropuerto();
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            opcion = menu(sc);
            elegirOpcion(opcion, sc, aerop);
        }while (opcion != 4);
    }
}
