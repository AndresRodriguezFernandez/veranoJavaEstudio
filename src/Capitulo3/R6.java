package Capitulo3;

import java.util.Scanner;
/*Leer por el teclado dos tablas de 10 numeros enteros y mezclarlas en una tercera de la forma: el 1º de A, el 1º de B, el 2º de A, 2º de B*/
public class R6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tablaA = new int[10];
        int[] tablaB = new int[10];
        int[] tablaC = new int[20];

        for (int i = 0;i < tablaA.length; i++) {
            System.out.print("Introduzca un número para la posición " + i + " de la tabla A:");
            tablaA[i] = sc.nextInt();
        }

        for (int j = 0;j < tablaB.length; j++) {
            System.out.print("Introduzca un número para la posición " + j + " de la tabla B: ");
            tablaB[j] = sc.nextInt();
        }

        for (int k = 0; k <10; k++) {
            tablaC[k] = tablaA[k];
        }

        for (int m = 0; m < 20; m++) {
            tablaC[m+10] = tablaB[m];
        }

        for (int r = 0; r < tablaC.length; r++) {
            System.out.print(tablaC[r] + " ");
        }

    }
}
