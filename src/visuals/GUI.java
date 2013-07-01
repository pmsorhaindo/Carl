package visuals;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SpringLayout;

public class GUI extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private Container contentPane = null;
	private JLabel jlbTest;
	private JButton jbtnTest;
	
	public void LaunchFrame() {
		
		//JPanel panel = new JPanel(new BorderLayout());
		contentPane = this.getContentPane();
		
		jlbTest = new JLabel("HEY TIM!!!");
		jbtnTest = new JButton("Test!");
		
		initLayout();
		
		contentPane.add(jlbTest);
		contentPane.add(jbtnTest);
		
		
		centerJFrame(this);
		this.setSize(600, 300);
		pack();
		setVisible(true);
	}
	
	private void centerJFrame(JFrame window) {
		
		// Mikey would like to thank Thanks http://www.java-forums.org/ :)
		// Get the size of the screen
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		 
		int w = window.getSize().width;
		int h = window.getSize().height;
		int x = (dim.width-w)/2;
		int y = (dim.height-h)/2;
		 
		window.setLocation(x, y);
	}
	
	private void initLayout() {
		
		SpringLayout layout = new SpringLayout();
		layout.putConstraint(SpringLayout.WEST, jlbTest, 5, SpringLayout.WEST, contentPane);
		layout.putConstraint(SpringLayout.NORTH, jbtnTest, 5, SpringLayout.NORTH, contentPane);
		contentPane.setLayout(layout);
		
	}

	public void actionPerformed(ActionEvent e) {
		System.out.println("test");
	}
}	
	
	
