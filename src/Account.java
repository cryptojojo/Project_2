import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

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
	private JComboBox c = new JComboBox();
	String [] newUsers = new String[5];
	int numberOfUsers = 0;

	/**
	 * Constructor for making an account from settings menu
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
		c.setSize(100, 150);
		add(c);
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
		 * Method for implementing action for JButton in GUI
		 * @param ActionEvent e 
		 */
		public void actionPerformed(ActionEvent e) {
			if(numberOfUsers == newUsers.length) {
				System.out.println("You have exceeded the number of users.");
			} else {
				newUsers[numberOfUsers] = "User: " + userName.getText() + " , Oven: " + userOven.getText();
				numberOfUsers++;
			}
			c.addItem(Arrays.toString(newUsers));
			userName.setText("");
			userOven.setText("");
		}
	}
}
