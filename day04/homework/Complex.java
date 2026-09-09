package homework;

public class Complex {
	private double num1;
	private double num2;
	
	public Complex(double num1) {
		this.num1 = num1;
		this.num2 = 0.0;
	}
	public Complex(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public void print() {
		System.out.println(num1 + " + " + num2+"i");
	}

}
