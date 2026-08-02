package Capitulo7.P2;

public class Loro extends Aves{
    protected boolean salvaje;

    public Loro(String especie, String color, boolean salvaje) {
        super(especie, color);
        this.salvaje = salvaje;
    }

    @Override
    public void caminar() {
        super.caminar();
        System.out.println("Esto es un loro y puede caminar.");
    }

    @Override
    public void volar() {
        super.volar();
        System.out.println("Esto es un loro y puede volar.");
    }


}
