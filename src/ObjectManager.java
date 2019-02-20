import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager {
	
	Rocketship mShip;
	ArrayList<Projectiles> proj;
	ArrayList<Alein> alien;
	int enemyTimer;
	int enemySpawnTime;

public ObjectManager(Rocketship ship) {
	
	
	mShip = ship;

	proj = new ArrayList<Projectiles>();
	alien = new ArrayList<Alein>();
	
}

public void update()	{
	 mShip.update();
	 for(int i = 0; i < proj.size(); i++ ) {
		 
		 proj.get(i).update();;
		 
	 }
	 for(int i = 0; i < alien.size(); i++ ) {
		 
		 alien.get(i).update();;
		 
	 }
	 
}

public void draw(Graphics g) 	{
	mShip.draw(g);
	for(int i = 0; i < proj.size(); i++ ) {
		 
		 proj.get(i).draw(g);
		 
	 }
	for(int i = 0; i < alien.size(); i++ ) {
		 
		 alien.get(i).draw(g);
		 
	 }
}

public void addProjectile(Projectiles projectile) {
	
	proj.add(projectile);
	
	
}
public void addAlien(Alein aye) {
	
	alien.add(aye);
	
	
}

public void manageEnemies(){
    if(System.currentTimeMillis() - enemyTimer >= enemySpawnTime){
            addAlien(new Alein(new Random().nextInt(LeagueInvaders.WIDTH), 0, 50, 50));
enemyTimer = System.currentTimeMillis();
    }
}


}
