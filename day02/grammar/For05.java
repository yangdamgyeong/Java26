package grammar;

public class For05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int dan=2; dan <=9; dan++) {
			System.out.println("[ 구구단 " + dan + "단 ]");
			for(int i=1; i<=9; i++) {
				System.out.printf("%d X %d = %d\n", dan, i, dan*i);
			}
			System.out.println();
		}
		
	}

}
