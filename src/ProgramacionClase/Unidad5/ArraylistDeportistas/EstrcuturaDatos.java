package ProgramacionClase.Unidad5.ArraylistDeportistas;

import java.util.ArrayList;
import java.util.Scanner;

public class EstrcuturaDatos {
    public void crearSitio(ArrayList deportistas) {
        ArrayList<Integer> sitio = new ArrayList<>();
        for (int i = 0; i < deportistas.size(); i++) {
            sitio.add((int) (Math.random()*(deportistas.size()-0)-0));
        }
    }

    public void crearDeportistas(Scanner sc) {
        ArrayList<Deportista> deportistas = new ArrayList<>();
        String nombre;
        String deporte;
        do {
            System.out.println("Introduce un nombre: ");
            nombre = sc.nextLine();
            System.out.println("Introduce su deporte: ");
            deporte = sc.nextLine();
        }while (!nombre.toLowerCase().equals("no") && !deporte.toLowerCase().equals("no"));
        if (!nombre.toLowerCase().equals("no") && !deporte.toLowerCase().equals("no")) {
            deportistas.add(new Deportista(nombre, deporte));
        }
        System.out.println("Proceso terminado");
    }

}
