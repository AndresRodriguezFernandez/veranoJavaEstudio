//Crear y cargar dos matrices 3x3, sumarlas y mostrar su suma.
package Capitulo3;

import java.util.Scanner;

public class P21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] m1 = new int[3][3];
        int[][] m2 = new int[3][3];

        for (int f = 0; f < m1.length; f++) {
            for (int c = 0; c < m1[f].length; c++) {
                System.out.print("Introduzca un valor para la posición ["+f+", "+c+ "] : ");
                m1[f][c] = sc.nextInt();
            }
        }
        System.out.println("-------Cargar la segunda matriz-------");
        for (int f = 0; f < m2.length; f++) {
            for (int c = 0; c < m2[f].length; c++) {
                System.out.print("Introduzca un valor para la posición ["+f+", "+c+ "] : ");
                m2[f][c] = sc.nextInt();
            }
        }

        for (int f = 0; f < m1.length; f++) {
            for (int c = 0; c < m1[f].length; c++) {
                System.out.print(m1[f][c] + m2[f][c] + " ");
            }
            System.out.println();
        }
    }
}
