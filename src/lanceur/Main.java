package lanceur;

import model.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sonic s = new Sonic(new DefaultMoveStrategy(),"sonic");
		
		System.out.println("Le jeu commence");
		s.move();
		
		System.out.println("Sonic mange des champignons");
		s.changeStrategy(new JumpMoveStrategy());
		s.move();
		
		System.out.println("Sonic a obtenu 50 rings");
		s.changeStrategy(new FlyMoveStrategy());
		s.move();

		System.out.println(s);
	}

}
