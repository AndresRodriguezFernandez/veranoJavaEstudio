package Capitulo7.P2;

public class Principal {
    public static void main(String[] args) {
        Gato gato = new Gato("Naranja", "Naranja", 4, false);
        Loro loro = new Loro("Común", "rojo", true);
        Avestruz avestruz = new Avestruz("Rapaz", "blanca", true);
        Murcielago murcielago = new Murcielago("Común", "Negro",2, true);
        Tigre tigre = new Tigre("Salvaje", "Naraja", 4, true);
        System.out.println("-----Gato-----");
        gato.mostrarInfo();
        System.out.println("-----Loro-----");
        loro.mostrarInfo();
        System.out.println("-----Avestruz-----");
        avestruz.mostrarInfo();
        System.out.println("-----Murciélago-----");
        murcielago.mostrarInfo();
        System.out.println("-----Tigre-----");
        tigre.mostrarInfo();
    }
}
