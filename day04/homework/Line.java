package homework;

public class Line {
	private double length;
	
	public Line(double leng) {
		this.length = length;
	}
	
	public boolean isSameLine(Line l) {
		if (this.length == l.length) {
			return true;
		} else {
			return false;
		}
	}

}
