/*Crear un programa que cree una matriz de tamaño NxM (tamaño introducido por el teclado) e
* introduzca en ella NxM valores (también introducios por el teclado.). Luego,
* deberá recorrer la matriz y al final mostrar por pantalla cuántos valores son mayores
* a cero, cuántos son menores que cero y cuántos son igual a cero.*/
package Capitulo3;

import java.util.Scanner;

public class P19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas;
        int col;

        System.out.print("Introduzca la cantidad de filas deseadas: ");
        filas = sc.nextInt();
        System.out.print("Introduca la cantidad de columnas deseadas: ");
        col = sc.nextInt();

        int[][] matriz = new int[filas][col];

        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[f].length; c++) {
                System.out.print("Introduzca el valor deseado para la posición " + f + ", " + c + " : ");
                matriz[f][c] = sc.nextInt();
            }
        }

        for (int r = 0; r < matriz.length; r++) {
            for (int re = 0; re < matriz[r].length; re++) {
                System.out.print(matriz[r][re] + " ");
            }
            System.out.println();
        }

        int mayores = 0;
        int menores = 0;
        int igual = 0;
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[f].length; c++) {
                if (matriz[f][c] < 0) {
                    menores++;
                } else if (matriz[f][c] > 0) {
                    mayores++;
                }else {
                    igual++;
                }
            }
        }

        System.out.println("Mayores a 0: " + mayores + "\nMenores a 0: " + menores + "\nIguales a 0: " + igual);

    }
}
