package grammar;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double w, h, area;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("직사각형의 가로 길이 : ");
		w = sc.nextDouble();
		
		System.out.print("직사각형의 세로 길이 : ");
		h = sc.nextDouble();
		
		area = w * h;
		System.out.println("직사각형의 넓이는 " + area + "cm입니다.");
		

	}

}
