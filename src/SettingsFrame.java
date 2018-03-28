import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Class for the settings menu window
 * 
 * @author Ashley Schuelein
 */
public class SettingsFrame extends JFrame {

	/**
	 * Constructor to make the settings menu
	 */
	public SettingsFrame() {
		super("Smart Oven");
		setResizable(false);

		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

		JLabel settingsLabel = new JLabel("Welcome to the Settings Menu");
		JPanel settingsPanel = new JPanel();
		JButton account = new JButton("Account");
		account.setBounds(80, 100, 100, 25);
		account.addActionListener(new ButtonListener());
		setSize(600, 300);
		settingsPanel.add(settingsLabel);
		settingsPanel.add(account);
		add(settingsPanel);
		setLayout(new FlowLayout());
		setLocationRelativeTo(null);
		setVisible(true);

		setLayout(new BorderLayout());
		JLabel background = new JLabel(new ImageIcon("grad.png"));
		add(background);
		background.setLayout(new FlowLayout());
	}

	/**
	 * Private class for Button actions
	 * 
	 * @author Ashley Schuelein
	 */
	private class ButtonListener implements ActionListener {
		@Override

		/**
		 * @param ActionEvent
		 *            e Method for implementing action for JButton in GUI
		 */
		public void actionPerformed(ActionEvent e) {
			Account myAccount = new Account();
			myAccount.setVisible(true);
		}
	}
}
