/*import javax.swing.*;
import java.awt.*;

public class Listagem {
    public  void Listagem(JFrame janelaListagem, JTextArea texto, List<Publicacao> publicacoes) {
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
}*/
