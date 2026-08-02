package Capitulo7.P2;

public class Felino extends Mamiferos implements PuedeNadar{

    public Felino(String especie, String color) {
        super(especie, color);
    }

    @Override
    public void caminar() {
        super.caminar();
        System.out.println("Es un felino y puede caminar.");
    }

    @Override
    public void nadar() {
        System.out.println("Es un felino y puede nadar.");
    }

    public void mostrarInfo(){
        caminar();
        nadar();
    }
}
