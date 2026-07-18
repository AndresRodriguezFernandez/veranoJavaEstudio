package Capitulo5.R3;

public class Main {
    public static void main(String[] args) {
        Cuenta c = new Cuenta("Andrew");
        Cuenta c2 = new Cuenta("Paquito", 20);

        c.ingresar(200);
        c2.retirar(100);

        System.out.println(c);
        System.out.println(c2);
    }
}
