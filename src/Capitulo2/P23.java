package Capitulo2;

public class P23 {
    public static void main(String[] args) {
        int numero = 0;
        for (int i = 0; i < 5;) {
            numero+=1;
            if (numero % 2 == 0) {
                System.out.println(numero);
                i++;
            }
        }
    }
}
