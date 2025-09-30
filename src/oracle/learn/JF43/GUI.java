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
	
	public GUI(Graphics2D g2) {
		g2.setColor(Color.WHITE);
		g2.setFont(new Font("Arial", Font.PLAIN,30));
		g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		g2.drawString("Hello World!", 100, 0);
	}

}