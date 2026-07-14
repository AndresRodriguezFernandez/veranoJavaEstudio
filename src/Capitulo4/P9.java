package Capitulo4;

public class P9 {
    static int cont = 0;
    static int[] ordenar(int[] vector) {
        if (vector[cont] > vector[cont+1]) {
            int numTemp = vector[cont+1];
            vector[cont+1] = vector[cont];
            vector[cont] = numTemp;
        }
        if (cont == vector.length-2){
            return vector;
        }
        cont++;
        return ordenar(vector);
    }

    public static void main(String[] args) {
        int[] vector = {2,6,1,7,4,3,9};
        ordenar(vector);
        for (int i = 0; i < vector.length; i++){
            System.out.print(vector[i] + " ");
        }
    }
}
