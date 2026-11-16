package exception;

public class TryCatchTest {
	public static void main(String[] args) {
		System.out.println("====== 프로그램 시작 ======");
		
		arithmenticException();

        indexException();

        nullPointerException();

        numberFormatException();
		
		System.out.println("====== 프로그램 종료 ======");
	}
	
	public static void arithmenticException() {
		
		int a = 10, b =0;
		
		try {
			int c = a/b;
		} catch(ArithmeticException e) {
			e.printStackTrace(); //다 나옴
			System.out.println(e.toString()); //예외의 정보만 출력
			System.out.println(e.getMessage()); // 에러 문제만
		}
		
	}
	
	public static void indexException() {
		
		try {
			int[] array = { 0, 1, 2 };
			int value = array[3];
		} catch(IndexOutOfBoundsException i) {
			i.printStackTrace();
			System.out.println(i.toString());
			System.out.println(i.getMessage());
		}
		
	}
	
	public static void nullPointerException() {
		
		try {
			String str = null;
			int length = str.length();
		} catch (NullPointerException n) {
			n.printStackTrace();
			System.out.println(n.getMessage());
		}
		
	}
	
	public static void numberFormatException() {
		
		try {
			String str = "123AA";
			int num = Integer.parseInt(str);
		} catch(NumberFormatException f) {
			System.out.println(f.getMessage());
		}
	}
}
