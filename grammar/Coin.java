package grammar;

import java.util.Scanner;

public class Coin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("금액 : ");
		int total = sc.nextInt();
		
		System.out.println("동전의 수 >");
		int five = total / 500;
		System.out.println("500원 짜리 = " + five + "개");
		int hundred = total - (five * 500) / 100;
		System.out.print("100원 짜리 = " + hundred + "개");

	}

}
