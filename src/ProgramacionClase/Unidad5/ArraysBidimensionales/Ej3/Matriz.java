package ProgramacionClase.Unidad5.ArraysBidimensionales.Ej3;

import java.util.Scanner;

public class Matriz {
    private int[][] matriz = new int[4][3];

    public void cargarMatriz(Scanner sc) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Introduce un valor: ");
                matriz[i][j] = sc.nextInt();
            }
        }
    }

    public int[] sumarColumnas() {
        int[] sumaFinal = new int[matriz[0].length];
        for (int i = 0; i < matriz[0].length; i++) {
            int sumaColumna = 0;
            for (int j = 0; j < matriz.length; j++) {
                sumaColumna+=matriz[j][i];
            }
            sumaFinal[i] = sumaColumna;
        }
        return sumaFinal;
    }

    public int[][] getMatriz() {
        return matriz;
    }
}
