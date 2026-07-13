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

    public int voltea(int num) {
        int resto;
        int invertido = 0;
        while(num > 0) {
            resto = num%10;
            invertido = invertido*10 + resto;
            num/=10;
        }
        return invertido;
    }

    public int digitoN(int num, int n){
        String numero = String.valueOf(num);
        char caracter = numero.charAt(n);
        return caracter - '0';
    }

    public int posicionDigito(int num, char digito) {
        String numero = String.valueOf(num);
        return numero.indexOf(digito);
    }

    public int quitaPorDetras(int num, int digitos) {
        for (int i = 0; i < digitos; i++) {
            num/=10;
        }
        return num;
    }

    public int quitaPorDelante(int num, int digitos) {
        String numero = String.valueOf(num);
        return Integer.parseInt(numero.substring(digitos));
    }

    public int pegaPorDetras(int num, int digito) {
        String numero = String.valueOf(num) + String.valueOf(digito);
        return Integer.parseInt(numero);
    }

    public int pegaPorDelante(int num, int digito) {
        String numero = String.valueOf(num);
        return Integer.parseInt(String.valueOf(digito) + numero);
    }

    public int trozoDeNumero(int num, int ini, int fin) {
        String numero = String.valueOf(num);
        return Integer.parseInt(numero.substring(ini, fin));
    }

    public int pegaNumeros(int num1, int num2) {
        String numero1 = String.valueOf(num1);
        String numero2 = String.valueOf(num2);
        return Integer.parseInt(numero1 + numero2);
    }

    public static void main(String[] args) {
        P5 p5 = new P5();
        int num = 159;
        int n = 2;
        int digito = 6;
        System.out.println(p5.posicionDigito(234, '4'));
    }
}
