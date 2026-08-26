package Homework;

import java.util.Scanner;

public class Example04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.print("초 단위 정수를 입력하세요 : ");
		int sec = in.nextInt();
		
		int h = sec / 3600;
		int m = (sec % 3600) / 60;
		int s = sec % 60;
		
		System.out.print(h + "시간 " + m + "분 " + s + "초");

	}

}
