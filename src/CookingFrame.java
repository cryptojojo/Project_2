import javax.swing.*;

import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

/**
 * Class for the cooking window
 * 
 * @author Ashley Schuelein
 */
public class CookingFrame extends JFrame {

	private JButton cookTime;
	private JButton pizza;
	private JButton cookies;
	private JButton editPresets;
	private JTextArea text;
	private JScrollPane scroll;

	/**
	 * Constructor to make the cooking menu
	 */
	public CookingFrame() {
		super("Smart Oven");
		setResizable(false);
		JLabel cookingLabel = new JLabel("Welcome to the Cooking Menu");

		setSize(1000, 400);

		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

		cookTime = new JButton("Set time");
		cookTime.setBounds(80, 100, 100, 25);
		cookTime.addActionListener(new ButtonListener());
		pizza = new JButton("Pizza");
		pizza.setBounds(80, 100, 100, 25);
		pizza.addActionListener(new ButtonListener());
		cookies = new JButton("Cookies");
		cookies.setBounds(80, 100, 100, 25);
		cookies.addActionListener(new ButtonListener());
		editPresets = new JButton("Edit Presets");
		editPresets.setBounds(80, 100, 100, 25);
		editPresets.addActionListener(new ButtonListener());
		text = new JTextArea(20, 30);
		scroll = new JScrollPane(text);
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		add(cookingLabel);
		add(cookTime);
		add(pizza);
		add(cookies);
		add(editPresets);
		add(scroll);

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
			int myCookTime;
			String cooking;
			String cookEnd;
			String reset;

			if (e.getSource() == cookTime) {
				myCookTime = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your cook time: "));
				if (myCookTime > 180) {
					reset = myCookTime + " is out of range. Enter a new cook time.\n";
					text.append(reset);
				} else {
					cooking = "Your cook time has been set to: " + myCookTime + " minutes\n";
					text.append(cooking);
					cookEnd = "Cooking is complete.\n";
					text.append(cookEnd);
				}
			} else if (e.getSource() == pizza) {
				myCookTime = 25;
				cooking = "Your cook time has been set to: " + myCookTime + " minutes\n";
				text.append(cooking);
				cookEnd = "Cooking is complete.\n";
				text.append(cookEnd);
			} else if (e.getSource() == cookies) {
				myCookTime = 12;
				cooking = "Your cook time has been set to: " + myCookTime + " minutes\n";
				text.append(cooking);
				cookEnd = "Cooking is complete.\n";
				text.append(cookEnd);
			} else {
				EditMyPresets myNewPreset = new EditMyPresets();
				myNewPreset.setVisible(true);
			}
		}
	}
}
