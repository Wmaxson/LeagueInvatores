import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class GamePanel extends JPanel implements ActionListener, KeyListener{
		GameObject gO;
		Timer timer;
		final int MENU_STATE = 0;
		final int GAME_STATE = 1;
		final int END_STATE = 2;
		int currentState = MENU_STATE;
		public GamePanel() {
		
		timer = new Timer(1000/60, this);
		gO = new GameObject();
	}
	
	public void startGame() { 
	timer.start();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
		 if(currentState == MENU_STATE){

             updateMenuState();

     }else if(currentState == GAME_STATE){

             updateGameState();

     }else if(currentState == END_STATE){

             updateEndState();

     }


	}
	
	 @Override

	 public void paintComponent(Graphics g){

		  gO.draw(g);
		  gO.update();
		  
		  if(currentState == MENU_STATE){

	             drawMenuState(g);

	     }else if(currentState == GAME_STATE){

	             drawGameState(g);

	     }else if(currentState == END_STATE){

	            drawEndState(g);

	     }

	 }

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("hi");
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("hi");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("hi");
	}

	public void updateMenuState() { 

		
	}
	public void updateGameState() { 

		
	}
	public void updateEndState() { 

	
	}
	public void drawMenuState(Graphics g) { 

		g.setColor(Color.BLUE);

		g.fillRect(0, 0, gO.WIDTH, gO.HEIGHT);    
		
	}
	public void drawGameState(Graphics g) { 

		
	}
	public void drawEndState(Graphics g) { 

	
	}

	}
