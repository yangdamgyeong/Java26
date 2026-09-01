package Homework;

import java.util.Scanner;

public class Example03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double r, h, volume;
		double pi = 3.14;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("원기둥의 밑면 반지름은? ");
		r = in.nextDouble();
		
		System.out.print("원기둥의 높이는? ");
		h = in.nextDouble();
		
		volume = pi * r * r * h;
		System.out.print("원기둥의 부피는 " + volume );
	}

}
