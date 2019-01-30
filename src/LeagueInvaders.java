import java.awt.Dimension;
import java.awt.event.KeyListener;

import javax.swing.*;

public class LeagueInvaders {
	JFrame Frame;
	GamePanel panel;
	public LeagueInvaders() {
		
		Frame = new JFrame();
		Frame.setSize(500,800);
		final int HEIGHT = 800;
		final int WIDTH = 500;
		panel = new GamePanel();
		
		Frame.getContentPane();
		Frame.setPreferredSize(new Dimension(WIDTH, HEIGHT));

        Frame.pack();
		
	}
	
public static void main(String[] args) {
	
	LeagueInvaders l = new LeagueInvaders();
	l.setup();
}

public void setup() {
	Frame.add(panel);
	Frame.setVisible(true);
	Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	panel.startGame();
	Frame.addKeyListener(panel);
	
	
}

}
