import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * GUI class for the Graphical User Interface
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
		preheat.addActionListener(new FileButtonListener());
		cook=new JButton("Cook Time");
		cook.setBounds(80, 100, 100, 25);
		//cook.addActionListener(new FileButtonListener());
		settings=new JButton("Settings");
		settings.setBounds(80, 100, 100, 25);
		//settings.addActionListener(new FileButtonListener());
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
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	/**
	 * Private class for Button action
	 * @author Ashley Schuelein
	 */
	 private class FileButtonListener implements ActionListener {   
		 @Override
	        
	         /**
	         * @param ActionEvent e
	         * Method for implementing action for JButton preheat in GUI
	         */
	        public void actionPerformed( ActionEvent e) {
	            System.out.println("hit the preheat button");
	            int temperature = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your temperature: "));
	            String temp = "This is your temperature: " + temperature;
	            text.append(temp);
	        }
	 	}
}
