package circle;

public class TypeConversion {
	
	//클래스가 달라도 상속을 받으면 부모타입을 통해서 출력할 수 있음
	public static void main(String[] args) {
		Circle[] circles = {new Circle(5.0), new Ball(5.0), new Cylinder(5.0, 7.0)};
		
		for (Circle c : circles) {
			System.out.println("===========");
			printCircleInfo(c);
			
		}
	}
	
	// 자식타입 변수라면 부모객체가 있으면 안됨 자식타입에 에러가 남
	public static void printCircleInfo(Circle c) {
		if ( c instanceof Ball ) {
			System.out.println(">>>> 구");
		} else if ( c instanceof Cylinder ) {
			System.out.println(">>>> 원기둥");
		} else {
			System.out.println(">>>> 원");
		}
		
		System.out.println("반지름 : " + c.getRadius());
		if (c instanceof Cylinder) {
			Cylinder cyl = (Cylinder)c;
			System.out.println("높이 : " + cyl.getHeight());
		}
		System.out.println("면적 : " + c.getArea());
		
	}


}
