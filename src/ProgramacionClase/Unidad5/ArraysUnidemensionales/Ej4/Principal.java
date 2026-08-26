package ProgramacionClase.Unidad5.ArraysUnidemensionales.Ej4;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        VectorClase vc = new VectorClase();
        Scanner sc = new Scanner(System.in);
        vc.cargar(sc);
        vc.buscar();
    }
}
