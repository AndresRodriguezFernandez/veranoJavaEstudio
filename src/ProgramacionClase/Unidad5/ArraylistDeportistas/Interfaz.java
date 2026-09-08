package ProgramacionClase.Unidad5.ArraylistDeportistas;

import java.util.ArrayList;
import java.util.Scanner;

public class Interfaz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EstrcuturaDatos ed = new EstrcuturaDatos();

        ArrayList<Deportista> deportistasPersonas =  ed.crearDeportistas(sc);
        ArrayList<Integer> sitioVector = ed.crearSitio(deportistasPersonas, sc);
        ed.cargarDatos(deportistasPersonas, sitioVector, sc);
        Deportista[] deportistasVector = ed.copiarVector(deportistasPersonas);
        ed.visualizar(deportistasPersonas, sitioVector, deportistasVector);
    }
}
