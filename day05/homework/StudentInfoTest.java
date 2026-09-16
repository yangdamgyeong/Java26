package homework;

public class StudentInfoTest {
	
	public static void main(String[] args) {
		Person[] studentinfo = {new Person("길동", 22), 
				                     new Student("황진이", 23, 100),
				                     new ForeignStudent("Amy", 30, 200, "U.S.A")};
		
		for (Person p : studentinfo ) {
			p.show();
		}
	}

}
