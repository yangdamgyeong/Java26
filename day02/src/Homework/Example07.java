package Homework;

import java.util.Scanner;

public class Example07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		int a = in.nextInt();
		
		System.out.println((a % 4 == 0) && (a % 5 == 0));
		System.out.println((a % 4 == 0) || (a % 5 == 0));
		System.out.println((a % 4 == 0) ^ (a % 5 == 0));

	}

}
