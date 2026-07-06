/*Diseñar una aplicación que declae una tabla de 10 elementos enteros. Leer mediante el teclado 8 números. Después se debe pedir un número
* y una posición, insertarlo en la posición indicada, desplazando los que estén detrás.*/
package Capitulo3;

import java.util.Scanner;

public class P9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int num;
        int pos;

        for (int i = 0; i <8 ; i++) {
            System.out.print("Introduce un valor para la pos " + i + " : ");
            numeros[i] = sc.nextInt();
        }

        System.out.print("Introduce un número: ");
        num = sc.nextInt();
        System.out.print("introduce una posición: ");
        pos = sc.nextInt();

        for (int k = numeros.length-2 ; k >= pos; k--) {
            numeros[k + 1] = numeros[k];
        }
        numeros[pos] = num;

        for (int l = 0; l < numeros.length; l++) {
            System.out.print(numeros[l] + " ");
        }
    }
}
