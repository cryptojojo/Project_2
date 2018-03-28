import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * Class for making a user account from settings
 * 
 * @author Ashley Schuelein
 */
public class Account extends JFrame {

	private JPanel user;
	private JLabel userLabel, ovenLabel;
	private JTextField userName;
	private JTextField userOven;
	private JButton addNewUser;

	/**
	 * Constructor for making an account from settins menu
	 */
	public Account() {
		super("Smart Oven");
		/**
		 * Main class to run the Smart Oven GUI
		 * 
		 * @author Ashley Schuelein
		 */
		user = new JPanel();
		setSize(800, 400);
		userLabel = new JLabel("User Name: ");
		ovenLabel = new JLabel("Oven Model: ");
		userName = new JTextField(10);
		userOven = new JTextField(10);
		addNewUser = new JButton("Add New User");
		addNewUser.addActionListener(new ButtonListener());
		user.add(userLabel);
		user.add(userName);
		user.add(ovenLabel);
		user.add(userOven);
		user.add(addNewUser);
		add(user);
		setLayout(new FlowLayout());
		setLocationRelativeTo(null);
		setVisible(true);
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
			String newUser = userName.getText();
			String newOven = userOven.getText();
			// Need to add more functionality to properly add user in settings
		}
	}
}
