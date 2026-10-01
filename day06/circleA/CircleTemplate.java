package circleA;

public abstract class CircleTemplate {
	
	static final double PI = 3.14;
	protected double radius;
	
	abstract double getArea();

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
}
