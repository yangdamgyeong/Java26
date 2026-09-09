package homework;

public class Triangle {
	private double height;
	private double base;
	
	//Example 01
	public Triangle(double height, double base) {
		this.height = height;
		this.base = base;
	}
	
	public double findArea() {
		return (height * base) / 2.0;
	}
	
	//Example 02
	public boolean isSameArea(Triangle t ) {
		if (this.findArea() == t.findArea()) {
	        return true;
	    } else {
	        return false;
	    }
	}
}
