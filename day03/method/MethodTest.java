package method;

public class MethodTest {
	
	public static void main(String[] args) {
		int[] numArr = {3, 6, 2, 4, 8};
		int target = 8;
		System.out.println("getSum의 결과값 = " + getSum(numArr));
		System.out.println("getMax의 결과값 = " + getMax(numArr));
		System.out.println("getCount의 결과값 = " + getCount(numArr, target));
		swapArray(numArr); //swapArray 메서드 호출 후 numArr 배열 역순으로 변경
		System.out.println("swapArray의 결과값 = "); 
		for ( int num : numArr ) { //for-each 문 (변수선언:시퀀스객체-> 순서대로 저장된 객체)
			System.out.print(num + " ");
		}
		System.out.println();
	}
	
	public static int getSum(int[] numArr) {
		
		if (numArr == null) return -1;
		int sum = 0;
		
		for( int i = 0 ; i < numArr.length ; i++) {
			sum += numArr[i];
		}
		
		return sum;
	}
	
	public static int getMax(int[] numArr) {
		int max = numArr[0];
		
		for ( int i = 0; i< numArr.length ; i++) {
			if ( numArr[i] > max ) {
				max = numArr[i];
			}
		}
		
		return max;
	}
	
	public static int getCount(int[] numArr, int target) {
		int count = 0;
		
		for ( int i = 0; i<numArr.length; i++ ) {
			if( numArr[i] > target) {
				count ++;
			}
		}
		
		return count;
	}
	
	public static void swapArray(int[] numArr) {
		
		for ( int i=0; i<numArr.length / 2; i++) {
		      int temp = numArr[i];
		      numArr[i] = numArr[numArr.length -1 -i];
		      numArr[numArr.length -1 -i] = temp;
		}

	}

}
