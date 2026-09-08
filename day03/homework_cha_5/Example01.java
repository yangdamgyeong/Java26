package homework_cha_5;

public class Example01 {
	
	public static void main(String[] args) {
		String s = "example01";
		char c = 'e';
		System.out.println(countChar(s, c));
	}
	
	public static int countChar(String s, char c) {
		int count = 0;
		
		for(int i=0; i <s.length(); i++) {
			if(s.charAt(i) == c) {
				count++;
			}
		}
		return count;
	}

}
