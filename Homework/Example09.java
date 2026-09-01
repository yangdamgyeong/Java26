package Homework;

import java.util.Scanner;

public class Example09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.print("전공 이수 학점 : ");
		int j = in.nextInt();
		
		System.out.print("교양 이수 학점 : ");
		int g = in.nextInt();
		
		System.out.print("일반 이수 학점 : ");
		int i = in.nextInt();
		
		int sum = j + g + i;
		
		boolean d1 = (sum >= 140) && (sum >= 70);
		
		boolean d2 = ((g >= 30) && (i >= 30) || (g + i) >= 80);
		
		System.out.println(d1 && d2? "졸업가능" : "졸업불가");

	}

}
