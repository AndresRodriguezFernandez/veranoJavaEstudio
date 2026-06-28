package Capitulo2;

import java.util.Scanner;

public class P26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("introduce un numero entero para definir la altura del triangulo: ");
        num = sc.nextInt();
        for (int fila = 1; fila <= num; fila++) {
            for (int espacio = 1; espacio <= num - fila; espacio++) {
                System.out.print(" ");
            }
            for (int columna = 1; columna <= fila; columna++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
