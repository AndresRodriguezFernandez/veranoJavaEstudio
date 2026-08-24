package ProgramacionClase.Unidad4.FlotaAutomovilistica;

public class Principal {
    public static void main(String[] args) {
        Camion camion = new Camion("1234 ABC", 18, 280000, "Negro", 15.3, Motor.DIESEL);
        Moto honda = new Moto("1234 CDF", 6780.99, "Roja", true);
        Moto scooter = new Moto("7890 FHJ", 3, 5400, "Negra", false);

        System.out.println("-------Datos de la moto Scooter-------");
        System.out.println(scooter.toString());
        System.out.println("-------Datos de la moto Honda---------");
        System.out.println(honda.toString());
        System.out.println("-------Datos del camión------------");
        System.out.println(camion.toString());
    }
}
