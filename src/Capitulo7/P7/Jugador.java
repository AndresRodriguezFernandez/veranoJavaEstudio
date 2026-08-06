package Capitulo7.P7;

public class Jugador {
    private int id;
    private String nombre;
    private boolean vivo;

    public Jugador(int id) {
        this.id = id;
        this.nombre = "Jugador " + id;
        this.vivo = true;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public boolean disparar(Revolver r) {
        boolean jugadorEliminado;
        if (r.disparar()) {
            jugadorEliminado = true;
        }else {
            jugadorEliminado = false;
        }
        return jugadorEliminado;
    }
}
