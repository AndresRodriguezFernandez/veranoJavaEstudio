package Capitulo7.P5;

public class Principal {
    public static void main(String[] args) {
        int contVideojuegos = 0;
        int contSeries = 0;
        Serie[] series = new Serie[5];
        Videojuego[] videojuegos = new Videojuego[5];
        series[0] = new Serie();
        series[1] = new Serie("The rookie", "Andrés R.");
        series[2] = new Serie("Hawai 5.0",7 , "Acción", "Andrés F.");
        series[3] = new Serie("El juego del calamar", 2, "Drama y acción", "Andrés R.F");
        series[4] = new Serie();

        videojuegos[0] = new Videojuego();
        videojuegos[1] = new Videojuego("Euro Truck Simulator 2", 1000);
        videojuegos[2] = new Videojuego("Grand Theft Auto VI", 50);
        videojuegos[3] = new Videojuego("Counter Strike 2", 0);
        videojuegos[4] = new Videojuego("Red Dead Redemption 2", 78, "Acción", "GOYA Software & Solutions");

        videojuegos[1].entregar();
        videojuegos[2].entregar();

        series[1].entregar();

        for (int i = 0; i < videojuegos.length; i++) {
            if (videojuegos[i].isEntregado()){
                contVideojuegos++;
                System.out.println(videojuegos[i].toString());
            }
        }
        System.out.println(contVideojuegos + " videojuegos entregados.");

        for (int i = 0; i < series.length; i++) {
            if (series[i].isEntregado()){
                contSeries++;
                System.out.println(series[i].toString());
            }
        }
        System.out.println(contSeries + " series entregadas." + "\n------------------------------------------------------------------");

        Videojuego vidMayor = videojuegos[0];
        for (int i = 0; i < videojuegos.length; i++){
            if (videojuegos[i].compareTo(vidMayor) == +1) {
                vidMayor = videojuegos[i];
            }
        }
        System.out.println(vidMayor.getTitulo() + " es el videojuego más largo con un total de " + vidMayor.getHorasEstimadas() + " horas de juego estimadas." + "\n" + vidMayor.toString());

        Serie serieMayor = series[0];
        for (int i = 0; i < series.length; i++){
            if (series[i].compareTo(serieMayor) == +1) {
                serieMayor = series[i];
            }
        }
        System.out.println(serieMayor.getTitulo() + " es la serie más larga con " + serieMayor.getNumTemporadas() + " temporadas." + "\n" + serieMayor.toString());
    }
}
