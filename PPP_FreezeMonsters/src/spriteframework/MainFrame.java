package spriteframework;

import javax.swing.JFrame;
import javax.swing.*;


public class MainFrame extends JFrame {

	public MainFrame(String title) {
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(Commons.BOARD_WIDTH, Commons.BOARD_HEIGHT);
		setLocationRelativeTo(null);
		setResizable(false);
		add(createBoard());
		setVisible(true);
	}

	protected AbstractBoard createBoard() {
		return null;
	}
}