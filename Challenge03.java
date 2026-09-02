package homework;

public class Challenge03 {
	
	public static void main(String[] args) {
		System.out.println(factorial(5));
		System.out.println(factorial(1, 5));
		System.out.println(factorial(3, 5));
		System.out.println(factorial(10, 5));
	}
	
	static int factorial(int x) {
		return factorial(1, x);
	}
	
	static int factorial(int x, int y) {
		int r = 1;
			while (x <= y) {
				r *= x;
				x++;
	    }
		return r;
	}

}
