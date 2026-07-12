//tabla de multiplicar de x numero
package Capitulo4;

import java.util.Scanner;

public class P1 {
    void tabla(int num) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + num*i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        P1 p1 = new P1();
        System.out.print("Introduce el número del que quieras saber su tabla de multiplicar: ");
        int num = sc.nextInt();
        p1.tabla(num);
    }
}
