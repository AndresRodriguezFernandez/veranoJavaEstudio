package Capitulo3;

import java.util.Arrays;
import java.util.Scanner;

public class P17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;

        System.out.println("Introduce una frase para comprobar si es palíndromo: ");
        frase = sc.nextLine().toLowerCase().trim().replace(" ", "");

        char[] caracteres = frase.toCharArray();

        System.out.println();
        char[] caracteresInversa = new char[caracteres.length];
        int cont = 0;
        for (int i = caracteres.length -1; i >= 0; i--) {
            caracteresInversa[cont] = caracteres[i];
            cont++;
        }


        if (Arrays.equals(caracteresInversa, caracteres)) {
            System.out.println("La frase se lee igual de izquierda a derecha. Es palíndromo.");
        }else {
            System.out.println("La frase no es palíndromo.");
        }
    }
}
