package Capitulo4;

public class P9 {
    static int[] ordenar(int[] vector, int cont, int cont2) {
        if (vector.length == 1) {
            return vector;
        }
        if (cont2 == 0) {
            return vector;
        }
        if (cont == vector.length-1){
            cont2--;
            cont = 0;
        }

        if (vector[cont] > vector[cont+1]) {
            int temp = vector[cont+1];
            vector[cont+1] = vector[cont];
            vector[cont] = temp;
        }

        return ordenar(vector, ++cont, cont2);
    }

    public static void main(String[] args) {
        int[] vector = {2, 90, 40, 3, 6, 7,84, 1, 56, 2342, 678, 1, 67, 8,5, 13, 6};
        ordenar(vector, 0, vector.length-1);
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
    }
}
