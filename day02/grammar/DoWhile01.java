package grammar;

import java.util.Scanner;

public class DoWhile01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int num;
		
		do {
			System.out.print("숫자를 입력하세요 : ");
			num = sc.nextInt();
			if (num != 0) {
				sum += num;
			}
			
		}while ( num != 0 );
		
		System.out.print("지금까지 입력한 숫자의 합은" + sum + "입니다.");
	}

}
