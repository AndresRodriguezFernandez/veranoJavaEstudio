package ProgramacionClase.Unidad5.ArraysBidimensionales.Ej1;

import java.util.Scanner;

public class Principal {
    public static void visualizarMatriz(int[][] matriz) {
        System.out.println("---Matriz-----");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void visualizarVector(int[] resultados) {
        System.out.println("---Vector de la suma----");
        for (int i = 0; i < resultados.length; i++) {
            System.out.println(resultados[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matriz mat = new Matriz();
        mat.cargar(sc);
        visualizarMatriz(mat.getMatriz());
        mat.sumar();
        visualizarVector(mat.getResultados());
    }
}
