package Capitulo7.P2;

public class Gato extends Felino{
    protected int patas;
    protected boolean salvaje;

    public Gato(String especie, String color, int patas, boolean salvaje) {
        super(especie, color);
        this.patas = patas;
        this.salvaje = salvaje;
    }

    @Override
    public void nadar() {
        super.nadar();
        System.out.println("Es un gato y puede nadar.");
    }

    @Override
    public void caminar() {
        super.caminar();
        System.out.println("Es un gato y puede caminar.");
    }
}
