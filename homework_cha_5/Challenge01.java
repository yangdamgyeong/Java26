package homework_cha_5;

import java.util.Scanner;

public class Challenge01 {
	
	public static void main(String[] args) {
		
		System.out.print("학생 수?");
		Scanner in = new Scanner(System.in);
		
		int numOfStudents = in.nextInt();
		
		int[] scores = new int[numOfStudents];
		
		System.out.println(numOfStudents + "명의 학생 성적을 입력하세요");
		for (int i=0; i < scores.length; i++) {
			scores[i] = in.nextInt();
		}
		
		System.out.println(numOfStudents + "명의 학생 성적을 다음과 같습니다");
		for (int i=0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
		
	}
	

}
