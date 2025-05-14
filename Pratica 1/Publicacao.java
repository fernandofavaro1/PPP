public abstract class Publicacao {
    protected String titulo;
    protected int ano;

    public Publicacao(String titulo, int ano){
        this.titulo = titulo;
        this.ano = ano;
    }

    public abstract String toString();
}
