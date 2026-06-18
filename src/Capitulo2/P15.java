package Capitulo2;

import java.util.Scanner;

public class P15 {
    public static int comprobarMayor(int num1, int num2, int num3) {
        if (num1 > num2 && num1 > num3){
            return num1;
        } else if (num2 > num1 && num2 > num3) {
            return  num2;
        }else {
            return num3;
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
        System.out.println("El número mayor es: " + comprobarMayor(num1, num2, num3));
    }
}
