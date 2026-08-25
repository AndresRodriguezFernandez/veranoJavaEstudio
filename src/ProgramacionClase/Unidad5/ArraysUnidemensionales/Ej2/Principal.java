package ProgramacionClase.Unidad5.ArraysUnidemensionales.Ej2;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ClaseVector vec = new ClaseVector();
        vec.leerTamano(sc);
        int[] vec1 = vec.cargarVector(sc);
        int[] vec2 = vec.crearVector(vec1);
        vec.visualizarVector(vec1, vec2);
    }
}
