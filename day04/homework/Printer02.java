package homework;

public class Printer02 {
	private int numOfPapers; 
	int amount; 
	
	public Printer02(int numOfPapers) {
		this.numOfPapers = numOfPapers;
	}
	
	public void print(int amount) {
		if (numOfPapers == 0) {
			System.out.println("용지가 없습니다. \n");
		} else if (numOfPapers < amount ) {
			int needAmount = amount - numOfPapers;
			System.out.printf("모두 출력하려면 용지가 %d매 부족합니다. %d장만 출력합니다. \n", needAmount, numOfPapers);
			this.numOfPapers = 0;
		} else {
			this.numOfPapers -= amount;
			System.out.printf("%d장 출력했습니다. 현재 %d장 남아 있습니다. \n", amount, numOfPapers);
		}
		
	}

}

