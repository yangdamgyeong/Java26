package homework;

public class OvershadowTest {
	
	public static void main(String[] args) {
		Parent p = new Child("사도세자");
		
		System.out.println(p.name);
		p.print();
	}

}
