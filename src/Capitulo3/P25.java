/*Utilizando dos tablas de tamaño 5x9 y 9x5, cargar la primera y trasponerla en la segunda*/
package Capitulo3;

import java.util.Scanner;

public class P25 {
    public static void main(String[] args) {
        int filas = 5;
        int columnas = 9;
        int[][] tabla1 = new int[filas][columnas];
        int[][] tabla2 = new int[columnas][filas];
        Scanner sc = new Scanner(System.in);

        for (int f = 0; f < filas; f++) {
            for (int c = 0; c < columnas; c++) {
                System.out.print("Introduce un valor para la posición ["+f+", "+c+"] : ");
                tabla1[f][c] = sc.nextInt();
            }
        }

        System.out.println("-----Primera tabla-----");
        for (int f = 0; f < filas; f++) {
            for (int c = 0; c < columnas; c++) {
                System.out.print(tabla1[f][c] + " ");
            }
            System.out.println();
        }

        for (int f = 0; f < tabla2.length; f++) {
            for (int c = 0; c < tabla2[filas].length; c++) {
                tabla2[f][c] = tabla1[c][f];
            }
        }

        System.out.println("-----Segunda tabla-----");
        for (int f = 0; f < columnas; f++) {
            for (int c = 0; c < filas; c++) {
                System.out.print(tabla2[f][c] + " ");
            }
            System.out.println();
        }

    }
}
