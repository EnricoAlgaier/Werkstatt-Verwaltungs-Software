package GUIElements;

import java.awt.Color;
import javax.swing.JFrame;

public class Window extends JFrame{
	private Color background = new Color(1, 11, 19);
	
	public Window(String windowName) {
		super(windowName);		
		getContentPane().setBackground(background);
		setLocationRelativeTo(null);
		setExtendedState(MAXIMIZED_BOTH);
		setResizable(false);
		setLayout(null);		
	}
}