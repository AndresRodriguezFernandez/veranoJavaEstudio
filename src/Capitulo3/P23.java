/*Crear una matriz 7x7 y rellenarla de forma que sea una matriz de identidad, es decir, que los elementos de la diagional
* sean 1 y el resto 0*/
package Capitulo3;

public class P23 {
    public static void main(String[] args) {
        int[][] matriz = new int[7][7];

        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[f].length; c++) {
                if (f == c) {
                    matriz[f][c] = 1;
                }else {
                    matriz[f][c] = 0;
                }
            }
        }

        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c <matriz[f].length; c++) {
                System.out.print(matriz[f][c]+" ");
            }
            System.out.println();
        }
    }
}
