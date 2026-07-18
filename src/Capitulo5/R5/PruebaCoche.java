package Capitulo5.R5;

public class PruebaCoche {
    public static void main(String[] args) {
        Coche ferrari = new Coche();

        System.out.println(ferrari.getVelocidad());
        ferrari.acelerar(50);
        System.out.println(ferrari.getVelocidad());

        ferrari.acelerar(100);
        System.out.println(ferrari.getVelocidad());

        ferrari.frenar(90);
        System.out.println(ferrari.getVelocidad());

    }
}
