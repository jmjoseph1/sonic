package model;

public class Sonic {
	
	private MoveStrategy move;
	private String name;
	
	public Sonic (MoveStrategy move, String name) {
		this.move = move;
		this.name = name;
	}
	
	public void changeStrategy(MoveStrategy move) {
		this.move = move;
	}
	
	public void move() {
		move.execute();
	}

	@Override
	public String toString() {
		return "Sonic [name=" + name + "]";
	}

	
}
