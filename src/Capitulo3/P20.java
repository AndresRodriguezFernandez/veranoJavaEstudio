/*Crear y cargar una tabla de tamaño 4x4 y decir si es simétrica o no,
* es decir si se obtiene la misma tabla al cambiar las filas por las columnas.*/
package Capitulo3;

import java.util.Arrays;
import java.util.Scanner;

public class P20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] tabla = new int[4][4];

        for (int f = 0; f < tabla.length; f++) {
            for (int c = 0; c < tabla[f].length; c++) {
                System.out.print("Introduce un valor para la posición ["+f+"] , ["+c+"] : " );
                tabla[f][c] = sc.nextInt();
            }
        }

        for (int f = 0; f < tabla.length; f++) {
            for (int c = 0; c < tabla[f].length; c++) {
                System.out.print(tabla[f][c] + " ");
            }
            System.out.println();
        }
        System.out.println("-----------------------");

        int[][] invertida = new int[4][4];
        for (int f = 0; f < tabla.length; f++){
            for (int c = 0; c < tabla[f].length; c++) {
                invertida[f][c] = tabla[c][f];
            }
        }

        for (int f = 0; f < invertida.length; f++) {
            for (int c = 0; c < invertida[f].length; c++) {
                System.out.print(invertida[f][c] + " ");
            }
            System.out.println();
        }


        if (Arrays.deepEquals(invertida, tabla)) {
            System.out.println("Las tablas son simétricas.");
        }else {
            System.out.println("Las tablas no son simétricas.");
        }
    }
}
