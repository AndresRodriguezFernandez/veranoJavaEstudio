package ProgramacionClase.Unidad5.ArraysBidimensionales.Ej4;

import java.util.Scanner;

public class Matriz {
    private int[][] notas = new int[3][5];

    public void cargarMatriz(Scanner sc) {
        System.out.println("-------Cargar matriz de notas:------");
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print("Introduce una nota: ");
                notas[i][j] = sc.nextInt();
            }
        }
    }

    public String[] cargarVector(Scanner sc) {
        String[] modulos = new String[3];
        System.out.println("-------Cargar vector de módulos:--------");
        for (int i = 0; i < modulos.length; i++) {
            System.out.print("Introduce el nombre del módulo: ");
            modulos[i] = sc.nextLine();
        }
        return modulos;
    }

    public int[][] getNotas() {
        return notas;
    }
}
