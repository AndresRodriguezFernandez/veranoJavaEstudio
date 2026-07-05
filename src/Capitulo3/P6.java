/*Leer los datos correspondientes a dos tablas de 12 elementos numéricos, y mezclarlos en una tercera de la forma: 3 de la tabla A, 3 de la tabla B, otros 3 de A,
* otros 3 de B...*/
package Capitulo3;

import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numerosA = new int[12];
        int[] numerosB = new int[12];
        int[] numerosC = new int[24];

        for (int i= 0; i < numerosA.length; i++) {
            System.out.print("Introduzca un número para la posición " + i + " : ");
            numerosA[i] = sc.nextInt();
        }

        for (int i = 0; i < numerosB.length; i++) {
            System.out.print("Introduzca un número para la posición " + i + " : ");
            numerosB[i] = sc.nextInt();
        }

        int l = 0;
        int a = 0;
        int b = 0;
        for (int i = 0; i < numerosC.length; i++) {
            for (int k = 0; k < 3; k++) {
                numerosC[l] = numerosA[a];
                a++;
                l++;
            }
            for (int j = 0; j < 3; j++) {
                numerosC[l] = numerosB[b];
                b++;
                l++;
            }
        }



    }
}
