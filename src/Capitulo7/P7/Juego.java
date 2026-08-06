package Capitulo7.P7;

public class Juego {
    private Revolver revolver;
    protected Jugador[] jugadores;

    public Juego(Revolver revolver, Jugador[] jugadores) {
        this.revolver = revolver;
        this.jugadores = jugadores;
    }

    public boolean finJuego(){
        boolean muerto = false;
        for (int i = 0; i < jugadores.length; i++){
            if (!jugadores[i].isVivo()) {
                muerto = true;
            }
        }
        return muerto;
    }

    public void ronda(){
        boolean fin = false;
        int ronda = 1;
        while (!fin) {
            System.out.println("-----------------RONDA "+ronda+"----------------");
            for (int i = 0; i < jugadores.length; i++) {
                if (jugadores[i].disparar(revolver)) {
                    System.out.println("El jugador " +jugadores[i].getNombre() + " se ha apuntado y se ha eliminado");
                    fin = true;
                    jugadores[i].setVivo(false);
                }else {
                    System.out.println("El jugador " + jugadores[i].getNombre() + " se ha apuntado y no se ha eliminado. Siguiente turno");
                }
                revolver.siguienteBala();
                if (finJuego()){
                    break;
                }
            }
            ronda++;

        }
    }
}
