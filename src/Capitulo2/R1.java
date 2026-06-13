package Capitulo2;

import java.util.Scanner;

public class R1 {
    public static void main(String[] args) {
        double radio;
        //final double PI = 3.1426;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el radio: ");
        radio = sc.nextDouble();
        double area = Math.PI*(radio*radio);
        System.out.println(area);
    }
}
