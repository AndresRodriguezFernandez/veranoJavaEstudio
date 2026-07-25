package Capitulo5.Reto485;

import java.util.Scanner;

public class Principal {
    public static void calcularEtapas(int etapas, int[] distancias) {
        int suma = 0;
        for (int i = 0; i < distancias.length; i++) {
            suma+=distancias[i];
        }
        for (int i = 0; i < etapas; i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(suma);
            suma=suma-distancias[i];
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int etapas;
        int[] distancias;
        do {
            do {
                System.out.println("Introduce el número de etapas de la ruta: ");
                etapas = sc.nextInt();
            }while (etapas < 0 || etapas > 100);
            if (etapas > 0) {
                distancias = new int[etapas];
                System.out.println("Introduce las distancias de cada etapa, separadas por un espacio: ");
                sc.nextLine();
                String linea = sc.nextLine();
                String[] distanciasLinea = linea.split(" ");
                for (int i = 0; i < distancias.length; i++){
                    distancias[i] = Integer.parseInt(distanciasLinea[i]);
                }
                calcularEtapas(etapas, distancias);
            }
        }while (etapas != 0);

    }
}
