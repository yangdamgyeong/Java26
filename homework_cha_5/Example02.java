package homework_cha_5;

public class Example02 {
	
	public static void main(String[] args) {
		System.out.println(sumExceptFirst(1, 2, 3, 4));
		int arr[] = {2,3};
		System.out.println(sumExceptFirst(1, arr));
		System.out.println(sumExceptFirst(1, 2, 3, 4, 5));
	}
	
	public static int sumExceptFirst(int[] arr) {
		int sum = 0;
		for(int i=0; i < arr.length; i++) {
			sum += arr[i]; 
		}
		
		return sum;
	}

}
