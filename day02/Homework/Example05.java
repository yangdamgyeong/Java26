package Homework;

public class Example05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c = 'e';
		
		// 형변환 (~~)
		char upperC = (char)(c - ('a' - 'A'));
		
		System.out.println("소문자: " + c);
		System.out.println("대문자: " + upperC);

	}

}
