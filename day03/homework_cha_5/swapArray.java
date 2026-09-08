package homework_cha_5;

public class swapArray {
	public static void main (String[] args) {
		int[] numList = { 34, 24, 11, 5, 67 };
		
		int [] swap = swapArray(numList);
		for(int i=0; i <swap.length; i++) {
			System.out.print(swap[i] + " ");
		}

		
	}
	public static int[] swapArray(int [] numList) {
		for (int i=0; i < numList.length / 2; i++) {
			int temp = numList[i];
			numList[i] = numList[numList.length - 1 - i];
			numList[numList.length - 1 - i] = temp;
		}
		return numList;
	}

}
