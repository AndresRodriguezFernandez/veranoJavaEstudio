package ProgramacionClase.Unidad5.ArraysUnidemensionales2.Ej1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        ClaseVector cv = new ClaseVector();
        Scanner sc = new Scanner(System.in);
        cv.cargar(sc);
        cv.ordenar();
        int num = cv.meter_numero(sc);
        cv.buscar(num);
    }
}
