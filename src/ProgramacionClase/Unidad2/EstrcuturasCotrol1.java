package ProgramacionClase.Unidad2;

import java.util.Scanner;

public class EstrcuturasCotrol1 {
    public static void main(String[] args) {
        //1
        Scanner sc = new Scanner(System.in);
        int num;
        int suma = 0;
        int sumaPares = 0;
        int sumaImpares = 0;
        int cuadrados = 0;
        do {
            System.out.println("Introduce un número: ");
            num = sc.nextInt();
        }while (num > 0 && num < 20);
        for (int i = 0; i < num; i++) {
            suma+=i;
            if (i % 2 == 0) {
                sumaPares+=i;
            }else {
                sumaImpares+=i;
            }
            if (i * i % 2 == 0) {
                cuadrados+=i;
            }
        }

        System.out.println(suma + " " + sumaPares + " " + sumaImpares + " " + cuadrados);

        //2
        int num1 = 0;
        do {
            System.out.println("Introduce un número para calcular su factorial menor que 7");
            num1 = sc.nextInt();
        }while (num1 < 7);
        int factorial = num1;
        if (num1 == 0) {
            System.out.println("0");
        }else {
            for (int i = num-1; i > 0 ; i--) {
                factorial = factorial*i;
            }
            System.out.println(factorial);
        }


    }
}
