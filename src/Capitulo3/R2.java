package Capitulo3;

import java.util.Scanner;

public class R2 {
    private static double[] numeros;
    public static void main(String[] args) {
        numeros = new double[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce un número real para el valor " + i + " :");
            numeros[i] = sc.nextDouble();
        }
        //mostrarmos los valores
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}
