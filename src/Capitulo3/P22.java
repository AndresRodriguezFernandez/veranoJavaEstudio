/*Crear una matriz "marco" de tamaño 8x6: todos sus elementos deben ser 0 salvo los de los bordes que deben ser 1.
* Mostrarla*/
package Capitulo3;

public class P22 {
    public static void main(String[] args) {
        int[][] matriz = new int[8][6];

        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[f].length; c++) {
                if (f == 0 || f == matriz.length - 1) {
                    matriz[f][c] = 1;
                } else if (c == 0 || c == matriz[f].length - 1) { //esto lo podría haber juntado en el if de arriba con otro "||"
                    matriz[f][c] = 1;
                }else {
                    matriz[f][c] = 0;
                }
            }
        }

        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[f].length; c++) {
                System.out.print(matriz[f][c] + " ");
            }
            System.out.println();
        }
    }
}
