package ProgramacionClase.Unidad5.ArraysUnidemensionales.Ej1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ClaseVector vec = new ClaseVector();
        vec.cargarVector(sc);
        vec.sumarVectores();
        vec.visualizarVector();
    }
}
