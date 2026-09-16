package homework;

public class Child extends Parent{
	String name = "사도세자";
	
	public Child (String name) {
		super("영조");
	}
	
	public void print() {
		System.out.println("나는 " + name + "이다.");
	}

}
