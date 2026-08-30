package ProgramacionClase.Unidad5.ArraysBidimensionales.Ej1;

import java.util.Scanner;

public class Matriz {
    private int[][] matriz = new int[2][3];
    private int[] resultados = new int[2];

    public void cargar(Scanner sc) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Introduce un valor: ");
                matriz[i][j] =sc.nextInt();
            }
        }
    }

    public void sumar() {
        for (int i = 0; i < matriz.length; i++) {
            int suma = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                suma+=matriz[i][j];
            }
            resultados[i] = suma;
        }
    }

    public int[][] getMatriz() {
        return matriz;
    }

    public int[] getResultados() {
        return resultados;
    }
}
