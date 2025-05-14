import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class IncluiPublicacao {

    public IncluiPublicacao(String publicacao, List<Publicacao> publicacoes ) {
        if (publicacao.equals("Livro")) {
            String titulo = JOptionPane.showInputDialog("Título do Livro:");
            String autor = JOptionPane.showInputDialog("Autor do Livro:");
            int ano = Integer.parseInt(JOptionPane.showInputDialog("Ano do Livro:"));

            if (!titulo.isEmpty() && !autor.isEmpty() && ano >= 0) {
                publicacoes.add(new Livro(titulo, autor, ano));
            }
        }

        if (publicacao.equals("Revista")) {
            String titulo = JOptionPane.showInputDialog("Título da Revista:");
            int ano = Integer.parseInt(JOptionPane.showInputDialog("Ano da Revista:"));
            int volume = Integer.parseInt(JOptionPane.showInputDialog("Volume da Revista:"));
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Número da Revista:"));
            String org = JOptionPane.showInputDialog("Organização da Revista:");

            if (!titulo.isEmpty() && !org.isEmpty() && ano >= 0 && volume >= 0 && numero >= 0) {
                publicacoes.add(new Revista(titulo, ano, volume, numero, org));
            }
        }

        if (publicacao.equals("Filme")) {
            String titulo = JOptionPane.showInputDialog("Titulo do Filme:");
            int ano = Integer.parseInt(JOptionPane.showInputDialog("Ano do Filme:"));
            int duracao = Integer.parseInt(JOptionPane.showInputDialog("Duracao em minutos do filme"));
            String autor = JOptionPane.showInputDialog("Autor do Filme:");
            String genero = JOptionPane.showInputDialog("Genero do Filme:");

            if (!titulo.isEmpty() && !autor.isEmpty() && !genero.isEmpty() && ano >= 0 && duracao >= 0) {
                publicacoes.add(new Filme(titulo, ano, duracao, autor, genero));
            }
        }
    }
}