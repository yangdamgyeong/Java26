package homework_cha_5;

import java.util.Scanner;

public class Example05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[10];
		
		System.out.println("숫지를 10개 입력하세요.");
		
		for (int i=0; i <numbers.length; i++) {
			numbers[i] = sc.nextInt();
		}
		histoGram(numbers);
	}
	public static void histoGram(int[] numbers) {
		int[] counts = new int[10];
		int count1 = 0; 
		int count2 = 0; 
		int count3 = 0; 
		int count4 = 0; 
		int count5 = 0; 
		int count6 = 0; 
		int count7 = 0; 
		int count8 = 0; 
		int count9 = 0; 
		int count10 = 0; 
		
		for (int i = 0; i < numbers.length; i++) {
			int num = numbers[i];
			
			if (num >= 0 && num <= 9) {
				count1++;
			} else if (num >= 10 && num <= 19) {
				count2++;
			} else if (num >= 20 && num <= 29) {
				count3++;
			} else if (num >= 30 && num <= 39) {
				count4++;
			} else if (num >= 40 && num <= 49) {
				count5++;
			} else if (num >= 50 && num <= 59) {
				count6++;
			} else if (num >= 60 && num <= 69) {
				count7++;
			} else if (num >= 70 && num <= 79) {
				count8++;
			} else if (num >= 80 && num <= 89) {
				count9++;
			} else if (num >= 90 && num <= 99) {
				count10++;
			}
			
		}
		counts[0] = count1;
		counts[1] = count2;
		counts[2] = count3;
		counts[3] = count4;
		counts[4] = count5;
		counts[5] = count6;
		counts[6] = count7;
		counts[7] = count8;
		counts[8] = count9;
		counts[9] = count10;
		
		for (int i=0; i<counts.length; i++) {
			int start = i*10;
			int end =(i*10) + 9;
			
			System.out.print(start + " ~ " + end + " : ");
			
			for(int j=0; j < counts[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
