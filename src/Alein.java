import java.awt.Color;
import java.awt.Graphics;

public class Alein extends GameObject {

	public Alein(int x, int y, int width, int height) {
		super(x, y, width, height);
		
	}
	public void draw(Graphics g)	{
		g.setColor(Color.yellow);
		g.fillRect(x, y, width, height);
	}
	public void update()	{
		y++;
	}

}
