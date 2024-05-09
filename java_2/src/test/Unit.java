package test;

public class Unit extends Module {

	private int moveSpeed;

	public Unit() {
		// TODO Auto-generated constructor stub
	}

	public Unit(String name, int hp, int moveSpeed) {
		super(name, hp);
		this.moveSpeed = moveSpeed;
	}

	public int getMoveSpeed() {
		return moveSpeed;
	}

	public void setMoveSpeed(int moveSpeed) {
		this.moveSpeed = moveSpeed;
	}

}
