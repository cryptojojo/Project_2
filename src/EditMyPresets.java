import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * Class for adding or deleting a new preset in cooking menu
 * 
 * @author Ashley Schuelein
 */
public class EditMyPresets extends JFrame {

	private String preset;
	private int time;
	private JLabel nameLabel, timeLabel;
	private JTextField presetName;
	private JTextField presetTime;
	private JButton addNewPreset;
	private JButton deletePreset;

	/**
	 * Constructor for adding or deleting a preset
	 */
	public EditMyPresets() {
		super("Smart Oven");
		setResizable(false);

		setSize(800, 400);

		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

		nameLabel = new JLabel("Preset Name: ");
		timeLabel = new JLabel("Time for preset: ");
		presetName = new JTextField(10);
		presetTime = new JTextField(10);
		addNewPreset = new JButton("Add New Preset");
		addNewPreset.addActionListener(new ButtonListener());
		deletePreset = new JButton("Delete Old Preset");
		deletePreset.addActionListener(new ButtonListener());
		add(nameLabel);
		add(presetName);
		add(timeLabel);
		add(presetTime);
		add(addNewPreset);
		add(deletePreset);

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
			if (e.getSource() == addNewPreset) {
				preset = presetName.getText();
				time = presetTime.getX();
				// Need to add more functionality to properly add new preset
			} else {
				// Need to add functionality to delete preset if delete is pressed
			}
		}
	}

}
