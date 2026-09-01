package grammar;

import java.util.Scanner;

public class While02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자를 입력하세요 : ");
			int num = sc.nextInt();
			
			switch (num % 2) {
			case 0: 
				System.out.print("짝수입니다.");
				break;
			case 1:
				System.out.print("홀수입니다.");
				break;
		}
		
		System.out.print("계속 하시겠습니까? (0-멈춤/1-계속) : ");
		int re = sc.nextInt();
		
		if (re==0) {
			System.out.print("프로그램을 종료합니다.");
			break;
		}
		
		}
		

	}

}
