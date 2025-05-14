public class Filme extends Publicacao{
    private int duracao;
    private String autor;
    private String genero;

    public Filme(String titulo, int ano, int duracao, String autor, String genero) {
        super(titulo, ano);
        this.duracao = duracao;
        this.autor = autor;
        this.genero = genero;
    }

    public String toString() {
        return "FILME | Titulo: " + titulo + " | Ano: " + ano + " | Autor: " + autor + " | Duracao: " + duracao + " | Genero: " + genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
}
