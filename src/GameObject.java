import java.awt.Graphics;
import java.awt.Rectangle;

public class GameObject {
	int x;
    int y;
    int width;
	int height;
	Boolean isAlive;
	Rectangle collisionBox;
    public GameObject(int x2, int y2, int width2, int height2) {
		x = x2;
		y = y2;
		width = width2;
		height = height2;
		collisionBox = new Rectangle();
	}

	public void update()	{
		collisionBox.setBounds(x, y, width, height);
    }
    
    public void draw(Graphics g) 	{

    	
    	
    }
    
    public void setAlive(Boolean bean) 	{
    	isAlive = bean;
    	
    }
    
    
	
    
    }

