import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;

/**
 * GUI class for the Smart Oven Graphical User Interface
 * 
 * @author Ashley Schuelein, Joseph Miller
 */
public class GUI extends JFrame {

	private JLabel message;

	private JButton preheat;
	private JButton cook;
	private JButton settings;
	private JTextArea text;
	private JScrollPane scroll;
	private Image backgroundImage = ImageIO.read(new File("grad.png"));

	/**
	 * Constructor to make the Graphical User Interface
	 * 
	 * @throws IOException
	 */
	public GUI() throws IOException {
		super("Smart Oven");

		setResizable(false);
		setSize(800, 400);
		message = new JLabel("Please select an option");

		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

		preheat = new JButton("Preheat");
		preheat.setBounds(80, 100, 100, 25);
		preheat.addActionListener(new ButtonListener());
		cook = new JButton("Cook Time");
		cook.setBounds(80, 100, 100, 25);
		cook.addActionListener(new ButtonListener());
		settings = new JButton("Settings");
		settings.setBounds(80, 100, 100, 25);
		settings.addActionListener(new ButtonListener());
		text = new JTextArea(20, 30);
		scroll = new JScrollPane(text);
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		add(message);
		add(preheat);
		add(cook);
		add(settings);
		add(scroll);

		setLayout(new FlowLayout());
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
			if (e.getSource() == preheat) {
				System.out.println("Hit the preheat button");
				int temperature = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your temperature: "));
				String temp;
				String reset;
				if (temperature > 500) {
					reset = temperature + " is out of range. Enter a new temperature.\n";
					text.append(reset);
				} else {
					temp = "Your oven has been preheated to: " + temperature + "\n";
					text.append(temp);
				}
			} else if (e.getSource() == cook) {
				System.out.println("Hit the cook button");
				CookingFrame cookFrame = new CookingFrame();
				cookFrame.setVisible(true);
			} else {
				System.out.println("Hit the settings button");
				SettingsFrame setFrame = new SettingsFrame();
				setFrame.setVisible(true);
			}
		}
	}
}
