import java.awt.Graphics;

public class ObjectManager {
	
	Rocketship mShip;
	
public ObjectManager(Rocketship ship) {
	
	
	mShip = ship;
	
	
	
}

public void update()	{
	 mShip.update();
}

public void draw(Graphics g) 	{
	mShip.draw(g);
	
}
}
