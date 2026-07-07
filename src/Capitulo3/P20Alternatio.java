package Capitulo3;

import java.util.Scanner;

public class P20Alternatio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] tabla = new int[4][4];

        for (int f = 0; f < tabla.length; f++) {
            for (int c = 0; c < tabla[f].length; c++) {
                System.out.print("Introduce un valor para la posición ["+f+"] , ["+c+"] : " );
                tabla[f][c] = sc.nextInt();
            }
        }

        boolean esSimetrica = false;
        for (int f = 0; f < tabla.length; f++){
            for (int c = 0; c < tabla[f].length; c++) {
                if (tabla[f][c] == tabla[c][f]) {
                    esSimetrica = true;
                }

            }
        }

        if (esSimetrica) {
            System.out.println("La matriz SÍ es simétrica.");
        }else {
            System.out.println("Las mastriz NO es simétrica.");
        }
    }
}
