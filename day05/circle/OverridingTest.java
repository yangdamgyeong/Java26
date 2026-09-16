package circle;

public class OverridingTest {
	
	/* public static void main(String[] args) {
		System.out.println(">>> 원 : ");
		Circle c = new Circle(5.0);
		printCircleInfo(c);
		
		System.out.println("\n>>> 공 : ");
		Ball b = new Ball(5.0);
		printCircleInfo(b);
		
		System.out.println("\n>>> 원기둥 : ");
		Cylinder cyl = new Cylinder(5.0, 7.0);
		printCircleInfo(cyl);
		System.out.println("높이 : " + cyl.getHeight());
		System.out.println("면적 : " + cyl.getArea());
	} */
	
	public static void main(String[] args) {
		System.out.println(">>> 원 : ");
		Circle c = new Circle(5.0);
		printCircleInfo(new Circle(5.0));
		
		System.out.println("\n>>> 공 : ");
		Ball b = new Ball(5.0);
		printCircleInfo(b);
		
		System.out.println("\n>>> 원기둥 : ");
		Cylinder cyl = new Cylinder(5.0, 7.0);
		printCircleInfo(cyl);
		Cylinder cyl2 = (Cylinder)cyl;
		System.out.println("높이 : " + cyl.getHeight());
	}
	
	// 객체타입 변환(강제타입)
	public static void printCircleInfo(Circle c) {
		System.out.println("반지름 : " + c.getRadius());
		System.out.println("면적 : " + c.getArea());
	}

}
