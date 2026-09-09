package homework;

public class Printer03 {
	private int numOfPapers;
	private boolean duplex;
	
	public Printer03(int numOfPapers, boolean duplex) {
		this.numOfPapers = numOfPapers;
		this.duplex = duplex;
		
	}
	
	public void print(int amount) {
	    if (duplex == true) {
	        // 양면 인쇄
	        int needPapers = (amount / 2) + (amount % 2);

	        if (numOfPapers >= needPapers) {
	            numOfPapers -= needPapers;
	            System.out.printf("양면으로 %d장 출력했습니다. 현재 %d장 남아 있습니다.%n", amount, numOfPapers);
	        }
	    } else {
	        // 단면 인쇄
	        if (numOfPapers < amount) {
	            int shortPapers = amount - numOfPapers;
	            System.out.printf("단면으로 모두 출력하려면 용지가 %d매 부족합니다. %d장만 출력합니다.%n", shortPapers, numOfPapers);
	            numOfPapers = 0;
	        }
	    }
	}
	
//	public boolean getDuplex() {
//	}
	
	public void setDuplex(boolean duplex) {
		this.duplex = duplex;
	}

}
