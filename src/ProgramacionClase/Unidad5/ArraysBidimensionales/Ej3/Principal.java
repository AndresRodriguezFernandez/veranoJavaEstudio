package ProgramacionClase.Unidad5.ArraysBidimensionales.Ej3;

import java.util.Scanner;

public class Principal {
    public static void visualizarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void visualizarResultados(int[] resultados) {
        int sumaMas = 0;
        int sumaMenos = 0;
        for (int i = 0; i < resultados.length; i++) {
            if (resultados[i] >= 20) {
                sumaMas++;
            }else {
                sumaMenos++;
            }
        }
        System.out.println("Columnas que sumen más de 20: " + sumaMas);
        System.out.println("Columnas que sumen menos de 20: " + sumaMenos);
    }

    public static void main(String[] args) {
        Matriz mat = new Matriz();
        Scanner sc = new Scanner(System.in);
        mat.cargarMatriz(sc);
        visualizarMatriz(mat.getMatriz());
        visualizarResultados(mat.sumarColumnas());
    }
}
