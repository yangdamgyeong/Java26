package homework_cha_5;

public class Example06 {
	public static int[] reverse(int[] org) {
		for (int i=0; i<org.length /2; i++) {
			int temp = org[i];
			org[i] = org[org.length -1 - i];
			org[org.length -1 - i] = temp;
		}
		return org;
	}

}
