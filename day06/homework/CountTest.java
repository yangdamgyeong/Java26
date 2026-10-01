package homework;

public class CountTest {
	
	public static void main(String[] args) {
		Countable [] m = {
				new Bird("뻐꾸기", 5),
				new Bird("독수리", 2),
				new Tree("사과나무", 10),
				new Tree("밤나무", 7)
		};
		
		for (Countable c : m) {
            c.count();
        }

        // 2. 타입 확인 후 fly() 또는 ripen() 호출
        for (Countable c : m) {
            if (c instanceof Bird) {
                ((Bird) c).fly();
            } else if (c instanceof Tree) {
                ((Tree) c).ripen();
            }
        }
	}

}
