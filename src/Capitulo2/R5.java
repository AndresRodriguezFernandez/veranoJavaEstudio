package Capitulo2;

import java.util.Scanner;

public class R5 {
    public static void main(String[] args) {
        int anio;
        int dia;
        int mes;
        int diasMes;
        int cifra = 0;
        int numSuerte = 0;
        boolean bisiesto = false;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Introduzca su año de nacimiento: ");
            anio = sc.nextInt();
        }while (anio <0 || anio >9999);
        if (anio%4 == 0){
            bisiesto=true;
        }
        do {
            System.out.println("Introduzca su mes de nacimiento; ");
            mes = sc.nextInt();
        }while (mes < 1 || mes > 12);
        do {
            System.out.println("Introduzca su día de nacimiento: ");
            dia = sc.nextInt();

            switch (mes) {
                case 1:
                case 3:
                case 7:
                case 8:
                case 10:
                case 12:
                    diasMes = 31;
                    break;
                case 2:
                    if (bisiesto){
                        diasMes=28;
                    }else {
                        diasMes=29;
                    }
                    break;
                default:
                    diasMes = 30;
            }
        }while (dia <1 || dia > diasMes);



        int suma = anio+mes+dia;
        System.out.println("La suma de " + anio + " + " + mes + " + " + dia + " es: " + suma);

        for (int i = 0; i<4;i++){
            cifra = cifra + (suma%10);
            suma/=10;
            if (suma == 0 && cifra > 9) {
                System.out.println("La suma de los 4 dígitos anteriores es: " + cifra);
                numSuerte = cifra%10;
                cifra = cifra/10;
                numSuerte +=cifra;
            }
        }

        System.out.println("La suma es: " + numSuerte + "\nY ese es el número de la suerte :)");
    }
}
