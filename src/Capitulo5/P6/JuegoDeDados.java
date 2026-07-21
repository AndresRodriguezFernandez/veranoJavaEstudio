package Capitulo5.P6;

public class JuegoDeDados {
    static Dado d1;
    static Dado d2;
    static Dado d3;

    public static void definirObjetos() {
        d1= new Dado();
        d2 = new Dado();
        d3 = new Dado();
    }

    static void tiradaDados() {
        d1.setValor();
        d1.imprimirValor();
        d2.setValor();
        d2.imprimirValor();
        d3.setValor();
        d3.imprimirValor();
        if (d1.retornarValor() == d2.retornarValor() ) {
            if (d2.retornarValor() == d3.retornarValor()) {
                System.out.println("¡Has ganado la partida!");
            }else {
                System.out.println("Inténtalo de nuevo");
            }
        }else {
            System.out.println("Inténtalo de nuevo");
        }
    }

    public static void main(String[] args) {
        definirObjetos();
        tiradaDados();
    }
}
