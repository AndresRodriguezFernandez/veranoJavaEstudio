package Capitulo5.R5;

public class Coche {
    private int velocidad;

    Coche() {
        velocidad = 0;
    }

    public int getVelocidad(){
        return velocidad;
    }

    public void acelerar(int mas) {
        this.velocidad += mas;
    }

    public void frenar(int menos) {
        this.velocidad -= menos;
    }
}
