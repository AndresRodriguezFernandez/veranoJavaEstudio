package Capitulo1;

import java.util.Random;

public class P8 {
    public static void main(String[] args) {
        Random random = new Random();
        int numero = random.nextInt(26);
        char letra =(char) ('A'+numero);
        System.out.println(letra);
        boolean vocal = false;
        vocal = (letra == 'A' || letra =='E' || letra == 'I' || letra == 'O' || letra == 'U');
        System.out.println("¿la letra es vocal?: " +vocal);
    }
}
