package Capitulo3;

import java.util.Scanner;

public class R7 {
    public static void main(String[] args) {
        int POS = 10;
        String[] nombres = new String[POS];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Introduce un nombre para la posición " + i + " : ");
            nombres[i] = sc.next();
        }

        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }
    }
}
