package main.java;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

//import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class Window extends JFrame {

	private GamePanel gamePanel;

	private JPanel mainPanel;

	public Window() {

		add(getMainPanel());
		setSize(640, 510);
		setTitle("Conway's Game of Life");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setVisible(true);

	}

	private JPanel getMainPanel() {
		if (mainPanel == null) {
			mainPanel = new JPanel(new GridBagLayout());
			mainPanel.add(getGamePanel(), new GridBagConstraints(0, 0, 1, 1, 1, 1, GridBagConstraints.CENTER,
					GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));
	//		JButton b = new JButton("Test");
	//		b.addActionListener(e -> gamePanel.setRunning(!gamePanel.isRunning()));
	//		mainPanel.add(b, new GridBagConstraints(0, 1, 1, 1, 1, 1, GridBagConstraints.CENTER,
	//				GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));
			gamePanel.setRunning(true);
		}

		return mainPanel;
	}

	private GamePanel getGamePanel() {
		if (gamePanel == null) {
			gamePanel = new GamePanel(640, 480);
		}
		return gamePanel;
	}
}