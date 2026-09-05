package ProgramacionClase.Unidad5.ArraysObjetos3;

import java.util.Scanner;

public class Aeropuerto {
    private String ciudad;
    private int nVuelos;
    private Vuelos[] vuelos = new Vuelos[nVuelos];

    public Vuelos leerDatos(Scanner sc) {
        System.out.println("---Creación de un nuevo vuelo----");
        System.out.print("Introduzca en número de vuelo: ");
        int numVuelo = sc.nextInt();
        sc.nextLine();
        System.out.print("Introduzca el destino: ");
        String dest = sc.nextLine();
        System.out.print("Introduzca el nombre de la comñía: ");
        String company = sc.nextLine();
        return new Vuelos(numVuelo, dest, company);
    }

    public void annadirVuelos(Scanner sc) {
        for (int i = 0; i < vuelos.length; i++) {
            vuelos[i] = leerDatos(sc);
        }
    }

    public int meterVueloEliminar(Scanner sc) {
        System.out.println("Introduce el número de vuelo a eliminar: ");
        return sc.nextInt();
    }

    public Vuelos buscarVuelo(int num) {
        Vuelos vuelo = null;
        for (int i = 0; i < vuelos.length; i++) {
            if (vuelos[i].getnVuelo() == num) {
                vuelo = vuelos[i];
            }
        }
        return vuelo;
    }

    public void visualizarVuelo(Vuelos vuelo) {
        System.out.println("------Vuelo seleccionado para su eliminación:----");
        System.out.println(vuelo.toString());
    }

    public String verRespuesta(Scanner sc) {
        String respuesta = "";
        do {
            System.out.print("¿Está seguro que desea elimianr el vuelo de la base de datos? (Si/No):");
            respuesta = sc.next().trim().toLowerCase();
        }while (!respuesta.equals("si") && !respuesta.equals("no"));
        return respuesta;
    }

    public void borrarVuelo(Scanner sc) {
        Vuelos vuel = buscarVuelo(meterVueloEliminar(sc));
        visualizarVuelo(vuel);
        if (verRespuesta(sc).equals("si")) {
            for (int i = 0; i < vuelos.length; i++) {
                if (vuelos[i] == vuel) {
                    vuelos[i] = vuelos[i+1];
                    for (int j = i+1;j < vuelos.length-1; j++) {
                        vuelos[j] = vuelos[j+1];
                    }
                }
            }
        }
    }

    public void visualizar() {
        System.out.println("---Listado de vuelos----");
        for (int i = 0; i < vuelos.length; i++) {
            System.out.println(vuelos[i].toString());
        }
    }
}
