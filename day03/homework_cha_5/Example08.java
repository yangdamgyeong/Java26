package homework_cha_5;

import java.util.Scanner;

public class Example08 {
	public static String day(String dayName) {
		
		switch(dayName) {
		case "MONDAY":
			return "월요일은 싫다.";
		case "FRIDAY":
			return "좋다.";
		case "SATURDAY":
		case "SUNDAY":
			return "최고.";
		default:
			return "그저 그렇다.";
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요일을 영어로 적으시오 : ");
		
		String day = sc.nextLine().toUpperCase();
		
		System.out.println(day(day));
		
	}

}