import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class GamePanel extends JPanel implements ActionListener, KeyListener{
	Font titleFont;
	Font subtitleFont;
	Boolean isAlive = true;
	Rocketship ship = new Rocketship(250, 700, 50, 50);
	ObjectManager man;
	
		Timer timer;
		final int MENU_STATE = 0;
		final int GAME_STATE = 1;
		final int END_STATE = 2;
		int currentState = MENU_STATE;
		
		public GamePanel() {
		titleFont = new Font("Arial", Font.PLAIN, 48);
		subtitleFont = new Font("Arial", Font.PLAIN, 24);
		man = new ObjectManager(ship);
		timer = new Timer(1000/60, this);
		
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
		
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode() == KeyEvent.VK_ENTER) {
			currentState++;
			if(currentState > END_STATE){
                currentState = MENU_STATE;
			}
			
		}
		if(e.getKeyCode() == KeyEvent.VK_SPACE) {
			man.addProjectile(new Projectiles(ship.x+20, ship.y, 10, 10));
		}
		
		
		if(e.getKeyCode() == KeyEvent.VK_UP) {
			ship.up = true;
		}
		if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			ship.down = true;
		}
		if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			ship.left = true;
		}
		if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			ship.right = true;
		}
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode() == KeyEvent.VK_UP) {
			ship.up = false;
		}
		if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			ship.down = false;
		}
		if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			ship.left = false;
		}
		if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			ship.right = false;
		}
		
	}

	public void updateMenuState() { 

		
	}
	public void updateGameState() { 
		man.manageEnemies();
		man.update();
		man.checkCollision();
		man.purgeObjects();
		
	}
	public void updateEndState() { 

	
	}
	
	
	public void drawMenuState(Graphics g) { 
		
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);    
		g.setFont(titleFont);
		g.setColor(Color.YELLOW);
		g.drawString("LEAGUE INVADERS", 30, 200);
		g.setFont(subtitleFont);
		g.drawString("Press ENTER to start", 150, 500);

		
		
	}
	public void drawGameState(Graphics g) { 
		g.setColor(Color.BLACK);

		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);  
		
		man.draw(g);
	}
	public void drawEndState(Graphics g) { 

		g.setColor(Color.RED);

		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);  
		
		g.setFont(titleFont);
		g.setColor(Color.BLACK);
		g.drawString("Game over :(", 30, 200);
	}

	}
