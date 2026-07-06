/*Crea un programa que cree un array de enteros de tamaño 100 y lo rellene con valores enteros aleatorios entre 1 y 10 (utiliza 1 + math.random()*10).
* Luego pedirá un valor n y mostrá en qué psociones del array aparece N.*/
package Capitulo3;

import java.util.Scanner;

public class P8 {
    public static void main(String[] args) {
        int[] numeros = new int[100];
        Scanner sc = new Scanner(System.in);
        int valor;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (1+ Math.random()*10);
        }

        System.out.print("Introduce el valor del que quieras conocer sus posiciones: ");
        valor = sc.nextInt();

        for (int j = 0; j < numeros.length; j++) {
            if (numeros[j] == valor) {
                System.out.print(j + " ");
            }
        }
    }
}
