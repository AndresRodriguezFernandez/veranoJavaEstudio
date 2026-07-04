package Capitulo3;

import java.util.Scanner;
/*Crea un programa que pida 20 números enteros por el teclado, los almacene en un array y luego muestre por separado la suma de todos los valores positivos y negativos.*/
public class P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[20];
        int sumaPos = 0;
        int sumaNeg = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduzca un número para la posición " + i + " : ");
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                sumaPos+=numeros[i];
            } else if (numeros[i] < 0) {
                sumaNeg+=numeros[i];
            }
        }

        System.out.println("El resultado de la suma de los números positivos es: " + sumaPos
        + "\nEl resultado de la suma de los números negativos es de: " + sumaNeg);
    }
}
