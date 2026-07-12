package Capitulo4;

import java.util.Scanner;

public class R2 {

    public static String numBinario(int num) {
        String binario = "";
        String digito;
        for (int i = num; i > 0; i/=2) {
            if (i % 2 == 1) {
                digito = "1";
            }else {
                digito = "0";
            }
            binario = digito + binario;
        }
        return binario;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Introduzca un número decimal para pasar a binario: ");
        num = sc.nextInt();

        System.out.println(numBinario(num));
    }
}
