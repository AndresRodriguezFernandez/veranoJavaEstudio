package ProgramacionClase.Unidad5.ArraysObjetos3;

public class Vuelos {
    private int nVuelo;
    private String destino;
    private String compania;

    public Vuelos(int nVuelo, String destino, String compania) {
        this.nVuelo = nVuelo;
        this.destino = destino;
        this.compania = compania;
    }

    public int getnVuelo() {
        return nVuelo;
    }

    public void setnVuelo(int nVuelo) {
        this.nVuelo = nVuelo;
    }

    @Override
    public String toString() {
        return "Vuelos{" +
                "nVuelo=" + nVuelo +
                ", destino='" + destino + '\'' +
                ", compania='" + compania + '\'' +
                '}';
    }
}
