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

        JButton botaoInclui = new JButton("Incluir");
        JButton botaoRevista = new JButton("Revista");
        JButton botaoListagem = new JButton("Listagem");
        JButton botaoLivros = new JButton("Livros");

        JPanel painel = new JPanel();
        painel.add(botaoRevista);
        painel.add(botaoListagem);
        painel.add(botaoLivros);
        janela.add(painel);

        botaoRevista.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                incluirRevista();
            }
        });

        botaoLivros.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                incluirLivro();
            }
        });

        botaoListagem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listarPublicacoes();
            }
        });

        janela.setVisible(true);
    }

    private void incluirLivro() {
        String titulo = JOptionPane.showInputDialog("Título do Livro:");
        String autor = JOptionPane.showInputDialog("Autor do Livro:");
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Ano do Livro:"));
        publicacoes.add(new Livro(titulo, autor, ano));
    }

    private void incluirRevista() {
        String titulo = JOptionPane.showInputDialog("Título da Revista:");
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Ano da Revista:"));
        int volume = Integer.parseInt(JOptionPane.showInputDialog("Volume da Revista:"));
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Número da Revista:"));
        String org = JOptionPane.showInputDialog("Organização da Revista:");
        publicacoes.add(new Revista(titulo, ano, volume, numero, org));
    }

    private void listarPublicacoes() {
        if (janelaListagem == null) {
            janelaListagem = new JFrame("Listagem");
            janelaListagem.setSize(400, 300);
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