package ProgramacionClase.Unidad5.ArraysBidimensionales.Ej4;

import java.util.Scanner;

public class Principal {
    public static void visualizar(int[][] notasMatriz, String[] modulos) {
        int[] aprobados = new int[3];
        for (int i = 0; i < notasMatriz[0].length; i++) {
            if (notasMatriz[0][i] >= 5) {
                aprobados[0] = aprobados[0]+1;
            }
            if (notasMatriz[1][i] >= 5) {
                aprobados[1] = aprobados[1]+1;
            }
            if (notasMatriz[2][i] >= 5) {
                aprobados[2] = aprobados[2]+1;
            }
        }
        for (int i = 0; i < modulos.length; i++) {
            System.out.println("En "+modulos[i]+" hubo "+aprobados[i]+" aprobados.");
        }
    }

    public static void main(String[] args) {
        Matriz mat = new Matriz();
        Scanner sc = new Scanner(System.in);
        String[] vectorModulos = mat.cargarVector(sc);
        mat.cargarMatriz(sc);
        visualizar(mat.getNotas(), vectorModulos);
    }
}
