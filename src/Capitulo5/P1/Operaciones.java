package Capitulo5.P1;

public class Operaciones {
    private int a;
    private int b;

    public Operaciones(int a, int b){
        this.a = a;
        this.b = b;
    }

    public void suma(int a, int b) {
        System.out.println("El resultado de la suma es: " + (a+b));
    }

    public void resta(int a, int b) {
        System.out.println("El resultado de la resta es: " + (a-b));
    }

    public void multiplicacion(int a, int b) {
        System.out.println("El resultado de la multiplicación es: " + (a*b));
    }

    public void dividir(int a, int b) {
        if (b != 0) {
            System.out.println("El resultado de la división es: " + (a/b));

        }else {
            System.out.println("No se puede dividir entre 0.");
        }
    }
}
