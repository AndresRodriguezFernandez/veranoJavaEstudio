package Capitulo7.P2;

public class Aves implements PuedeVolar, PuedeCaminar{
    protected String especie;
    protected String color;

    public Aves(String especie, String color) {
        this.especie = especie;
        this.color = color;
    }

    @Override
    public void caminar() {
        System.out.println("Esto es un ave y puede caminar.");
    }

    @Override
    public void volar() {
        System.out.println("Esto es un ave y puede volar.");
    }

    public void mostrarInfo(){
        caminar();
        volar();
    }
}
