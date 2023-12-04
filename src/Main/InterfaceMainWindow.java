package Main;

import javax.swing.JButton;

import GUIElements.AllButtons;
import GUIElements.Window;

public class InterfaceMainWindow extends Window{
	private AllButtons menueButtons;
	private ActionListenerButton actionListener;
	protected String[] buttonNames = {"Kunden", "Reifenlager", "Termine", "Rechnungen", "Werkstatt", "Teilelager"};
	protected int number = 6;
	
	public InterfaceMainWindow(String windowName) {
		super(windowName);
		actionListener = new ActionListenerButton(this);
		menueButtons = new AllButtons(actionListener, buttonNames, number);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		menueButtons.createButtons(40,  40, 150, 50, 50);
		for(JButton button : menueButtons.getButtons()) {
			add(button);
		}
		
		setVisible(true);
	}
	
	
	
}