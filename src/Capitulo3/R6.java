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

        for (int i = 0; i < tablaB.length; i++) {
            System.out.print("Introduzca un número para la posición " + i + " de la tabla B: ");
            tablaB[i] = sc.nextInt();
        }

        for (int i = 0; i < tablaC.length; i++) {

        }

        System.out.println(tablaA);
        System.out.println(tablaB);
        System.out.println(tablaC);
    }
}
