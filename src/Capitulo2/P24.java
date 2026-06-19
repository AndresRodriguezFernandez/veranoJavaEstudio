package Capitulo2;

public class P24 {
    public static void main(String[] args) {
        for (int m = 0; m <= 10 ; m++) {
            System.out.println("Tabla del " + m);
            for (int i = 0; i <= 10;i++ ) {
                int res = m*i;
                System.out.println(m + " x " + i + " : " + res);
            }
            System.out.println("----------------------");
        }
    }
}
