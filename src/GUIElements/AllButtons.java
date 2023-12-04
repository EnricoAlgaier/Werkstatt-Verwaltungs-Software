package GUIElements;

import java.awt.event.ActionListener;
import javax.swing.*;
import Design.CustomButtonRect;
import Main.ActionListenerButton;

public class AllButtons extends JButton {
	private ActionListenerButton actionListener;
	private CustomButtonRect[] buttons;
	private CustomButtonRect button;
	private String color1 = "#000000";
	private String color2 = "#03099e";
	private String[] buttonID;
	private int number;

	public AllButtons(ActionListenerButton actionListener, String[] buttonID, int number) {
		buttons = new CustomButtonRect[number];
		this.actionListener = actionListener;
		this.buttonID = buttonID;
		this.number = number;
	}

	public void createButtons(int posX, int posY, int weight, int height, int distanceValue) {
		for (int create = 0; create < number; create++) {
			buttons[create] = new CustomButtonRect(color1, color2, buttonID[create]);
			buttons[create].setActionCommand(buttonID[create]);
			buttons[create].setBounds(posX, posY, weight, height);
			buttons[create].setFocusPainted(false);
			buttons[create].addActionListener((ActionListener) actionListener);
			posY += distanceValue;
		}
	}
	
	public void createButton(int posX, int posY, int weight, int height, String buttonName) {
		button = new CustomButtonRect(color1, color2, buttonName);
		button.setActionCommand(buttonName);
		button.setBounds(posX, posY, weight, height);
		button.setFocusPainted(false);
		button.addActionListener((ActionListener) actionListener);
	}

	public JButton[] getButtons() {
		return buttons;
	}
	
	public JButton getButton() {
		return button;
	}
}