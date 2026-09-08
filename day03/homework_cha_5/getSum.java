package homework_cha_5;


public class getSum {
	public static void main(String[] args) {
		int[] numList = { 34, 24, 11, 5, 67 };
		
		System.out.println(getSum(numList));
		}	
	
	public static int getSum(int[] numList) {
		int sum = 0;
		
		for (int i=0; i < numList.length; i++) {
			sum += numList[i];
		}
		return sum;
		
	}

}
