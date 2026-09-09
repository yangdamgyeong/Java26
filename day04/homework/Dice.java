package homework;

public class Dice {
	private int face;
	
	public Dice() {
        this(6);
    }
	
	public Dice (int face) {
		this.face = face;
	}
	
	public int roll() {
		return (int) Math.random() * this.face + 1;
	}

}
