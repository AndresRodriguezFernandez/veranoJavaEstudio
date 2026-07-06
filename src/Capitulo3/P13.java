/*hacer un programa que acepte varios números por teclado hasta llegar a un 0, cuando llegue
* a un 0 no pedirá más y nos mostrará por pantalla el mayor de los números introducidos,
* (como máximo 10 números contando el 0)*/
package Capitulo3;

import java.util.Scanner;

public class P13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int num;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce un valor para el vector: ");
            numeros[i] = sc.nextInt();
            if (numeros[i] == 0) {
                break;
            }
        }

        int max = 0;
        for (int j = 0; j <numeros.length; j++) {
            if (max < numeros[j]) {
                max = numeros[j];
            }
        }

        System.out.println("El número más grande es: " + max);
    }
}
