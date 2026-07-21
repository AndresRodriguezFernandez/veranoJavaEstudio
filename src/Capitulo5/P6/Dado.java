package Capitulo5.P6;

public class Dado {
    private int valor;


    public void setValor(){
        this.valor = (int) ((Math.random()*6)+1);
    }

    public void imprimirValor(){
        System.out.println(this.valor);
    }

    public int retornarValor(){
        return this.valor;
    }
}
