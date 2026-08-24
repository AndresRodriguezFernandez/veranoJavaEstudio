package ProgramacionClase.Unidad4.InterfaceVehiculos;

public class Principal {

    public static void main(String[] args) {
        Automovil autoVan = new Automovil("Mercedes", "G63", 2020, 17000, "van", 6);
        Automovil auto = new Automovil("Opel", "Astra", 2001, 170000, "Normal", 12);
        Motocicleta moto = new Motocicleta("Honda", "SI", 2017, 20000, "Repartidor");
        Camion volvo = new Camion("Volvo", "FH6", 2022, 400000, 1, 2);

        System.out.println(autoVan.toString() + "\nCumple las medidas: " + autoVan.coumplien_medidas());
        System.out.println(auto.toString() + "\nCumple las medidas: " + auto.coumplien_medidas());
        System.out.println(moto.toString());
        System.out.println(volvo.toString() + "\nCumple las medidas: " + volvo.coumplien_medidas());
    }
}
