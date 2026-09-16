package homework;

public class Student extends Person{
	protected int num;
	
	public Student(String name, int age, int num) {
		super(name, age);
		this.num = num;
	}
	
	@Override
	public void show() {
		System.out.println("학생[이름 : " + name + ", 나이 : " + age + ", 학번" + num + "]");
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	

}
