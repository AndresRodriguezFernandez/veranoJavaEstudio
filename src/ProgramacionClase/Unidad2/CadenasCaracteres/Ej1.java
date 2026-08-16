package ProgramacionClase.Unidad2.CadenasCaracteres;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra;
        boolean seguir = true;
        do {
            System.out.print("Introduzca una palabra (fin para terminar): ");
            palabra = sc.next().toLowerCase();
            sc.nextLine();
            if (palabra.equals("fin")) {
                seguir=false;
            }
            if (seguir) {
                System.out.println("Longitud: " + calcularLongitud(palabra));
                convertirMayusculas(palabra);
                convertirMinusculas(palabra);
                sacarSubcadena(palabra);
                System.out.print("Introduce un carácter a comprobar en la palabra: ");
                char caracter = sc.nextLine().charAt(0);
                System.out.println("Caracter introducido: " + caracter);
                System.out.println("Cantidad de " + caracter + " en " + palabra + " : "+contarCaracteres(palabra, caracter));
            }
        }while (seguir);
    }

    public static int calcularLongitud(String palabra) {
        return palabra.length();
    }

    public static void convertirMayusculas(String palabra){
        System.out.println(palabra.toUpperCase());
    }

    public static void convertirMinusculas(String palabra) {
        System.out.println(palabra.toLowerCase());
    }

    public static void sacarSubcadena(String palabra){
        System.out.println(palabra.substring(1, 3));
    }

    public static int contarCaracteres(String palabra, char caracter) {
        int cont = 0;
        boolean seguir = true;
        while (seguir) {
            int pos = palabra.indexOf(caracter);
            if (pos != -1) {
                cont++;
                palabra = palabra.substring(pos+1);
            }else {
                seguir=false;
            }
        }
        return cont;
    }
}
