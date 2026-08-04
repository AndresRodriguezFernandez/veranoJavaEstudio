package Capitulo7.P5;

public class Serie implements Entregable{
    private String titulo;
    private int numTemporadas;
    private boolean entregado;
    private String genero;
    private String creador;

    private final int TEMPORADAS_CONST = 3;
    private final boolean ENTREGADO_CONST = false;
    private final String TITULO_CONST = null;
    private final String GENERO_CONST = null;
    private final String CREADOR_CONST = null;

    public Serie(){
        this.titulo=TITULO_CONST;
        this.numTemporadas= TEMPORADAS_CONST;
        this.entregado=ENTREGADO_CONST;
        this.genero=GENERO_CONST;
        this.creador=CREADOR_CONST;
    }

    public Serie(String titulo, String creador) {
        this.titulo=titulo;
        this.creador=creador;
        this.numTemporadas=TEMPORADAS_CONST;
        this.genero=GENERO_CONST;
        this.entregado=ENTREGADO_CONST;
    }

    public Serie(String titulo, int numTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numTemporadas = numTemporadas;
        this.genero = genero;
        this.creador = creador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumTemporadas() {
        return numTemporadas;
    }

    public void setNumTemporadas(int numTemporadas) {
        this.numTemporadas = numTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
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
        if (this.numTemporadas > ((Serie) a).getNumTemporadas()) {
            return +1;
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", numTemporadas=" + numTemporadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
                '}';
    }
}
