package homework;

public class MovablePoint extends Point {
	private int xSpeed;
	private int ySpeed;
	
	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		super(x, y);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed;
	}

}
