import javax.swing.*;

public class LeagueInvaders {
	JFrame Frame;
	public LeagueInvaders() {
		
		Frame = new JFrame();
		Frame.setSize(500,800);
		
		
	}
	
public static void main(String[] args) {
	
	LeagueInvaders l = new LeagueInvaders();
	l.setup();
}

public void setup() {
	Frame.setVisible(true);
	Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

}
