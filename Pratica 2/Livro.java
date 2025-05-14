public class Livro extends Publicacao{
    private String autor;

    public Livro(String titulo, String autor, int ano){
        super(titulo, ano);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String toString(){return "LIVRO | Titulo: " + titulo + " | Ano: " + ano + " | Autor: " + autor;}
}