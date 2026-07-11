package Capitulo4;

import java.util.Scanner;

public class TP3 {

    public static boolean comprobarPrimo(int num) {
        for (int i = 2; i < num; i++) {
            if ((num % i) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        boolean resultado = comprobarPrimo(num);
        if (resultado) {
            System.out.println("El número es primo");
        }else {
            System.out.println("El número no es primo.");
        }
    }
}
