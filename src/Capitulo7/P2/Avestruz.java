package Capitulo7.P2;

public class Avestruz extends Aves {
    protected boolean salvaje;

    public Avestruz(String especie, String color, boolean salvaje) {
        super(especie, color);
        this.salvaje = salvaje;
    }

    @Override
    public void caminar() {
        super.caminar();
        System.out.println("Esta es una avestruz y puede caminar.");
    }

    @Override
    public void volar() {
        super.volar();
        System.out.println("Esta es una avestruz y NO puede volar.");
    }
}
