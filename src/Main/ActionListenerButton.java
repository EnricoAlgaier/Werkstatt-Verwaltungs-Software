package Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ActionListenerButton implements ActionListener{
	private InterfaceMainWindow frame;
	
	public ActionListenerButton(InterfaceMainWindow frame) {
		this.frame = frame;
	}	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String buttonName = ((JButton) e.getSource()).getActionCommand();
		
		if("Kunden".equals(buttonName)) {
			System.out.println("Kunden");
		}
		else if("Reifenlager".equals(buttonName)) {
			System.out.println("Reifenlager");
		}
		else if("Termine".equals(buttonName)) {
			System.out.println("Termine");
		}
		else if("Rechnungen".equals(buttonName)) {
			System.out.println("Rechnungen");
		}
		else if("Werkstatt".equals(buttonName)) {
			System.out.println("Werkstatt");
		}
		else if("Teilelager".equals(buttonName)) {
			System.out.println("Teilelager");
		}
	}

}