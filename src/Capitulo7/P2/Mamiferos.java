package Capitulo7.P2;

public class Mamiferos implements PuedeCaminar{
    protected String especie;
    protected String color;

    public Mamiferos(String especie, String color) {
        this.especie = especie;
        this.color = color;
    }

    @Override
    public void caminar() {
        System.out.println("Esto es un mamífero y puede caminar.");
    }

    public void mostrarInfo(){
        caminar();
    }
}
