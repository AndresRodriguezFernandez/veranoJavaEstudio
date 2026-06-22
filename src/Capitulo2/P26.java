package Capitulo2;

import java.util.Scanner;

public class P26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("introduce un numero entero para definir la altura del triangulo: ");
        num = sc.nextInt();
        int espacio = 0;
        for (int fila = 1; fila <= num; fila++) {
            for (int columna = 1; columna <= fila; columna++) {
                while (espacio < num) {
                    System.out.print(" ");
                    espacio++;
                }
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
