package Homework;

import java.util.Scanner;

public class Example06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("화씨온도를 입력하세요 : ");
		double f = in.nextDouble();
		
		double c = 5.0 / 9.0 * (f -32);
		
		System.out.println("화씨" + f + "도 = 섭씨 " + c + "도");

	}

}
