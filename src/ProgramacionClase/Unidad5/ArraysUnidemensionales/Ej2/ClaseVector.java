package ProgramacionClase.Unidad5.ArraysUnidemensionales.Ej2;
import java.util.Scanner;

public class ClaseVector {
    private int tamano;

    public void leerTamano(Scanner sc) {
        do {
            System.out.println("Introduce el tamaño del vector: ");
            tamano = sc.nextInt();
        }while (tamano % 2 != 0);
    }

    public int[] cargarVector(Scanner sc){
        int[] vec = new int[this.tamano];
        for (int i = 0; i < vec.length; i++){
            System.out.println("Introduce un valor para la posición " + i +" : ");
            vec[i] = sc.nextInt();
        }
        return vec;
    }

    public int[] crearVector(int[] vector1) {
        int[] vector2 = new int[vector1.length];
        for (int i = 0; i < vector1.length; i++){
            if (i % 2==0) {
                for (int j = 0; j < vector2.length; j++) {
                    if (j % 2 != 0) {
                        vector2[j] = vector1[i]*6;
                    }
                }
            }else {
                for (int k = 0; k < vector2.length; k++) {
                    if (k % 2 == 0){
                        vector2[k] = vector1[i]+2;
                    }
                }
            }
        }
        return vector2;
    }

    public void visualizarVector(int[] vector1, int[] vector2) {
        System.out.println("----Vector1----");
        for (int i: vector1) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("-----Vector2-----");
        for (int i: vector2){
            System.out.print(i + " ");
        }
    }
}
