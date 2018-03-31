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
 * @author Ashley Schuelein, Joseph Miller
 */
public class SettingsFrame extends JFrame {

	JLabel settingsLabel = new JLabel("Welcome to the Settings Menu");
	JPanel settingsPanel = new JPanel();
	JButton account = new JButton("Account");

	/**
	 * Constructor to make the settings menu
	 */
	public SettingsFrame() {
		super("Smart Oven");
		setResizable(false);

		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

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
		 * Method for implementing action for JButton in GUI
		 * @param ActionEvent e 
		 */
		public void actionPerformed(ActionEvent e) {
			Account myAccount = new Account();
			myAccount.setVisible(true);
		}
	}
}
