package oracle.learn.JF43;

import java.awt.*;
import javax.swing.*;

public class GUI {
	
	//create window
	public GUI(String string) {
		JFrame GUI = new JFrame(string);
		GUI.setSize(900,600);
		GUI.getContentPane().setBackground(Color.DARK_GRAY);
		GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GUI.setVisible(true);
	}
	
	public void TEXT(String string) {
		JLabel text = new JLabel();
		text.setForeground(Color.WHITE);
	}

}