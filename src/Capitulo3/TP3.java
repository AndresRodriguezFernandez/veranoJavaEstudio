package Capitulo3;

public class TP3 {
    public static void main(String[] args) {
        int[] notas = {1, 4, 7, 8, 9};
        int suma = 0;

        for (int i = 0; i < notas.length; i++) {
            suma+=notas[i];
            System.out.println(notas[i]);
        }
        //Usamos float para poder ver la media con decimales aunque también se podría usar double.
        float media = (float) suma / notas.length;
        System.out.println("La media de las notas anteriores es: " + media);
    }
}
