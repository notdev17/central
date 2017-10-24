/**
 * @author notDevs
 * @version 1
 */

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class EasterFrame extends JFrame {
	//width and height of the frame
	private static final int SIZE = 500;

	/**
	 * EasterEgg constructor. Sets JFrame settings.
	 */
	public EasterFrame () {
		super("Easter Egg");

		//Set preferences for window
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		this.setPreferredSize(new Dimension(SIZE, SIZE));
		this.setSize(this.getPreferredSize());

		//create and add button and panel to the frame
		addContents();

		//Centering the JFrame
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);

	}

	/**
	 * Creates and adds the panel and button to the frame
	 */
	private void addContents() {

		//create the panel & set layout
		JPanel panel = new JPanel();
		panel.setLayout(new GridBagLayout());

		//create the button & set size
		JButton butt  = new JButton("We are...");
		butt.setPreferredSize(new Dimension(this.getWidth()/3, this.getHeight()/4));

		JPanel names = new EasterNamePanel();

		//create the action listener for the button
		butt.addActionListener(event -> {
			JOptionPane.showMessageDialog(this, names, "Not Dev!",JOptionPane.INFORMATION_MESSAGE);
		});

		//add the panel and button to the frame
		panel.add(butt);
		this.add(panel);
	}


}
