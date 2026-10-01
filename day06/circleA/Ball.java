package circleA;

public class Ball extends CircleTemplate{
	
    public Ball(double radius) {
    	this.radius = radius;
    }
    
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 4 * PI * radius * radius;
	}

}
