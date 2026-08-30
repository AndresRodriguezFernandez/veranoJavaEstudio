package ProgramacionClase.Unidad5.ArraysBidimensionales.Ej2;

import java.util.Scanner;

public class Principal {
    public static void visualizar(int[][] primera, int[][] segunda) {
        System.out.println("---Primera matriz---");
        for (int i = 0; i < primera.length; i++){
            for (int j = 0; j < primera[i].length; j++) {
                System.out.print(primera[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("----Segunda matriz-----");
        for (int i = 0; i < segunda.length; i++){
            for (int j = 0; j < segunda[i].length; j++) {
                System.out.print(segunda[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matriz mat = new Matriz();
        visualizar(mat.cargar(sc), mat.crear());
    }
}
