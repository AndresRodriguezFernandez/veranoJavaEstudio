package Capitulo7.P2;

public class Tigre extends Felino{
    protected int patas;
    protected boolean salvaje;

    public Tigre(String especie, String color, int patas, boolean salvaje) {
        super(especie, color);
        this.patas = patas;
        this.salvaje = salvaje;
    }

    @Override
    public void nadar() {
        super.nadar();
        System.out.println("Es un tigre y puede nadar.");
    }

    @Override
    public void caminar() {
        super.caminar();
        System.out.println("Es un tigre y puede caminar.");
    }
}
