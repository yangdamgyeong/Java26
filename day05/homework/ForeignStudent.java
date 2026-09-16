package homework;

public class ForeignStudent extends Student{
	String nat;
	
	public ForeignStudent (String name, int age, int num, String nat) {
		super(name, age, num);
		this.nat = nat;
	}
	
	@Override
	public void show() {
		System.out.println("학생[이름 : " + name + ", 나이 : " + age + 
				", 학번" + num + ", 국적 : " + nat + "]");
		
	}

	public String getNat() {
		return nat;
	}

	public void setNat(String nat) {
		this.nat = nat;
	}
	

}
