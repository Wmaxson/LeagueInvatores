import java.awt.Dimension;
import java.awt.event.KeyListener;

import javax.swing.*;

public class LeagueInvaders {
	JFrame Frame;
	GamePanel panel;
	public static final int HEIGHT = 800;
	public static final int WIDTH = 500;
	public LeagueInvaders() {
		
		Frame = new JFrame();
		Frame.setSize(500,800);
		
		panel = new GamePanel();
		
		Frame.getContentPane();
		panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));

        
		
	}
	
public static void main(String[] args) {
	
	LeagueInvaders l = new LeagueInvaders();
	l.setup();
}

public void setup() {
	Frame.add(panel);
	Frame.pack();
	Frame.setVisible(true);
	Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	panel.startGame();
	Frame.addKeyListener(panel);
	
	
}

}
