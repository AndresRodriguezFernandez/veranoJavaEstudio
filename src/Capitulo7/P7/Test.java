package Capitulo7.P7;

import java.util.Scanner;

public class Test {
    static Scanner sc = new Scanner(System.in);
    static private int numeroJugadores;

    public static int numJugadores() {
        System.out.println("Introduce un número de jugadores (entre 1 y 6): ");
        numeroJugadores = sc.nextInt();
        if (numeroJugadores <= 0 || numeroJugadores > 6) {
            numeroJugadores = 6;
        }
        return numeroJugadores;
    }

    public static void main(String[] args) {
        Revolver r = new Revolver();
        int num = numJugadores();
        Jugador[] jugadores = new Jugador[num];
        for (int i = 0; i < jugadores.length; i++) {
            jugadores[i] = new Jugador(i+1);
        }
        Juego juego = new Juego(r, jugadores);
        juego.ronda();
    }
}
