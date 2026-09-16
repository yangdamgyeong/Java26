package homework;

public class BestGirl extends GoodGirl{
	@Override
	public void show() {
		System.out.println(name + "는 자바를 무지하게 잘 안다.");
		// System.out.println("그녀는 자바를 무지하게 잘 안다.");
	}
	
	
	public BestGirl(String name) {
		super(name);
	}

}