package Capitulo4;

public class P5 {
    public boolean esCapicua(int num) {
        int numero = num;
        int invertido = 0;
        while (numero > 0) {
            invertido += numero%10;
            numero /=10;
        }
        if (invertido == num) {
            return true;
        }
        return false;
    }

    public boolean esPrimo(int num) {
        boolean primo = true;
        for (int i = 2; i < num-1; i++) {
            if ((num % i) == 0) {
                primo = false;
            }
        }
        return primo;
    }

    public int siguientePrimo(int num) {
        int primo = num;
        while (!esPrimo(primo)) {
            primo++;
            esPrimo(primo);
        }
        return primo;
    }

    public int potencia(int base, int exp) {
        int mult = base;
        if (exp == 0) {
            return 1;
        }else {
            for (int i = 1; i < exp; i++) {
                mult = mult * base;
            }
        }
        return mult;
    }

    public int digitos(int num) {
        int cont = 1;
        for (int i = num; i > 10; i++) {
            i/=10;
            cont++;
        }
        return cont;
    }

    public static void main(String[] args) {
        P5 p5 = new P5();
        int num = 20;
        System.out.println(p5.digitos(50));
    }
}
