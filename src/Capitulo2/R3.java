package Capitulo2;

import java.util.Scanner;

public class R3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer numero: ");
        int a = sc.nextInt();
        System.out.println("Introduce el segundo numero: ");
        int b = sc.nextInt();
        if (a<b){
            System.out.println("Los numeros, de menor a mayor, son: " + b + ", " + a);
        }else {
            System.out.println("Los numeros, de menor a mayor, son: " + a + ", " + b);
        }
    }
}
