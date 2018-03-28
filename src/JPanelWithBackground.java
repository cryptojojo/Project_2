import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 * Class to set background image
 * 
 * @author Joseph Miller
 */
public class JPanelWithBackground extends JPanel {

	private Image backgroundImage;

	// Some code to initialize the background image.
	// Here, we use the constructor to load the image. This
	// can vary depending on the use case of the panel.
	public JPanelWithBackground(String fileName) throws IOException {
		backgroundImage = ImageIO.read(new File(fileName));
		Dimension size = new Dimension(backgroundImage.getWidth(null), backgroundImage.getHeight(null));
		setPreferredSize(size);
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		// Draw the background image.
		g.drawImage(backgroundImage, 0, 0, null);
	}
}