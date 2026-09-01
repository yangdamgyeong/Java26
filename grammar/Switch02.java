package grammar;

import java.util.Scanner;

public class Switch02 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("등급을 입력하세요 : ");
		
		String grade = sc.nextLine();
		
		switch(grade) {
		case "A":
		case "B":
			System.out.print("아주 열심히 하셨군요");
			break;
		case "C":
			System.out.print("남들만큼 하셨네요");
			break;
		case "D":
			System.out.print("조금 더 노력이 필요합니다.");
			break;
		case "F":
			System.out.print("교수실로 찾아오세요.");
			break;
		default:
			System.out.print("없는 등급입니다.");
			break;
		
	}
	


	}
}
