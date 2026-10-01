package circleI;

public class Ball implements CircleTemplate{
	
	static final double PI = 3.14;
    private double radius;
    
    public Ball(double radius) {
    	this.setRadius(radius);
    }
    
	@Override
	public double getArea() {
		return 4 * PI * radius * radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	

}
