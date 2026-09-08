package homework_cha_5;

public class getCount {
	public static void main(String[] args) {
		int[] numList = { 34, 24, 11, 5, 67 };
		int target = 34;
		
		System.out.print(getCount(numList, target));
	}
	
	public static int getCount(int[] numList, int target) {
		int count = 0;
		
		for (int i=0; i<numList.length; i++ ) {
			if (numList[i] > target) {
				count += 1;
				
			}
			
	}
		return count;
	}

}
