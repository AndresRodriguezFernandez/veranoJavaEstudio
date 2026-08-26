package ProgramacionClase.Unidad5.ArraysUnidemensionales.Ej3;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VectorClase vc = new VectorClase();

        vc.cargar(sc);
        int[] vectorFinal = vc.crearNuevoVector();
        vc.visualizar(vectorFinal);
    }
}
