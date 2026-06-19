package Capitulo2;

import java.io.IOException;
import java.text.NumberFormat;
import java.util.Scanner;

public class P27 {
    public static void main(String[] args) {
        int opcion = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1. Primera opcion");
            System.out.println("2. Segundo opcion");
            System.out.println("3. tercera opcion");
            System.out.println("4. Cuarta opcion");
            System.out.println("5. Quinta opcion-salir");
            System.out.println("Introduce una opción");
            try {
                opcion = sc.nextInt();
            }catch (NumberFormatException e) {
                System.out.println("Error: " + e);
            }
            switch (opcion) {
                case 1:
                    System.out.println("Primera opcion");
                    break;
                case 2:
                    System.out.println("Segunda opcion");
                    break;
                case 3:
                    System.out.println("Tercera opcion");
                    break;
                case 4:
                    System.out.println("Cuarta opcion");
                case 5:
                    break;
            }
        } while (opcion != 5);


    }
}
