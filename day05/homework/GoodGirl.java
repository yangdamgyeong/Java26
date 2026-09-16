package homework;

public class GoodGirl extends Girl {
	
	@Override
	public void show() {
		System.out.println(name + "는 자바를 잘 안다.");
		// System.out.println("그녀는 자바를 잘 안다.");
	}
	
	public GoodGirl(String name) {
		super(name);
	}
	

}
