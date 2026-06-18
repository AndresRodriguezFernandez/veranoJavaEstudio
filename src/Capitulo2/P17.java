package Capitulo2;

import java.util.Scanner;

public class P17 {
    public static void ordenados(int num1, int num2, int num3) {
        if (num1 > num2) {
            if (num1 > num3) {
                if (num2 > num3) {
                    System.out.println(num1 + "-" + num2 + "-" + num3);
                }else {
                    System.out.println(num1 + "-" + num3 + "-" +num2);
                }
            }else {
                System.out.println(num3 + "-" + num1 + "-" + num2);
            }

        } else if (num2 > num1) {
            if (num2 > num3) {
                if (num1 > num3) {
                    System.out.println(num2 + "-" + num1 + "-" + num3);
                }else {
                    System.out.println(num2 + "-" + num3 + "-" + num1);
                }
            }else {
                System.out.println(num3 + "-" + num2 + "-" + num1);
            }
        }
    }
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primero número: ");
        num1 = sc.nextInt();
        System.out.println("Introduce el segundo número: ");
        num2 = sc.nextInt();
        System.out.println("Introduce el tercer número: ");
        num3 = sc.nextInt();
        ordenados(num1, num2, num3);
    }
}
