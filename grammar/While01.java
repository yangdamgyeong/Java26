package grammar;

import java.util.Scanner;

public class While01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		while(num != 0) {
				sum += num;
				
				System.out.print("숫자를 입력하세요 : ");
				num = sc.nextInt();

	}
		System.out.print("지금까지 입력한 숫자의 합은 " + sum + "입니다.");
	}

}
