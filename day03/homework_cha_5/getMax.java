package homework_cha_5;

public class getMax {
	public static void main(String[] args) {
		int[] numList = { 34, 24, 11, 5, 67 };
		
		System.out.println(getMax(numList));
	}
	
	public static int getMax(int [] numList) {
		
		int max = numList[0];
		for (int i=0; i < numList.length; i++) {
			if (numList[i] > max) {
				max = numList[i];
			}
			
		}
		return max;
	}

}
