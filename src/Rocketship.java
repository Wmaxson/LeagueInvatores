import java.awt.Color;
import java.awt.Graphics;

public class Rocketship extends GameObject { 

	int speed;
	boolean up = false;
	boolean down = false;
	boolean left = false;
	boolean right = false;
	
	public Rocketship(int x, int y, int width, int height) {
		
		super(x,y,width,height);
		speed = 5;
		
	}
	
	public void update()	{
		 super.update();
		 if(up) {
			 y -= speed;
		 }
		 if(down) {
			 y += speed;
		 }
		 if(left) {
			 x -= speed;
		 }
		 if(right) {
			 x += speed;
		 }
    }
    
    public void draw(Graphics g) 	{

    	g.setColor(Color.BLUE);
        g.fillRect(x, y, width, height);
    }
	
}
