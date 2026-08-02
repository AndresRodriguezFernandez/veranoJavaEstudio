package Capitulo7.P2;

public class Murcielago extends Mamiferos implements PuedeVolar{
    protected int patas;
    protected boolean salvaje;

    public Murcielago(String especie, String color, int patas, boolean salvaje) {
        super(especie, color);
        this.patas = patas;
        this.salvaje = salvaje;
    }

    @Override
    public void volar() {
        System.out.println("Es un murciélago y puede volar.");
    }

    @Override
    public void caminar() {
        super.caminar();
        System.out.println("Es un murciélago y puede caminar.");
    }

    public void mostrarInfo(){
        volar();
        caminar();
    }
}
