import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.ArrayList;

public class Janela {
    private JFrame janelaListagem;
    private List<Publicacao> publicacoes = new ArrayList<>();
    private JTextArea texto;

    public Janela() {
        JFrame janela = new JFrame("Inicio");
        janela.setSize(400, 100);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLayout(new FlowLayout());

        texto = new JTextArea(10, 30); // Inicializando o JTextArea
        texto.setEditable(false);

        JButton botaoRevista = new JButton("Revista");
        JButton botaoListagem = new JButton("Listagem");
        JButton botaoLivros = new JButton("Livros"); // botao livro
        JButton botaoFilme = new JButton("Filmes");

        JPanel painel = new JPanel();
        painel.add(botaoRevista);
        painel.add(botaoLivros);
        painel.add(botaoFilme); // botao novo no painel para o livro
        painel.add(botaoListagem);
        janela.add(painel);

        botaoRevista.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                IncluiPublicacao i = new IncluiPublicacao("Revista", publicacoes);
            }
        });

        botaoLivros.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                IncluiPublicacao i = new IncluiPublicacao("Livro", publicacoes);
            }
        });

        botaoFilme.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {IncluiPublicacao i = new IncluiPublicacao("Filme", publicacoes);}
        });

        botaoListagem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listarPublicacoes();
            }
        });

        janela.setVisible(true);
    }

    /*private void incluirLivro() {
        String titulo = JOptionPane.showInputDialog("Título do Livro:");
        String autor = JOptionPane.showInputDialog("Autor do Livro:");
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Ano do Livro:"));

        if (!titulo.isEmpty() && !autor.isEmpty() && ano >= 0) {
            publicacoes.add(new Livro(titulo, autor, ano));
        }
    }

    private void incluirRevista() {
        String titulo = JOptionPane.showInputDialog("Título da Revista:");
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Ano da Revista:"));
        int volume = Integer.parseInt(JOptionPane.showInputDialog("Volume da Revista:"));
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Número da Revista:"));
        String org = JOptionPane.showInputDialog("Organização da Revista:");

        if (!titulo.isEmpty() && !org.isEmpty() && ano >= 0 && volume >= 0 && numero >= 0) {
            publicacoes.add(new Revista(titulo, ano, volume, numero, org));
        }
    }

    private void incluirFilme (){ // funcao nova para incluir filme na listagem
        String titulo = JOptionPane.showInputDialog("Titulo do Filme:");
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Ano do Filme:"));
        int duracao = Integer.parseInt(JOptionPane.showInputDialog("Duracao em minutos do filme"));
        String autor = JOptionPane.showInputDialog("Autor do Filme:");
        String genero = JOptionPane.showInputDialog("Genero do Filme:");

        if (!titulo.isEmpty() && !autor.isEmpty() && !genero.isEmpty() && ano >= 0 && duracao >= 0) {
            publicacoes.add(new Filme(titulo, ano, duracao, autor, genero));
        }
    }*/

    private void listarPublicacoes() {
        if (janelaListagem == null) {
            janelaListagem = new JFrame("Listagem");
            janelaListagem.setSize(500, 300);
            janelaListagem.setLayout(new FlowLayout());

            texto = new JTextArea(14, 40);
            texto.setEditable(false);
            JScrollPane scrollPane = new JScrollPane(texto);
            janelaListagem.add(scrollPane);

            JButton botaoFechar = new JButton("Fechar");
            botaoFechar.addActionListener(e -> {
                janelaListagem.dispose();
                janelaListagem = null; // Resetar a variável para próxima abertura
            });

            janelaListagem.add(botaoFechar);
        }

        texto.setText(""); // Limpa antes de exibir
        for (Publicacao p : publicacoes) {
            texto.append(p.toString() + "\n");
        }

        janelaListagem.setVisible(true);
    }
}