/*Leer 10 números enteros. Debemos mostrarlos en el siguiente orden: el primero, el último, el segundo, el penúltimo, el tercero...*/
package Capitulo3;

import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce un número para la posición " + i + " : ");
            numeros[i] = sc.nextInt();
        }

        int a = numeros.length ;
        for (int k = 0; k < numeros.length; k++) {
            System.out.print(numeros[k] + "-");
            a -= 1;
            System.out.print(numeros[a] + " ");
        }
    }
}
