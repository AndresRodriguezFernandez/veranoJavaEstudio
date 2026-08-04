package Capitulo7.P5;

public class Videojuego implements Entregable{
    private String titulo;
    private int horasEstimadas;
    private boolean entregado;
    private String genero;
    private String compannia;

    private final int HORAS_ESTIMADAS_CONST = 10;
    private final boolean ENTREGADO_CONST = false;
    private final String TITULO_CONST = null;
    private final String COMANNIA_CONST = null;
    private final String GENERO_CONST = null;

    public Videojuego(){
        this.titulo=TITULO_CONST;
        this.horasEstimadas=HORAS_ESTIMADAS_CONST;
        this.entregado=ENTREGADO_CONST;
        this.genero=GENERO_CONST;
        this.compannia=COMANNIA_CONST;
    }

    public Videojuego(String titulo, int horasEstimadas){
        this.titulo=titulo;
        this.horasEstimadas=horasEstimadas;
        this.genero=GENERO_CONST;
        this.compannia=COMANNIA_CONST;
        this.entregado=ENTREGADO_CONST;
    }

    public Videojuego(String titulo, int horasEstimadas, String genero, String compannia) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compannia = compannia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompannia() {
        return compannia;
    }

    public void setCompannia(String compannia) {
        this.compannia = compannia;
    }

    @Override
    public void entregar() {
        this.entregado=true;
    }

    @Override
    public void devolver() {
        this.entregado=false;
    }

    @Override
    public boolean isEntregado() {
        return entregado;
    }

    @Override
    public int compareTo(Object a) {
        if (this.horasEstimadas > ((Videojuego) a).getHorasEstimadas()) {
            return +1;
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "compannia='" + compannia + '\'' +
                ", genero='" + genero + '\'' +
                ", entregado=" + entregado +
                ", horasEstimadas=" + horasEstimadas +
                ", titulo='" + titulo + '\'' +
                '}';
    }
}
