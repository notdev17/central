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
	
	public EasterFrame () {
		super("Easter Egg");

		//Set preferences for window
		this.setLayout(new BorderLayout());
		this.setPreferredSize(new Dimension(SIZE, SIZE));
		this.setSize(this.getPreferredSize());
		
		//Centering the JFrame
		this.pack();
		this.setLocationRelativeTo(null);
		
		//create and add button and panel to the frame
		addContents();
	}
	
	//creates and adds the panel and button to the frame
	private void addContents() {
		
		//create the panel and button
		JPanel panel = new JPanel();
		panel.setLayout(new GridBagLayout());
		JButton butt  = new JButton("We are...");
		butt.setPreferredSize(new Dimension(this.getWidth()/3, this.getHeight()/4));
		panel.add(butt);
		
		//create the action listener for the button
		butt.addActionListener(event -> {
			//show a message dialogue displaying members (ADD YOUR NAME HERE with (\n) for new lines)
			JOptionPane.showMessageDialog(this, "Daylen\nBrandon", "Not Dev!",JOptionPane.INFORMATION_MESSAGE);
		});
		
		//add the panel and button to the frame
		this.add(panel);
	}
	
	
}
