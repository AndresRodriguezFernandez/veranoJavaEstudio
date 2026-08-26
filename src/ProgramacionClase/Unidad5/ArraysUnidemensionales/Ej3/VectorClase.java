package ProgramacionClase.Unidad5.ArraysUnidemensionales.Ej3;

import java.util.Scanner;

public class VectorClase {
    int[] vector1 = new int[5];
    int[] vector2 = new int[5];


    public void cargar(Scanner sc) {
        System.out.println("------ Carga del vector 1 ------");
        for (int i = 0; i < vector1.length; i++) {
            System.out.print("Introduce un valor para la posición " +i+" : ");
            vector1[i] = sc.nextInt();
        }
        System.out.println("----Carga del vector 2-----");
        for (int i = 0; i < vector2.length; i++) {
            System.out.print("Introduce un valor para la spocion " +i+" : " );
            vector2[i] = sc.nextInt();
        }
    }

    public int multiplicar(int num1, int num2) {
        return num1*num2;
    }

    public int[] crearNuevoVector() {

        int[] vector3 = new int[vector1.length];
        int j = vector2.length-1;
        for (int i = 0; i < vector3.length; i++){
            vector3[i] = multiplicar(vector1[i], vector2[j]);
            j--;
        }
        return vector3;
    }

    public void visualizar(int[] vectorFinal) {
        for (int i = 0; i < vectorFinal.length; i++) {
            System.out.print(vectorFinal[i] + " ");
        }
    }

}
