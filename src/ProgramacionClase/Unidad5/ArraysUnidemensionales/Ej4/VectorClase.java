package ProgramacionClase.Unidad5.ArraysUnidemensionales.Ej4;

import java.util.Scanner;

public class VectorClase {
    int[] vector1 = new int[5];
    int[] vector2 = new int[3];

    public void cargar(Scanner sc) {
        System.out.println("----Carga del vector 1-----");
        for (int i = 0; i < vector1.length; i++) {
            System.out.print("Introduce un valor para la posición " +i+ " : ");
            vector1[i] = sc.nextInt();
        }
        System.out.println("----Carga del vector 2-----");
        for (int i = 0; i < vector2.length; i++) {
            System.out.print("Introduce un valor para la posición "+i+" : ");
            vector2[i] = sc.nextInt();
        }
    }

    public void buscar() {
        int num;
        for (int i = 0; i < vector1.length; i++) {
            boolean pos = false;
            num = vector1[i];
            for (int j = 0; j < vector2.length; j++) {
                if (vector2[j] == num) {
                    pos = true;
                    System.out.println("El número "+num+" está en la posición "+j);
                    break;
                }
            }
            if (!pos) {
                System.out.println("El elemento "+num+ " no existe.");
            }
        }
    }
}
