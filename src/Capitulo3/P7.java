/*Leer por teclado una serie de 10 números enteros. La aplicación debe indicarnos si los números están ordenados de forma creciente, decreciente
* o si están desordenados.*/
package Capitulo3;

import java.util.Arrays;
import java.util.Scanner;

public class P7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduzca un número para la posición " + i + " : ");
            numeros[i] = sc.nextInt();
        }

        boolean esCreciente = true;
        for (int j = 0; j < numeros.length; j++) {
            if (numeros[j] > numeros[j+1]) {
                esCreciente = false;
                break; //se supone que no es buena práctica usar estos breaks dentro de los for
            }
        }

        boolean esDecreciente = true;
        for (int k = 0; k < numeros.length; k++) {
            if (numeros[k] < numeros[k+1]) {
                esDecreciente=false;
                break;
            }
        }

        if (esCreciente) {
            System.out.println("El array está ordenado crecientemente");
        } else if (esDecreciente) {
            System.out.println("El array está ordenado decrecientemente");
        }else {
            System.out.println("El array no está ordenado");
        }
    }
}
