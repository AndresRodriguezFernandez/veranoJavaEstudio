package Capitulo3;

import java.util.Scanner;

public class R1 {
    private static int[] temperaturas;
    final static int POS = 10; //numero de temperaturas que almacenará el array
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        temperaturas = new int[POS];
        int suma = 0;
        for (int i = 0; i < POS; i++) {
            System.out.println("Introduzca una temperatura: ");
            temperaturas[i] = sc.nextInt();
        }
        System.out.println("Las temperaturas son: ");
        for (int i = 0; i < temperaturas.length;i++) {
            System.out.print(temperaturas[i] + " ");
        }

        for (int i = 0; i < temperaturas.length; i++) {
            suma+=temperaturas[i];
        }
        int media = suma / POS;
        System.out.println("\nLa media de las temperaturas es de : " + media);
    }
}
