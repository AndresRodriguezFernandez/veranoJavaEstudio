package Capitulo2;

import java.util.Scanner;

public class R4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int u;
        int d;
        int c;
        int m;
        do {
            System.out.println("Introduce un numero entre 0 y 9.999");
            numero = sc.nextInt();
        }while (numero <0 || numero > 9999);
        u = numero % 10;
        numero = numero /10;

        d = numero % 10;
        numero/= 10;

        c=numero%10;
        numero/=10;

        m=numero%10;
        numero/=10;


        System.out.println(u+""+d+""+c+""+m);
    }
}

