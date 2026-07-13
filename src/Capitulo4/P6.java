package Capitulo4;

public class P6 {
    static boolean primo;
    static boolean esPrimo(int numero, int divisor) {
        if (numero < 2){
            return false;
        }
        if (divisor == 1) {
            return true;
        }
        if (numero % divisor == 0) {
            return false;
        }
        return esPrimo(numero, divisor-1);
    }

    public static void main(String[] args) {
        System.out.println("47: " + esPrimo(47, 47-1));
        System.out.println("49: " + esPrimo(49, 49-1));
    }
}
