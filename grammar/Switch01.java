package grammar;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 ");
		int num = sc.nextInt();
		switch (num % 2) {
		case 0:
			System.out.print("짝수");
			break;
		case 1:
			System.out.println("홀수");
			break;
		}
		
		

	}

}
