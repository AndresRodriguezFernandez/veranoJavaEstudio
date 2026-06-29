package Capitulo3;

import java.util.Scanner;

public class R5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        int contadorPositivos = 0;
        int contadorNegativos = 0;
        int contadorCeros = 0;
        int mediaPositivos = 0;
        int mediaNegativos = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce un número por el teclado: ");
            numeros[i] = sc.nextInt();
        }

        for (int i =0 ; i < 5; i++) {
            if (numeros[i] < 0 ) {
                contadorNegativos++;
                mediaNegativos += numeros[i];
            } else if (numeros[i] > 0) {
                contadorPositivos++;
                mediaPositivos+= numeros[i];
            }else {
                contadorCeros+=1;
            }
        }

        if (contadorPositivos == 0) {
            System.out.println("No se puede realizar la media de los números positivos");
        }else {
            System.out.println("Números positivos: " + contadorPositivos + "\nMedia positivos: " + (float)mediaPositivos/contadorPositivos);
        }
        if (contadorNegativos == 0) {
            System.out.println("No se puede realizar la media de los numeros negativos.");
        }else {
            System.out.println("Números negativos: " + contadorNegativos + "\nMedia negativos" + (float) mediaNegativos/contadorNegativos);
        }
        System.out.println("Ceros: " + contadorCeros);
    }
}
