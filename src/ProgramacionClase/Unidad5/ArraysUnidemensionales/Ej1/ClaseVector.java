package ProgramacionClase.Unidad5.ArraysUnidemensionales.Ej1;

import java.util.Scanner;

public class ClaseVector {
    private int[] vector1 = new int[5];
    private int[] vector2 = new int[5];
    private int[] vector3 = new int[5];

    public void cargarVector(Scanner sc) {
        System.out.println("---- Carga del Vector 1 ------");
        for (int i = 0; i < vector1.length; i++) {
            System.out.print("Introduce un valor para la posción "+i+" :");
            vector1[i] = sc.nextInt();
        }
        System.out.println("---- Carga del Vector 2 ------");
        for (int i = 0; i < vector2.length; i++) {
            System.out.print("Introduce un valor para la posición "+i+": ");
            vector2[i] = sc.nextInt();
        }
        System.out.println("--- Carga finalizada -----");
    }

    public void sumarVectores() {
        for (int i = 0; i < vector2.length; i++) {
            vector3[i] = this.vector1[i]+this.vector2[i];
        }
        System.out.println("--- Suma y carga finalizada ----");
    }

    public void visualizarVector() {
        System.out.println("---- Vector 1 ------");
        for (int i : vector1){
            System.out.print(i +" ");
        }
        System.out.println();
        System.out.println("---- Vector 2 ------");
        for (int i : vector2){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("---- Vector 3 ------");
        for (int i : vector3){
            System.out.print(i+" ");
        }
    }
}
