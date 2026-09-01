package Homework;

import java.util.Scanner;

public class Challenge02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner in = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		a = in.nextInt();
		System.out.print(a % 2 == 0 ? "짝수" : "홀수");

	}

}
