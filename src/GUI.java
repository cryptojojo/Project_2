import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

/**
 * GUI class for the Smart Oven Graphical User Interface
 * @author Ashley Schuelein
 */
public class GUI extends JFrame {

	private JLabel message;
	private JPanel panel;
	private JButton preheat;
	private JButton cook;
	private JButton settings;
	private JTextArea text;
	private JScrollPane scroll;
	
	/**
	 * Constructor to make the Graphical User Interface
	 * @author Ashley Schuelein
	 */
	public GUI()
	{
		super("Smart Oven");
		setSize(800, 400);
		message=new JLabel("Please select an option");
		panel=new JPanel();
		preheat=new JButton("Preheat");
		preheat.setBounds(80, 100, 100, 25);
		preheat.addActionListener(new ButtonListener());
		cook=new JButton("Cook Time");
		cook.setBounds(80, 100, 100, 25);
		cook.addActionListener(new ButtonListener());
		settings=new JButton("Settings");
		settings.setBounds(80, 100, 100, 25);
		settings.addActionListener(new ButtonListener());
		text=new JTextArea(20, 30);
		scroll=new JScrollPane(text);
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		panel.add(message);
		panel.add(preheat);
		panel.add(cook);
		panel.add(settings);
		panel.add(scroll);
		add(panel);
		setLayout(new FlowLayout());
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	/**
	 * Private class for Button actions
	 * @author Ashley Schuelein
	 */
	 private class ButtonListener implements ActionListener {   
		 @Override
	        
	         /**
	         * @param ActionEvent e
	         * Method for implementing action for JButton in GUI
	         */
	        public void actionPerformed(ActionEvent e) {
			 	if(e.getSource() == preheat)
			 	{
			 		System.out.println("Hit the preheat button");
		            int temperature = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your temperature: "));
		            if(temperature > 500)
		            {
		            	String reset = temperature + " is out of range. Enter a new temperature.\n";
		            	text.append(reset);
		            }
		            else
		            {
		            	String temp = "Your oven has been preheated to: " + temperature + "\n";
		            	text.append(temp);
		            }
			 	}
			 	else if(e.getSource() == cook)
			 	{
			 		System.out.println("Hit the cook button");
		            int cookTime = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your cook time: "));
		            if(cookTime > 180)
		            {
		            	String reset = cookTime + " is out of range. Enter a new cook time.\n";
		            	text.append(reset);
		            }
		            else
		            {
		            	String cooking = "Your cook time has been set to: " + cookTime + " minutes\n";
		            	text.append(cooking);
		            	String cookEnd = "Cooking is complete.";
		            	text.append(cookEnd);
		            }
			 	}
			 	else 
			 	{
			 		System.out.println("Hit the settings button");
			 		SettingsFrame setFrame = new SettingsFrame();
			 		setFrame.setVisible(true);
			 	}
	        }
	 	}
}
