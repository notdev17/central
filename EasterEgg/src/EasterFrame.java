import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class EasterFrame extends JFrame {
	//width and height of the frame
	private static final int SIZE = 500;
	
	public EasterFrame () {
		super("Easter Egg");

		//Set preferences for window
		this.setLayout(new BorderLayout());
		this.setVisible(true);
		this.setPreferredSize(new Dimension(SIZE, SIZE));
		this.setSize(this.getPreferredSize());
		
		//create and add button and panel to the frame
		addContents();
	}
	
	//creates and adds the panel and button to the frame
	private void addContents() {
		
		//create the panel and button
		JPanel panel = new JPanel();
		JButton butt  = new JButton("We are...");
		
		//create the action listener for the button
		butt.addActionListener(event -> {
			//show a message dialogue displaying members (ADD YOUR NAME HERE with (\n) for new lines)
			JOptionPane.showMessageDialog(this, "Daylen", "Not Dev!",JOptionPane.INFORMATION_MESSAGE);
		});
		
		//add the panel and button to the frame
		add(panel);
		panel.add(butt);
	}
	
	
}
