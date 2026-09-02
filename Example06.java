package homework;

import java.util.Scanner;

public class Example06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("철수 : ");
		String chul = sc.next();
		System.out.print("영희 : ");
		String zero = sc.next();
		
		String s;
		String r;
		String p;
		
		if (chul.equals(zero)) {
			System.out.print("무승부");
		} else if ((chul.equals("r")&& zero.equals("s")) || 
		          (chul.equals("s") && zero.equals("p")) ||
		          (chul.equals("p") && zero.equals("r"))){
			
				System.out.println("철수, 승!");
		} else if ((zero.equals("r") && chul.equals("s")) || 
				 (zero.equals("s") && chul.equals("p")) || 
				 (zero.equals("p") && chul.equals("r"))){
			    System.out.println("영희, 승!");
		}
		
	}

}
