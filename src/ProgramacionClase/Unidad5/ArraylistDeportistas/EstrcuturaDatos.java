package ProgramacionClase.Unidad5.ArraylistDeportistas;

import java.util.ArrayList;
import java.util.Scanner;

public class EstrcuturaDatos {
    public ArrayList<Integer> crearSitio(ArrayList deportistas, Scanner sc) {
        ArrayList<Integer> sitio = new ArrayList<>();
        for (int i = 0; i < deportistas.size(); i++) {
            String num;
            boolean seguir = true;
            do {
                System.out.print("Introduce un número entre 0 y "+deportistas.size()+" :");
                num = sc.next();
                if (num.toLowerCase().trim().equals("no")) {
                    seguir = false;
                    break;
                }
            }while(Integer.parseInt(num) > deportistas.size() && Integer.parseInt(num) < 0);
            sitio.add(Integer.parseInt(num));
            if (!seguir) {
                break;
            }
        }
        System.out.println("Proceso terminado");
        return sitio;
    }

    public ArrayList<Deportista> crearDeportistas(Scanner sc) {
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
        return deportistas;
    }

    public void cargarDatos(ArrayList<Deportista> deportistas, ArrayList<Integer> sitio, Scanner sc) {
        for (int i = 0; i < sitio.size(); i++) {
            String nombre;
            String deporte;
            System.out.println("Introduce un nombre: ");
            nombre = sc.nextLine();
            System.out.println("Introduce su deporte: ");
            deporte = sc.nextLine();
            deportistas.add(sitio.get(i), new Deportista(nombre, deporte));
        }
    }

    public Deportista[] copiarVector(ArrayList<Deportista> deportistas) {
        Deportista[] deportistasVector = new Deportista[deportistas.size()];
        for (int i = 0; i < deportistas.size(); i++) {
            deportistasVector[i] = deportistas.get(i);
        }
        return deportistasVector;
    }

    public void visualizar(ArrayList<Deportista> deportistas, ArrayList<Integer> sitio, Deportista[] deportistasVec) {
        System.out.println("---Visualizando vector de deportistas final-----");
        for (int i = 0; i < deportistas.size(); i++) {
            System.out.println(deportistas.get(i).toString());
        }

        System.out.println("--Visualizando vector sitio----");
        for (int j = 0; j < sitio.size(); j++) {
            System.out.println(sitio.get(j)+" ");
        }

        System.out.println("---Visualizando vector normal de deportistas---");
        for (int k = 0; k < deportistasVec.length; k++) {
            System.out.println(deportistasVec[k].toString());
        }
    }

}
