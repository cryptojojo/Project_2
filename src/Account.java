import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * Class for making a user account from settings
 * 
 * @author Ashley Schuelein, Joseph Miller
 */
public class Account extends JFrame {

	private JPanel user = new JPanel();
	private JLabel userLabel = new JLabel("User Name: "), ovenLabel = new JLabel("Oven Model: ");
	private JTextField userName = new JTextField(10);
	private JTextField userOven = new JTextField(10);
	private JButton addNewUser = new JButton("Add New User");

	/**
	 * Constructor for making an account from settins menu
	 */
	public Account() {
		super("Smart Oven");
		setSize(800, 400);

		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

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
			String newUser = userName.getText();
			String newOven = userOven.getText();
			// Need to add more functionality to properly add user in settings
		}
	}
}
