package Homework;

import java.util.Scanner;

public class Example08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("0 ~ 999 사이의 숫자를 입력하세요 : ");
		int num = in.nextInt();
		
		int h = num / 100;
		int t = (num % 100) / 10;
		int o = num % 10;
		
		int sum = h + t + o;
		
		System.out.println(sum);

	}

}
