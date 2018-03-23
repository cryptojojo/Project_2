import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Class for the settings menu window
 * @author Ashley Schuelein
 */
public class SettingsFrame extends JFrame {

	/**
	 * Constructor to make the settings menu
	 * @author Ashley Schuelein
	 */
	public SettingsFrame()
	{
		super("Smart Oven");
		JLabel settingsLabel = new JLabel("Welcome to the Settings Menu");
 		JPanel settingsPanel = new JPanel();
 		setSize(600, 300);
 		settingsPanel.add(settingsLabel);
 		add(settingsPanel);
 		setLayout(new FlowLayout());
 		setLocationRelativeTo(null);
 		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		//TODO Need to add more features in settings
	}
}
