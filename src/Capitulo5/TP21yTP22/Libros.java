package Capitulo5.TP21yTP22;

public class Libros {
    private String titulo;
    private String autor;
    private int anio;


    Libros(String t, String a, int d) {
        titulo=t;
        autor=a;
        anio=d;
    }

    void mostrar(){
        System.out.println(titulo);
        System.out.println(autor);
        System.out.println(anio);
        System.out.println();
    }

    void mostrarPar(){
        System.out.println(titulo);
        System.out.println(anio);
    }

    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public int getAnio(){
        return anio;
    }

    public void setTitulo(String titulo){
        this.titulo=titulo;
    }

    public void setAutor(String autor){
        this.autor=autor;
    }

    public void setAnio(int anio){
        this.anio=anio;
    }

}
